package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.User;

public final class edit_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/democss.css\"> \n");
      out.write("    <title>Edit Account</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Edit Account</h1>\n");
      out.write("    \n");
      out.write("    ");
 
        User user = (User) session.getAttribute("user"); 
        if (user != null) { // Check if user is not null
    
      out.write("\n");
      out.write("        <form action=\"update_user.jsp\" method=\"post\">\n");
      out.write("            <label for=\"name\">Name:</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" value=\"");
      out.print( user.getName() );
      out.write("\" required><br>\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" value=\"");
      out.print( user.getEmail() );
      out.write("\" required><br>\n");
      out.write("            <label for=\"password\">Password:</label>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" value=\"");
      out.print( user.getPassword() );
      out.write("\" required><br>\n");
      out.write("            <label for=\"gender\">Gender:</label>\n");
      out.write("            <input type=\"text\" id=\"gender\" name=\"gender\" value=\"");
      out.print( user.getGender() );
      out.write("\"><br>\n");
      out.write("            <label for=\"favcol\">Favourite Colour:</label>\n");
      out.write("            <input type=\"text\" id=\"favcol\" name=\"favcol\" value=\"");
      out.print( user.getFavouriteColour() );
      out.write("\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Update\">\n");
      out.write("        </form>\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        <p>No user logged in.</p>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    \n");
      out.write("    <a href=\"index.jsp\">Back to Main Page</a>\n");
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
