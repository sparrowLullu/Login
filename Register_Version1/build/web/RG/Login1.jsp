
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Welcome</title>
        <style>
            body {
                background:url('http://cdn.wallpapersafari.com/13/6/Mpsg2b.jpg');
                margin:0px;
                font-family: 'Ubuntu', sans-serif;
                background-size: 100% 110%;
            }
            h1, h2, h3, h4, h5, h6, a {
                margin:0; padding:0;
            }
            .login {
                margin:0 auto;
                max-width:500px;
            }
            .login-header {
                color:#fff;
                text-align:center;
                font-size:300%;
            }
            /* .login-header h1 {
               text-shadow: 0px 5px 15px #000; 
            } */
            .login-form {
                border:.5px solid #fff;
                background:#4facff;
                border-radius:10px;
                box-shadow:0px 0px 10px #000;
            }
            .login-form h3 {
                text-align:left;
                margin-left:40px;
                color:#fff;
            }
            .login-form {
                box-sizing:border-box;
                padding-top:15px;
                padding-bottom:10%;
                margin:5% auto;
                text-align:center;
            }
            .login input[type="text"],
            .login input[type="password"] {
                max-width:400px;
                width: 80%;
                line-height:3em;
                font-family: 'Ubuntu', sans-serif;
                margin:1em 2em;
                border-radius:5px;
                border:2px solid #f2f2f2;
                outline:none;
                padding-left:10px;
            }
            .login-form input[type="button"] {
                height:30px;
                width:100px;
                background:#fff;
                border:1px solid #f2f2f2;
                border-radius:20px;
                color: slategrey;
                text-transform:uppercase;
                font-family: 'Ubuntu', sans-serif;
                cursor:pointer;
            }
            .sign-up{
                color:#f2f2f2;
                margin-left:-70%;
                cursor:pointer;
                text-decoration:underline;
            }
            .no-access {
                color:#E86850;
                margin:20px 0px 20px -57%;
                text-decoration:underline;
                cursor:pointer;
            }.update-password{
                color:#f2f2f2;
                margin-left:50px;
                cursor:pointer;
                text-decoration:underline;
            }
            .try-again {
                color:#f2f2f2;
                text-decoration:underline;
                cursor:pointer;
            }
            
            .update-gmail{
                color:#f2f2f2;
                margin-right:50px;
                padding-left: 50px;
                cursor:pointer;
                text-decoration:underline;
            }

            /*Media Querie*/
            @media only screen and (min-width : 150px) and (max-width : 530px){
                .login-form h3 {
                    text-align:center;
                    margin:0;
                }
                .sign-up, .no-access , .update-password{
                    margin:10px 0;
                }
                .login-button {
                    margin-bottom:10px;
                }

            }
        </style>
    </head>
    <body>

 <%-- Form --%>
 
        <form method="post" action="/Register_Version1/Login">
            <div class="login">
                <div class="login-header">
                    <h1>Login</h1>
                </div>
                <div class="login-form">
                    <h3>Email Id:</h3>
                    <input type="text" placeholder="User Email Id" name="f_email_id"/><br>
                    <h3>Password:</h3>
                    <input type="password" placeholder="Password" name="f_passwd"/>
                    <br>
                    <button type="submit" class="btn btn-primary btn-lg"/>Login</button>         
                    <%--   <input type="submit" value="login" />     --%>
                    <br>
                    <a class="sign-up" href="/Register_Version1/RG/Registration1.jsp">Sign up!</a>
                    <br>
                    <h6 class="no-access"><a href="/Register_Version1/RG/ResetPassword.jsp">Can't access your account?</a></h6>
                    <br>
                    <a class="update-password" href="/Register_Version1/RG/UpdatePassword.jsp">Update Password</a>
                    
                    <a class="update-gmail" href="/Register_Version1/RG/UpdateEmailId.jsp">Change your email</a>
                </div>
            </div>
            <div class="error-page">
                <%--  <div class="try-again">Error: Try again?</div> --%>
            </div>
        </form>
    </body>
</html>
