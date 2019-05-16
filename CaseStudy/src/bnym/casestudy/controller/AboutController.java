package bnym.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AboutController {

	//@RequestMapping("/")
			@RequestMapping(value={"/about"})
			public ModelAndView getAboutPage() {
				//model.addAttribute("loginForm", new UserRegistration());
				ModelAndView mav = new ModelAndView("about");
				return mav;
			}
}
