package bnym.casestudy.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import bnym.casestudy.entity.Authorities;
import bnym.casestudy.entity.Employee;
import bnym.casestudy.entity.UserProfile;
import bnym.casestudy.service.employee.EmployeeService;
import bnym.casestudy.service.userprofile.UserProfileService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private UserProfileService userProfileService;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "sDOB", new CustomDateEditor(sdf, false));
	}

	// ======================== Method for new Employee Registartion ============
	@RequestMapping(value = "/saveApplication", method = RequestMethod.POST) // ======================= step-1 for //
																				// validation
	public ModelAndView submitAdmission(@Valid @ModelAttribute("userProfile") UserProfile userProfile, BindingResult result,
			RedirectAttributes redirect) {

		if (result.hasErrors()) {
			System.out.println(result.toString());
			ModelAndView model = new ModelAndView("employeeregistration");
			return model;
		}
		
		try {
			String encoded=new BCryptPasswordEncoder().encode(userProfile.getPassword());
			userProfile.setPassword(encoded);
			userProfile.setEnabled(true);
			Authorities authorities = new Authorities();
			authorities.setAuthority("ROLE_USER");
			authorities.setUserProfile(userProfile);
			
			Set<Authorities> auth = new HashSet<>();
			auth.add(authorities);
			
			userProfile.setAuthorities(auth);
			
			userProfileService.saveUserProfile(userProfile);
			ModelAndView model = new ModelAndView("redirect:/login");
			redirect.addFlashAttribute("doLogin", "Registered Successfully! Please login now.");
			return model;
		} catch (Exception e) {
			ModelAndView model = new ModelAndView("login");
			model.addObject("registrationMsg", "You already have an account, please login!");
			return model;
		}
		
	}

	@RequestMapping("/employeeregistration") // ========================================================== step-1 for
												// validation
	public ModelAndView getRegistrationForm(Model model) {

		model.addAttribute("userProfile", new UserProfile());

		ModelAndView mav = new ModelAndView("employeeregistration");
		mav.addObject("msg", "Welcome Global Well Registration Portal!");
		return mav;

	}

	// =============================================================
	@RequestMapping("/admin/AllEmployees")
	public ModelAndView empList() {
		ModelAndView mav = new ModelAndView("allemployees");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeService.getAllEmployees();
		System.out.println("Size:" + employeeList.size());
		mav.addObject("employeeList", employeeList);
		return mav;
	}

	// ========================Edit / Delete============================

	@RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.GET)
	public ModelAndView displayEditUserForm(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("/editemployee");
		Employee employee = employeeService.getEmployeenById(id);
		mv.addObject("headerMessage", "Edit Application Details");
		mv.addObject("applicationForm", employee);
		return mv;
	}

//==============================Edit and save===============================
	@RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.POST)
	public ModelAndView saveEditEmployee(@ModelAttribute Employee employee, BindingResult result) {
		// ModelAndView mv = new ModelAndView("redirect:/allemployees");

		if (result.hasErrors()) {
			System.out.println(result.toString());
			return new ModelAndView("editemployee");
		}

		employeeService.saveEmployees(employee);
		ModelAndView mv = new ModelAndView("redirect: /admin/allEmployees");

		return mv;
	}

//========================================Delete===========================
	@RequestMapping("/delete")
	public ModelAndView deleteApplication(@RequestParam Long id) {

		employeeService.deleteEmployeeById(id);
		ModelAndView mav = new ModelAndView("redirect:/admin/allEmployees");
		return mav;
	}
}
