<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="mini.dto.Post"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="../include/header.jsp"%>
<title>게시물 작성</title>
<script>
/* 썸머노트 본체는 헤더페이지에 포함 */
	$(document).ready(function() {
		$('#content').summernote({
			height : 400, // 에디터 높이 지정
			minHeight : 200, // 에디터 최소 높이
			maxHeight : null, // 에디터 최대 높이
			focus : true,
			lang : 'ko-KR' // 기본 메뉴언어 US->KR로 변경
		});
	});
</script>
<body>
<div class="jumbotron">
	<div class="container">
		<div class="col-xl-10 row">
			<div>
				<h2>
					<strong>게시물 작성</strong>
				</h2>
			</div>
		</div>
		<hr>
		<div class="container">
			<form action="/addPost.do" class="form-horizontal" method="post">
				<div class="form-group row">
					<label class="col-xl-2">제목</label>
					<div class="col-xl-10">
						<input type="text" name="postSub" id="postSub" class="form-control"
							placeholder='제목을 입력 해 주세요'>
					</div>
				</div>
				
				<div class="form-group row">
					<!-- 앞에 fakepath가 붙으므로, substring으로 12번째부터 불러오기 -->
					<label class="col-xl-2">섬네일</label>
					<input class="col-xl-10" type="file" id="postThumb" name="postThumb">
				</div>
				
				<div class="form-group row">
					<label class="col-xl-2">내용</label>
					<div class="col-xl-10">
						<textarea id="content" name="content" cols="200" rows="8" class="summernote form-control"></textarea>
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-xl-12" align="right">
						<a href="javascript:void(0);" class="btn btn-primary" onclick="addPostChk();">등록</a>
						<input type="button" class="btn btn-dark" value="취소" onclick="/PostList.do">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
	<%@include file="../include/footer.jsp"%>
</body>
</html>