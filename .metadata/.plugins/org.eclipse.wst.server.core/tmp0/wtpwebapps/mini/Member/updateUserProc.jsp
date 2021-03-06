<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dataSource" driver="oracle.jdbc.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe" user="mini" password="3939" />
<%
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
%>
<%
//한글처리, DB연동 -- 상기 끝
//flag = update 저장, main.jsp로 이동
//실패시, flag=upfail 저장, 알림메시지 경고창 출력
%>
<script>
	console.log('${param.userPw}');
	console.log('${param.userNm}');
	console.log('${param.userEmail}');
	console.log('${param.userId}');
	console.log('${param.userImg }');
</script>
<sql:update var="result" dataSource="${dataSource }">
		UPDATE member SET userPw=?, userNm=?, userEmail=?, userImg=? WHERE userId=?
	<sql:param value="${param.userPw }" />
	<sql:param value="${param.userNm }" />
	<sql:param value="${param.userEmail }" />
	<c:if test="${empty param.userImg}">
		<sql:param value="${param.userImg_before }" />
		<%
		session.setAttribute("userImg", request.getParameter("userImg_before"));
		%>
	</c:if>
	<c:if test="${not empty param.userImg}">
		<sql:param value="${param.userImg }" />
	</c:if>
	<sql:param value="${param.userId }" />
</sql:update>

<c:if test="${result == 1}">
	<%
	session.setAttribute("userNm", request.getParameter("userNm"));
	if (request.getParameter("userImg") != "") {
		session.setAttribute("userImg", request.getParameter("userImg"));
	} else {
		session.setAttribute("userImg", request.getParameter("userImg_before"));
	}
	System.out.println("sessionImg : " + request.getParameter("userImg_before"));
	%>
	<c:redirect url="/main.jsp">
		<c:param name="flag" value="update" />
	</c:redirect>
</c:if>
<c:if test="${result == 0 }">
	<script>
		alert('회원 등록 오류');
	</script>
</c:if>