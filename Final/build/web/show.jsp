<%-- 
    Document   : show
    Created on : Nov 29, 2017, 1:58:04 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Page</title>
        <script src="bootstrap/jquery-3.2.1.min.js"></script>
        <script src="bootstrap/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
        <style>
            body{
                 background-color: #F2F4F8;
            }
            h4{
                color : #aa422f;
                
            }
            span{
                float: right;
                color: blue;
                margin-right: 3em;
                margin-bottom: 2em;
                
            }
            #info{
                color:#10707f;
            }
            table{
                background-color: #F2F4F8;
            }
        </style>
    </head>
    <body>
        <form>
            <span>Hi, ${employee.name}!! <a href="login.jsp" style="color:red">(Log out)</a></span>
            
            <table class="table table-striped">
                <tr>                  
                    <th><h4><strong>ID</strong></h4></th>
                    <th><h4><strong>Name</strong></h4></th>
                    <th><h4><strong>Position</strong></h4></th>
                    <th><h4><strong>Email</strong></h4></th>
                    <th><h4><strong>Password</strong></h4></th>
                    <th><h4><strong>Address</strong></h4></th>                    
                </tr>
                <c:forEach var="employee" items="${employees}">
                    <tr id ="info">                      
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.position}</td>
                        <td>${employee.email}</td>
                        <td>${employee.password}</td>
                        <td>${employee.address}</td>                       
                        <td><input type="button"  class="btn btn-info" name="edit" value="Edit" onclick="window.location.href = 'editServlet?id=${employee.id}&name=${employee.name}&position=${employee.position}&email=${employee.email}&password=${employee.password}&address=${employee.address}'"><br></td>                      
                        <td><input type="button"  class="btn btn-secondary" name="delete" value="Delete" onclick="window.location.href = 'deleteServlet?id=${employee.id}'"></td>
                    </tr>
                </c:forEach>                
            </table>
            <input style="margin-left: 70.5em;" type="button" class="btn btn-danger" name="add" value="Add" onclick="window.location.href = 'add.jsp'"><br>
        </form>
    </body>
</html>
