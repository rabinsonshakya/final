package com.cubic.ehr.dao.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cubic.ehr.common.Status;
import com.cubic.ehr.dao.entity.PrescriberEntity;


public interface PrescriberRepo extends CrudRepository<PrescriberEntity, Long> {
	@Query("select x from PrescriberEntity x where (UPPER(x.firstName) like UPPER(?1) OR UPPER(x.lastName) like UPPER(?1)) AND UPPER(x.deaNumber) like UPPER(?2)")
	List<PrescriberEntity> search(final String firstName, final String deaNumber);
	
	@Query("select count(*) from PrescriberEntity x where UPPER(x.deaNumber) like UPPER(?1)")
	int searchForDuplication(final String deaNumber);
	
	//SELECT * FROM prescriber WHERE ID <> ?1 ORDER BY ID
	@Query("select count(*) from PrescriberEntity x where (ID <> ?1 AND UPPER(x.deaNumber) like UPPER(?2))")
	int searchForDuplication(Long id, final String deaNumber);
	
	@Modifying
	@Query("UPDATE PrescriberEntity e set e.active =?1 where e.pk = ?2")
	void setActiveForPrescriberEntity(Status active, Long id);
	
}