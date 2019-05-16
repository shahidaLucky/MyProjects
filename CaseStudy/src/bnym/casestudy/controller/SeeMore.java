package bnym.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SeeMore {
	
	@RequestMapping(value={"/seemore"})
	public ModelAndView getAboutPage() {
		ModelAndView mav = new ModelAndView("seemore");
		return mav;
	}
}
