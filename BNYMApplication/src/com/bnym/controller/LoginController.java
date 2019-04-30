package com.bnym.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entity.Applicant;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView model =new ModelAndView("index");
		return model;
	}
	

	// from direct index page if the user has a valid login
		@RequestMapping(value = "/loginSuccess", method = RequestMethod.POST) // step 3.
		public ModelAndView submitLoginPage(
				@RequestParam Map<String, String> loginData,
				Model applicant) {
		
			String email = loginData.get("email");
			String password = loginData.get("password");
			if (email.equals("shahidakawsar@gmail.com") && password.equals("12345")) {
				//ModelAndView model = new ModelAndView("admissionform");
				
				applicant.addAttribute("applicant", new Applicant());
				ModelAndView model = new ModelAndView("loginsuccess"); // BootStrap
				model.addObject("msg", "Login Successful!");
				return model;
			}
			ModelAndView model = new ModelAndView("redirect:/");

			return model;

		}
	
}
