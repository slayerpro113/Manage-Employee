<%-- 
    Document   : add
    Created on : Dec 10, 2017, 7:36:37 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Page</title>
        <script src="bootstrap/jquery-3.2.1.min.js"></script>
        <script src="bootstrap/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="style/main.css">
    </head>
    <body>
        <div class="container-fluid">
            <form action="addServlet" method="post" class="register-form"> 
                <h2 style="margin-left: 3em; color: #dc3545"><strong>Add Form</strong></h2>
                 <div class="row">      
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="firstName">ID</label>
                        <input name="id" class="form-control" type="text" required>    
                    </div>            
                </div>
                <div class="row">      
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="firstName">NAME</label>
                        <input name="name" class="form-control" type="text" required>    
                    </div>            
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="email">EMAIL</label>
                        <input name="email" class="form-control" type="email" required>             
                    </div>            
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="password">PASSWORD</label>
                        <input name="password" class="form-control" type="password" required>             
                    </div>            
                </div>
                <div class="row">      
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="firstName">POSITION</label>
                        <input name="position" class="form-control" type="text">    
                    </div>            
                </div>
                <div class="row">      
                    <div class="col-md-4 col-sm-4 col-lg-4">
                        <label for="firstName">ADDRESS</label>
                        <input name="address" class="form-control" type="text" >    
                    </div>            
                </div>
                <hr>
                <div class="row">
                    <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
                        <button class="btn btn-default logbutton">Add</button>           
                    </div>          
                </div>    
            </form>
        </div>
    </body>
</html>
