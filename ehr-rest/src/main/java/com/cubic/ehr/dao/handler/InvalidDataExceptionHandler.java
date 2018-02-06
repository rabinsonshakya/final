package com.cubic.ehr.dao.handler;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cubic.ehr.common.exception.PrescriberInvalidDataException;
import com.cubic.ehr.dao.data.ErrorResponse;

@Provider
public class InvalidDataExceptionHandler implements ExceptionMapper<PrescriberInvalidDataException> {
	
	private final static Logger Logger = LoggerFactory.getLogger(InvalidDataExceptionHandler.class);

	@Override
	public Response toResponse(PrescriberInvalidDataException exception) {
		
		Logger.error("Invalid Data Exception occurred, Error{}", exception);

		final ErrorResponse entity = new ErrorResponse("ERR-510", exception.getMessage());
		return Response.status(510).type(MediaType.APPLICATION_XML).entity(entity).build();

	}


}
