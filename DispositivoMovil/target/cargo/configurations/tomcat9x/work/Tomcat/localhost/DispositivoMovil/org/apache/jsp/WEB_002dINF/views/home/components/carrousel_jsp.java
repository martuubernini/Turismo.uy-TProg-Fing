/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2023-01-14 14:17:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.home.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carrousel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!-- Carousel Start -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div id=\"header-carousel\" class=\"carousel slide w-100\"\r\n");
      out.write("\t\tdata-ride=\"carousel\">\r\n");
      out.write("\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t<div class=\"carousel-item active\" style=\"height: 410px\"\r\n");
      out.write("\t\t\t\tstyle=\"max-width:1366\">\r\n");
      out.write("\t\t\t\t<img class=\"img-fluid\" src=\"media/img/carousel-1.jpg\" alt=\"Image\" />\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"p-3\" style=\"max-width: 700px\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"text-light text-uppercase font-weight-medium mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t15% de descuento</h4>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">\r\n");
      out.write("\t\t\t\t\t\t\tUN D??A EN COLONIA</h3>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"ConsultarPaquete?paquete=un d??a en colonia\" class=\"btn btn-light py-2 px-3\">??Compre ahora!</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"carousel-item\" style=\"height: 410px\"\r\n");
      out.write("\t\t\t\tstyle=\"max-width:1366\">\r\n");
      out.write("\t\t\t\t<img class=\"img-fluid\" src=\"media/img/carousel-2.jpg\" alt=\"Image\" />\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"p-3\" style=\"max-width: 700px\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"text-light text-uppercase font-weight-medium mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t20% de descuento</h4>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">\r\n");
      out.write("\t\t\t\t\t\t\tDISFRUTAR ROCHA</h3>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"ConsultarPaquete?paquete=disfrutar rocha\" class=\"btn btn-light py-2 px-3\">??Compre ahora!</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a class=\"carousel-control-prev\" href=\"#header-carousel\"\r\n");
      out.write("\t\t\tdata-slide=\"prev\">\r\n");
      out.write("\t\t\t<div class=\"btn btn-dark\" style=\"width: 45px; height: 45px\">\r\n");
      out.write("\t\t\t\t<span class=\"carousel-control-prev-icon mb-n2\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</a> <a class=\"carousel-control-next\" href=\"#header-carousel\"\r\n");
      out.write("\t\t\tdata-slide=\"next\">\r\n");
      out.write("\t\t\t<div class=\"btn btn-dark\" style=\"width: 45px; height: 45px\">\r\n");
      out.write("\t\t\t\t<span class=\"carousel-control-next-icon mb-n2\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Carousel End -->\r\n");
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
}
