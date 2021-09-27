<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h1>Mini Project - 게임정보 페이지</h1>
	<ol>
		<li>데스티니2 게임정보 페이지 개요<!-- 개요 -->
			<ul>
				<li>프로젝트 개요
					<ul>
						<li>회원가입으로 운영되는 금주의 리셋과 경이아이템 정보 공유사이트</li>
					</ul>
				</li>
			</ul>
			<ul>
				<li>기능개요<!-- 기능개요 -->
					<ol type="I">
						<li>공통기능
							<ul type="circle">
								<li>로그인</li>
								<li>로그아웃</li>
								<li>회원가입</li>
								<li>마이페이지</li>
							</ul>
						</li>
						<li>금주의 활동표시
							<ul type="circle">
								<li>공통기능 : 활동 리스트 열람, 활동 상세보기</li>
								<li>관리자 : 활동 등록, 수정, 삭제</li>
							</ul>
						</li>
						<li>아이템 정보표시
							<ul type="circle">
								<li>공통기능 : 아이템 목록 보기, 아이템 상세보기</li>
								<li>관리자 : 아이템정보 등록, 수정, 삭제</li>
								<li>유저 : 추천, 비추천</li>
							</ul>
						</li>
						<li>아이템 정보 댓글
							<ul type="circle">
								<li>공통기능 : 댓글 목록보기
								<li>유저 : 댓글 추가, 수정, 삭제</li>
							</ul>
						</li>
					</ol>
				</li>
				<!-- 기능개요 끝 -->
				<li>요구사항 정의<!-- 요구사항 정의 -->
					<ol type="I">
						<li>회원가입
							<ol type="i">
								<li>아이디(필수, 중복검사, 영문,숫자,특문 허용 8~12자리) uId</li>
								<li>비밀번호(필수, 영문+숫자+특수문자 조합) uPw</li>
								<li>이름 uNm</li>
								<li>이메일 uEmail</li>
								<li>프로필사진 uImg</li>
								<li>권한 - 관리자(Y), 회원(N) 두가지. 가입 시 DEFAULT는 N, DB에서 컨트롤</li>
							</ol>
						</li>
						<li>로그인
							<ol type="i">
								<li>ID랑 PW 확인</li>
								<li>로그인 성공 시 - 메인화면으로 돌아감, 성공메세지 출력.</li>
								<li>로그인 실패시 로그인화면에서 로그인 실패 메세지 출력</li>
							</ol>
						</li>
						<li>로그아웃
							<ol type="i">
								<li>로그아웃 성공 시 - 메인화면으로 돌아감, 성공메세지 출력.</li>
								<li>로그아웃 실패시 에러화면 출력</li>
							</ol>
						</li>
						<li>마이페이지
							<ol type="i">
								<li>회원정보 수정 - 비밀번호, 이름, 프로필사진, 이메일 수정 가능</li>
								<li>작성한 댓글 보기</li>
								<li>회원탈퇴</li>
							</ol>
						</li>
						<li>번지 소식
							<ol type="i">
								<li>관리자만 등록 가능</li>
								<li>번지 홈페이지 내용 가져올 것</li>
								<li>등록된 내용물들은 가장 최근 내용 3개를 메인화면에서 표시</li>								
								<li>게시물번호 : 자동</li>
								<li>제목 : 입력</li>
								<li>내용 : 텍스트 에디터를 이용해서 작성.</li>
								<li>등록일</li>
							</ol>
						</li>
						<li>번지 소식 - 활동 목록 포함사항
							<ol type="i">
								<li>카테고리 : 공격전, 전장, 황혼전, 주간 시련의장, 엑소도전, 슬픔의 제단, 적용 모드, 드랍 전설, 적용 기간
								</li>
								<li>공격전
									<ul type="circle">
										<li>적용 모드</li>
										<li>적용기간</li>
									</ul>
								</li>
								<li>전장
									<ul type="circle">
										<li>적용 모드</li>
										<li>적용기간</li>
									</ul>
								</li>
								<li>황혼전
									<ul type="circle">
										<li>출현 맵</li>
										<li>난이도</li>
										<li>적용 모드</li>
										<li>드랍 아이템</li>
										<li>적용기간</li>
									</ul>
								</li>
								<li>시련의 장 주간 플레이리스트
									<ul type="circle">
										<li>적용 모드</li>
										<li>적용기간</li>
									</ul>
								</li>
								<li>엑소도전
									<ul type="circle">
										<li>도전 유형 이름</li>
										<li>설명</li>
										<li>적용기간</li>
									</ul>
								</li>
								<li>슬픔의 제단
									<ul type="circle">
										<li>드랍 아이템</li>
										<li>적용기간</li>
									</ul>
								</li>
							</ol>
						</li>
						<li>이번 주 데스티니 소식<br>번지넷 press 페이지 include, 또는 소스 활용
						</li>
						<li>아이템 정보
							<ol type="i">
								<li>아이템 이름, 스크린샷, 아이콘, 설명, 태그(등급, 분류, 유형), 특성아이콘, 특성이름,
									특성설명(1~4)</li>
								<li>등급 : 일반, 고급, 희귀, 전설, 경이</li>
								<li>분류 : 자동소총, 파동소총, 정찰소총, 융합소총, 선형융합소총, 추적소총,<br>
									핸드캐논, 보조무기, 전투 활, 산탄총, 저격총, 기관단총, 기관총, 유탄발사기, 로켓발사기, 검
								</li>
								<li>업로드 - 관리자만</li>
								<li>아이템 목록에서는 이름과 아이콘만</li>
								<li>아이템 상세보기에서는 세부정보 표시</li>
								<li>화면에 전체 아이템 목록</li>
								<li>아이콘 클릭하여 세부정보 진입</li>
								<li>로그인한 사람에 대해서 추천, 비추천과 입력 가능</li>
							</ol>
						</li>
						<li>댓글 기능
							<ol type="i">
								<li>댓글은 한줄로</li>
								<li>댓글 열람은 누구나 가능</li>
								<li>로그인한 회원만 댓글 추가 가능</li>
								<li>자기가 단 댓글만 삭제 가능</li>
							</ol>
						</li>
					</ol>
				</li>
				<!-- 요구사항 정의 끝 -->
			</ul>
			<hr>
		</li>
		<!-- 개요 끝 -->
		<li>가능하면 추가할 사항들<!-- 추가사항START  -->
			<ul>
				<li>API를 연결해서 내 인벤토리 및 현재 착용 아이템 조회</li>
				<li>로그인 - 게임DB랑 연동</li>
				<li>현재 내 계정의 캐릭터 조회 - User.GetBungieNetUserById
					<ol>
						<li>현재 내 캐릭터의 인벤토리 아이템 조회</li>
						<li>현재 내 캐릭터가 장비한 아이템 조회</li>
						<li>인벤토리와 장비칸 간 아이템 이동</li>
						<li>아이템 이동은 아이템 아이콘 드래그를 통하여 이동함</li>
					</ol>
				</li>
				<li>현재 내 계정 창고 조회
					<ul>
						<li>계정 창고에서 캐릭터 인벤토리로 아이템 이동</li>
						<li>계정 창고에서 캐릭터 아이템 장비</li>
					</ul>
				</li>
			</ul>
		</li>
		<!-- 추가사항END  -->
	</ol>
</body>
</html>