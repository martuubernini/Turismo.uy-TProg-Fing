/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2023-01-14 14:13:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wrapper_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/template/footer.jspf", Long.valueOf(1673705616615L));
    _jspx_dependants.put("/WEB-INF/template/header.jspf", Long.valueOf(1673705616616L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String pageTitle;

  public java.lang.String getPageTitle() {
    return this.pageTitle;
  }

  public void setPageTitle(java.lang.String pageTitle) {
    this.pageTitle = pageTitle;
    jspContext.setAttribute("pageTitle", pageTitle);
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getPageTitle() != null ) 
      _jspx_page_context.setAttribute("pageTitle", getPageTitle());

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\" />\r\n");
      out.write("\t<title>Turismo.Uy - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("</title>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("<meta content=\"Free HTML Templates\" name=\"keywords\" />\r\n");
      out.write("<meta content=\"Free HTML Templates\" name=\"description\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link href=\"media/img/favicon.ico\" rel=\"icon\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Google Web Fonts -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Libraries Stylesheet -->\r\n");
      out.write("<link href=\"media/lib/owlcarousel/assets/owl.carousel.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("<link href=\"media/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Las libreria de javascpript estan acá porque usamos el flag defer para que se carguen al final de la página -->\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript Libraries -->\r\n");
      out.write("<script defer src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script defer\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script defer src=\"media/lib/easing/easing.min.js\"></script>\r\n");
      out.write("<script defer src=\"media/lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Contact Javascript File -->\r\n");
      out.write("<script defer src=\"media/mail/jqBootstrapValidation.min.js\"></script>\r\n");
      out.write("<script defer src=\"media/mail/contact.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Template Javascript -->\r\n");
      out.write("<script defer src=\"media/js/main.js\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/template/navbar/navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,getJspContext());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Footer Start -->\r\n");
      out.write("<div class=\"container-fluid bg-secondary text-dark mt-5 pt-5\">\r\n");
      out.write("    <div class=\"row px-xl-5 pt-5\">\r\n");
      out.write("        <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\r\n");
      out.write("            <a href=\"\" class=\"text-decoration-none\">\r\n");
      out.write("            \r\n");
      out.write("                <h1 class=\"mb-4 display-5 font-weight-semi-bold\"><span\r\n");
      out.write("                        class=\"text-primary font-weight-bold px-3\">Turismo</span>Uy</h1>\r\n");
      out.write("            </a>\r\n");
      out.write("            <p> Desde sus comienzos en el año 2022, Turismo.uy se ha destacado como una empresa proveedora de servicios\r\n");
      out.write("                turísticos en el Uruguay. Basándonos en la permanente actualización de nuestra infraestructura\r\n");
      out.write("                tecnológica y\r\n");
      out.write("                en el personal capacitado en turismo nacional. Nuestro objetivo es proporcionar a nuestros clientes el\r\n");
      out.write("                mejor\r\n");
      out.write("                “Servicio Turístico Integral” del mercado, buscando no sólo satisfacer, sino superar sus\r\n");
      out.write("                expectativas.</p>\r\n");
      out.write("            <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>Av. Julio Herrera y Reissig 565,\r\n");
      out.write("                Montevideo, URU</p>\r\n");
      out.write("            <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i> TProg_G22@fing.edu.uy</p>\r\n");
      out.write("            <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+598 99 999 999</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-8 col-md-12\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 mb-5\">\r\n");
      out.write("                    <h5 class=\"font-weight-bold text-dark mb-4\">Enlaces de utilidad</h5>\r\n");
      out.write("                    <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                        <a class=\"text-dark mb-2\" href=\"Home\"><i class=\"fa fa-angle-right mr-2\"></i>Inicio</a>\r\n");
      out.write("                        <a class=\"text-dark mb-2\" href=\"ConsultarActividades\"><i class=\"fa fa-angle-right mr-2\"></i>Actividades\r\n");
      out.write("                            Turisticas</a>\r\n");
      out.write("                        <a class=\"text-dark mb-2\" href=\"ConsultaSalidas\"><i class=\"fa fa-angle-right mr-2\"></i>Salidas\r\n");
      out.write("                            Turisticas</a>\r\n");
      out.write("                        <a class=\"text-dark mb-2\" href=\"ConsultaPaquetes\"><i class=\"fa fa-angle-right mr-2\"></i>Paquetes\r\n");
      out.write("                            turisticos</a>\r\n");
      out.write("                        <a class=\"text-dark mb-2\" href=\"ConsultarUsuarios\"><i class=\"fa fa-angle-right mr-2\"></i>Usuarios</a>\r\n");
      out.write("                        <a class=\"text-dark\" href=\"contact\"><i class=\"fa fa-angle-right mr-2\"></i>Contactenos</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-5\">\r\n");
      out.write("                    <h5 class=\"font-weight-bold text-dark mb-4\">Informacion Covid-19</h5>\r\n");
      out.write("                    <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                        <a class=\"text-dark mb-2\"\r\n");
      out.write("                           href=\"https://www.gub.uy/ministerio-salud-publica/comunicacion/publicaciones/recomendaciones-protocolos-relacionados-covid-19\"><i\r\n");
      out.write("                                class=\"fa fa-angle-right mr-2\"></i>Covid-19: ¿Qué precauciones tomar para viajar seguro?</a>\r\n");
      out.write("                        <a class=\"text-dark mb-2\" href=\"https://www.gub.uy/tramites/permiso-menor-edad\"><i\r\n");
      out.write("                                class=\"fa fa-angle-right mr-2\"></i>Si soy menor ¿Como puedo tramitar el permiso del\r\n");
      out.write("                            menor para viajar?</a>\r\n");
      out.write("                        <a class=\"text-dark mb-2\"\r\n");
      out.write("                           href=\"https://www.gub.uy/ministerio-salud-publica/comunicacion/publicaciones/recomendaciones-protocolos-relacionados-covid-19\"><i\r\n");
      out.write("                                class=\"fa fa-angle-right mr-2\"></i>Recomendaciones para viajar por Uruguay</a>\r\n");
      out.write("                        <a class=\"text-dark mb-2\"\r\n");
      out.write("                           href=\"https://www.gub.uy/ministerio-turismo/comunicacion/noticias/hacer-declaracion-jurada-salud-formato-digital\"><i\r\n");
      out.write("                                class=\"fa fa-angle-right mr-2\"></i>¿Como hago la declaracion jurada digital de\r\n");
      out.write("                            salud?</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-5\">\r\n");
      out.write("                    <h5 class=\"font-weight-bold text-dark mb-4\">Newsletter</h5>\r\n");
      out.write("                    <form action=\"\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control border-0 py-4\" placeholder=\"Nombre\"\r\n");
      out.write("                                   required=\"required\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"email\" class=\"form-control border-0 py-4\" placeholder=\"Email\"\r\n");
      out.write("                                   required=\"required\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <button class=\"btn btn-primary btn-block border-0 py-3\" type=\"submit\">Suscribirme</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row border-top border-light mx-xl-5 py-4 overflow-hidden\">\r\n");
      out.write("        <div class=\"col-md-6 px-xl-0\">\r\n");
      out.write("            <p class=\"mb-md-0 text-center text-md-left text-dark\">\r\n");
      out.write("                &copy; <a class=\"text-dark font-weight-semi-bold\" href=\"https://www.fing.edu.uy/\">Facultad de\r\n");
      out.write("                ingenieria</a>. Derechos reservados. Diseñado por Grupo 22.\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\r\n");
      out.write("            <img class=\"img-fluid\" src=\"media/img/payments.png\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("<!-- Back to Top -->\r\n");
      out.write("<a href=\"#\" class=\"btn btn-primary back-to-top\"\r\n");
      out.write("><i class=\"fa fa-angle-double-up\"></i\r\n");
      out.write("></a>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
