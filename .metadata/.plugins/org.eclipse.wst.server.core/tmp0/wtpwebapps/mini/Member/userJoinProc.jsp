<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="dataSource" driver="oracle.jdbc.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe" user="mini" password="3939" />
<%
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
//한글 처리
%>
<%
//파라미터로 전송된 데이터를 member테이블에 추가

//테이블에 잘 추가되면 ${result == 1} 
//		JSTL 코어 태그를 이용하여 resultMember.jsp로 이동
//		단, flag 파라미터에 값을 add로 지정
//추가되지 않으면 회원가입 실패 경고페이지로 이동
System.out.println(request.getParameter("userId")); /*ID가 제대로 들어갔는지 디버깅용 코드.*/
System.out.println(request.getParameter("userPw"));
System.out.println(request.getParameter("userNm"));
System.out.println(request.getParameter("userEmail"));
System.out.println(request.getParameter("userImg"));
%>
<sql:update var="result" dataSource="${dataSource }">
		INSERT INTO member VALUES(?,?,?,?,?,DEFAULT,DEFAULT)
	<sql:param value="${param.userId }" />
	<sql:param value="${param.userPw }" />
	<sql:param value="${param.userNm }" />
	<sql:param value="${param.userEmail }" />
	<c:if test="${empty param.userImg}">
		<sql:param value="Profile_default.png" />
	</c:if>
	<c:if test="${not empty param.userImg}">
		<sql:param value="${param.userImg }" />
	</c:if>

</sql:update>
<c:if test="${result == 1 }">
	<c:redirect url="/Member/loginUserProc.jsp">
		<c:param name="userId" value="${param.userId }" />
		<c:param name="userPw" value="${param.userPw }" />
		<c:param name="flag" value="newUser" />
	</c:redirect>
</c:if>
<c:if test="${result == 0 }">
	<script>
		alert('회원 등록 오류');
	</script>
</c:if>