/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-12 14:31:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navBar.jsp.jspf", Long.valueOf(1631457056667L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jsp.jspf", Long.valueOf(1631126240137L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jsp.jspf", Long.valueOf(1631011669841L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>SarayaTech | The Solution</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- LINK Bootdey -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@2.0.7/css/boxicons.min.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- CSS LINK -->\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"/WEB-INF/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<!--  \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(" \r\n");
      out.write("        body {\r\n");
      out.write("            color: #566787;\r\n");
      out.write("            background: #f5f5f5;\r\n");
      out.write("            font-family: 'Varela Round', sans-serif;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("    <a class=\"navbar-brand d-inline-flex align-items-center\" href=\"https://www.linkedin.com/in/bamba-ndour-a46a8420a\">\r\n");
      out.write("       <i class=\"fas fa-code d-inline-flex mr-2 avatar32 bg-info-dark shadow-sm text-primary-light rounded-circle align-items-center justify-content-center fs-1x\"></i> \r\n");
      out.write("       <span class=\"text-white fs-1x font500\">Bamba Ndour</span> \r\n");
      out.write("    </a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor02\" aria-controls=\"navbarColor02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("       <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarColor02\">\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("             <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/home\" class=\"nav-link\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/about\" class=\"nav-link\">About Me <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/contact\" class=\"nav-link\">Contact Me <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("            <input type=\"search\" name=\"key\" id=\"searchName\" class=\"form-control mr-sm-2\" placeholder=\"Search employees...\" required>\r\n");
      out.write("        </form>\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <span class=\"nav-link\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"sr-only\"></span></span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/logout\" class=\"nav-link\">Log Out <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\n");
      out.write("body{\r\n");
      out.write("\r\n");
      out.write("    background-color: #f7f7ff;\r\n");
      out.write("    margin-top:0px;\r\n");
      out.write("}\r\n");
      out.write(".radius-15 {\r\n");
      out.write("    border-radius: 15px;\r\n");
      out.write("}\r\n");
      out.write(".card {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    min-width: 0;\r\n");
      out.write("    word-wrap: break-word;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    background-clip: border-box;\r\n");
      out.write("    border: 0px solid rgba(0, 0, 0, 0);\r\n");
      out.write("    border-radius: .25rem;\r\n");
      out.write("    margin-bottom: 1.5rem;\r\n");
      out.write("    box-shadow: 0 2px 6px 0 rgb(218 218 253 / 65%), 0 2px 6px 0 rgb(206 206 238 / 54%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("element.style {\r\n");
      out.write("}\r\n");
      out.write(".list-inline-item:not(:last-child) {\r\n");
      out.write("    margin-right: .5rem;\r\n");
      out.write("}\r\n");
      out.write(".contacts-social a {\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    width: 36px;\r\n");
      out.write("    height: 36px;\r\n");
      out.write("    line-height: 36px;\r\n");
      out.write("    background: #ffffff;\r\n");
      out.write("    border: 1px solid #eeecec;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    color: #2b2a2a;\r\n");
      out.write("}\r\n");
      out.write(".bg-facebook {\r\n");
      out.write("    background-color: #3b5998!important;\r\n");
      out.write("}\r\n");
      out.write(".bg-twitter {\r\n");
      out.write("    background-color: #55acee!important;\r\n");
      out.write("}\r\n");
      out.write(".bg-linkedin {\r\n");
      out.write("    background-color: #0976b4!important;\r\n");
      out.write("}\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div align=\"center\" class=\"mt-4\">\r\n");
      out.write("\t\t          <h1>Meet our experts</h1>\r\n");
      out.write("\t\t\t\t  <p>\r\n");
      out.write("\t\t\t\t    It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.\r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t <div align=\"right\" class=\"\">\r\n");
      out.write("               <a href=\"/newEmployeeForm\" class=\"btn btn-info\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Employee</span></a>\r\n");
      out.write("               <a href=\"/deleteAllEmployees\" onclick=\"return confirm('Are you sure ?')\" class=\"btn btn-danger\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete All</span></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<div class=\"row row-cols-1 row-cols-lg-2 row-cols-xl-4 mt-5 mb-5\">\r\n");
      out.write("\t\t    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER HERE -->\r\n");
      out.write("<div class=\"container mt-5 mb-5\">\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("<footer class=\"bg-light text-center text-lg-start mt-4\">\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("  <div class=\"container p-4\">\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-6 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("        <h5 class=\"text-uppercase\">Footer text</h5>\r\n");
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis\r\n");
      out.write("          molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae\r\n");
      out.write("          aliquam voluptatem veniam, est atque cumque eum delectus sint!\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-6 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("        <h5 class=\"text-uppercase\">Footer text</h5>\r\n");
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis\r\n");
      out.write("          molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae\r\n");
      out.write("          aliquam voluptatem veniam, est atque cumque eum delectus sint!\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\r\n");
      out.write("    ?? 2021 Copyright:\r\n");
      out.write("    <a class=\"text-dark\" href=\"https://www.linkedin.com/in/bamba-ndour-a46a8420a\">BAMBA NDOUR</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/home.jsp(68,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home.jsp(68,6) '${employees }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${employees }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/home.jsp(68,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("employee");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"col\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"card radius-15\">\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"card-body text-center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"p-4 border radius-15\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<img style=\"cursor: pointer;\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.imageUrl }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" width=\"110\" height=\"110\" class=\"rounded-circle shadow\" alt=\"\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mb-0 mt-5\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<p class=\"mb-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.jobTitle }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"list-inline contacts-social mt-3 mb-3\"> <a href=\"javascript:;\" class=\"list-inline-item bg-facebook text-white border-0\"><i class=\"bx bxl-facebook\"></i></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"list-inline-item bg-twitter text-white border-0\"><i class=\"bx bxl-twitter\"></i></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"list-inline-item bg-linkedin text-white border-0\"><i class=\"bx bxl-linkedin\"></i></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"d-grid\"> <a href=\"/detailEmployee?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-outline-info radius-15\">Detail</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
