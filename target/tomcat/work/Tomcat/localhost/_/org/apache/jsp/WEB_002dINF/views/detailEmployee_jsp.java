/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-12 14:17:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detailEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navBar.jsp.jspf", Long.valueOf(1631453467834L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jsp.jspf", Long.valueOf(1631126240137L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jsp.jspf", Long.valueOf(1631011669841L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("                <a href=\"\" class=\"nav-link\">About Me <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"\" class=\"nav-link\">Contact Me <span class=\"sr-only\"></span></a>\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write(" body{\r\n");
      out.write("    margin-top:0px;\r\n");
      out.write("    color: #1a202c;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    background-color: #e2e8f0;    \r\n");
      out.write("}\r\n");
      out.write(".main-body {\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("}\r\n");
      out.write(".card {\r\n");
      out.write("    box-shadow: 0 1px 3px 0 rgba(0,0,0,.1), 0 1px 2px 0 rgba(0,0,0,.06);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    min-width: 0;\r\n");
      out.write("    word-wrap: break-word;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    background-clip: border-box;\r\n");
      out.write("    border: 0 solid rgba(0,0,0,.125);\r\n");
      out.write("    border-radius: .25rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-body {\r\n");
      out.write("    flex: 1 1 auto;\r\n");
      out.write("    min-height: 1px;\r\n");
      out.write("    padding: 1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gutters-sm {\r\n");
      out.write("    margin-right: -8px;\r\n");
      out.write("    margin-left: -8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gutters-sm>.col, .gutters-sm>[class*=col-] {\r\n");
      out.write("    padding-right: 8px;\r\n");
      out.write("    padding-left: 8px;\r\n");
      out.write("}\r\n");
      out.write(".mb-3, .my-3 {\r\n");
      out.write("    margin-bottom: 1rem!important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bg-gray-300 {\r\n");
      out.write("    background-color: #e2e8f0;\r\n");
      out.write("}\r\n");
      out.write(".h-100 {\r\n");
      out.write("    height: 100%!important;\r\n");
      out.write("}\r\n");
      out.write(".shadow-none {\r\n");
      out.write("    box-shadow: none!important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"rows\">\r\n");
      out.write("\t\t   <div class=\"col-12 m-auto\">\r\n");
      out.write("\t\t        <h4 align=\"center\" class=\"mt-4 mb-4\">Employee (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(") : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t\t   <div class=\"container\">\r\n");
      out.write("    <div class=\"main-body\">\r\n");
      out.write("    \r\n");
      out.write("          <div class=\"row gutters-sm\">\r\n");
      out.write("            <div class=\"col-md-4 mb-3\">\r\n");
      out.write("              <div class=\"card\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <div class=\"d-flex flex-column align-items-center text-center\">\r\n");
      out.write("                    <img style=\"cursor: pointer;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.imageUrl }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" alt=\"employee\" title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"rounded-circle\" width=\"150\">\r\n");
      out.write("                    <div class=\"mt-3\">\r\n");
      out.write("                      <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("                      <p class=\"text-secondary mb-1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.jobTitle }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("                      <p class=\"text-muted font-size-sm\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.phoneNumber }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("                      <a href=\"/updateFormEmployee?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-secondary\">Edit</a>\r\n");
      out.write("                      <a href=\"/deleteEmployee?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onclick=\"return confirm('Are you sure you want to delete these Records?')\" class=\"btn btn-outline-danger\">Delete</a>\r\n");
      out.write("                      <a href=\"/home\" class=\"btn btn-success\">Home</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"card mt-3\">\r\n");
      out.write("                <ul class=\"list-group list-group-flush\">\r\n");
      out.write("                  <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("                    <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-globe mr-2 icon-inline\"><circle cx=\"12\" cy=\"12\" r=\"10\"></circle><line x1=\"2\" y1=\"12\" x2=\"22\" y2=\"12\"></line><path d=\"M12 2a15.3 15.3 0 0 1 4 10 15.3 15.3 0 0 1-4 10 15.3 15.3 0 0 1-4-10 15.3 15.3 0 0 1 4-10z\"></path></svg>Website</h6>\r\n");
      out.write("                    <span class=\"text-secondary\">https://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('-');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(".com</span>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("                    <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-github mr-2 icon-inline\"><path d=\"M9 19c-5 1.5-5-2.5-7-3m14 6v-3.87a3.37 3.37 0 0 0-.94-2.61c3.14-.35 6.44-1.54 6.44-7A5.44 5.44 0 0 0 20 4.77 5.07 5.07 0 0 0 19.91 1S18.73.65 16 2.48a13.38 13.38 0 0 0-7 0C6.27.65 5.09 1 5.09 1A5.07 5.07 0 0 0 5 4.77a5.44 5.44 0 0 0-1.5 3.78c0 5.42 3.3 6.61 6.44 7A3.37 3.37 0 0 0 9 18.13V22\"></path></svg>Github</h6>\r\n");
      out.write("                    <span class=\"text-secondary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("                    <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-twitter mr-2 icon-inline text-info\"><path d=\"M23 3a10.9 10.9 0 0 1-3.14 1.53 4.48 4.48 0 0 0-7.86 3v1A10.66 10.66 0 0 1 3 4s-4 9 5 13a11.64 11.64 0 0 1-7 2c9 5 20 0 20-11.5a4.5 4.5 0 0 0-.08-.83A7.72 7.72 0 0 0 23 3z\"></path></svg>Twitter</h6>\r\n");
      out.write("                    <span class=\"text-secondary\">@");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("                    <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-instagram mr-2 icon-inline text-danger\"><rect x=\"2\" y=\"2\" width=\"20\" height=\"20\" rx=\"5\" ry=\"5\"></rect><path d=\"M16 11.37A4 4 0 1 1 12.63 8 4 4 0 0 1 16 11.37z\"></path><line x1=\"17.5\" y1=\"6.5\" x2=\"17.51\" y2=\"6.5\"></line></svg>Instagram</h6>\r\n");
      out.write("                    <span class=\"text-secondary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("                    <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-facebook mr-2 icon-inline text-primary\"><path d=\"M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z\"></path></svg>Facebook</h6>\r\n");
      out.write("                    <span class=\"text-secondary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-8\">\r\n");
      out.write("              <div class=\"card mb-3\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">First Name</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Last Name</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                     ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Full Name</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                     ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.firstName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.lastName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">E-Mail</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Job Title</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                     ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.jobTitle }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Phone Number</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.phoneNumber }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Employee Code</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.employeeCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Gender</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                     ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.gender }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                   <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Married</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.married }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Date Of Birth</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Address</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                      <a href=\"/updateFormEmployee?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ employee.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-info \" target=\"__blank\">Edit</a>\r\n");
      out.write("                      <a href=\"/home\" class=\"btn btn-success\">Back To Home</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"row gutters-sm\">\r\n");
      out.write("                <div class=\"col-sm-6 mb-3\">\r\n");
      out.write("                  <div class=\"card h-100\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <h6 class=\"d-flex align-items-center mb-3\"><i class=\"material-icons text-info mr-2\">assignment</i>Project Status</h6>\r\n");
      out.write("                      <small>Web Design</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 80%\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>Website Markup</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 72%\" aria-valuenow=\"72\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>One Page</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 89%\" aria-valuenow=\"89\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>Mobile Template</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 55%\" aria-valuenow=\"55\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>Backend API</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 66%\" aria-valuenow=\"66\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6 mb-3\">\r\n");
      out.write("                  <div class=\"card h-100\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <h6 class=\"d-flex align-items-center mb-3\"><i class=\"material-icons text-info mr-2\">assignment</i>Project Status</h6>\r\n");
      out.write("                      <small>Web Design</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 80%\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>Website Markup</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 72%\" aria-valuenow=\"72\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>One Page</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 89%\" aria-valuenow=\"89\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>Mobile Template</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 55%\" aria-valuenow=\"55\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <small>Backend API</small>\r\n");
      out.write("                      <div class=\"progress mb-3\" style=\"height: 5px\">\r\n");
      out.write("                        <div class=\"progress-bar bg-primary\" role=\"progressbar\" style=\"width: 66%\" aria-valuenow=\"66\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\t   </div>\r\n");
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
      out.write("    © 2021 Copyright:\r\n");
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
}
