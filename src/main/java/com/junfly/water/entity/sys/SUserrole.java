package com.junfly.water.entity.sys;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author pq
 * @email pq27120@126.com
 * @date 2017-06-14 11:30:59
 */
public class SUserrole implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String userid;
	//
	private String rolecode;

	/**
	 * 设置：
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * 获取：
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * 设置：
	 */
	public void setRolecode(String rolecode) {
		this.rolecode = rolecode;
	}
	/**
	 * 获取：
	 */
	public String getRolecode() {
		return rolecode;
	}
}
