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
import javax.servlet.http.HttpSession;

/**
 *
 * @author TheOS
 */
@WebServlet(name = "UpdatePassword", urlPatterns = {"/UpdatePassword"})
public class UpdateLoginPassword extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        RegisterBean rgbean = new RegisterBean();
        String c_email_id = request.getParameter("f_email_id");
        rgbean.setEmailId(c_email_id);
        String c_curr_passwd = request.getParameter("f_curr_passwd");
        rgbean.setPassword(c_curr_passwd);
        
        String c_new_passwd = request.getParameter("f_new_passwd");// ask do i need to set new password  eg rgbean.setPassword(c_new_passwd)

        
        Login_Service lg_srvc = new Login_Service();

        // first checking email exist or not
        HttpSession session = request.getSession(false);

        try {
            if (c_curr_passwd != null) {
                session.setAttribute("Oldpwd", c_curr_passwd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            rgbean = (RegisterBean) lg_srvc.checkEmailId(c_email_id);
            if (rgbean != null) {
                session.setAttribute("emailId", c_email_id);
   //error because here i am matching String and using equal to operator
 // for String matching use  .equals
   // if (c_curr_passwd == rgbean.getPassword()) {
                
                if(rgbean.getPassword() .equals(c_curr_passwd)){
                
                    if (lg_srvc.UpdatePasswordLogin(rgbean, c_new_passwd)) {

                        request.getRequestDispatcher("/RG/Login1.jsp").forward(request, response);
                    } else {
                        out.println("registration not successfull");
                        response.sendRedirect("/RG/UpdatePassword.jsp");
                    }

                } else {
                    out.println("check mail Id");
                    request.getRequestDispatcher("/RG/UpdatePassword.jsp").forward(request, response);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
