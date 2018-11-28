package Controller;

import Bean.RegisterBean;

import Service.Login_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TheOS
 */
@WebServlet(name = "EmailUpdate", urlPatterns = {"/EmailUpdate"})
public class EmailUpdate extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        RegisterBean rgbean = new RegisterBean();
        
        String c_email_id = request.getParameter("f_email_id");
        rgbean.setEmailId(c_email_id);
        String c_password = request.getParameter("f_password");
        rgbean.setPassword(c_password);

        String c_new_email_id = request.getParameter("f_newEmail_password");

        Login_Service lg_srvc = new Login_Service();
        
            if (lg_srvc.AuthenticateUserLogin(rgbean)) {
                if (lg_srvc.UpdateEmailId(rgbean, c_new_email_id)) {
                    out.println("Email Updation Successfull");
                    request.getRequestDispatcher("/RG/login1.jsp").forward(request, response);
                } else {
                    out.println("Email Updation UnSuccessfull");
                    request.getRequestDispatcher("/RG/UpdateEmailId.jsp").forward(request, response);
                }
            } else {
                out.println("Invalid Login");
                request.getRequestDispatcher("/RG/EmailUpdate.jsp").forward(request, response);
            }
       
    }

}
