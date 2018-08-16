/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.servlet;

import com.udea.ejb.VentasFacadeLocal;
import com.udea.entity.Account;
import com.udea.entity.Ventas;
import java.io.IOException;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class VentasServlet extends HttpServlet {

    @EJB
    private VentasFacadeLocal ventasFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try{
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");
            String url = "index.jsp";
            if("list".equals(action)) {
                List<Ventas> findAll=ventasFacade.findAll();
                request.getSession().setAttribute("accounts", findAll);
                url = "listAccounts.jsp";
            }else if("insert".equals(action)){
                    Ventas a = new Ventas();
                    Account b = new Account();
                    //a.setIDCliente(request.getParameter("IDCliente"));
                    //a.setIDVehiculo(Integer.parseInt((request.getParameter("precio"))));
                    a.setFecha(request.getParameter("placa"));
                    a.setPrecio(Integer.parseInt((request.getParameter("precio"))));
                    a.setDescuento(Integer.parseInt((request.getParameter("precio"))));
                    ventasFacade.create(a);
                    url = "vehiculoNuevo.jsp";
                }else if ("delete".equals(action)){
                    String id = request.getParameter("id");
                    Ventas a = ventasFacade.find(Integer.valueOf(id));
                    ventasFacade.remove(a);
                    url = "VentasServlet?action=List";
                }
                response.sendRedirect(url);
                
            }finally{
            out.close();
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
