package Controladores;

import Modulos.Articulo;
import Modulos.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

/**
 *
 * @author Fenix
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        UsuarioDAO usuarioDao = new UsuarioDAO();
        if (menu.equals("Principal")) {

            request.getRequestDispatcher("Vista/Principal.jsp").forward(request, response);

        }

        if (menu.equals("Productos")) {

            request.getRequestDispatcher("Vista/Productos.jsp").forward(request, response);
        }

        if (menu.equals("Empleados")) {

            request.getRequestDispatcher("Vista/Empleados.jsp").forward(request, response);
        }

        if (menu.equals("Clientes")) {

            request.getRequestDispatcher("Vista/Clientes.jsp").forward(request, response);
        }

        if (menu.equals("Ventas")) {
            request.getRequestDispatcher("Vista/Ventas.jsp").forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        Articulo articulo = new Articulo(0, "clorox", "esta en buen estado", 982.2);

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

    private static class UsuarioDAO {

        public UsuarioDAO() {
        }
    }

}
