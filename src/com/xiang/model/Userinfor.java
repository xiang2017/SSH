/**
 * add by xiang 
 * 2015年1月21日 Userinfor.java
 */
package com.xiang.model;

import java.io.Serializable;

/**
 * @author 祥祥
 *
 */
public class Userinfor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6917692187600219207L;
	
	/**用户id*/
	private Integer id;
	/**用户名*/
	private String uname;
	/**性别*/
	private String sex;
	/**密码*/
	private String password;
	/**电话号码*/
	private String telphone;
	/**住址*/
	private String address;

	public Userinfor() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
