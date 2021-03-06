package com.bitauto.bdc.modules.oozie.monitor.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-11-02 16:25:54
 */
public class WorkflowsEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//
	private Long index;
	//
	private String id;
	//
	private String parentid;
	//
	private String appname;
	//
	private String createdtime;
	//
	private String starttime;
	//
	private String endtime;
	//
	private String user;
	//
	private String status;
	//
	private String externalid;
	//
	private String externalchildids;
	//
	private String doneflag;

	public Long getIndex() {
		return index;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 设置：
	 */
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	/**
	 * 获取：
	 */
	public String getParentid() {
		return parentid;
	}
	/**
	 * 设置：
	 */
	public void setAppname(String appname) {
		this.appname = appname;
	}
	/**
	 * 获取：
	 */
	public String getAppname() {
		return appname;
	}
	/**
	 * 设置：
	 */
	public void setCreatedtime(String createdtime) {
		this.createdtime = createdtime;
	}
	/**
	 * 获取：
	 */
	public String getCreatedtime() {
		return createdtime;
	}
	/**
	 * 设置：
	 */
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	/**
	 * 获取：
	 */
	public String getStarttime() {
		return starttime;
	}
	/**
	 * 设置：
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	/**
	 * 获取：
	 */
	public String getEndtime() {
		return endtime;
	}
	/**
	 * 设置：
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * 获取：
	 */
	public String getUser() {
		return user;
	}
	/**
	 * 设置：
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setExternalid(String externalid) {
		this.externalid = externalid;
	}
	/**
	 * 获取：
	 */
	public String getExternalid() {
		return externalid;
	}
	/**
	 * 设置：
	 */
	public void setExternalchildids(String externalchildids) {
		this.externalchildids = externalchildids;
	}
	/**
	 * 获取：
	 */
	public String getExternalchildids() {
		return externalchildids;
	}
	/**
	 * 设置：
	 */
	public void setDoneflag(String doneflag) {
		this.doneflag = doneflag;
	}
	/**
	 * 获取：
	 */
	public String getDoneflag() {
		return doneflag;
	}
}
