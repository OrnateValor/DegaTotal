<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%
//세션 무효화 및 
session.invalidate();
%>
<c:redirect url="/main.jsp">
	<c:param name="flag" value="out" />
</c:redirect>