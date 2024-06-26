package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Main Page</title>\n");
      out.write("    <style>\n");
      out.write("        .container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: flex-start;\n");
      out.write("            height: 80vh;\n");
      out.write("        }\n");
      out.write("        .user-info {\n");
      out.write("            text-align: right;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        .top-left {\n");
      out.write("            align-self: flex-start;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/democss.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 User user = (User) session.getAttribute("user"); 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 if (user != null) { 
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h1>Main Page</h1>\n");
      out.write("            </div>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <p>Please log in to view your details.</p>\n");
      out.write("                <a class=\"button\" href=\"one.jsp\">Register</a>\n");
      out.write("            </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"user-info\">\n");
      out.write("        ");
 if (user != null) { 
      out.write("\n");
      out.write("            <p>You are logged in as ");
      out.print( user.getName() );
      out.write(',');
      out.write(' ');
      out.print( user.getEmail() );
      out.write("</p>\n");
      out.write("            <a href=\"logout.jsp\">Logout</a>\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");

                // Invalidate session when user clicks "Logout"
                session.invalidate();
            
      out.write("\n");
      out.write("            <a href=\"edit_user.jsp\">My Account</a>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
