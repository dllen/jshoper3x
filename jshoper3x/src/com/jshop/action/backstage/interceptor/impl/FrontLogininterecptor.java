package com.jshop.action.backstage.interceptor.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.jshop.action.backstage.tools.BaseTools;
import com.jshop.action.backstage.tools.StaticString;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class FrontLogininterecptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		ActionContext actionContext=invocation.getInvocationContext();
		HttpServletRequest request=(HttpServletRequest)actionContext.get(StrutsStatics.HTTP_REQUEST);
		Map session=actionContext.getSession();
		if(StaticString.MEMBER_SESSION_KEY!=null){
			return invocation.invoke();
		}else{
			return "login";
		}
		
		
	}

	
	
}
