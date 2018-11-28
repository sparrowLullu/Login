function validateForm() {

    var first_name = document.forms["registration"]["f_first_name"].value;
    var last_name = document.forms["registration"]["f_last_name"].value;
    var address = document.forms["registration"]["f_address"].value;
    var mobile_no = document.forms["registration"]["f_mobile_no"].value;
    var pass1 = document.getElementById("pass1").value;
    var pass2 = document.getElementById("pass2").value;
    var security_ques = document.forms["registration"]["f_myselect"].value;
    var security_answer = document.forms["registration"]["f_my_answer"].value;
    var email = document.forms["registration"]["f_email_id"].value;
    var reEmail = /^(?:[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+\.)*[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+@(?:(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9\-](?!\.)){0,61}[a-zA-Z0-9]?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9\-](?!$)){0,61}[a-zA-Z0-9]?)|(?:\[(?:(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\.){3}(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\]))$/;
    var ok = true;
    var alphaExp = /^[a-zA-Z]+$/;
    
    if (first_name == null || first_name == "") {
        alert("First Name not filled");
        return false;
    }
    if(!first_name.match(alphaExp)){
        alert="plese enter letters only";
        return false;
    }
    if (last_name == null || last_name == "") {
        alert("Last Name not filled");
        return false;
    }
    if (address == null || address == " ") {
        alert = "Address Field is Blank";
        return false;
    }
    if (!email.match(reEmail)) {
        alert("invalid email address");
        return false;
    }

    if (pass1 != null || pass2 != null) {
        alert = "plaese fill the both  password"
    }
    if (pass1 != pass2) {
        alert = "Password not matched";
        document.getElementById("pass1").style.borderColor = "#E34234";
        document.getElementById("pass2").style.borderColor = "#E34234";
        return false;
    }


    if (security_ques == null || security_ques == "") {
        alert = "Selet Security Answer";
        return false;
    }
    if (security_answer == null || security_answer == "") {
        alert = "please answer the security answer";
        return false;
    }


    if (isNaN(mobile_no)) {
        document.getElementId("id_mobile_no").innerHTML = "Enter Numeric Value only";
        return false;
    }

    else {
        alert = "Ready to Register";
    }



}
