package com.cubic.ehr.dao.handler;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cubic.ehr.common.exception.PrescriberNotFoundException;
import com.cubic.ehr.dao.data.ErrorResponse;

@Provider
public class PrescriberNotFoundHandler implements ExceptionMapper<PrescriberNotFoundException> {
	
	private final static Logger Logger = LoggerFactory.getLogger(PrescriberNotFoundHandler.class);

	@Override
	public Response toResponse(PrescriberNotFoundException exception) {
		
		Logger.error("Prescriber not found, Error{}", exception);

		final ErrorResponse entity = new ErrorResponse("ERR-400", exception.getMessage());
		return Response.status(Status.NOT_FOUND).type(MediaType.APPLICATION_XML).entity(entity).build();

	}

}
