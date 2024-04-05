package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class one_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/democss.css\">\n");
      out.write("    <title>Registration Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
 String submitted = request.getParameter("submitted");
        if (submitted != null && submitted.equals("yes")) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String favcol = request.getParameter("favcol");
            if (request.getParameter("tos") != null) { 
      out.write("\n");
      out.write("                <h1><font color=\"");
      out.print( favcol );
      out.write("\">Welcome ");
      out.print( name );
      out.write("!</h1>\n");
      out.write("                <p class=\"p\" <font color=\"");
      out.print( favcol );
      out.write("\">Your email is: ");
      out.print( email );
      out.write(".</p>\n");
      out.write("                <p class=\"p\" <font color=\"");
      out.print( favcol );
      out.write("\">Your password is: ");
      out.print( password );
      out.write(".</p>\n");
      out.write("                <p class=\"p\" <font color=\"");
      out.print( favcol );
      out.write("\">Your gender is: ");
      out.print( gender );
      out.write(".</p>\n");
      out.write("                <p class=\"p\" <font color=\"");
      out.print( favcol );
      out.write("\">Your favourite colour is: ");
      out.print( favcol );
      out.write(".</p>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <p>To register, you must agree to the terms of service.</p>\n");
      out.write("                <a href=\"one.jsp\">Register</a>\n");
      out.write("            ");
 }
        } else { 
      out.write("\n");
      out.write("            <h1>Sign Up</h1>\n");
      out.write("            <form action=\"one.jsp\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <tr><td>Full Name: </td><td><input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required=\"true\"></td></tr>\n");
      out.write("                    <tr><td>Email: </td><td><input type=\"text\" placeholder=\"Enter Email\" name=\"email\"></td></tr>\n");
      out.write("                    <tr><td>Password: </td><td><input type=\"password\" placeholder=\"Enter Password\" name=\"password\"></td></tr>\n");
      out.write("                    <tr><td>Gender: </td><td><input type=\"text\" placeholder=\"Enter Gender\" name=\"gender\"></td></tr>\n");
      out.write("                    <tr><td>Favourite Colour:</td><td><input type=\"text\" placeholder=\"Enter Favourite Colour\" name=\"favcol\"></td></tr>\n");
      out.write("                    <tr><td>Agree to TOS:</td><td><input type=\"checkbox\" name=\"tos\"></td></tr>\n");
      out.write("                    <input type=\"hidden\" name=\"submitted\" value=\"yes\">\n");
      out.write("                </table>\n");
      out.write("                <div>\n");
      out.write("                    <input class=\"button\" type=\"submit\" value=\"Register\">\n");
      out.write("                    <a class=\"button\" href=\"index.html\">Cancel</a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
