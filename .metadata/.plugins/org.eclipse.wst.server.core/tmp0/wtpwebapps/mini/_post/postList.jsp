<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="mini.dto.Post"%>
<%@include file="../include/header.jsp"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<title>번지 소식</title>
<body style="background: #E9ECEF; height: 100%; width: 100%;">
	<!-- msg 값이 있는 경우, alert로 msg 출력 -->
	<c:if test="${msg != null }">
		<script>
			alert('${msg}');
		</script>
		<%
		session.removeAttribute("msg");
		%>
	</c:if>
	<div class="jumbotron">	
	<div class="container">
		<div class="col-xl-10 row">
			<div>
				<h2>
					<strong>번지 소식</strong>
				</h2>
			</div>
		</div>
		<hr>
		<div class="row">
			<!-- 등록된 게시물이 없는 경우 - 알림 메시지 표시 -->
			<c:choose>
				<c:when test="">
					등록된 게시물이 없습니다.
				</c:when>
				<c:otherwise>
					<!-- 게시물이 있는 경우 -->
					<div class="col-12 row mb-3">
						<div class="col-8">
							<select>
								<option>제 목</option>
								<option>내 용</option>
								<option>제목+내용</option>
							</select> <input type="search" id="searchbar" name="keyword" /> <input
								type="submit" value="검색" class="btn btn-dark btn-sm">
								<c:if test="${Admin eq 'true' }">
								<a href="/postWrite.do" class="btn btn-info btn-sm">글쓰기</a>
								</c:if>
						</div>
					</div>
					<!-- 게시물을 테이블 형태로 출력 -->
					<table class="table table-hover">
						<thead>
							<tr class="post-list-header">
								<th id="pId" class="col-xl-1">번 호</th>
								<th id="thumb" class="col-xl-3">섬네일</th>
								<th id="pSub" class="col-xl-6">제 목</th>
								<th id="pRdate" class="col-xl-2">작성일</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${postList }" var="post">
								<tr onclick="location.href = '/postView.do?postId=${post.postId}'">
									<td id="pId">${post.postId }</td>
									<td id="thumb"><img src="/resources/imgs/post/${post.postThumb }"></td>
									<td id="pSub">${post.postSub }</td>
									<td id="pRdate">${post.regDate }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	</div>
	<%@include file="../include/footer.jsp"%>
</body>
</html>