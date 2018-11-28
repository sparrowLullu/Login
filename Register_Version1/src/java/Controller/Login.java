
package Controller;

import Bean.RegisterBean;
import Service.Login_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TheOS
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
       HttpSession session = request.getSession();

        String c_email_id = request.getParameter("f_email_id");
        String c_passwd = request.getParameter("f_passwd");

        RegisterBean rgbean = new RegisterBean();
        rgbean.setEmailId(c_email_id);
        rgbean.setPassword(c_passwd);

     Login_Service lg_srvc = new Login_Service();
        if (lg_srvc.AuthenticateUserLogin(rgbean)) {
            session.setAttribute("user", c_email_id);
            session.setMaxInactiveInterval(30);
         request.getRequestDispatcher("/RG/Welcome1.jsp").forward(request, response); //problem having because of requestDispatcher
            
          //response.sendRedirect("/Register_Version1/RG/Welcome1.jsp");
        } else {
            System.out.println("Invalid Login");
            response.sendRedirect("/Register_Version1/RG/Login1.jsp");
        }
    }

}
