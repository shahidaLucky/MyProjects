package com.bnym.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entity.Applicant;

import com.bnym.service.ApplicationService;

@Controller
public class ApplicationController {

	@Autowired
	ApplicationService applicationService;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "sDOB", new CustomDateEditor(sdf, false));
	}

	// ========================= Method Admission
	// ================================================
	@RequestMapping(value = "/saveApplication", method = RequestMethod.POST) // ======================= step-1 for
																				// validation
	public ModelAndView submitAdmission(@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result) {

		applicationService.getAllApplicantions().add(applicant);
		if (result.hasErrors()) {
			// ModelAndView model = new ModelAndView("admissionform");
			ModelAndView model = new ModelAndView("newapplication");
			return model;
		}

		// ModelAndView model = new ModelAndView("applysuccess");

		ModelAndView model = new ModelAndView("applysuccessBoot");
		return model;

	}
	// ===================================== Apply
	// ===========================================================

	@RequestMapping("/newapplication") // ========================================================== step-1 for
										// validation
	public ModelAndView getAdmissionForm(Model applicant) {

		applicant.addAttribute("applicant", new Applicant());

		ModelAndView model = new ModelAndView("newapplication");
		model.addObject("msg", "Welcome to Application Portal!");
		return model;

	}
	//==========================================List Applicant================================
		@RequestMapping("/allApplication")
		public ModelAndView appList() {
			ModelAndView mav = new ModelAndView("allapp");
			mav.addObject("applicationList", applicationService.getAllApplicantions());
			return mav;
		}

//===================================All Application==========================================
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveApplication(@ModelAttribute("applicant") Applicant applicant) {
		applicationService.getAllApplicantions().add(applicant);
		ModelAndView mav = new ModelAndView("allapplication");
		return mav;
	}
	
	//====================================Edit and Delete and Search =====================================
	
	@RequestMapping("/edit")
	public ModelAndView editApplication(@RequestParam long id) {
		Applicant applicant = applicationService.getAllApplicantions()
				.stream()
				.filter(app -> (int) id == (app.getId()))
				.findAny()
				.orElse(null);
		
		applicationService.getAllApplicantions().remove(applicant);
		
		ModelAndView mav = new ModelAndView("editapplication");
		mav.addObject("applicant", applicant);
		return mav;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteApplication(@RequestParam long id) {
		Applicant applicant = applicationService.getAllApplicantions()
				.stream()
				.filter(app -> (int) id == (app.getId()))
				.findAny()
				.orElse(null);
		applicationService.getAllApplicantions().remove(applicant);
		ModelAndView mav = new ModelAndView("allapplication");
		return mav;
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<Applicant> result = new ArrayList<>();
		Applicant applicant = applicationService.getAllApplicantions()
				.stream()
				.filter(app -> keyword.equalsIgnoreCase(app.getsName()))
				.findAny()
				.orElse(null);
		result.add(applicant);
		ModelAndView mav = new ModelAndView("searchapplication");
		mav.addObject("result", result);

		return mav;
	}

	
}
