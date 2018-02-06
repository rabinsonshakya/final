package com.cubic.ehr.rest.resources;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;



@Component
public class SimpleCORSFilter implements Filter{

        //private static final Logger LOGGER = LoggerFactory.getLogger(SimpleCORSFilter.class);
        
        public void init(FilterConfig filterConfig) throws ServletException {
               // LOGGER.info("Initializing CORSFilter");
                
        }

        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                        throws IOException, ServletException {
                
                HttpServletRequest requestToUse = (HttpServletRequest) request;
                HttpServletResponse responseToUse = (HttpServletResponse) response;
                
                responseToUse.setHeader("Access-Control-Allow-Origin", "*");//requestToUse.getHeader("Origin"));
                responseToUse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            responseToUse.setHeader("Access-Control-Max-Age", "3600");
            responseToUse.setHeader("Access-Control-Allow-Headers", "X-PINGOTHER,Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
            responseToUse.addHeader("Access-Control-Expose-Headers", "xsrf-token");
                
                chain.doFilter(requestToUse, responseToUse);
        }

        public void destroy() {
                // TODO Auto-generated method stub
                
        }

}

