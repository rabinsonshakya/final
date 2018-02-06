package com.cubic.ehr.prescriber.test;

import com.cubic.ehr.common.Status;
import com.cubic.ehr.dao.data.PrescriberVO;
import com.cubic.ehr.dao.data.PrescriberVOstatus;
import com.cubic.ehr.dao.entity.PrescriberEntity;

public class PrescriberData {
	
	public static PrescriberVO createPrescriber() {
		final PrescriberVO vo = new PrescriberVO();
		vo.setFirstName("Rabinson");
		vo.setLastName("Shakya");
		vo.setDeaNumber("qw1234567");
		vo.setPhoneNumber("1234567890");
		vo.setId((long) 1);
		return vo;
	}
	
	public static PrescriberVOstatus createPrescriberStatus() {
		final PrescriberVOstatus vo = new PrescriberVOstatus();
		vo.setId((long) 1);
		vo.setActive(Status.Yes);
		return vo;
	}

	public static PrescriberEntity createProductEntity() {
		final PrescriberEntity entity = new PrescriberEntity();
		entity.setFirstName("Salomon");
		entity.setLastName("Kalou");
		entity.setPk(new Long(2000));
		return entity;
	}

}
