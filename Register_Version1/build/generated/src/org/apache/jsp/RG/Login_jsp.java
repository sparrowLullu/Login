package org.apache.jsp.RG;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Welcome</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background:url('http://cdn.wallpapersafari.com/13/6/Mpsg2b.jpg');\n");
      out.write("                margin:0px;\n");
      out.write("                font-family: 'Ubuntu', sans-serif;\n");
      out.write("                background-size: 100% 110%;\n");
      out.write("            }\n");
      out.write("            h1, h2, h3, h4, h5, h6, a {\n");
      out.write("                margin:0; padding:0;\n");
      out.write("            }\n");
      out.write("            .login {\n");
      out.write("                margin:0 auto;\n");
      out.write("                max-width:500px;\n");
      out.write("            }\n");
      out.write("            .login-header {\n");
      out.write("                color:#fff;\n");
      out.write("                text-align:center;\n");
      out.write("                font-size:300%;\n");
      out.write("            }\n");
      out.write("            /* .login-header h1 {\n");
      out.write("               text-shadow: 0px 5px 15px #000; \n");
      out.write("            } */\n");
      out.write("            .login-form {\n");
      out.write("                border:.5px solid #fff;\n");
      out.write("                background:#4facff;\n");
      out.write("                border-radius:10px;\n");
      out.write("                box-shadow:0px 0px 10px #000;\n");
      out.write("            }\n");
      out.write("            .login-form h3 {\n");
      out.write("                text-align:left;\n");
      out.write("                margin-left:40px;\n");
      out.write("                color:#fff;\n");
      out.write("            }\n");
      out.write("            .login-form {\n");
      out.write("                box-sizing:border-box;\n");
      out.write("                padding-top:15px;\n");
      out.write("                padding-bottom:10%;\n");
      out.write("                margin:5% auto;\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("            .login input[type=\"text\"],\n");
      out.write("            .login input[type=\"password\"] {\n");
      out.write("                max-width:400px;\n");
      out.write("                width: 80%;\n");
      out.write("                line-height:3em;\n");
      out.write("                font-family: 'Ubuntu', sans-serif;\n");
      out.write("                margin:1em 2em;\n");
      out.write("                border-radius:5px;\n");
      out.write("                border:2px solid #f2f2f2;\n");
      out.write("                outline:none;\n");
      out.write("                padding-left:10px;\n");
      out.write("            }\n");
      out.write("            .login-form input[type=\"button\"] {\n");
      out.write("                height:30px;\n");
      out.write("                width:100px;\n");
      out.write("                background:#fff;\n");
      out.write("                border:1px solid #f2f2f2;\n");
      out.write("                border-radius:20px;\n");
      out.write("                color: slategrey;\n");
      out.write("                text-transform:uppercase;\n");
      out.write("                font-family: 'Ubuntu', sans-serif;\n");
      out.write("                cursor:pointer;\n");
      out.write("            }\n");
      out.write("            .sign-up{\n");
      out.write("                color:#f2f2f2;\n");
      out.write("                margin-left:-70%;\n");
      out.write("                cursor:pointer;\n");
      out.write("                text-decoration:underline;\n");
      out.write("            }\n");
      out.write("            .no-access {\n");
      out.write("                color:#E86850;\n");
      out.write("                margin:20px 0px 20px -57%;\n");
      out.write("                text-decoration:underline;\n");
      out.write("                cursor:pointer;\n");
      out.write("            }.update-password{\n");
      out.write("                color:#f2f2f2;\n");
      out.write("                margin-left:-70%;\n");
      out.write("                cursor:pointer;\n");
      out.write("                text-decoration:underline;\n");
      out.write("            }\n");
      out.write("            .try-again {\n");
      out.write("                color:#f2f2f2;\n");
      out.write("                text-decoration:underline;\n");
      out.write("                cursor:pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Media Querie*/\n");
      out.write("            @media only screen and (min-width : 150px) and (max-width : 530px){\n");
      out.write("                .login-form h3 {\n");
      out.write("                    text-align:center;\n");
      out.write("                    margin:0;\n");
      out.write("                }\n");
      out.write("                .sign-up, .no-access , .update-password{\n");
      out.write("                    margin:10px 0;\n");
      out.write("                }\n");
      out.write("                .login-button {\n");
      out.write("                    margin-bottom:10px;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"/Register/Login\">\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <div class=\"login-header\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"login-form\">\n");
      out.write("                    <h3>Email Id:</h3>\n");
      out.write("                    <input type=\"text\" placeholder=\"User Email Id\" name=\"f_email_id\"/><br>\n");
      out.write("                    <h3>Password:</h3>\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" name=\"f_passwd\"/>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-lg\"/>Login</button>         \n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <a class=\"sign-up\" href=\"/Register/RG/Registration.jsp\">Sign up!</a>\n");
      out.write("                    <br>\n");
      out.write("                    <h6 class=\"no-access\">Can't access your account?</h6>\n");
      out.write("                     <br>\n");
      out.write("                    <a class=\"update-password\" href=\"/Register/RG/UpdatePassword.jsp\">Update Password</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"error-page\">\n");
      out.write("             ");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
