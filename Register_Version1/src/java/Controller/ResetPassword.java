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
@WebServlet(name = "ResetPassword", urlPatterns = {"/ResetPassword"})
public class ResetPassword extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        RegisterBean rgbean = new RegisterBean();

        String c_email_id = request.getParameter("f_email_id");
        rgbean.setEmailId(c_email_id);

        String c_my_select = request.getParameter("f_my_select");
        rgbean.setSecurityQuestion(c_my_select);

        String c_my_answer = request.getParameter("f_my_answer");
        rgbean.setSecurityAnswer(c_my_answer);
        
        String c_new_password = request.getParameter("f_new_passwd");

        Login_Service lg_srvc = new Login_Service();
        try {
            rgbean = (RegisterBean) lg_srvc.checkEmailId(c_email_id);
            if (rgbean != null) {
                session.setAttribute("mailid", c_email_id);
                if (rgbean.getSecurityQuestion().equals(c_my_select) && (rgbean.getSecurityAnswer().equals(c_my_answer))) {
                    if (lg_srvc.UpdatePasswordLogin(rgbean, c_new_password)) {
                        request.getRequestDispatcher("/RG/Login1.jsp").forward(request, response);
                    }

                } else {
                    out.println("Security question answer not matched");
                    request.getRequestDispatcher("/RG/ResetPassword.jsp").forward(request, response);
                }
            } else {
                out.println("EmailId not matched");
                request.getRequestDispatcher("/RG/ResetPassword.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
