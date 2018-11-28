package Controller;

import Bean.RegisterBean;
import Service.Registration_Class;
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
@WebServlet(name = "Registration", urlPatterns = {"/Registration"})
public class Registration1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String c_first_name = request.getParameter("f_first_name");
        String c_last_name = request.getParameter("f_last_name");
        String c_dob = request.getParameter("f_dob");
        String c_address = request.getParameter("f_address");
        String c_gender = request.getParameter("f_gender");
        String c_mobile_no = request.getParameter("f_mobile_no");
        String c_email_id = request.getParameter("f_email_id");
        String c_password = request.getParameter("f_password");
        String c_secu_ques = request.getParameter("f_my_select");
        String c_secu_answer = request.getParameter("f_my_answer");
        

        RegisterBean rgbean = new RegisterBean();
        rgbean.setFirstName(c_first_name);
        rgbean.setLastName(c_last_name);
        rgbean.setDob(null);
        rgbean.setAddress(c_address);
        rgbean.setGender(c_gender);
        rgbean.setMobileNo(c_mobile_no);
        rgbean.setEmailId(c_email_id);
        rgbean.setPassword(c_password);
        rgbean.setEmailId(c_email_id);
        rgbean.setSecurityQuestion(c_secu_ques);
        rgbean.setSecurityAnswer(c_secu_answer);

        Registration_Class rg_srvc = new Registration_Class();
        if (rg_srvc.addRegister(rgbean)) {
           // request.getRequestDispatcher("/RG/Login1.jsp").forward(request, response); //creating problem ( url is different )
            response.sendRedirect("/Register_Version1/RG/Login1.jsp");
        } else {
            System.out.println("registration not successfull");

            response.sendRedirect("/Register_Version1/RG/Registration1.jsp");
            out.println("REGISTRATION  not successfull");
        }
    }
}
