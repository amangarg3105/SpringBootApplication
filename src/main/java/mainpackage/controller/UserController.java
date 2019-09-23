package mainpackage.controller;

import mainpackage.model.User;
import mainpackage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

	UserController() {
		System.out.println("*********UserController Created**********");
	}

	@Autowired
	UserService userService;

	@RequestMapping("users/login")
	public String login() {
		return "users/login";
	}
	
	@RequestMapping("users/registration")
	public String registration() {
		return "users/registration";
	}
	
	@RequestMapping("users/logout")
	public String logout() {
		return "users/logout";
	}

	@RequestMapping(value = "users/login", method = RequestMethod.POST)
	public String loginUser(User user) {
		if(userService.login(user)) {
			return "redirect:/posts";
		}
		else {
			return "users/login";
		}
	}
	
	@RequestMapping(value = "users/registration", method = RequestMethod.POST)
	public String registrationUser(User user) {
		return "redirect:/posts";
	}


}
