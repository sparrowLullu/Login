package org.apache.jsp.RG;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ResetPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body style=\"\">\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script><script src=\"//m.servedby-buysellads.com/monetization.js\" type=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("\t\n");
      out.write("<script async=\"\" src=\"https://www.googletagmanager.com/gtag/js?id=UA-125810435-1\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"elelment\">\n");
      out.write("\t<h2>Reset Password Form</h2>\n");
      out.write("\t<div class=\"element-main\">\n");
      out.write("\t\t<h1>Forgot Password</h1>\n");
      out.write("\t\t<p> Please enter your Email Id.</p>\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<input type=\"text\" value=\"Your e-mail address\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Your e-mail address';}\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Reset my Password\">\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!---728x90--->\n");
      out.write("\n");
      out.write("<div class=\"copy-right\">\n");
      out.write("\t\t\t<p>© 2016 Reset Password Form. All rights reserved | Template by  <a href=\"http://w3layouts.com/\" target=\"_blank\">  W3layouts </a></p>\n");
      out.write("</div>\n");
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
