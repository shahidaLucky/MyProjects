package bnym.casestudy.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	//@RequestMapping("/")
		@RequestMapping(value={"/"})
		public ModelAndView getHomePage() {
			//model.addAttribute("loginForm", new UserRegistration());
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			boolean hasUserRole = authentication.getAuthorities().stream()
			          .anyMatch(r -> r.getAuthority().equals("ROLE_USER"));			
			
			
			if (hasUserRole) {
				return new ModelAndView("redirect:/useremployeehome");
			}
			
			
			return new ModelAndView("redirect:/admin/AllEmployees");
		}
		
		
		
}
