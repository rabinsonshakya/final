package com.cubic.ehr.dao.data;

import javax.xml.bind.annotation.XmlRootElement;

import com.cubic.ehr.common.Status;

@XmlRootElement
public class PrescriberVOstatus {
	private Long id;
	private Status active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "PrescriberVOstatus [id=" + id + ", active=" + active + "]";
	}

	
//	public String getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(String createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public String getModifiedDate() {
//		return modifiedDate;
//	}
//
//	public void setModifiedDate(String modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}

	

	
}
