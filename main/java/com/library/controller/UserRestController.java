package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.user.domain.FindUserForm;
import com.library.user.domain.User;
import com.library.user.domain.UserForm;
import com.library.user.domain.UserType;
import com.library.user.service.UserService;

@Controller
public class UserRestController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	@Autowired
	UserService userService;	

	/*This handler is used to check if the user exists or not*/
	@RequestMapping(value = "/existsUser", method = RequestMethod.POST)
	public String existsUser(@ModelAttribute("userform")FindUserForm userform, 
		      ModelMap model) {
		
		String view;
		User user = userService.getUser(userform.getUsername());
		
		//Should have used an optional here
		if(user!=null) {					
			view = "manage";			
		} else {	
			 model.addAttribute("userForm", new UserForm());
			view = "welcome";
		}		
		return view;
	}
	
	/*First page - Login page*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("userform")FindUserForm userform, 
		      ModelMap model) {		       
		        model.addAttribute("userform", userform);	
		        return "welcome";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	    public String registration(Model model) {
	        model.addAttribute("userForm", new UserForm());

	        return "registration";
	}
	 
	/*This handler method is used for registering a new user*/
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	    public String registration(@ModelAttribute("userForm") UserForm userForm)
	 {	
	User  user = new User();
	user.setAddress_1(userForm.getAddress_1());	
	user.setAddress_2(userForm.getAddress_2());
	user.setAdmin(true);
	user.setFname(userForm.getFname());
	user.setLname(userForm.getLname());
	user.setType(UserType.DONOR);
	user.setZip(userForm.getZip());
	userService.registerUserDetails(user);
	return "registrationSuccess";
	}	
}
