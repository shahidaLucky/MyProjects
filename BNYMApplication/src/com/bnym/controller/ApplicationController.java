package com.bnym.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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

		// ModelAndView model = new ModelAndView("admissionform");
		ModelAndView model = new ModelAndView("newapplication");
		model.addObject("msg", "Welcome to Application Portal!");
		return model;

	}

//===================================All Application==========================================
	@RequestMapping(value = "/allApplication", method = RequestMethod.POST)
	public ModelAndView saveApplication(@ModelAttribute("applicant") Applicant applicant) {
		applicationService.getAllApplicants().add(applicant);
		//ModelAndView mav = new ModelAndView("redirect:/");
		ModelAndView mav = new ModelAndView("allapplication");
		return mav;
	}
	//==========================================List Applicant================================
	@RequestMapping("/allapplication")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("allapplication");
		mav.addObject("appList", applicationService.getAllApplicants());
		return mav;
	}
}
