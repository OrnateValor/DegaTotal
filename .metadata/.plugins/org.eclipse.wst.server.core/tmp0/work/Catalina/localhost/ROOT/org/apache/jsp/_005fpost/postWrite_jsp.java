/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.50
 * Generated at: 2021-09-27 05:10:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._005fpost;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mini.dto.Post;

public final class postWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1631996497649L));
    _jspx_dependants.put("jar:file:/C:/Users/paeks/DegaTotal/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mini/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/Users/paeks/DegaTotal/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mini/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/_post/../include/header.jsp", Long.valueOf(1632709756478L));
    _jspx_dependants.put("/_post/../include/footer.jsp", Long.valueOf(1632640048325L));
    _jspx_dependants.put("jar:file:/C:/Users/paeks/DegaTotal/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mini/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("mini.dto.Post");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\r\n");
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
      out.write("<title>게시물 작성</title>\r\n");
      out.write("<script>\r\n");
      out.write("/* 썸머노트 본체는 헤더페이지에 포함 */\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$('#content').summernote({\r\n");
      out.write("			height : 400, // 에디터 높이 지정\r\n");
      out.write("			minHeight : 200, // 에디터 최소 높이\r\n");
      out.write("			maxHeight : null, // 에디터 최대 높이\r\n");
      out.write("			focus : true,\r\n");
      out.write("			lang : 'ko-KR' // 기본 메뉴언어 US->KR로 변경\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"jumbotron\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"col-xl-10 row\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<h2>\r\n");
      out.write("					<strong>게시물 작성</strong>\r\n");
      out.write("				</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<form action=\"/addPost.do\" class=\"form-horizontal\" method=\"post\">\r\n");
      out.write("				<div class=\"form-group row\">\r\n");
      out.write("					<label class=\"col-xl-2\">제목</label>\r\n");
      out.write("					<div class=\"col-xl-10\">\r\n");
      out.write("						<input type=\"text\" name=\"postSub\" id=\"postSub\" class=\"form-control\"\r\n");
      out.write("							placeholder='제목을 입력 해 주세요'>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"form-group row\">\r\n");
      out.write("					<!-- 앞에 fakepath가 붙으므로, substring으로 12번째부터 불러오기 -->\r\n");
      out.write("					<label class=\"col-xl-2\">섬네일</label>\r\n");
      out.write("					<input class=\"col-xl-10\" type=\"file\" id=\"postThumb\" name=\"postThumb\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"form-group row\">\r\n");
      out.write("					<label class=\"col-xl-2\">내용</label>\r\n");
      out.write("					<div class=\"col-xl-10\">\r\n");
      out.write("						<textarea id=\"content\" name=\"content\" cols=\"200\" rows=\"8\" class=\"summernote form-control\"></textarea>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"form-group row\">\r\n");
      out.write("					<div class=\"col-xl-12\" align=\"right\">\r\n");
      out.write("						<a href=\"javascript:void(0);\" class=\"btn btn-primary\" onclick=\"addPostChk();\">등록</a>\r\n");
      out.write("						<input type=\"button\" class=\"btn btn-dark\" value=\"취소\" onclick=\"/PostList.do\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
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
      // /_post/../include/header.jsp(31,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("							<a href=\"/Member/userMypage.jsp\" class=\"col-sm-4\" style=\"color: white; font-weight: bold;\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userNm }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님</a>\r\n");
          out.write("							<a href=\"javascript:logout()\" class=\"btn btn-sm btn-primary\">로그아웃</a>\r\n");
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
}
