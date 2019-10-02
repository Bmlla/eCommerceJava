/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import ClassesNegocio.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author brunomuller
 */
@WebServlet(name = "Produto", urlPatterns = {"/Produto"})
public class Produto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


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
        
        HttpSession session = request.getSession();
        
        ArrayList<Item> itensDisponiveis = new ArrayList<Item>();
        itensDisponiveis.add(new Item("Batata","","caixas", 10.00));
        itensDisponiveis.add(new Item("Pneu","https://a-static.mlcdn.com.br/618x463/pneu-aro-16-michelin-205-55r16-94v-primacy-4/magazineluiza/221598800/f0d21b60efa44130f54c6e8a0a79da22.jpg","unidade", 5.00));
        itensDisponiveis.add(new Item("Carne","","peças", 2.76));
        itensDisponiveis.add(new Item("Pregos","","caixas", 3.15));
    
        session.setAttribute("ListaProdutos", itensDisponiveis);
        
        request.setAttribute("Produtos", itensDisponiveis);
        request.setAttribute("ListaCarrinho", new ArrayList<Item>());

        request.getRequestDispatcher("/Produto.jsp").forward(request, response);
    }

        protected void doGet_Alteracao(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            request.getSession();
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
        //processRequest(request, response);
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
