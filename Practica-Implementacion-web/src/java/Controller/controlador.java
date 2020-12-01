package Controller;

import Moduls.Usuario;
import Moduls.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

    Usuario usuario = new Usuario();
    UsuarioDao usuarioDao = new UsuarioDao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("crear")) {

            request.getRequestDispatcher("WIEW/add.jsp").forward(request, response);

        } else if (action.equalsIgnoreCase("reguesar")) {

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else if (action.equalsIgnoreCase("Agregar")) {

            String name = request.getParameter("Name");
            String password = request.getParameter("password");
            String correo = request.getParameter("email");

            usuario.setNombre(name);
            usuario.setPassword(password);
            usuario.setCorreo(correo);

            usuarioDao.add(usuario);
            request.getRequestDispatcher("WIEW/add.jsp").forward(request, response);
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
    }

}
