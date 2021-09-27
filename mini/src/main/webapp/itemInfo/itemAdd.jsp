<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="mini.dto.Item"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<title>아이템 등록</title>
</head>
<body>
	<%@include file="../include/header.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<form name="itemModForm" action="/itemInsert.do" method="post">
				<div class="form-group col-xl-8 row">
					<div style="margin-left: 1rem; margin-right: 1rem;">
						<!-- 아이콘 -->
						<c:if test=""></c:if>
						<img src="/resources/imgs/ico/no_ico.jpg">
						<div>
							<label for="itemIco" class="btn btn-sm btn-success btn-block">파일
								선택</label> <input type="file" name="itemIco" id="itemIco"
								accept="image/*">
						</div>
					</div>
					<!-- 이름 -->
					<div class="form-group col-xl-10 row">
						<h2>
							<strong><input class="form-control" name="itemNm" placeholder="아이템명"></strong>
						</h2>
						<!-- 희귀도 -->
						<div class="form-group col-xl-10 row">
							<select class="form-control" style="width: 8rem;" name="iRarity">
								<option value="">희귀도</option>
								<option id="경이" value="경이">경이</option>
								<option id="전설" value="전설">전설</option>
								<option id="희귀" value="희귀">희귀</option>
								<option id="고급" value="고급">고급</option>
								<option id="일반" value="일반">일반</option>
							</select>/
							<!-- 장비 슬롯 -->
							<select class="form-control" style="width: 8rem;" name="iSlot">
								<option value="">장비 슬롯</option>
								<option id="물리 무기" value="물리 무기">물리 무기</option>
								<option id="에너지 무기" value="에너지 무기">에너지 무기</option>
								<option id="중화기" value="중화기">중화기</option>
							</select>/
							<!-- 무기군 -->
							<select class="form-control" style="width: 10rem;"
								name="iCategory">
								<option value="">무기군</option>
								<option id="자동 소총" value="자동 소총">자동 소총</option>
								<option id="파동 소총" value="파동 소총">파동 소총</option>
								<option id="정찰 소총" value="정찰 소총">정찰 소총</option>
								<option id="융합 소총" value="융합 소총">융합 소총</option>
								<option id="선형 융합 소총" value="선형 융합 소총">선형 융합 소총</option>
								<option id="추적 소총" value="추적 소총">추적 소총</option>
								<option id="핸드 캐논" value="핸드 캐논">핸드 캐논</option>
								<option id="보조 무기" value="보조 무기">보조 무기</option>
								<option id="전투 활" value="전투 활">전투 활</option>
								<option id="산탄총" value="산탄총">산탄총</option>
								<option id="저격총" value="저격총">저격총</option>
								<option id="기관단총" value="기관단총">기관단총</option>
								<option id="기관총" value="기관총">기관총</option>
								<option id="유탄발사기" value="유탄발사기">유탄발사기</option>
								<option id="로켓발사기" value="로켓발사기">로켓발사기</option>
								<option id="검" value="검">검</option>
							</select>
						</div>
						<!-- 수정, 삭제 버튼 -->
						<div class="col-xl-8">
							<a class="btn btn-primary btn-sm" href="javascript:addItemChk()">등록</a> <a
								class="btn btn-danger btn-sm" href="/itemList.do">취소</a>
						</div>
					</div>
				</div>
				<hr>
				<!-- 본체 -->
				<div class="form-group row justify-content-center">
					<div class="col-xl-5">
						<img src="/resources/imgs/scr/no_scr.jpg" style="width: 100%">
						<div>
							<label for="itemScr" class="btn btn-sm btn-success btn-block">파일
								선택</label> <input type="file" name="itemScr" id="itemScr"
								accept="image/*">
						</div>
					</div>
					<div id="stat-container" class="col-xl-5">
						<!-- 설명 -->
						<p>
							<textarea class="form-control" name="itemDes" cols="50" rows="2">플레이버 텍스트</textarea>
						</p>
						<!-- 아이템 스탯 -->
						<div class="">
							<h4>무기 능력치</h4>
							<table class="stat_set" style="width: 100%;">
								<tr>
									<td class="statNm"><input class="form-control" type="text"
										name="STAT1NM" placeholder="스탯1"></td>
									<!-- 슬라이더 -->
									<td class="statFig"><input class="form-control"
										name="STAT1FIG" type="range" max="100" min="0" step="1"
										oninput="document.getElementById('stat1Fig').innerHTML=this.value;"></td>
									<!-- 슬라이더 표시기 -->
									<td><span id="stat1Fig">50</span></td>

								</tr>
								<tr>
									<td class="statNm"><input class="form-control" type="text"
										name="STAT2NM" placeholder="스탯2"></td>
									<!-- 슬라이더 -->
									<td class="statFig"><input class="form-control"
										name="STAT2FIG" type="range" max="100" min="0" step="1"
										oninput="document.getElementById('stat2Fig').innerHTML=this.value;"></td>
									<!-- 슬라이더 표시기 -->
									<td><span id="stat2Fig">50</span></td>
								</tr>
								<tr>
									<td class="statNm"><input class="form-control" type="text"
										name="STAT3NM" placeholder="스탯3"></td>
									<!-- 슬라이더 -->
									<td class="statFig"><input class="form-control"
										name="STAT3FIG" type="range" max="100" min="0" step="1"
										oninput="document.getElementById('stat3Fig').innerHTML=this.value;"></td>
									<!-- 슬라이더 표시기 -->
									<td><span id="stat3Fig">50</span></td>
								</tr>
								<tr>
									<td class="statNm"><input class="form-control" type="text"
										name="STAT4NM" placeholder="스탯4"></td>
									<!-- 슬라이더 -->
									<td class="statFig"><input class="form-control"
										name="STAT4FIG" type="range" max="100" min="0" step="1"
										oninput="document.getElementById('stat4Fig').innerHTML=this.value;"></td>
									<!-- 슬라이더 표시기 -->
									<td><span id="stat4Fig">50</span></td>
								</tr>
								<tr>
									<td class="statNm"><input class="form-control" type="text"
										name="STAT5NM" placeholder="스탯5"></td>
									<!-- 슬라이더 -->
									<td class="statFig"><input class="form-control"
										name="STAT5FIG" type="range" max="100" min="0" step="1"
										oninput="document.getElementById('stat5Fig').innerHTML=this.value;"></td>
									<!-- 슬라이더 표시기 -->
									<td><span id="stat5Fig">50</span></td>
								</tr>
								<tr>
									<td class=" ">분당 발사 수</td>
									<td><input class="form-control col-xl-5 col-md-4"
										type="number" name="RPM"></td>
								</tr>
								<tr>
									<td class=" ">탄창</td>
									<td><input class="form-control col-xl-5 col-md-4"
										type="number" name="MAGAZINE"></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="col-xl-8">
						<!-- 아이템 퍽 -->
						<table class="perk_set" style="">
							<tr class="perk">
								<td><img class="ico" src="/resources/imgs/ico/no_ico.jpg"
									class="bg-dark">
									<div>
										<label for="perkIco1" class="btn btn-sm btn-dark btn-block">파일
											선택</label> <input type="file" name="perkIco1" id="perkIco1"
											accept="image/*">
									</div></td>
								<td class="item_perk"><strong><input type="text"
										class="form-control" name="perkName1" placeholder="특성1"></strong>
									<textarea class="form-control" name="perkDes1">특성1 설명</textarea></td>
							</tr>
							<tr class="perk">
								<td><img class="ico" src="/resources/imgs/ico/no_ico.jpg"
									class="bg-dark">
									<div>
										<label for="perkIco2" class="btn btn-sm btn-dark btn-block">파일
											선택</label> <input type="file" name="perkIco2" id="perkIco2"
											accept="image/*">
									</div></td>
								<td class="item_perk"><strong><input type="text"
										class="form-control" name="perkName2" placeholder="특성2"></strong>
									<textarea class="form-control" name="perkDes2">특성2 설명</textarea></td>
							</tr>
							<tr class="perk">
								<td><img class="ico" src="/resources/imgs/ico/no_ico.jpg"
									class="bg-dark">
									<div>
										<label for="perkIco3" class="btn btn-sm btn-dark btn-block">파일
											선택</label> <input type="file" name="perkIco3" id="perkIco3"
											accept="image/*">
									</div></td>
								<td class="item_perk"><strong><input type="text"
										class="form-control" name="perkName3" placeholder="특성3"></strong>
									<textarea class="form-control" name="perkDes3">특성3 설명</textarea></td>
							</tr>
							<tr class="perk">
								<td><img class="ico" src="/resources/imgs/ico/no_ico.jpg"
									class="bg-dark">
									<div>
										<label for="perkIco4" class="btn btn-sm btn-dark btn-block">파일
											선택</label> <input type="file" name="perkIco4" id="perkIco4"
											accept="image/*">
									</div></td>
								<td class="item_perk"><strong><input type="text"
										class="form-control" name="perkName4" placeholder="특성4"></strong>
									<textarea class="form-control" name="perkDes4">특성4 설명</textarea></td>
							</tr>
							<tr class="perk">
								<td><img class="ico" src="/resources/imgs/ico/no_ico.jpg"
									class="">
									<div>
										<label for="perkIco5" class="btn btn-sm btn-dark btn-block">파일
											선택</label> <input type="file" name="perkIco5" id="perkIco5"
											accept="image/*">
									</div></td>
								<td class="item_perk"><strong><input type="text"
										class="form-control" name="perkName5" placeholder="특성5"></strong>
									<textarea class="form-control" name="perkDes5">특성5 설명</textarea></td>
							</tr>
						</table>
						<br>
					</div>
				</div>
				<input type="hidden" name="_itemScr" value="no_scr.jpg">
				<input type="hidden" name="_itemIco" value="no_ico.jpg">
				<input type="hidden" name="_perkIco1" value="no_ico.jpg">
				<input type="hidden" name="_perkIco2" value="no_ico.jpg">
				<input type="hidden" name="_perkIco3" value="no_ico.jpg">
				<input type="hidden" name="_perkIco4" value="no_ico.jpg">
				<input type="hidden" name="_perkIco5" value="no_ico.jpg">
			</form>
		</div>
	</div>
	<%@include file="../include/footer.jsp"%>
</body>
</html>