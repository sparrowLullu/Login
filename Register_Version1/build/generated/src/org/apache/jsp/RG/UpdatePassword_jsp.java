package org.apache.jsp.RG;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdatePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("               <style>\n");
      out.write("            .pass_show{position: relative} \n");
      out.write("\n");
      out.write(".pass_show .ptxt { \n");
      out.write("\n");
      out.write("position: absolute; \n");
      out.write("\n");
      out.write("top: 50%; \n");
      out.write("\n");
      out.write("right: 10px; \n");
      out.write("\n");
      out.write("z-index: 1; \n");
      out.write("\n");
      out.write("color: #f36c01; \n");
      out.write("\n");
      out.write("margin-top: -10px; \n");
      out.write("\n");
      out.write("cursor: pointer; \n");
      out.write("\n");
      out.write("transition: .3s ease all; \n");
      out.write("\n");
      out.write("} \n");
      out.write("\n");
      out.write(".pass_show .ptxt:hover{color: #333333;} \n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <title>Update</title>\n");
      out.write("        <script>\n");
      out.write("             \n");
      out.write("$(document).ready(function(){\n");
      out.write("$('.pass_show').append('<span class=\"ptxt\">Show</span>');  \n");
      out.write("});\n");
      out.write("  \n");
      out.write("\n");
      out.write("$(document).on('click','.pass_show .ptxt', function(){ \n");
      out.write("\n");
      out.write("$(this).text($(this).text() == \"Show\" ? \"Hide\" : \"Show\"); \n");
      out.write("\n");
      out.write("$(this).prev().attr('type', function(index, attr){return attr == 'password' ? 'text' : 'password'; }); \n");
      out.write("\n");
      out.write("}); \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body> <form action=\"/Register_Version1/UpdatePassword\" method=\"post\" >\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t    \n");
      out.write("                    <label>Email Id</label>\n");
      out.write("\t\t    <div class=\"form-group pass_show\"> \n");
      out.write("                <input type=\"email\" value=\"\" class=\"form-control\" placeholder=\"Email Id\"  name=\"f_email_id\"/> \n");
      out.write("            </div> \n");
      out.write("\t\t    <label>Current Password</label>\n");
      out.write("\t\t    <div class=\"form-group pass_show\"> \n");
      out.write("                <input type=\"password\" value=\"\" class=\"form-control\" placeholder=\"Current Password\" name=\"f_curr_passwd\" /> \n");
      out.write("            </div> \n");
      out.write("\t\t       <label>New Password</label>\n");
      out.write("            <div class=\"form-group pass_show\"> \n");
      out.write("                <input type=\"password\" value=\"\" class=\"form-control\" placeholder=\"New Password\" name=\"f_new_passwd\" /> \n");
      out.write("            </div> \n");
      out.write("\t\t       <label>Confirm Password</label>\n");
      out.write("            <div class=\"form-group pass_show\"> \n");
      out.write("                <input type=\"password\" value=\"\" class=\"form-control\" placeholder=\"Confirm Password\" /> \n");
      out.write("            </div> \n");
      out.write("            <input type=\"submit\" class=\"btn btn-danger\" value=\"Update\"> \n");
      out.write("\t\t</div>  \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("            </form>\n");
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
