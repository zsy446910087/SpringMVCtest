package org.fkit.domain;

import java.io.Serializable;

/**
 * @Author:Siyu
 * @Date:Created in 下午3:40 2018/7/2
 */

// 域对象，实现序列化接口
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// 私有字段
	private String loginname;
	private String password;
	private String username;
	
	// 公共构造器
	public User() {
		super();
	}
	
	public User(String loginname, String password, String username) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.username = username;
	}


	// set/get方法
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [loginname=" + loginname + ", password=" + password
				+ ", username=" + username + "]";
	}
	
}
