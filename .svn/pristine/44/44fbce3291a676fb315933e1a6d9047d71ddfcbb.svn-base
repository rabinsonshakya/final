package com.cubic.ehr.dao.handler;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cubic.ehr.dao.data.ErrorResponse;

@Provider
@Produces({ MediaType.APPLICATION_JSON })
public class GenericExceptionHandler implements ExceptionMapper<Exception> {

	private final static Logger Logger = LoggerFactory.getLogger(GenericExceptionHandler.class);
	@Override
	public Response toResponse(Exception exception) {
		Logger.error("Generic execption occurred, Error{}", exception);
		final ErrorResponse entity = new ErrorResponse("ERR-500", exception.getMessage());
		return Response.serverError().type(MediaType.APPLICATION_XML).entity(entity).build();

	}

}
