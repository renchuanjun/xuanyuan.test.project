package org.open.model;

public class BaseEntity implements java.io.Serializable{
	// 0代表请求出错, 1代表请求成功
	protected Integer status;	
	//报错信息
	protected String msg;
	
	
	public Integer getStatus() {
		return this.status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
