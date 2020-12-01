package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");

        if (menu.equals("Empleados")) {
            request.getRequestDispatcher("Empleados.jsp").forward(request, response);

        }

        if (menu.equals("Productos")) {
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }

        if (menu.equals("Ventas")) {

            request.getRequestDispatcher("Ventas.jsp").forward(request, response);
        }

        
        if (menu.equalsIgnoreCase("Delete")) {
            
            request.getRequestDispatcher("Delete.jsp").forward(request, response);
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
