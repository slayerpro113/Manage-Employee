<%-- 
    Document   : login
    Created on : Dec 13, 2017, 11:02:55 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style/main.css">
        <script src="bootstrap/jquery-3.2.1.min.js"></script>
        <script src="bootstrap/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid">
            <form action="loginServlet" method="post" class="register-form"> 
                <span><h3 style ="color:red">${errorMessage}</h3></span>
              
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="email">EMAIL</label>
                        <input name="email" class="form-control" type="email">             
                    </div>            
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="password">PASSWORD</label>
                        <input name="password" class="form-control" type="password">             
                    </div>            
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
                        <button class="btn btn-default regbutton" onclick="window.location.href='add.jsp'">Register</button>                       
                    </div>
                    <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
                        <button class="btn btn-default logbutton">Sign up</button>           
                    </div>          
                </div>    
            </form>
        </div>
    </body>
</html>
