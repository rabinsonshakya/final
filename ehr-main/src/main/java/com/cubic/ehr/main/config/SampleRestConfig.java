package com.cubic.ehr.main.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.cubic.ehr.dao.handler.DuplicateExceptionHandler;
import com.cubic.ehr.dao.handler.GenericExceptionHandler;
import com.cubic.ehr.dao.handler.InvalidDataExceptionHandler;
import com.cubic.ehr.dao.handler.PrescriberNotFoundHandler;
import com.cubic.ehr.rest.resources.HelloWorldRest;
import com.cubic.ehr.rest.resources.PrescriberWS;


@Configuration
public class SampleRestConfig extends ResourceConfig {

	public SampleRestConfig() {
		register(HelloWorldRest.class);
		register(PrescriberWS.class);
		register(GenericExceptionHandler.class);
		register(PrescriberNotFoundHandler.class);
		register(InvalidDataExceptionHandler.class);
		register(DuplicateExceptionHandler.class);
	}

}
