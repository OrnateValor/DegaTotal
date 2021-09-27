<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="mini.dto.Item"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이템 상세</title>
</head>
<body>
	<%@include file="../include/header.jsp"%>
	<!-- alert로 msg 출력 -->
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
				<div style="margin-left: 1rem; margin-right: 1rem;">
					<!-- 아이콘 -->
					<img style="width:96px;" src="/resources/imgs/ico/${item.itemIco }">
				</div>
				<!-- 이름 -->
				<div>
					<h2>
						<strong>${item.itemNm }</strong>
					</h2>
					<!-- 희귀도 / 슬롯 / 분류 -->
					<h5>${item.iRarity  }/${item.iSlot  }/${item.iCategory  }</h5>
					<!-- 수정, 삭제 버튼 -->
					<c:if test="${Admin eq 'true' }">
						<div>
							<a class="btn btn-primary btn-sm" href="/itemMod.do?itemId=${item.itemId }">편집</a>
							<a class="btn btn-danger btn-sm" href="javascript:delItemChk('${item.itemId }')">삭제</a>
						</div>
					</c:if>
				</div>
			</div>
			<hr>
			<!-- 본체 -->
			<div class="row justify-content-center">
				<div class="col-xl-5">
					<img src="/resources/imgs/scr/${item.itemScr }" style="width: 100%">
				</div>

				<div id="stat-container" class="col-xl-6">
					<!-- 설명 -->
					<p>
						<i>${item.itemDes }</i>
					</p>
					<!-- 아이템 스탯 -->
					<div class="">
						<h4>무기 능력치</h4>
						<table class="stat_set" style="width: 100%;">
							<tr>
								<td style="width: 30%">${item.STAT1NM }</td>
								<td>
									<div class="progress bg-dark">
										<div class="progress-bar bg-warning bg-warning" role="progressbar" aria-valuenow="${item.STAT1FIG }"
											aria-valuemax="100" aria-valuemin="0"
											style="width: ${item.STAT1FIG }%"></div>
									</div>
								</td>
								<td>${item.STAT1FIG }</td>
							</tr>
							<tr>
								<td>${item.STAT2NM }</td>
								<td>
									<div class="progress bg-dark">
										<div class="progress-bar bg-warning" role="progressbar"
											aria-valuenow="${item.STAT2FIG }" aria-valuemax="100"
											aria-valuemin="0" style="width: ${item.STAT2FIG }%"></div>
									</div>
								</td>
								<td>${item.STAT2FIG }</td>
							</tr>
							<tr>
								<td class=" ">${item.STAT3NM }</td>
								<td>
									<div class="progress bg-dark">
										<div class="progress-bar bg-warning" role="progressbar"
											aria-valuenow="${item.STAT3FIG }" aria-valuemax="100"
											aria-valuemin="0" style="width: ${item.STAT3FIG }%"></div>
									</div>
								</td>
								<td>${item.STAT3FIG }</td>
							</tr>
							<tr>
								<td class=" ">${item.STAT4NM }</td>
								<td>
									<div class="progress bg-dark">
										<div class="progress-bar bg-warning" role="progressbar"
											aria-valuenow="${item.STAT4FIG }" aria-valuemax="100"
											aria-valuemin="0" style="width: ${item.STAT4FIG }%"></div>
									</div>
								</td>
								<td>${item.STAT4FIG }</td>
							</tr>
							<tr>
								<td class=" ">${item.STAT5NM }</td>
								<td>
									<div class="progress bg-dark">
										<div class="progress-bar bg-warning" role="progressbar"
											aria-valuenow="${item.STAT5FIG }" aria-valuemax="100"
											aria-valuemin="0" style="width: ${item.STAT5FIG }%"></div>
									</div>
								</td>
								<td>${item.STAT5FIG }</td>
							</tr>
							<tr>
								<td class=" ">분당 발사 수</td>
								<td>${item.RPM }</td>
							</tr>
							<tr>
								<td class=" ">탄창</td>
								<td>${item.MAGAZINE }</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="col-xl-8">
					<!-- 아이템 퍽 -->
					<table class="perk_set" style="width: 100%">
						<tr height="10rem">
							<td class="perk_Ico" style=""><img class="ico"
								src="/resources/imgs/ico/${item.perkIco1  }" class="bg-dark"></td>
							<td class="item_perk" style=""><div>
									<strong>${item.perkName1  }</strong>
								</div> ${item.perkDes1  }</td>
						</tr>
						<tr height="10rem">
							<td><img class="ico"
								src="/resources/imgs/ico/${item.perkIco2  }" class="bg-dark"></td>
							<td class="item_perk"><div>
									<strong>${item.perkName2  }</strong>
								</div> ${item.perkDes2  }</td>
						</tr>
						<tr height="10rem">
							<td><img class="ico"
								src="/resources/imgs/ico/${item.perkIco3  }" class="bg-dark"></td>
							<td class="item_perk"><div>
									<strong>${item.perkName3  }</strong>
								</div> ${item.perkDes3  }</td>
						</tr>
						<tr height="10rem">
							<td><img class="ico"
								src="/resources/imgs/ico/${item.perkIco4  }" class="bg-dark"></td>
							<td class="item_perk"><div>
									<strong>${item.perkName4  }</strong>
								</div> ${item.perkDes4  }</td>
						</tr>
						<tr height="10rem">
							<td><img class="ico"
								src="/resources/imgs/ico/${item.perkIco5  }" class=""></td>
							<td class="item_perk"><div>
									<strong>${item.perkName5  }</strong>
								</div> ${item.perkDes5  }</td>
						</tr>
					</table>
					<br>
				</div>
			</div>
			<%@include file="../comment/commentWriter.jsp"%>
			<%@include file="../comment/commentView.jsp"%>
		</div>
	</div>
	<%@include file="../include/footer.jsp"%>
</body>
</html>