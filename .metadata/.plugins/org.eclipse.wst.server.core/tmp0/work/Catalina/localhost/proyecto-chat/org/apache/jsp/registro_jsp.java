/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-05-23 23:07:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\" text/html; ie=edge; charset=ISO-8859-1\">\r\n");
      out.write("    <title>Registrate en nuestro chat</title>\r\n");
      out.write("    <!-- Bootstrap css -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Material Design Bootstrap -->\r\n");
      out.write("    <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Css Personalizado -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  \r\n");
      out.write("  <header>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark scrolling-navbar fixed-top\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <!-- Navbar brand -->\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">LogoChat</a>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Navbar Boton - Icon -->\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#NavbarPrincipal\" aria-controls=\"NavbarPrincipal\"\r\n");
      out.write("            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Contenido del Navbar -->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"NavbarPrincipal\">\r\n");
      out.write("        \r\n");
      out.write("            <!-- Lista -->\r\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Inicio\r\n");
      out.write("                        <span class=\"sr-only\">Navbar de la pagina</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Menu</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Acerca de</a>\r\n");
      out.write("                </li>  \r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- Form Buscar -->\r\n");
      out.write("            <form class=\"form-inline\">\r\n");
      out.write("              <div class=\"md-form my-0\">\r\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar\" aria-label=\"Search\">\r\n");
      out.write("              </div>\r\n");
      out.write("                <button class=\"btn btn-outline-white btn-md my-2 my-sm-0 ml-3\" type=\"submit\">Buscar</button>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Contenido del Navbar -->\r\n");
      out.write("  \r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("      <!-- Seccion del Header -->\r\n");
      out.write("        <div class=\"view rgba-fondo\">\r\n");
      out.write("          <div class=\"container my-5 opacity\">\r\n");
      out.write("              <div class=\"row align-items-center\">\r\n");
      out.write("                <div class=\"col-md-7 my-4\">\r\n");
      out.write("                  <div class=\"col-md-12 mb-5 mt-md-0 mt-5 text-center text-md-left animated fadeInLeft\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                    <h1 class=\"display-4 font-weight-bold\">Lorem ipsum</h1>\r\n");
      out.write("                    <hr class=\"hr-light\">\r\n");
      out.write("                    <h6 class=\"mb-3\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem repellendus quasi fuga nesciunt dolorum nulla magnam veniam sapiente, fugiat! Commodi sequi non animi ea dolor molestiae, quisquam iste.</h6>\r\n");
      out.write("                    <a class=\"btn btn-outline-light\">Learn more</a>\r\n");
      out.write("                  </div>  \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-5\">\r\n");
      out.write("                    <div class=\"card rgba-card animated fadeInRight my-4 bg-transparent\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                          <form action=\"\" id=\"formulario\" name=\"formulario\" autocomplete=\"on\">\r\n");
      out.write("                              <div class=\"row py-4 d-flex justify-content-center\">\r\n");
      out.write("                              <i class=\"user fas fa-user\"></i>\r\n");
      out.write("                              <h3 class=\"\">Registrate</h3>\r\n");
      out.write("                              \r\n");
      out.write("                              </div>\r\n");
      out.write("                              <hr class=\"hr-light\">\r\n");
      out.write("                              <div class=\"form-row\">\r\n");
      out.write("                                <div class=\"form-group col md-form\">\r\n");
      out.write("                                  <input type=\"text\" class=\"form-control white-text\" id=\"nombres\" name=\"nombres\">\r\n");
      out.write("                                  <label for=\"nombres\" id=\"nom\" class=\"font-weight-light mx-1\">Nombres</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col md-form\">\r\n");
      out.write("                                  <input type=\"text\" class=\"form-control white-text\" id=\"apellidos\" name=\"apellidos\" >\r\n");
      out.write("                                  <label for=\"apellidos\" class=\"font-weight-light mx-1\">Apellidos</label>\r\n");
      out.write("                                  \r\n");
      out.write("                                </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group md-form\">\r\n");
      out.write("                                <input type=\"text\" name=\"usuario\" class=\"form-control white-text\" id=\"usuario\"> \r\n");
      out.write("                                <label for=\"usuario\" class=\"font-weight-light\">Usuario</label> \r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-group md-form\">\r\n");
      out.write("                                <input type=\"email\" class=\"form-control white-text\" name=\"email\" id=\"email\">\r\n");
      out.write("                                <label for=\"email\" class=\"font-weight-light\">Correo Electrónico</label>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-row\">\r\n");
      out.write("                                <div class=\"form-group col md-form\">\r\n");
      out.write("                                  <input type=\"password\" class=\"form-control white-text\" id=\"clave\" name=\"clave\">\r\n");
      out.write("                                  <label for=\"clave\" class=\"font-weight-light mx-1\">Contraseña</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col md-form\">\r\n");
      out.write("                                  <input type=\"password\" class=\"form-control white-text\" id=\"clavecon\" name=\"clavecon\">\r\n");
      out.write("                                  <label for=\"clavecon\" class=\"font-weight-light mx-1\">Confirmar Contraseña</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"form-check col-12\">\r\n");
      out.write("                                  <input type=\"checkbox\" class=\"form-check-input\" id=\"terminos\" name=\"terminos\">\r\n");
      out.write("                                  <label for=\"terminos\" class=\"form-check-label\">Acepta los <a href=\"#\" class=\"font-weight-light\">Términos y Condiciones</a></label>\r\n");
      out.write("                              </div><div></div>\r\n");
      out.write("                              <div class=\"text-center md-form\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary btn-rounded\" value=\"Registrate\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                         </form>\r\n");
      out.write("                       </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- SCRIPTS -->\r\n");
      out.write("     <!-- Fonts Awesome -->\r\n");
      out.write("    <script src=\"js/fontawesome-all.js\"></script>\r\n");
      out.write("    <!-- JQuery -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <!-- JQuery Validate -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("    <!-- Bootstrap tooltips -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- MDB core JavaScript -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      new WOW().init();\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/validation.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
