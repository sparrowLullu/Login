package org.apache.jsp.RG;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ----------> <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .register{\n");
      out.write("                background: -webkit-linear-gradient(left, #3931af, #00c6ff);\n");
      out.write("                margin-top: 3%;\n");
      out.write("                padding: 3%;\n");
      out.write("            }\n");
      out.write("            .register-left{\n");
      out.write("                text-align: center;\n");
      out.write("                color: #fff;\n");
      out.write("                margin-top: 4%;\n");
      out.write("            }\n");
      out.write("            .register-left input{\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 1.5rem;\n");
      out.write("                padding: 2%;\n");
      out.write("                width: 60%;\n");
      out.write("                background: #f8f9fa;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #383d41;\n");
      out.write("                margin-top: 30%;\n");
      out.write("                margin-bottom: 3%;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .register-right{\n");
      out.write("                background: #f8f9fa;\n");
      out.write("                border-top-left-radius: 10% 50%;\n");
      out.write("                border-bottom-left-radius: 10% 50%;\n");
      out.write("            }\n");
      out.write("            .register-left img{\n");
      out.write("                margin-top: 15%;\n");
      out.write("                margin-bottom: 5%;\n");
      out.write("                width: 25%;\n");
      out.write("                -webkit-animation: mover 2s infinite  alternate;\n");
      out.write("                animation: mover 1s infinite  alternate;\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes mover {\n");
      out.write("                0% { transform: translateY(0); }\n");
      out.write("                100% { transform: translateY(-20px); }\n");
      out.write("            }\n");
      out.write("            @keyframes mover {\n");
      out.write("                0% { transform: translateY(0); }\n");
      out.write("                100% { transform: translateY(-20px); }\n");
      out.write("            }\n");
      out.write("            .register-left p{\n");
      out.write("                font-weight: lighter;\n");
      out.write("                padding: 12%;\n");
      out.write("                margin-top: -9%;\n");
      out.write("            }\n");
      out.write("            .register .register-form{\n");
      out.write("                padding: 10%;\n");
      out.write("                margin-top: 10%;\n");
      out.write("            }\n");
      out.write("            .btnRegister{\n");
      out.write("                float: right;\n");
      out.write("                margin-top: 10%;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 1.5rem;\n");
      out.write("                padding: 2%;\n");
      out.write("                background: #0062cc;\n");
      out.write("                color: #fff;\n");
      out.write("                font-weight: 600;\n");
      out.write("                width: 50%;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .register .nav-tabs{\n");
      out.write("                margin-top: 3%;\n");
      out.write("                border: none;\n");
      out.write("                background: #0062cc;\n");
      out.write("                border-radius: 1.5rem;\n");
      out.write("                width: 28%;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .register .nav-tabs .nav-link{\n");
      out.write("                padding: 2%;\n");
      out.write("                height: 34px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: #fff;\n");
      out.write("                border-top-right-radius: 1.5rem;\n");
      out.write("                border-bottom-right-radius: 1.5rem;\n");
      out.write("            }\n");
      out.write("            .register .nav-tabs .nav-link:hover{\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            .register .nav-tabs .nav-link.active{\n");
      out.write("                width: 100px;\n");
      out.write("                color: #0062cc;\n");
      out.write("                border: 2px solid #0062cc;\n");
      out.write("                border-top-left-radius: 1.5rem;\n");
      out.write("                border-bottom-left-radius: 1.5rem;\n");
      out.write("            }\n");
      out.write("            .register-heading{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 8%;\n");
      out.write("                margin-bottom: -15%;\n");
      out.write("                color: #495057;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script src=\"NewValidation.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p align=\"center\">Registration</p>\n");
      out.write("\n");
      out.write("        <div class=\"container register\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 register-left\">\n");
      out.write("                    <img src=\"https://image.ibb.co/n7oTvU/logo_white.png\" alt=\"\"/>\n");
      out.write("                    <h3>Welcome</h3>\n");
      out.write("                    <p>Please Register Yourself</p>\n");
      out.write("                    <a href=\"/Register_Version1/RG/Login1.jsp\" ><h1> Login</h1></a><br/>  \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 register-right\">\n");
      out.write("                    <ul class=\"nav nav-tabs nav-justified\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">Employee</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            ");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write(" ");
      out.write("\n");
      out.write("                        .\n");
      out.write("                        <form method=\"post\" action=\"/Register_Version1/Registration\" name=\"registration\"  onsubmit=\"return formValidation();\">\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                                <h3 class=\"register-heading\">Please Register Yourself</h3>\n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"First Name *\" value=\"\"  name=\"f_first_name\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Last Name *\" value=\"\"  name=\"f_last_name\" required />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" placeholder=\"Date of Birth *\" value=\"\"  name=\"f_dob\"  required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\"  placeholder=\"Address *\" value=\"\"  name=\"f_address\"  required />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"maxl\">\n");
      out.write("                                                <label class=\"radio inline\"> \n");
      out.write("                                                    <input type=\"radio\" name=\"f_gender\" value=\"male\" checked>\n");
      out.write("                                                    <span> Male </span> \n");
      out.write("                                                </label>\n");
      out.write("                                                <label class=\"radio inline\"> \n");
      out.write("                                                    <input type=\"radio\" name=\"f_gender\" value=\"female\">\n");
      out.write("                                                    <span>Female </span> \n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" minlength=\"10\" maxlength=\"10\"  class=\"form-control\" placeholder=\"Your Mobile *\" value=\"\" name=\"f_mobile_no\"  required />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">    \n");
      out.write("                                            <input type=\"email\" class=\"form-control\" placeholder=\"Your Email *\" value=\"\" name=\"f_email_id\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"set Password*\" value=\"\" name=\"f_password\" id=\"pass1\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Confirm Password*\" value=\"\" name=\"\" id=\"pass2\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"submit\" class=\"btnRegister\"  value=\"Register\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
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
