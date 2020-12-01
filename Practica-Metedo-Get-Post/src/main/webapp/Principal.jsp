<%-- 
    Document   : Principal
    Created on : 26/10/2020, 4:47:05 p. m.
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
        <h1>Bienvido</h1>

        <form action="NewServlet" method="get">

            <!-- Principalmente enviamos los datos al acccionar el <button type="submit">Enviar</button>
                 y lo que realiza es enviar los datos por el metedo <Get> para que los recepcione el 
                 <servlet> para que realice su respectico proceso
            
            -->

            <input type="text" name="nombre"><!-- Se visualiza una caja para poder insertar el dato <nombre> -->

            <button type="submit">Enviar</button><!-- Al accionar envia la informacion -->
        </form>
    </body>
</html>
