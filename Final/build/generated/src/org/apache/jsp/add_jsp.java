package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Page</title>\n");
      out.write("        <script src=\"bootstrap/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <form action=\"loginServlet\" method=\"post\" class=\"register-form\"> \n");
      out.write("                <div class=\"row\">      \n");
      out.write("                    <div class=\"col-md-4 col-sm-4 col-lg-4\">\n");
      out.write("                        <label for=\"firstName\">NAME</label>\n");
      out.write("                        <input name=\"firstName\" class=\"form-control\" type=\"text\" required>    \n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-4 col-lg-4\">\n");
      out.write("                        <label for=\"email\">EMAIL</label>\n");
      out.write("                        <input name=\"email\" class=\"form-control\" type=\"email\" required>             \n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-4 col-lg-4\">\n");
      out.write("                        <label for=\"password\">PASSWORD</label>\n");
      out.write("                        <input name=\"password\" class=\"form-control\" type=\"password\" required>             \n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">      \n");
      out.write("                    <div class=\"col-md-4 col-sm-4 col-lg-4\">\n");
      out.write("                        <label for=\"firstName\">Position</label>\n");
      out.write("                        <input name=\"firstName\" class=\"form-control\" type=\"text\">    \n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">      \n");
      out.write("                    <div class=\"col-md-4 col-sm-4 col-lg-4\">\n");
      out.write("                        <label for=\"firstName\">Address</label>\n");
      out.write("                        <input name=\"firstName\" class=\"form-control\" type=\"text\" >    \n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-6 col-lg-6\">\n");
      out.write("                        <button class=\"btn btn-default logbutton\">Sign up</button>           \n");
      out.write("                    </div>          \n");
      out.write("                </div>    \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
