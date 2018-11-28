<%-- 
    Document   : Registration
    Created on : Nov 16, 2018, 9:05:33 PM
    Author     : TheOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="Registration_Validation.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ----------> <title>JSP Page</title>

        <style>

            .register{
                background: -webkit-linear-gradient(left, #3931af, #00c6ff);
                margin-top: 3%;
                padding: 3%;
            }
            .register-left{
                text-align: center;
                color: #fff;
                margin-top: 4%;
            }
            .register-left input{
                border: none;
                border-radius: 1.5rem;
                padding: 2%;
                width: 60%;
                background: #f8f9fa;
                font-weight: bold;
                color: #383d41;
                margin-top: 30%;
                margin-bottom: 3%;
                cursor: pointer;
            }
            .register-right{
                background: #f8f9fa;
                border-top-left-radius: 10% 50%;
                border-bottom-left-radius: 10% 50%;
            }
            .register-left img{
                margin-top: 15%;
                margin-bottom: 5%;
                width: 25%;
                -webkit-animation: mover 2s infinite  alternate;
                animation: mover 1s infinite  alternate;
            }
            @-webkit-keyframes mover {
                0% { transform: translateY(0); }
                100% { transform: translateY(-20px); }
            }
            @keyframes mover {
                0% { transform: translateY(0); }
                100% { transform: translateY(-20px); }
            }
            .register-left p{
                font-weight: lighter;
                padding: 12%;
                margin-top: -9%;
            }
            .register .register-form{
                padding: 10%;
                margin-top: 10%;
            }
            .btnRegister{
                float: right;
                margin-top: 10%;
                border: none;
                border-radius: 1.5rem;
                padding: 2%;
                background: #0062cc;
                color: #fff;
                font-weight: 600;
                width: 50%;
                cursor: pointer;
            }
            .register .nav-tabs{
                margin-top: 3%;
                border: none;
                background: #0062cc;
                border-radius: 1.5rem;
                width: 28%;
                float: right;
            }
            .register .nav-tabs .nav-link{
                padding: 2%;
                height: 34px;
                font-weight: 600;
                color: #fff;
                border-top-right-radius: 1.5rem;
                border-bottom-right-radius: 1.5rem;
            }
            .register .nav-tabs .nav-link:hover{
                border: none;
            }
            .register .nav-tabs .nav-link.active{
                width: 100px;
                color: #0062cc;
                border: 2px solid #0062cc;
                border-top-left-radius: 1.5rem;
                border-bottom-left-radius: 1.5rem;
            }
            .register-heading{
                text-align: center;
                margin-top: 8%;
                margin-bottom: -15%;
                color: #495057;
            }


        </style>
        <script src="NewValidation.js"></script>
    </head>
    <body>
        <p align="center">Registration</p>

        <div class="container register">
            <div class="row">
                <div class="col-md-3 register-left">
                    <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                    <h3>Welcome</h3>
                    <p>Please Register Yourself</p>
                    <a href="/Register_Version1/RG/Login1.jsp" ><h1> Login</h1></a><br/>  

                </div>
                <div class="col-md-9 register-right">
                    <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Employee</a>
                        </li>
                        <li class="nav-item">
                            <%--        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Hirer</a>    --%>
                        </li>
                    </ul>
                    <div class="tab-content" id="myTabContent">
   <%-- form --%>
                        .
                        <form method="post" action="/Register_Version1/Registration" name="registration"  onsubmit="return frmValidation();">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Please Register Yourself</h3>
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="First Name *" value=""  name="f_first_name" required/>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Last Name *" value=""  name="f_last_name" required />
                                        </div>
                                        <div class="form-group">
                                            <input type="date" class="form-control" placeholder="Date of Birth *" value=""  name="f_dob"  required/>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control"  placeholder="Address *" value=""  name="f_address"  required />
                                        </div>
                                        <div class="form-group">
                                            <div class="maxl">
                                                <label class="radio inline"> 
                                                    <input type="radio" name="f_gender" value="male" checked>
                                                    <span> Male </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" name="f_gender" value="female">
                                                    <span>Female </span> 
                                                </label>
                                            </div>
                                        </div>
                                         <input type="submit" class="btnRegister"  value="Register"/>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" minlength="10" maxlength="10"  class="form-control" placeholder="Your Mobile *" value="" name="f_mobile_no"  id="id_mobile_no" required />
                                        </div>
                                        <div class="form-group">    
                                            <input type="email" class="form-control" placeholder="Your Email *" value="" name="f_email_id"/>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" name="f_my_select">
                                                <option class="hidden"  selected disabled>Please select your Security Question</option>
                                                <option value="1"> What is your Birthdate? </option>
                                                <option value="2"> What is Your old Phone Number? </option>
                                                <option value="3"> What is your Pet Name? </option>
                                            </select>   </div>  
                                            <div class="form-group">
                                                <input type="text" class="form-control" placeholder="Answer* " name="f_my_answer" />
                                            </div>
                                           
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="set Password*" value="" name="f_password" id="pass1" required/>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Confirm Password*" value="" name="f_password2" id="pass2" required/>
                                        </div>

                                       
                                    </div>
                                </div>
                            </div>
                            <%--         
                      <div class="tab-pane fade show" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                          <h3  class="register-heading">Apply as a Hirer</h3>
                          <div class="row register-form">
                              <div class="col-md-6">
                                  <div class="form-group">
                                      <input type="text" class="form-control" placeholder="First Name *" value="" />
                                  </div>
                                  <div class="form-group">
                                      <input type="text" class="form-control" placeholder="Last Name *" value="" />
                                  </div>
                                  <div class="form-group">
                                      <input type="email" class="form-control" placeholder="Email *" value="" />
                                  </div>
                                  <div class="form-group">
                                      <input type="text" maxlength="10" minlength="10" class="form-control" placeholder="Phone *" value="" />
                                  </div>


                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="password" class="form-control" placeholder="Password *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" placeholder="Confirm Password *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control">
                                                <option class="hidden"  selected disabled>Please select your Sequrity Question</option>
                                                <option>What is your Birthdate?</option>
                                                <option>What is Your old Phone Number</option>
                                                <option>What is your Pet Name?</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="`Answer *" value="" />
                                        </div>
                                        <input type="submit" class="btnRegister"  value="Register"/>
                                    </div>
                                </div>
                            </div>  --%>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
