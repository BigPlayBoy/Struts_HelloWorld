package com.imooc.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloWorldAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("执行Action");
		return SUCCESS;
		
	}

	public String add(){
		System.out.println("执行add");
		return "add";
		
	}
	public String update(){
		System.out.println("执行update");
		return "update";
		
	}
	
}
