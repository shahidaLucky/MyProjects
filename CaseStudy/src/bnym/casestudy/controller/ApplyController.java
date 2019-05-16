package bnym.casestudy.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entity.Apply;
import bnym.casestudy.entity.Employee;
import bnym.casestudy.entity.UserProfile;
import bnym.casestudy.repository.UserProfileRepository;
import bnym.casestudy.service.apply.ApplyService;
import bnym.casestudy.service.employee.EmployeeService;

@Controller
public class ApplyController {

	
	
	@Autowired
	ApplyService applyService;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	UserProfileRepository repository;	

	//Get a new application form
	@RequestMapping(value="/employee/apply", method=RequestMethod.GET)
	public ModelAndView getAuthorForm(Model model) {
		model.addAttribute("applicationForm", new Apply());
		List<String> skillsList = new ArrayList<String>();
		skillsList.add("Java");
		skillsList.add("Spring MVC");
		skillsList.add("JPA");
		skillsList.add("HTML");
		skillsList.add("JavaScript");
		ModelAndView mav = new ModelAndView("loanapplication");
		mav.addObject("skillsList", skillsList);
		return mav;
	}

	//save a new application and then show application details
	@RequestMapping(value = "/employee/apply", method = RequestMethod.POST)
	public ModelAndView saveAuthor(
			Principal principal,
			@ModelAttribute("applicationForm") Apply apply, 
			BindingResult result) {
		
		UserProfile userProfile = repository.findById(principal.getName()).get();
		
		Long id = userProfile.getEmployee().getId();
		
		if (result.hasErrors()) {
			System.out.println(result.toString());
			ModelAndView mav = new ModelAndView("loanapplication");
			return mav;
		}
		
		Employee employee = employeeService.getEmployeenById(id);
		employee.setApplication(apply);
		
		employeeService.saveEmployees(employee);
		ModelAndView mav = new ModelAndView("showapplication");
		mav.addObject("employee", employee);
		return mav;
	}
	
	//***********************************************************************************************************
	@RequestMapping("/showApplication")
	public ModelAndView appList() {
		ModelAndView mav = new ModelAndView("showapplication");
		List<Apply> applicationList = new ArrayList<Apply>();
		applicationList = applyService.getAllApplications();
		System.out.println("Size:" + applicationList.size());
		mav.addObject("applicationList", applicationList);
		return mav;
	}
}
