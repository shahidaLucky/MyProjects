package com.bnym.admission;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.enterprise.inject.New;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
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

@Controller
public class GreetingController {

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "sDOB", new CustomDateEditor(sdf, false));
	}

	@RequestMapping("/welcome/{userName}/{countryName}")
	public ModelAndView greeter(@PathVariable Map<String, String> pathVar) { // pathVariable is a data binder

		String userName = pathVar.get("userName");
		String countryName = pathVar.get("countryName");

		ModelAndView model = new ModelAndView("greetings"); // as response controller knows in this page it should go
															// (greetings.jsp) values goes to the FrontEnd
		model.addObject("msg", "Hello  " + userName + ", you are from" + countryName + "!");
		return model;
	}

	@RequestMapping("/goodBye/{userName}")
	public ModelAndView goodBye(@PathVariable Map<String, String> pathVar) { // pathVariable is a data binder

		String userName = pathVar.get("userName");

		ModelAndView model = new ModelAndView("goodBye"); // as response controller knows in this page it should go
															// (greetings.jsp) values goes to the FrontEnd
		model.addObject("msg", "Hello  " + userName + ", Good Bye" + "!");
		return model;
	}
	// ===================================== Apply
	// ===========================================================

	@RequestMapping("/apply") //========================================================== step-1 for validation
	public ModelAndView getAdmissionForm(Model applicant) {
		
	applicant.addAttribute("applicant", new Applicant());
		
		//ModelAndView model = new ModelAndView("admissionform");
		ModelAndView model = new ModelAndView("admissionBoot");
		model.addObject("msg", "Welcome to Application Portal!");
		return model;

	}

// ========================= Method Admission ================================================
	@RequestMapping(value = "/submitform", method = RequestMethod.POST)//======================= step-1 for validation
	public ModelAndView submitAdmission(
			@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result) {

		if (result.hasErrors()) {
			//ModelAndView model = new ModelAndView("admissionform");
			ModelAndView model = new ModelAndView("admissionBoot");
			return model;
		}

		//ModelAndView model = new ModelAndView("applysuccess");

		ModelAndView model = new ModelAndView("applysuccessBoot");
		return model;

	}

	
	
	// Method for register a user
//	@RequestMapping(value = "/submit", method = RequestMethod.POST) // step-3
//	public ModelAndView submitLoginPage(@ModelAttribute UserRegistration userRegistration, BindingResult result) {
//
//		if (result.hasErrors()) {
//			ModelAndView model = new ModelAndView("index");
//			return model;
//		}
//
//		ModelAndView model = new ModelAndView("admissionform");
//		return model;
//
//	}
//=================================================================================================================
	// Method to take in the registration form
//	@RequestMapping(value = "/submitNewUser", method = RequestMethod.POST) // step-3
//	public ModelAndView submitNewUSer(@ModelAttribute UserRegistration userRegistration, BindingResult result) {
//
//		if (result.hasErrors()) {
//			ModelAndView model = new ModelAndView("registration");
//			return model;
//		}
//
//		ModelAndView model = new ModelAndView("admission");
//		return model;
//
//	}
//=============================================================================================================

	// Method to take in the registration form
//	@RequestMapping(value = "/registration") // step-3
//	public ModelAndView getRegistrationForm() {
//
//		ModelAndView model = new ModelAndView("registration");
//		model.addObject("msg", "Welcome");
//		return model;
//
//	}
	// login from index page
//	@RequestMapping(value = "submitlogin", method= RequestMethod.POST)
//	public ModelAndView login(@RequestParam Map<String, String >loginData) { // pathVariable is adata binder
//        
//		String email = loginData.get("email");
//        String password = loginData.get("password");
//
//		if(email.equals("shahida@gmail.com") && password.equals("12345")) {
//		ModelAndView model = new ModelAndView("admissionform"); // as response controller knows in this page it should go
//		model.addObject("msg", "Login Successfull!");										// (greetings.jsp) values goes to the FrontEnd
//		return model;
//		}
//		ModelAndView model = new ModelAndView("rdirect:/"); 
//		return model;
//	}

	// ================================================================================

	// from direct index page if the user has a valid login
	@RequestMapping(value = "/submit", method = RequestMethod.POST) // step 3.
	public ModelAndView submitLoginPage(
			@RequestParam Map<String, String> loginData,
			Model applicant) {
	
		String email = loginData.get("email");
		String password = loginData.get("password");
		if (email.equals("shahidakawsar@gmail.com") && password.equals("12345")) {
			//ModelAndView model = new ModelAndView("admissionform");
			
			applicant.addAttribute("applicant", new Applicant());
			ModelAndView model = new ModelAndView("admissionBoot"); // BootStrap
			model.addObject("msg", "Login Successful!");
			return model;
		}
		ModelAndView model = new ModelAndView("redirect:/");

		return model;

	}

	// method to take a new user to registration form from login page
	//@RequestMapping(value = "/registration") // step 3.
	@RequestMapping(value = "/registrationBoot")
	public ModelAndView getRegistrationform() {

		//ModelAndView model = new ModelAndView("registration");

		ModelAndView model = new ModelAndView("registrationBoot");// BootStrap
		model.addObject("msg", "Welcome To Registration Page!");
		return model;

	}

	// new user validation and validating that two passwords are similar
	@RequestMapping(value = "/submitNewUser", method = RequestMethod.POST)
	public ModelAndView validateNew(@RequestParam Map<String, String> newUser, Model applicant) {
		
		applicant.addAttribute("applicant", new Applicant());
		// if email exists in database redirect to registartion page again
		boolean userDoesNotExists = true;

		String email = newUser.get("email");
		String password = newUser.get("password");
		String confirmPassword = newUser.get("confirmPassword");

		if (userDoesNotExists) {
			if (password.equals(confirmPassword)) {
				UserRegistration newRegUser = new UserRegistration();
				newRegUser.setEmail(email);
				newRegUser.setPassword(password);

				//ModelAndView model = new ModelAndView("admissionform");
				ModelAndView model = new ModelAndView("admissionBoot");
				return model;
			} else {
				//ModelAndView model = new ModelAndView("registration");
				ModelAndView model = new ModelAndView("registrationBoot");
				model.addObject("msg", "Your Password did not match. Please Try again!");
				return model;
			}
		} else {
			//ModelAndView model = new ModelAndView("registration");
			ModelAndView model = new ModelAndView("registrationBoot");
			model.addObject("msg", "User found with same email, Try again!");
			return model;
		}
	}

}
