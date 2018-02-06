package com.cubic.ehr.prescriber.service;

import java.util.List;

import com.cubic.ehr.dao.data.PrescriberVO;
import com.cubic.ehr.dao.data.PrescriberVOstatus;

public interface PrescriberService {

	PrescriberVO createPrescriber(final PrescriberVO prescriber);

	void modifyPrescriber(final PrescriberVO prescriber);

	List<PrescriberVO> searchPrescriber(final String name, final String deaNumber);

	PrescriberVO findPrescriber(Long id);

	void prescriberStatus(PrescriberVOstatus prescriber);

}
