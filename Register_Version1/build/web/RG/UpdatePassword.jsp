<%-- 
    Document   : UpdatePassword
    Created on : Nov 26, 2018, 12:48:56 PM
    Author     : TheOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
               <style>
            .pass_show{position: relative} 

.pass_show .ptxt { 

position: absolute; 

top: 50%; 

right: 10px; 

z-index: 1; 

color: #f36c01; 

margin-top: -10px; 

cursor: pointer; 

transition: .3s ease all; 

} 

.pass_show .ptxt:hover{color: #333333;} 
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>Update</title>
        <script>
             
$(document).ready(function(){
$('.pass_show').append('<span class="ptxt">Show</span>');  
});
  

$(document).on('click','.pass_show .ptxt', function(){ 

$(this).text($(this).text() == "Show" ? "Hide" : "Show"); 

$(this).prev().attr('type', function(index, attr){return attr == 'password' ? 'text' : 'password'; }); 

}); 
        </script>
    </head>
    <body> <form action="/Register_Version1/UpdatePassword" method="post" >
      <div class="container-fluid">
	<div class="row">
		<div class="col-sm-6">
		    
                    <label>Email Id</label>
		    <div class="form-group pass_show"> 
                <input type="email" value="" class="form-control" placeholder="Email Id"  name="f_email_id"/> 
            </div> 
		    <label>Current Password</label>
		    <div class="form-group pass_show"> 
                <input type="password" value="" class="form-control" placeholder="Current Password" name="f_curr_passwd" /> 
            </div> 
		       <label>New Password</label>
            <div class="form-group pass_show"> 
                <input type="password" value="" class="form-control" placeholder="New Password" name="f_new_passwd" /> 
            </div> 
		       <label>Confirm Password</label>
            <div class="form-group pass_show"> 
                <input type="password" value="" class="form-control" placeholder="Confirm Password" /> 
            </div> 
            <input type="submit" class="btn btn-danger" value="Update"> 
		</div>  
	</div>
</div>
            </form>
    </body>
</html>
