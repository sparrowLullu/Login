<%-- 
    Document   : UpdateEmailId
    Created on : Nov 27, 2018, 5:11:11 PM
    Author     : TheOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <%--
        <style>
            body {
          background-image: linear-gradient(to left top, #17a2b8, #14abc4, #12b3d1, #11bcde, #12c5eb);
          height: 100vh;
        }
        #login .container #login-row #login-column .login-box {
          margin-top: 120px;
          max-width: 600px;
          height: 320px;
          border: 1px solid #9C9C9C;
          background-image: linear-gradient(to bottom, #aec1c3, #a9b5b7, #bcc5c6, #cfd5d5, #e3e5e5); 

}
#login .container #login-row #login-column .login-box #login-form {
  padding: 20px;
}
#login .container #login-row #login-column .login-box #login-form #register-link {
  margin-top: -85px;
}
</style> --%>
    </head>
    <body>


    <body>
        <div id="reset-email">
            <h3 class="text-center text-white pt-5">Reset Email Id</h3>
            <div class="container">
                <div id="reset-email-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div class="login-box col-md-12">
   <%--form--%>               
                            <form id="login-form" class="form" action="/Register_Version1/EmailUpdate" method="post">
                                <h3 class="text-center text-info">Login</h3>
                                <div class="form-group">
                                    <label for="user Email" class="text-info">Login Id:</label><br>
                                    <input type="text" name="f_email_id" id="" class="form-control" placeholder="Login Email ID">
                                </div>
                                <div class="form-group">
                                    <label for="password" class="text-info">Password:</label><br>
                                    <input type="text" name="f_password" id="" class="form-control" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="newEmail" class="text-info">Reset Email Id:</label><br>
                                    <input type="text" name="f_newEmail_password" id="" class="form-control" placeholder="New Email Id">
                                </div>
                                <div class="form-group">
     <%-- <label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br> --%>
                                    <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                                </div>
                                <div id="register-link" class="text-right">
                                    <a href="#" class="text-info">Register here</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</body>
</html>
