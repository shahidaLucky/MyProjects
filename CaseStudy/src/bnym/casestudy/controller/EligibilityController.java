package bnym.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EligibilityController {

	/*@RequestMapping("/eligibility")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("/eligibility/index");
		return mv*/
			
			@RequestMapping(value={"/eligibility"})
			public ModelAndView eligibilityPage() {
				//model.addAttribute("loginForm", new UserRegistration());
				ModelAndView mav = new ModelAndView("eligibility");
				return mav;
			}
	}

