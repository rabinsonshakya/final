package com.cubic.ehr.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cubic.ehr.dao.data.PrescriberSearchResult;
import com.cubic.ehr.dao.data.PrescriberVO;
import com.cubic.ehr.dao.data.PrescriberVOstatus;
import com.cubic.ehr.prescriber.service.PrescriberService;



@Path("/prescriber")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class PrescriberWS {
	
	private final static Logger Logger = LoggerFactory.getLogger(PrescriberWS.class);
	
	@Autowired
	private PrescriberService ps;
	
	@POST
	public Response create(final PrescriberVO prescriber){
		Logger.debug("Entering PrescriberWS.create");
		Logger.info("PrescriberVO Request Object={}", prescriber);
		final PrescriberVO entity = ps.createPrescriber(prescriber);
		final ResponseBuilder rb = Response.ok();
		Logger.debug("Exiting PrescriberWS.create");
		return rb.entity(entity).build();
	}
	
	@GET
	@Path("/{pk}")
	public Response find(@PathParam("pk") final Long id) {
		Logger.debug("Entering PrescriberWS.find");
		final PrescriberVO entity = ps.findPrescriber(id);
		Logger.info("PrescriberVO Request Object={}", entity);
		Logger.debug("Exiting PrescriberWS.find");
		return Response.ok().entity(entity).build();
	}
	
	@PUT
	public Response modify(final PrescriberVO prescriber) {
		Logger.debug("Entering PrescriberWS.modify");
		Logger.info("PrescriberVO Request Object={}", prescriber);
		ps.modifyPrescriber(prescriber);
		final ResponseBuilder rb = Response.ok();
		Logger.debug("Exiting PrescriberWS.modify");
		return rb.build();
	}
	
	@PUT
	@Path("/updateStatus")
	public Response status(final PrescriberVOstatus prescriber) {
		Logger.debug("Entering PrescriberWS.status");
		Logger.info("PrescriberVOstatus Request Object={}", prescriber);
		ps.prescriberStatus(prescriber);
		//System.out.println("After:" + prescriber);
		//final PrescriberVO entity = ps.findPrescriber(prescriber.getId());
		final ResponseBuilder rb = Response.noContent();
		Logger.debug("Exiting PrescriberWS.status");
		return rb.build();
	}

	@GET
	public Response search(@QueryParam("name") final String name, @QueryParam("dea") final String deaNumber) {
		return searchPrescriber(name, deaNumber);
	}

	private Response searchPrescriber(final String name, final String deaNumber) {
		final List<PrescriberVO> prescribers = ps.searchPrescriber(name, deaNumber);
		PrescriberSearchResult entity = new PrescriberSearchResult(prescribers);
		return Response.ok().entity(entity).build();
	}
}
