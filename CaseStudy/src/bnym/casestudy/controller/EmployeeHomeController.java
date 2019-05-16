package bnym.casestudy.controller;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entity.Authorities;

@Controller
public class EmployeeHomeController {

	@RequestMapping(value={"/useremployeehome"})
	public ModelAndView getAboutPage(Authentication authentication) {
		
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		
		for (GrantedAuthority grantedAuthority : authorities) {
			System.out.println("Auth: "+grantedAuthority.getAuthority());
		}
		
		ModelAndView mav = new ModelAndView("employeehome");
		return mav;
	}
}
