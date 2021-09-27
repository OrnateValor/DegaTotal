<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html style="width: 100%; height: 100%;">
<head>
<meta charset="UTF-8">
<title>데가 종합</title>
<%@include file="/include/header.jsp"%>
</head>
<body style="background: #E9ECEF; height: 100%; width: 100%;">
	<c:choose>
		<c:when test="${param.flag == 'newUser' }">
			<script type="text/javascript">
				alert('유저등록이 정상적으로 처리 되었습니다.');
			</script>
		</c:when>
		<c:when test="${param.flag == 'in' }">
			<script type="text/javascript">
				alert('로그인 되었습니다.');
			</script>
		</c:when>
		<c:when test="${param.flag == 'out' }">
			<script type="text/javascript">
				alert('정상적으로 로그아웃 되었습니다.');
			</script>
		</c:when>
		<c:when test="${param.flag == 'update' }">
			<script type="text/javascript">
				alert('유저 정보가 업데이트 되었습니다.');
			</script>
		</c:when>
		<c:when test="${param.flag == 'delete' }">
			<script type="text/javascript">
				alert('회원탈퇴 성공');
				alert('이용해 주셔서 감사합니다.');
			</script>
		</c:when>
	</c:choose>
	<div class="jumbotron" style="margin-bottom: 0">
		<div class="container">
			<h2>최근 소식</h2>
			<hr>
			<div style="margin-top: 3rem; margin-bottom: 3rem">
				<div class="row justify-content-around">
					<div class="card col-sm-3" style="width: 18rem;">
						<img class="card-img-top" src="/resources/imgs/Bungie_hotfix.png"
							alt="Card image cap" style="margin-top: 1rem;">
						<div class="card-body">
							<h5 class="card-title">소식 1</h5>
							<p class="card-text">게시글 요약</p>
						</div>
					</div>

					<div class="card col-sm-3" style="width: 18rem;">
						<img class="card-img-top" src="/resources/imgs/Bungie_hotfix.png"
							alt="Card image cap" style="margin-top: 1rem;">
						<div class="card-body">
							<h5 class="card-title">소식 2</h5>
							<p class="card-text">게시글 요약</p>
						</div>
					</div>

					<div class="card col-sm-3" style="width: 18rem;">
						<img class="card-img-top" src="/resources/imgs/Bungie_hotfix.png"
							alt="Card image cap" style="margin-top: 1rem;">
						<div class="card-body">
							<h5 class="card-title">소식 3</h5>
							<p class="card-text">게시글 요약</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="/include/footer.jsp"%>
</body>
</html>