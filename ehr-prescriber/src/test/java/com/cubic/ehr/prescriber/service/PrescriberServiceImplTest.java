package com.cubic.ehr.prescriber.service;

import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.cubic.ehr.common.exception.DuplicateEntryException;
import com.cubic.ehr.common.exception.PrescriberInvalidDataException;
import com.cubic.ehr.common.exception.PrescriberNotFoundException;
import com.cubic.ehr.dao.data.PrescriberVO;
import com.cubic.ehr.dao.data.PrescriberVOstatus;
import com.cubic.ehr.dao.entity.PrescriberEntity;
import com.cubic.ehr.dao.repo.PrescriberRepo;
import com.cubic.ehr.prescriber.test.PrescriberData;

@RunWith(MockitoJUnitRunner.class)
public class PrescriberServiceImplTest{
	
	@InjectMocks
	private PrescriberServiceImpl impl;
	
	@Mock
	private PrescriberRepo prescriberRepo;
	
	@Spy
	private PrescriberMapper mapper;
	
	@Spy
	private PrescriberValidator prescriberValidator;
	
	private PrescriberVO input;
	private PrescriberVOstatus active;
	private PrescriberEntity entity;
	
	@Before
	public void setUp() {
		active = PrescriberData.createPrescriberStatus();
		input = PrescriberData.createPrescriber();
		entity = PrescriberData.createProductEntity();
		List<PrescriberEntity> entity1;
	}
	
private void answer() {
		
	}
	
	@Test
	public void testCreatePrescriber() throws SQLException {
		when(prescriberRepo.searchForDuplication(input.getDeaNumber())).thenReturn(0);
		//when(prescriberRepo.save(entity)).thenReturn(Doans);
		//doAnswer(answer);
		impl.createPrescriber(input);
	}
	
	
	@Test
	public void testModifyPrescriber() throws SQLException {
		
		when(prescriberRepo.searchForDuplication(input.getDeaNumber())).thenReturn(0);
		when(prescriberRepo.findOne(input.getId())).thenReturn(entity);
		impl.modifyPrescriber(input);
	}
	
	@Test
	public void testSearchPrescriber() throws SQLException {
		String sName = "san";
		String dea = "";
		//List<PrescriberEntity> entity1 = Arrays.asList({entity});
		//when(prescriberRepo.search(s, d)).thenReturn(Arrays.asList(entity));
		impl.searchPrescriber(sName, dea);
	}
	
	@Test
	public void testPrescriberStatus() throws SQLException {		
		//List<PrescriberEntity> entity1 = Arrays.asList({entity});
		//when(prescriberRepo.search(s, d)).thenReturn(Arrays.asList(entity));
		impl.prescriberStatus(active);
	}
	
	@Test
	public void testFindPrescriber() throws SQLException {		
		//List<PrescriberEntity> entity1 = Arrays.asList({entity});
		when(prescriberRepo.findOne(input.getId())).thenReturn(entity);
		//PrescriberEntity expec = 
		//assertEquals(impl.findPrescriber(input.getId()), mapper.mapToPrescriberVO(entity));
		impl.findPrescriber(input.getId());
	}
	
	
	@Test(expected = DuplicateEntryException.class)
	public void testDuplicateEntry() throws SQLException {
		
		when(prescriberRepo.searchForDuplication(input.getDeaNumber())).thenReturn(1);
		impl.createPrescriber(input);
	}
	
	@Test(expected = DuplicateEntryException.class)
	public void testDuplicateEntryWhenModify() throws SQLException {
		
		when(prescriberRepo.searchForDuplication(input.getId(), input.getDeaNumber())).thenReturn(1);
		impl.modifyPrescriber(input);
	}
	
	@Test(expected = PrescriberInvalidDataException.class)
	public void testNullID() throws SQLException {
		
		impl.findPrescriber(null);
	}
	
	@Test(expected = PrescriberNotFoundException.class)
	public void testFindPrescriberNull() throws SQLException {		
		//List<PrescriberEntity> entity1 = Arrays.asList({entity});
		when(prescriberRepo.findOne(input.getId())).thenReturn(null);
		//PrescriberEntity expec = 
		//assertEquals(impl.findPrescriber(input.getId()), mapper.mapToPrescriberVO(entity));
		impl.findPrescriber(input.getId());
	}
	
}
