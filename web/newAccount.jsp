<%-- 
    Document   : newAcccount
    Created on : 04-ago-2018, 3:38:24
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="style.css">
        <!--Optional theme-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
        <!--Lastest compiles and minified JavaScript-->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <h1>Hello World!</h1>
        <div class="container well">
            <form action="AccountServlet?action=insert" method="post">
                <table>
                    <tr>
                        <th> <label><b>Username:</b></label> </th>
                        <th>
                            <input type="text" placeholder="Enter Username" class="form-control" name="username" required=""/>
                        </th>
                    </tr>
                    <tr>
                        <th> <label><b>Password:</b></label> </th>
                        <th>
                            <input type="password" placeholder="Enter Password" class="form-control" name="password" required=""/>
                        </th>
                    </tr>
                     <tr>
                        <th> <label><b>Nombres:</b></label> </th>
                        <th>
                            <input type="text" placeholder="Enter name" class="form-control" name="nombres" required=""/>
                        </th>
                    </tr>
                     <tr>
                        <th> <label><b>Apellidos:</b></label> </th>
                        <th>
                            <input type="text" placeholder="Enter last name" class="form-control" name="apellidos" required=""/>
                        </th>
                    </tr>
                    <tr>
                        <th> <label><b>Correo:</b></label> </th>
                        <th>
                            <input type="email" placeholder="Enter Email" class="form-control" name="correo" required=""/>
                        </th>
                    </tr>
                    <tr>
                        <th> <label><b>Dirección:</b></label> </th>
                        <th>
                            <input type="text" placeholder="Enter Adress" class="form-control" name="direccion" required=""/>
                        </th>
                    </tr>
                     <tr>
                        <th> <label><b>Celular:</b></label> </th>
                        <th>
                            <input type="number" placeholder="Enter phone" class="form-control" name="celular" required=""/>
                        </th>
                    </tr>
                     <tr>
                        <th> <label><b>Rol:</b></label> </th>
                        <th>
                            <input type="text" placeholder="Enter rol" class="form-control" name="rol" required=""/>
                        </th>
                    </tr>
                    <div class="break"></div>
                    <tr>
                        <td colspan="2"> 
                            <input class="btn icon-btn btn-success" type="submit" name="action" value="insertar">
                            <span class="glyphicon glyphicon-ok-sign"></span> 
                        
                            <input class="btn btn-info btn-lg" type="reset" name="action" value="Reset">
                            <span class="glyphicon glyphicon-remove"></span> 
                        </td>
                    </tr>
                </table>
            </form>
            <br>
        </div>
    </body>
</html>
