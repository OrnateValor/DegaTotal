/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.50
 * Generated at: 2021-09-26 08:21:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.itemInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mini.dto.Item;

public final class itemAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1631996497649L));
    _jspx_dependants.put("jar:file:/C:/Users/paeks/DegaTotal/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mini/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/Users/paeks/DegaTotal/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mini/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/itemInfo/../include/header.jsp", Long.valueOf(1632642336454L));
    _jspx_dependants.put("/itemInfo/../include/footer.jsp", Long.valueOf(1632640048325L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("mini.dto.Item");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style>\r\n");
      out.write("input[type=\"file\"] {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	width: 1px;\r\n");
      out.write("	height: 1px;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	margin: -1px;\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("	clip: rect(0, 0, 0, 0);\r\n");
      out.write("	border: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>아이템 등록</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Project Sources -->\r\n");
      out.write("<script src=\"/resources/script.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../include/OVStyle.css\">\r\n");
      out.write("<!-- Jquery -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<!--BootStarp 4.1.1  -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("<!-- summernote -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- header page -->\r\n");
      out.write("<nav class='navbar sticky-top navbar-expand navbar-dark bg-secondary'>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"navbar-header\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"/main.jsp\"><img class=\"nav-item\"\r\n");
      out.write("				src=\"/resources/imgs/destiny2_icon_384.png\" width=\"64\"> 데가 종합</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<a class=\"btn btn-dark btn-lg\" href=\"/postList.do\">번지 소식</a> <a\r\n");
      out.write("			class=\"btn btn-dark btn-lg\" href=\"/itemList.do\">아이템 DB</a>\r\n");
      out.write("		<div>\r\n");
      out.write("			");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"jumbotron\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<form name=\"itemModForm\" action=\"/itemInsert.do\" method=\"post\">\r\n");
      out.write("				<div class=\"form-group col-xl-8 row\">\r\n");
      out.write("					<div style=\"margin-left: 1rem; margin-right: 1rem;\">\r\n");
      out.write("						<!-- 아이콘 -->\r\n");
      out.write("						");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						<img src=\"/resources/imgs/ico/no_ico.jpg\">\r\n");
      out.write("						<div>\r\n");
      out.write("							<label for=\"itemIco\" class=\"btn btn-sm btn-success btn-block\">파일\r\n");
      out.write("								선택</label> <input type=\"file\" name=\"itemIco\" id=\"itemIco\"\r\n");
      out.write("								accept=\"image/*\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- 이름 -->\r\n");
      out.write("					<div class=\"form-group col-xl-10 row\">\r\n");
      out.write("						<h2>\r\n");
      out.write("							<strong><input class=\"form-control\" name=\"itemNm\" placeholder=\"아이템명\"></strong>\r\n");
      out.write("						</h2>\r\n");
      out.write("						<!-- 희귀도 -->\r\n");
      out.write("						<div class=\"form-group col-xl-10 row\">\r\n");
      out.write("							<select class=\"form-control\" style=\"width: 8rem;\" name=\"iRarity\">\r\n");
      out.write("								<option value=\"\">희귀도</option>\r\n");
      out.write("								<option id=\"경이\" value=\"경이\">경이</option>\r\n");
      out.write("								<option id=\"전설\" value=\"전설\">전설</option>\r\n");
      out.write("								<option id=\"희귀\" value=\"희귀\">희귀</option>\r\n");
      out.write("								<option id=\"고급\" value=\"고급\">고급</option>\r\n");
      out.write("								<option id=\"일반\" value=\"일반\">일반</option>\r\n");
      out.write("							</select>/\r\n");
      out.write("							<!-- 장비 슬롯 -->\r\n");
      out.write("							<select class=\"form-control\" style=\"width: 8rem;\" name=\"iSlot\">\r\n");
      out.write("								<option value=\"\">장비 슬롯</option>\r\n");
      out.write("								<option id=\"물리 무기\" value=\"물리 무기\">물리 무기</option>\r\n");
      out.write("								<option id=\"에너지 무기\" value=\"에너지 무기\">에너지 무기</option>\r\n");
      out.write("								<option id=\"중화기\" value=\"중화기\">중화기</option>\r\n");
      out.write("							</select>/\r\n");
      out.write("							<!-- 무기군 -->\r\n");
      out.write("							<select class=\"form-control\" style=\"width: 10rem;\"\r\n");
      out.write("								name=\"iCategory\">\r\n");
      out.write("								<option value=\"\">무기군</option>\r\n");
      out.write("								<option id=\"자동 소총\" value=\"자동 소총\">자동 소총</option>\r\n");
      out.write("								<option id=\"파동 소총\" value=\"파동 소총\">파동 소총</option>\r\n");
      out.write("								<option id=\"정찰 소총\" value=\"정찰 소총\">정찰 소총</option>\r\n");
      out.write("								<option id=\"융합 소총\" value=\"융합 소총\">융합 소총</option>\r\n");
      out.write("								<option id=\"선형 융합 소총\" value=\"선형 융합 소총\">선형 융합 소총</option>\r\n");
      out.write("								<option id=\"추적 소총\" value=\"추적 소총\">추적 소총</option>\r\n");
      out.write("								<option id=\"핸드 캐논\" value=\"핸드 캐논\">핸드 캐논</option>\r\n");
      out.write("								<option id=\"보조 무기\" value=\"보조 무기\">보조 무기</option>\r\n");
      out.write("								<option id=\"전투 활\" value=\"전투 활\">전투 활</option>\r\n");
      out.write("								<option id=\"산탄총\" value=\"산탄총\">산탄총</option>\r\n");
      out.write("								<option id=\"저격총\" value=\"저격총\">저격총</option>\r\n");
      out.write("								<option id=\"기관단총\" value=\"기관단총\">기관단총</option>\r\n");
      out.write("								<option id=\"기관총\" value=\"기관총\">기관총</option>\r\n");
      out.write("								<option id=\"유탄발사기\" value=\"유탄발사기\">유탄발사기</option>\r\n");
      out.write("								<option id=\"로켓발사기\" value=\"로켓발사기\">로켓발사기</option>\r\n");
      out.write("								<option id=\"검\" value=\"검\">검</option>\r\n");
      out.write("							</select>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- 수정, 삭제 버튼 -->\r\n");
      out.write("						<div class=\"col-xl-8\">\r\n");
      out.write("							<a class=\"btn btn-primary btn-sm\" href=\"javascript:addItemChk()\">등록</a> <a\r\n");
      out.write("								class=\"btn btn-danger btn-sm\" href=\"/itemList.do\">취소</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<hr>\r\n");
      out.write("				<!-- 본체 -->\r\n");
      out.write("				<div class=\"form-group row justify-content-center\">\r\n");
      out.write("					<div class=\"col-xl-5\">\r\n");
      out.write("						<img src=\"/resources/imgs/scr/no_scr.jpg\" style=\"width: 100%\">\r\n");
      out.write("						<div>\r\n");
      out.write("							<label for=\"itemScr\" class=\"btn btn-sm btn-success btn-block\">파일\r\n");
      out.write("								선택</label> <input type=\"file\" name=\"itemScr\" id=\"itemScr\"\r\n");
      out.write("								accept=\"image/*\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div id=\"stat-container\" class=\"col-xl-5\">\r\n");
      out.write("						<!-- 설명 -->\r\n");
      out.write("						<p>\r\n");
      out.write("							<textarea class=\"form-control\" name=\"itemDes\" cols=\"50\" rows=\"2\">플레이버 텍스트</textarea>\r\n");
      out.write("						</p>\r\n");
      out.write("						<!-- 아이템 스탯 -->\r\n");
      out.write("						<div class=\"\">\r\n");
      out.write("							<h4>무기 능력치</h4>\r\n");
      out.write("							<table class=\"stat_set\" style=\"width: 100%;\">\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td class=\"statNm\"><input class=\"form-control\" type=\"text\"\r\n");
      out.write("										name=\"STAT1NM\" placeholder=\"스탯1\"></td>\r\n");
      out.write("									<!-- 슬라이더 -->\r\n");
      out.write("									<td class=\"statFig\"><input class=\"form-control\"\r\n");
      out.write("										name=\"STAT1FIG\" type=\"range\" max=\"100\" min=\"0\" step=\"1\"\r\n");
      out.write("										oninput=\"document.getElementById('stat1Fig').innerHTML=this.value;\"></td>\r\n");
      out.write("									<!-- 슬라이더 표시기 -->\r\n");
      out.write("									<td><span id=\"stat1Fig\">50</span></td>\r\n");
      out.write("\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td class=\"statNm\"><input class=\"form-control\" type=\"text\"\r\n");
      out.write("										name=\"STAT2NM\" placeholder=\"스탯2\"></td>\r\n");
      out.write("									<!-- 슬라이더 -->\r\n");
      out.write("									<td class=\"statFig\"><input class=\"form-control\"\r\n");
      out.write("										name=\"STAT2FIG\" type=\"range\" max=\"100\" min=\"0\" step=\"1\"\r\n");
      out.write("										oninput=\"document.getElementById('stat2Fig').innerHTML=this.value;\"></td>\r\n");
      out.write("									<!-- 슬라이더 표시기 -->\r\n");
      out.write("									<td><span id=\"stat2Fig\">50</span></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td class=\"statNm\"><input class=\"form-control\" type=\"text\"\r\n");
      out.write("										name=\"STAT3NM\" placeholder=\"스탯3\"></td>\r\n");
      out.write("									<!-- 슬라이더 -->\r\n");
      out.write("									<td class=\"statFig\"><input class=\"form-control\"\r\n");
      out.write("										name=\"STAT3FIG\" type=\"range\" max=\"100\" min=\"0\" step=\"1\"\r\n");
      out.write("										oninput=\"document.getElementById('stat3Fig').innerHTML=this.value;\"></td>\r\n");
      out.write("									<!-- 슬라이더 표시기 -->\r\n");
      out.write("									<td><span id=\"stat3Fig\">50</span></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td class=\"statNm\"><input class=\"form-control\" type=\"text\"\r\n");
      out.write("										name=\"STAT4NM\" placeholder=\"스탯4\"></td>\r\n");
      out.write("									<!-- 슬라이더 -->\r\n");
      out.write("									<td class=\"statFig\"><input class=\"form-control\"\r\n");
      out.write("										name=\"STAT4FIG\" type=\"range\" max=\"100\" min=\"0\" step=\"1\"\r\n");
      out.write("										oninput=\"document.getElementById('stat4Fig').innerHTML=this.value;\"></td>\r\n");
      out.write("									<!-- 슬라이더 표시기 -->\r\n");
      out.write("									<td><span id=\"stat4Fig\">50</span></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td class=\"statNm\"><input class=\"form-control\" type=\"text\"\r\n");
      out.write("										name=\"STAT5NM\" placeholder=\"스탯5\"></td>\r\n");
      out.write("									<!-- 슬라이더 -->\r\n");
      out.write("									<td class=\"statFig\"><input class=\"form-control\"\r\n");
      out.write("										name=\"STAT5FIG\" type=\"range\" max=\"100\" min=\"0\" step=\"1\"\r\n");
      out.write("										oninput=\"document.getElementById('stat5Fig').innerHTML=this.value;\"></td>\r\n");
      out.write("									<!-- 슬라이더 표시기 -->\r\n");
      out.write("									<td><span id=\"stat5Fig\">50</span></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td class=\" \">분당 발사 수</td>\r\n");
      out.write("									<td><input class=\"form-control col-xl-5 col-md-4\"\r\n");
      out.write("										type=\"number\" name=\"RPM\"></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td class=\" \">탄창</td>\r\n");
      out.write("									<td><input class=\"form-control col-xl-5 col-md-4\"\r\n");
      out.write("										type=\"number\" name=\"MAGAZINE\"></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</table>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-xl-8\">\r\n");
      out.write("						<!-- 아이템 퍽 -->\r\n");
      out.write("						<table class=\"perk_set\" style=\"\">\r\n");
      out.write("							<tr class=\"perk\">\r\n");
      out.write("								<td><img class=\"ico\" src=\"/resources/imgs/ico/no_ico.jpg\"\r\n");
      out.write("									class=\"bg-dark\">\r\n");
      out.write("									<div>\r\n");
      out.write("										<label for=\"perkIco1\" class=\"btn btn-sm btn-dark btn-block\">파일\r\n");
      out.write("											선택</label> <input type=\"file\" name=\"perkIco1\" id=\"perkIco1\"\r\n");
      out.write("											accept=\"image/*\">\r\n");
      out.write("									</div></td>\r\n");
      out.write("								<td class=\"item_perk\"><strong><input type=\"text\"\r\n");
      out.write("										class=\"form-control\" name=\"perkName1\" placeholder=\"특성1\"></strong>\r\n");
      out.write("									<textarea class=\"form-control\" name=\"perkDes1\">특성1 설명</textarea></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr class=\"perk\">\r\n");
      out.write("								<td><img class=\"ico\" src=\"/resources/imgs/ico/no_ico.jpg\"\r\n");
      out.write("									class=\"bg-dark\">\r\n");
      out.write("									<div>\r\n");
      out.write("										<label for=\"perkIco2\" class=\"btn btn-sm btn-dark btn-block\">파일\r\n");
      out.write("											선택</label> <input type=\"file\" name=\"perkIco2\" id=\"perkIco2\"\r\n");
      out.write("											accept=\"image/*\">\r\n");
      out.write("									</div></td>\r\n");
      out.write("								<td class=\"item_perk\"><strong><input type=\"text\"\r\n");
      out.write("										class=\"form-control\" name=\"perkName2\" placeholder=\"특성2\"></strong>\r\n");
      out.write("									<textarea class=\"form-control\" name=\"perkDes2\">특성2 설명</textarea></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr class=\"perk\">\r\n");
      out.write("								<td><img class=\"ico\" src=\"/resources/imgs/ico/no_ico.jpg\"\r\n");
      out.write("									class=\"bg-dark\">\r\n");
      out.write("									<div>\r\n");
      out.write("										<label for=\"perkIco3\" class=\"btn btn-sm btn-dark btn-block\">파일\r\n");
      out.write("											선택</label> <input type=\"file\" name=\"perkIco3\" id=\"perkIco3\"\r\n");
      out.write("											accept=\"image/*\">\r\n");
      out.write("									</div></td>\r\n");
      out.write("								<td class=\"item_perk\"><strong><input type=\"text\"\r\n");
      out.write("										class=\"form-control\" name=\"perkName3\" placeholder=\"특성3\"></strong>\r\n");
      out.write("									<textarea class=\"form-control\" name=\"perkDes3\">특성3 설명</textarea></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr class=\"perk\">\r\n");
      out.write("								<td><img class=\"ico\" src=\"/resources/imgs/ico/no_ico.jpg\"\r\n");
      out.write("									class=\"bg-dark\">\r\n");
      out.write("									<div>\r\n");
      out.write("										<label for=\"perkIco4\" class=\"btn btn-sm btn-dark btn-block\">파일\r\n");
      out.write("											선택</label> <input type=\"file\" name=\"perkIco4\" id=\"perkIco4\"\r\n");
      out.write("											accept=\"image/*\">\r\n");
      out.write("									</div></td>\r\n");
      out.write("								<td class=\"item_perk\"><strong><input type=\"text\"\r\n");
      out.write("										class=\"form-control\" name=\"perkName4\" placeholder=\"특성4\"></strong>\r\n");
      out.write("									<textarea class=\"form-control\" name=\"perkDes4\">특성4 설명</textarea></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr class=\"perk\">\r\n");
      out.write("								<td><img class=\"ico\" src=\"/resources/imgs/ico/no_ico.jpg\"\r\n");
      out.write("									class=\"\">\r\n");
      out.write("									<div>\r\n");
      out.write("										<label for=\"perkIco5\" class=\"btn btn-sm btn-dark btn-block\">파일\r\n");
      out.write("											선택</label> <input type=\"file\" name=\"perkIco5\" id=\"perkIco5\"\r\n");
      out.write("											accept=\"image/*\">\r\n");
      out.write("									</div></td>\r\n");
      out.write("								<td class=\"item_perk\"><strong><input type=\"text\"\r\n");
      out.write("										class=\"form-control\" name=\"perkName5\" placeholder=\"특성5\"></strong>\r\n");
      out.write("									<textarea class=\"form-control\" name=\"perkDes5\">특성5 설명</textarea></td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</table>\r\n");
      out.write("						<br>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<input type=\"hidden\" name=\"_itemScr\" value=\"no_scr.jpg\">\r\n");
      out.write("				<input type=\"hidden\" name=\"_itemIco\" value=\"no_ico.jpg\">\r\n");
      out.write("				<input type=\"hidden\" name=\"_perkIco1\" value=\"no_ico.jpg\">\r\n");
      out.write("				<input type=\"hidden\" name=\"_perkIco2\" value=\"no_ico.jpg\">\r\n");
      out.write("				<input type=\"hidden\" name=\"_perkIco3\" value=\"no_ico.jpg\">\r\n");
      out.write("				<input type=\"hidden\" name=\"_perkIco4\" value=\"no_ico.jpg\">\r\n");
      out.write("				<input type=\"hidden\" name=\"_perkIco5\" value=\"no_ico.jpg\">\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("<style>\r\n");
      out.write(".footer{\r\n");
      out.write("	position: sticky;\r\n");
      out.write("	bottom:0;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	margin-top: 10rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	color: white !important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<footer class='navbar navbar-dark bg-secondary footer'>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<a class=\"nav-item nav-link\"\r\n");
      out.write("			href=\"https://www.bungie.net/7/ko/User/Profile/254/19164972/OrnateValor\">Contact\r\n");
      out.write("			us</a> &copy; OrnateValor\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /itemInfo/../include/header.jsp(30,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sid != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<!-- 로그인 상태 -->\r\n");
          out.write("					<div class=\"nav-item d-flex justify-content-around\">\r\n");
          out.write("						<a href=\"/Member/userMypage.jsp\"> <img\r\n");
          out.write("							src=\"/resources/imgs/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userImg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" class=\"image\" width=\"48rem\">\r\n");
          out.write("						</a>\r\n");
          out.write("						<div class=\"align-self-center\">\r\n");
          out.write("							<a href=\"/Member/userMypage.jsp\" class=\"col-sm-4\"\r\n");
          out.write("								style=\"color: white; font-weight: bold;\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userNm }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님</a> <a\r\n");
          out.write("								href=\"javascript:logout()\" class=\"btn btn-sm btn-primary\">로그아웃</a>\r\n");
          out.write("						</div>\r\n");
          out.write("					</div>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<!-- 로그아웃 상태 -->\r\n");
          out.write("					<a class=\"btn btn-primary btn-sm\" href=\"/Member/loginUser.jsp\">Login</a>\r\n");
          out.write("					<a class=\"btn btn-success btn-sm\" href=\"/Member/userJoin.jsp\">JoinUs</a>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /itemInfo/itemAdd.jsp(30,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(false);
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}