package com.niydiy.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.niydiy.entity.User;
import com.niydiy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/user")
public class UserAction extends ActionSupport implements ModelDriven<User> {
	@Resource
	private UserService userService;

	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}

	@Action(value="userSave",results= {@Result(name="success",location="/jsp/succ.jsp")})
	public String save() {
		System.out.println(user);
		userService.save(user);
		return SUCCESS;
	}

	public String test() {
		System.out.println("test function....");
		return NONE;
	}
}
