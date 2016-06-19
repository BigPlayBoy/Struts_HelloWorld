package com.imooc.action;

import com.imooc.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user=new User();

	public String login() {
		 System.out.println(user.getUsername());
		return SUCCESS;

	}

	@Override
	public User getModel() {
		return user;
	}

}
