<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  page import="java.util.*"%>
<%@ page import="mini.dto.Item"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이템 목록</title>
<%@include file="../include/header.jsp"%>
</head>
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
			<div class="col-sm">
				<h2>아이템 DB</h2>
				<%
				//콘솔 출력용 코드
				//System.out.println("admin : "+request.getParameter("admin"));
				%>
				<c:if test="${Admin eq 'true' }">
					<a type="button" class="btn btn-primary btn-sm col-sm-2"
						href="/itemAdd.do">아이템등록</a>
				</c:if>
			</div>
			<hr>
			<div style="margin-top: 3rem; margin-bottom: 3rem">
				<div class="row justify-content-left">
					<c:choose>
						<c:when test="${empty itemList }">
							조회 가능한 아이템이 없습니다.
							<c:out value="${itemList }" />
						</c:when>
						<c:otherwise>
							<c:forEach items="${itemList }" var="item">
								<div class="card" style="width: 8rem; margin: 1rem;">
									<img class="card-img-top"
										src="/resources/imgs/ico/${item.itemIco }" alt="itemIco">
									<div>
										<strong class="card-title" style="overflow: ellipsis;">${item.itemNm }</strong>
										<%-- <p class="card-text">${item.itemDes }</p> --%>
									</div>
									<div style="position: relative; botton: 0;">
										<a href="/itemInfo.do?itemId=${item.itemId }"
											class="btn btn-sm btn-dark">상세보기>></a>
									</div>
								</div>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	<%@include file="/include/footer.jsp"%>
</body>
</html>