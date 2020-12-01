<%-- 
    Document   : add
    Created on : 24/11/2020, 3:27:07 p. m.
    Author     : Fenix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar persona!</h1>

        <form action="Controlador" >

            DNI:<br>
            <input type="text" name="txtDni"><br>
            Nombres:<br>
            <input type="text" name="txtNom"><br>
            <input type="submit" name="accion" value="Agregar">


        </form>


    </body>
</html>
