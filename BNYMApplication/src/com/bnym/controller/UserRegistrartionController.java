package com.bnym.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entity.Applicant;
import com.bnym.entity.UserRegistration;

@Controller
public class UserRegistrartionController {
	
	// method to take a new user to registration form from login page
		//@RequestMapping(value = "/registration") // step 3.
		@RequestMapping(value = "/newuser")
		public ModelAndView getRegistrationform() {

			//ModelAndView model = new ModelAndView("registration");

			ModelAndView model = new ModelAndView("newuser");// BootStrap
			model.addObject("msg", "Welcome To Registration Page!");
			return model;

		}


	// new user validation and validating that two passwords are similar
		@RequestMapping(value = "/newUser", method = RequestMethod.POST)
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
					ModelAndView model = new ModelAndView("newapplication");
					return model;
				} else {
					//ModelAndView model = new ModelAndView("registration");
					ModelAndView model = new ModelAndView("newuser");
					model.addObject("msg", "Your Password did not match. Please Try again!");
					return model;
				}
			} else {
				//ModelAndView model = new ModelAndView("registration");
				ModelAndView model = new ModelAndView("newuser");
				model.addObject("msg", "User found with same email, Try again!");
				return model;
			}
		}
//		 Method to take in the registration form
//	@RequestMapping(value = "/saveUser", method = RequestMethod.POST) // step-3
//	public ModelAndView submitNewUSer(@ModelAttribute UserRegistration userRegistration, BindingResult result) {
//
//		if (result.hasErrors()) {
//			ModelAndView model = new ModelAndView("newuser");
//			return model;
//		}
//
//		ModelAndView model = new ModelAndView("newapplication");
//		return model;
//
//	}

}
