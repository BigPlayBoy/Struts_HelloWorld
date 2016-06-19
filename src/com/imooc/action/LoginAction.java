package com.imooc.action;

import com.imooc.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	public String login() {
		//写在这里的话 需要手动添加input才可以返回相应的页面
//		if (user.getUsername() == null || "".equals(user.getUsername())) {
//			this.addFieldError("username", "用户名不能为空");
////			return INPUT;
//		}
		
		System.out.println(user.getUsername());
		System.out.println(user.getBooklist().get(0));
		System.out.println(user.getBooklist().get(1));
		return SUCCESS;

	}

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public void validate() {
		if (user.getUsername() == null || "".equals(user.getUsername())) {
		this.addFieldError("username", "用户名不能为空");
//		return INPUT;
	}
	}
	

}
