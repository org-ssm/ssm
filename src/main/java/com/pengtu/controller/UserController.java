package com.pengtu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pengtu.model.User;
import com.pengtu.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		String userId = request.getParameter("id");
		User user = userServiceImpl.selectByPrimaryKey(userId);
		model.addAttribute("user", user);
		return "/showUser";
	}
}
