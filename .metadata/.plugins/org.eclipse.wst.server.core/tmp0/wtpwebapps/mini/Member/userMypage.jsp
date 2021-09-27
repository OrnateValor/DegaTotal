<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<sql:setDataSource var="dataSource" driver="oracle.jdbc.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe" user="mini" password="3939" />
<%@include file="../include/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
<style>
input[type="file"] {
	position: absolute;
	width: 1px;
	height: 1px;
	padding: 0;
	margin: -1px;
	overflow: hidden;
	clip: rect(0, 0, 0, 0);
	border: 0;
}
</style>
</head>
<body style="background: #E9ECEF; height: 100%; width: 100%;">
	<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	%>

	<c:choose>
		<c:when test="${sid != null }">
			<sql:query var="rs" dataSource="${dataSource }">
				SELECT * FROM member WHERE userId = ?
				<sql:param value="${sid }" />
			</sql:query>
		</c:when>
		<c:otherwise>
			<c:redirect url="./loginUser.jsp" />
		</c:otherwise>
	</c:choose>

	<div class="jumbotron"></div>

	<div class="container">
		<h2>마이페이지</h2>
		<hr>
		<!-- 필수 입력 항목 안내 메시지 -->
		<c:set var="idMsg" value="아이디는 필수 입력 항목입니다." />
		<c:set var="pwMsg" value="비밀번호는 필수 입력 항목입니다." />
		<c:set var="pwcMsg" value="비밀번호가 올바르지 않습니다." />
		<c:set var="nmMsg" value="유저명은 필수 입력 항목입니다." />
		<c:forEach items="${rs.rows }" var="row">
			<form name="newProduct" action="updateUserProc.jsp"
				class="form-horizontal" method="post">
				<div class="form-group col-md-3">
					<img src="/resources/imgs/${row.userImg }"
						style="width: 100%; border: 1px solid black;">
					<div>
						<label for="userImg" class="btn btn-sm btn-success btn-block">파일
							선택</label> <input type="file" name="userImg" id="userImg"
							accept="image/*">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">아이디</label>
					<div class="col-sm-3">
						<input type="text" name="userId" id="userId" class="form-control"
							value="${row.userId }" readonly>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">비밀번호</label>
					<div class="col-sm-4">
						<input type="password" name="userPw" id="userPw"
							class="form-control" placeholder='문자+숫자+특수문자 8자리 이상' required
							oninput="setCustomValidity('')"
							oninvalid="this.setCustomValidity('${pwMsg }')"
							value="${row.userPw }">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">비밀번호 확인</label>
					<div class="col-sm-4">
						<input type="password" name="pwConfirm" id="pwConfirm"
							class="form-control" placeholder='비밀번호 재입력' required
							oninput="setCustomValidity('')"
							oninvalid="this.setCustomValidity('${pwcMsg }')">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">유저명</label>
					<div class="col-sm-3">
						<input type="text" name="userNm" id="userNm" class="form-control"
							value="${row.userNm }">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">이메일</label>
					<div class="col-sm-5">
						<input type="email" name="userEmail" id="userEmail"
							class="form-control" value="${row.userEmail }">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">가입일</label>
					<div class="col-sm-3">${row.regDate }</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">권한</label>
					<div class="col-sm-3">
						<label><input type="radio" name="properties" id="Admin"
							value="1" ${row.properties=='1' ? 'checked' : '' } disabled>
							관리자</label> <label><input type="radio" name="properties"
							id="User" value="0" ${row.properties=='0' ? 'checked' : '' }
							disabled> 일반유저</label>
					</div>
				</div>

				<div class="form-group row">
					<div class="com-sm-offset-2 col-sm-10">
						<input type="button" class="btn btn-primary" value="등록"
							onclick="return upUserChk()"> <a
							class="btn btn-secondary" href="/main.jsp">취소</a> <input
							type="button" class="btn btn-danger" value="회원탈퇴"
							onclick="return delUserChk('${row.userId}')">
					</div>
				</div>
				<input type="hidden" name="userImg_before" value="${row.userImg }">
			</form>
		</c:forEach>
	</div>
</body>
<footer>
	<%@include file="../include/footer.jsp"%>
</footer>
</html>