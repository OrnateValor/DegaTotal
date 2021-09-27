<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<%@include file="../include/header.jsp"%>
</head>
<body style="background: #E9ECEF; height: 100%; width: 100%;">
	<div class="jumbotron">
		<br>
	</div>
	<div class="container" align="center">
		<div class="col-md-4 col-md-offset">
			<c:choose>
				<c:when test="${param.flag == 'loginFail' }">
					<c:set var="_class" value="alert alert-danger" />
					<c:set var="msg" value="아이디 혹은 비밀번호가 올바르지 않습니다." />
				</c:when>
				<c:when test="${param.flag == 'noUser' }">
					<c:set var="_class" value="alert alert-warning" />
					<c:set var="msg" value="로그인이 필요한 <br> 서비스입니다." />
				</c:when>
				<c:otherwise>
					<c:set var="_class" value="alert alert-dark" />
					<c:set var="msg" value="아이디와 비밀번호를 입력 해 주세요." />
				</c:otherwise>
			</c:choose>
			<!-- 로그인하지 않은 경우 : 회원 전용 페이지 알림 메시지 출력 -->
			<p class="h3 form-signin-heading alert alert-dark">MEMBER LOGIN</p>
			<hr>
			<div>
				<p class="form-signin-heading ${_class }">${msg }</p>
			</div>
			<form class="form-signin" action="./loginUserProc.jsp"
				method="post">
				<div class="form-group">
					<input type="text" name="userId" class="form-control" placeholder="ID"
						required autofocus>
				</div>
				<div class="form-group">
					<input type="password" name="userPw" class="form-control"
						placeholder="Password" required>
				</div>
				<div class="row justify-content-around">
					<input type="submit" value="로그인" class="btn btn-lg btn-primary">
					<input type="button" value="돌아가기" class="btn btn-lg btn-dark">
				</div>
				<!-- IP전송 -->
				<input type="hidden" value="<%=request.getRemoteAddr()%>">
			</form>
		</div>
	</div>
</body>
<%@include file="../include/footer.jsp"%>
</html>