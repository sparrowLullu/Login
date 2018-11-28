package Controller;

import Bean.RegisterBean;
import DAO.LoginDAO;
import Service.Login_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TheOS
 */
@WebServlet(name = "CheckEmailId", urlPatterns = {"/CheckEmailId"})
public class CheckEmailId extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RegisterBean rgbean = new RegisterBean();
        int x = 0;
        String c_email_id = request.getParameter("f_email_id");
        rgbean.setEmailId(c_email_id);

        Login_Service lg_srvc = new Login_Service();
        try {
            rgbean = (RegisterBean) lg_srvc.checkEmailId(c_email_id);
            if (rgbean != null) {
                request.getRequestDispatcher("/RG/Login1.jsp").forward(request, response);
            } else {
                out.println("Email not exist");
            }
        } catch (Exception ex) {
        }

    }
}
