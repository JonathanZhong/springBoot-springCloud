package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class MonitorData implements Serializable {
	/** 产品id*/
	private String id;
	
	private String monitorId;
	
	private String datas;
	
	private String templateId;
	
	/**创建日期	 */
	private Date createtm;
	
	/**操作时间*/
	private Date proctm;

	
	public MonitorData() {
		super();
	}

	public MonitorData(String id, String monitorId, String datas, String templateId,
			Date createtm, Date proctm) {
		super();
		this.id = id;
		this.monitorId = monitorId;
		this.datas = datas;
		this.templateId = templateId;
		this.createtm = createtm;
		this.proctm = proctm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMonitorId() {
		return monitorId;
	}

	public void setMonitorId(String monitorId) {
		this.monitorId = monitorId;
	}

	public String getDatas() {
		return datas;
	}

	public void setDatas(String datas) {
		this.datas = datas;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Date getCreatetm() {
		return createtm;
	}

	public void setCreatetm(Date createtm) {
		this.createtm = createtm;
	}

	public Date getProctm() {
		return proctm;
	}

	public void setProctm(Date proctm) {
		this.proctm = proctm;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", monitorId=" + monitorId + ", datas="
				+ datas + ", templateId=" + templateId + ", createtm="
				+ createtm + ", proctm=" + proctm + "]";
	}

	
	

}
