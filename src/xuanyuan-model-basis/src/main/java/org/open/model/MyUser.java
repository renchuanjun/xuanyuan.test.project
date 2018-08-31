package org.open.model;

import java.util.List;



/***
 * 该类用于解决前端多登录的实体情况
 * @author lenovo
 *
 */
public class MyUser<T,K> implements java.io.Serializable{

	private String userId;
	
	private String userName;
	
	private String name;
	
	private Integer superUser;//默认为1  0超级管理员
	
	private T t;

	private K k;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public Integer getSuperUser() {
		return superUser;
	}

	public void setSuperUser(Integer superUser) {
		this.superUser = superUser;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
