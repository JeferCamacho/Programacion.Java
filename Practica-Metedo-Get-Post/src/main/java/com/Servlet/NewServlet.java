package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*
        
        
            
        * Principalmente el servlet es el encargado se intersectar todas las peticiones del cliente tanto 
          <GET> O <POST> que vienen desde una cliente en cual los datos son enviados directamente al servidor
          
        * <REQUEST> : Principamente accede a la informacion en cual esta contenida en la pagina <LOGIN-CUESTIONARIO>
          un ejemplo claro es cuando se realiza una operacion matematica traeria los numeros para realizar la operacion

        * <RESPONSE> : La respuesta que hace el servidor hacia la <VISTA> nombrando el ejemplo anterior lo que
          realizaria es traer los resultados de la operacion matematica y lo llevaria a que usuario lo visualizaria
          

         */
        System.out.println(request.getParameter("nombre"));

        /*
        
        //FUNCIONAMIENTO OBJETO REQUEST
        
            * Request. permite acceder a la informacion que se pasa desde el nagador del cliente al servidor
        
        // FUNCIONAMIENTO request.getParameter
        
            * request.getParameter("nombre") Su funcionamiento es devolver los datos proviente del cliente
        
       
         */
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
