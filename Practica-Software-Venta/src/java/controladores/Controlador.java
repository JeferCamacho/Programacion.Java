/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modulos.ProductoD;
import modulos.ProductoDAO;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    ProductoD producto = new ProductoD();
    ProductoDAO productoDao = new ProductoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        String menu = request.getParameter("menu");

        if (menu.equals("nuevo")) {
            request.getRequestDispatcher("nuevo.jsp").forward(request, response);

            switch (accion) {
                case "Listar":

                    break;
                case "Agregar":
                    String codigo = request.getParameter("codigo");
                    String nombre = request.getParameter("nombre");
                    double precio = Double.parseDouble(request.getParameter("precio"));
                    int existencias = Integer.parseInt(request.getParameter("existencia"));
                    producto.setCodigo(codigo);
                    producto.setNombre(nombre);
                    producto.setPrecio(precio);
                    producto.setExistencia(existencias);
                    productoDao.Agregar(producto);

                    break;
                case "Eliminar":

                    break;
                case "Actualizar":

                    break;
                case "Cargar":

                    break;
            }

        }
//
//        if (accion.equals("agregar")) {
//
//            String codigo = request.getParameter("codigo");
//            String nombre = request.getParameter("nombre");
//            double precio = Double.parseDouble(request.getParameter("precio"));
//            int existencias = Integer.parseInt(request.getParameter("existencia"));
//            producto.setCodigo(codigo);
//            producto.setNombre(nombre);
//            producto.setPrecio(precio);
//            producto.setExistencia(existencias);
//            productoDao.Agregar(producto);
//
//        }

        if (menu.equals("nuevo")) {
            switch (accion) {
                case "Listar":

                    break;
                case "Agregar":
                    String codigo = request.getParameter("codigo");
                    String nombre = request.getParameter("nombre");
                    double precio = Double.parseDouble(request.getParameter("precio"));
                    int existencias = Integer.parseInt(request.getParameter("existencia"));
                    producto.setCodigo(codigo);
                    producto.setNombre(nombre);
                    producto.setPrecio(precio);
                    producto.setExistencia(existencias);
                    productoDao.Agregar(producto);

                    break;
                case "Eliminar":

                    break;
                case "Actualizar":

                    break;
                case "Cargar":

                    break;
            }
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
