<%-- 
    Document   : ResetPassword
    Created on : Nov 27, 2018, 10:17:46 AM
    Author     : TheOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script><script src="//m.servedby-buysellads.com/monetization.js" type="text/javascript"></script>
        <script>< script async = "" src = "https://www.googletagmanager.com/gtag/js?id=UA-125810435-1" ></script>



        <style type="text/css">
            .copy-right{
                position:absolute;
                // top:0;
                bottom:0;
                right:0;
                padding-bottom: 25px;
            }
        </style>
        <style>
            .Reset-Password-form{
                background:url('http://cdn.wallpapersafari.com/13/6/Mpsg2b.jpg');
                height: 100%;
                width: 100%;
                <%--   margin:0px;
                font-family: 'Ubuntu', sans-serif;
                background-size: 100% 110%; --%>
            }




            .Reset-Password-form input[type="text"],
            .Reset-Password-form input[type="password"] {
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
        </style>
    </head>
    <body>


        <div class="Reset-Password-form" align="center">
            <h2>Reset Password Form</h2><br>
            <div class="element-main">
                <h1>Forgot Password</h1>
                <p> Please enter your Email Id.</p>
<%-- form --%>
                <form action="/Register_Version1/ResetPassword" method="post">
                    <input type="text" placeholder="Your e-mail address" name="f_email_id">
                    <div><br>
                        <select class="form-control" name="f_my_select">
                            <option class="hidden"  selected disabled>Please select your Security Question</option>
                            <option value="1"> What is your Birthdate? </option>
                            <option value="2"> What is Your old Phone Number? </option>
                            <option value="3"> What is your Pet Name? </option>
                        </select>
                    </div>  <br>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Answer* " name="f_my_answer" />
                    </div>
                    <br>
                    <div><input type="text" placeholder="set New Password" name="f_new_passwd"></div>

                    <input type="submit" value="Reset my Password">
                </form>
            </div>
        </div>
        <!---728x90--->

        <div class="copy-right">

            <p>© 2018 Reset Password Form. All rights reserved </p>
        </div>
    </body>
</html>
