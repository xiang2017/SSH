package com.xiang.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.xiang.model.User;
import com.xiang.tool.BaseAction;
import com.xiang.tool.ResultUtils;

public class UserAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5528119123690441362L;
	
	/**
	 * 请求的数据
	 */
	private String hello;
	
	/**
	 * 返回的数据
	 */
	private String hi;
	private Map<String, Object> jsonResult;

	@Override
	public String execute() throws Exception {
		setHi("hello");
		setStatus(0);
		setDescription("hahaha");
		Map<String, Object> map = new HashMap<String, Object>();
		User user = new User();
		user.setID("xiangxiang");
		
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user);
		
		map.put("users", list);
		
		ResultUtils.toJson(ServletActionContext.getResponse(), map);
		
		return "success";
	}
	
	public String userToJson(){
		setStatus(0);
		setDescription("hahaha");
		setHi(getHello());
        Map<String, Object> map = new HashMap<String, Object>();
        User user = new User();
        user.setID("xiangxiang");
        List<User> list = new ArrayList<User>();
		list.add(user);
        map.put("users", list);
	    setJsonResult(map);
	    return "success";
    }

	public String getHi() {
		return hi;
	}

	public void setHi(String hi) {
		this.hi = hi;
	}

	public Map<String, Object> getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(Map<String, Object> jsonResult) {
		this.jsonResult = jsonResult;
	}

	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * @param hello the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}
	
}
