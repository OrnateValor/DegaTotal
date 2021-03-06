<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../include/OVStyle.css">
<script src="/resources/script.js"></script>
<div class="container">
	<hr>
	<h6>
		전체 댓글
		<span class="badge badge-dark">
			<c:choose>
				<c:when test="${totalCmt != null }">${totalCmt }</c:when>
				<c:otherwise>0</c:otherwise>
			</c:choose>
		</span>건
		
	</h6>
	<hr>
	<form action="/addCmt.do" method="post">
		<div
			class="comment-box d-flex row justify-content-around align-items-center">
			<c:choose>
				<c:when test="${sid != null }">
					<input type="text" class="comment-user-box align-self-start" value="${userNm }" disabled="disabled">
					<input type="hidden" name="userId" id="userId" value="${sid }">
					<input type="hidden" name="userNm" id="userNm" value="${userNm }">
					<textarea class="comment-input-box" name="userCmt" id="userCmt" rows="3" style="resize: none;" placeholder="댓글을 입력해주세요"></textarea>
					<p>
						<a class="btn btn-primary" href="javascript:void(0);"onclick="commentChk();">등록</a>
					</p>
					<input type="hidden" name="postId" id="postId" value="${item.itemId }">
				</c:when>
				<c:otherwise>
					<div class="need-login">댓글을 추가하려면 로그인이 필요합니다.</div>
				</c:otherwise>
			</c:choose>
		</div>
	</form>
</div>
