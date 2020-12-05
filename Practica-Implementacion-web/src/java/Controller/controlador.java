package Controller;

import Moduls.Documento;
import Moduls.DocumentoDao;
import Moduls.Producto;
import Moduls.ProductoDao;
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
    Producto producto = new Producto();
    ProductoDao productoDao = new ProductoDao();
    Documento documento = new Documento();
    DocumentoDao documentoDoa = new DocumentoDao();

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
        } else if (action.equalsIgnoreCase("crearProducto")) {

            request.getRequestDispatcher("WIEW/producto.jsp").forward(request, response);

        } else if (action.equalsIgnoreCase("agregarProducto")) {

            String nombre = request.getParameter("nombre");
            String codigo = request.getParameter("codigo");
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));

            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setCantidad(cantidad);

            productoDao.add(producto);
            request.getRequestDispatcher("WIEW/producto.jsp").forward(request, response);

        } else if (action.equalsIgnoreCase("crearDocumento")) {

            request.getRequestDispatcher("WIEW/documento.jsp").forward(request, response);

        } else if (action.equalsIgnoreCase("agregarDocumento")) {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nombreDocumento = request.getParameter("nombreDocumento");

            documento.setCodigo(codigo);
            documento.setNombreDocumento(nombreDocumento);

            documentoDoa.add(documento);

            request.getRequestDispatcher("WIEW/documento.jsp");

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
