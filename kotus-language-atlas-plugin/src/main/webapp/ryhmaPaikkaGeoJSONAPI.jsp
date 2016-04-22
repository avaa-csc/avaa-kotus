<%@ page import="fi.csc.avaa.kotus.kielikartastot.KotusDbUtils"%>
<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	response.setHeader("Access-Control-Allow-Origin", "http://avoin-test.csc.fi,https://avoin-test.csc.fi,http://avaa.tdata.fi,https://avaa.tdata.fi");
	int ryhmaId = null == request.getParameter("ryhma_id") ? 0 : Integer.parseInt(request.getParameter("ryhma_id"));	
	String paikkaTiedot = KotusDbUtils.getRyhmaPaikkaTieto(ryhmaId);
%>
<%=paikkaTiedot%>