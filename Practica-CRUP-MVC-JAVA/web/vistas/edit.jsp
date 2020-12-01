<%-- 
    Document   : edit
    Created on : 24/11/2020, 3:27:31 p. m.
    Author     : Fenix
--%>

<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            PersonaDAO dao = new PersonaDAO();

            int id = Integer.parseInt((String) request.getAttribute("idper"));
            Persona p = (Persona) dao.list(id);

        %>
        <h1>Modificar Persona!</h1>



        <form action="Controlador" >

            DNI:<br>
            <input type="text" name="txtDni" value="<%= p.getDni()%>"><br>

            Nombres:<br>
            <input type="text" name="txtNom" value="<%= p.getNom()%>"><br>

            
            
            <input type="hibben" name="txtid" value="<%= p.getId()%>">

            <input type="submit" name="accion" value="Actualizar">


            <a href="Controlador?accion=listar">regresar</a>

        </form>

    </body>
</html>
