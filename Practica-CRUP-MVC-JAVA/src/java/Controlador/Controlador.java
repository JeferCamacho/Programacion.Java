package Controlador;

import Modelo.Persona;
import ModeloDAO.PersonaDAO;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    String listar = "vistas/listar.jsp";
    String add = "vistas/add.jsp";
    String edit = "vistas/edit.jsp";

    Persona p = new Persona();
    PersonaDAO dao = new PersonaDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        String action = request.getParameter("accion");
//
//        if (action.equals("listar")) {
//
//            request.getRequestDispatcher("listar.jsp");
//
//        }
//
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String acceso = "";
        String action = request.getParameter("accion");

        if (action.equals("listar")) {

            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {

            acceso = add;

        } else if (action.equalsIgnoreCase("Agregar")) {

            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");

            p.setDni(dni);
            p.setNom(nom);

            dao.add(p);

            acceso = listar;

        } else if (action.equalsIgnoreCase("editar")) {

            request.setAttribute("idper", request.getParameter("id"));
            acceso = edit;

        } else if (action.equalsIgnoreCase("Actualizar")) {

            int id = Integer.parseInt(request.getParameter("txtid"));
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");

            p.setId(id);
            p.setDni(dni);
            p.setNom(nom);

            dao.edit(p);

            acceso = listar;

        } else if (action.equalsIgnoreCase("eliminar")) {

            int id = Integer.parseInt(request.getParameter("id"));

            p.setId(id);
            dao.eliminar(id);
            acceso = listar;

        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);

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
