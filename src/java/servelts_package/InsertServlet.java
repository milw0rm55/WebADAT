/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelts_package;

import beans_package.Beans;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Peliculas;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "servelts", urlPatterns = {"/servelts"})
public class InsertServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
  Beans aEJB;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String nombre = request.getParameter("Titulo");
            String fecha = request.getParameter("date");
            double presupuesto = Double.valueOf(request.getParameter("Presupuesto"));
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            Date fechaDate = null;
            fechaDate = formatter.parse(fecha);
            /*java.sql.Date sqlDate;
            sqlDate = new java.sql.Date(formatter.parse(fecha).getTime());*/
            
         
            Peliculas pelicula = new Peliculas();
            pelicula.setCodigo(0);
            pelicula.setTitulo(nombre);
            pelicula.setFecha(fechaDate);
            pelicula.setPresupuesto(presupuesto);
            
           System.out.println(pelicula.getTitulo());
            System.out.println(pelicula.getCodigo());
            System.out.println(pelicula.getFecha());
            System.out.println(pelicula.getPresupuesto());
            aEJB.addPelicula(pelicula);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Prueba Servlet con EJB</title>");            
            out.println("</head>");
            out.println("<body>");
           List<Peliculas> l = aEJB.findAll();
/* bucle para recorrer la lista que corresponda */
 for(int i = 0; i < 10; i++ )
 out.println("<b>Titulo:</b>"+ l.get(i).getTitulo()
         +", <b>Fecha </b>"+l.get(i).getFecha()
+"<br>" );
            out.println("</body>");
            out.println("</html>");
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(InsertServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(InsertServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
