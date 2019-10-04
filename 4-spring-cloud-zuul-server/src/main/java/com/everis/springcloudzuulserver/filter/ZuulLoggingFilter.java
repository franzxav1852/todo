package com.everis.springcloudzuulserver.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	//slf4j framework que permite almacenar logs	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	//Si deseas que el filtro sea ejecutado o no.
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	//Instrucciones que ejecutara el filtro
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		//debug (desarrollando) Sytem.out
		//warn (warning, precaucion)
		//error (ya valio)
		//fatal (ya valio mas feo)
		logger.info("Peticion -> {} URL -> {}", request, request.getRequestURL());
		return null;
	}

	@Override
	//Indicamos en que momento queremos que el filtro se ejecute
	//pre, post, error
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	//Orden en el que se va a ejecutar el filtro
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	
		


		}
