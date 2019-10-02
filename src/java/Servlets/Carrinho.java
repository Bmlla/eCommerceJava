package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ClassesNegocio.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(urlPatterns = {"/Carrinho"})
public class Carrinho extends HttpServlet {

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

        String acaoParametro = request.getParameter("action");     
        HttpSession session = request.getSession();
        
        int idProduto = Integer.parseInt(request.getParameter("id"));
        
        if(acaoParametro.equals("Adicionar")){
            
            ArrayList<Item> listaProdutos = (ArrayList<Item>)session.getAttribute("ListaProdutos");
            ArrayList<Item> listaProdutosCarrinho = new ArrayList<Item>();
            Item produto = listaProdutos.get(idProduto);
            
            if (session.getAttribute("Carrinho") == null ) {
                listaProdutosCarrinho.add(listaProdutos.get(idProduto));
                session.setAttribute("Carrinho", listaProdutosCarrinho);
            }else{
                listaProdutosCarrinho = (ArrayList<Item>)session.getAttribute("Carrinho");
                
                if(!listaProdutosCarrinho.contains(produto))
                    listaProdutosCarrinho.add(produto);
            }
            request.setAttribute("Carrinho", listaProdutosCarrinho);
        }
        
        
        if(acaoParametro.equals("Alterar")){
            ArrayList<String> quantidadeProduto = new ArrayList<String>();
            String quantidade = request.getParameter("qtd");
            
            if (session.getAttribute("QuantidadeProduto") == null ) 
            {
                quantidadeProduto.add(quantidade);
                session.setAttribute("QuantidadeProduto", quantidadeProduto);
            }else{
                quantidadeProduto = (ArrayList<String>)session.getAttribute("QuantidadeProduto");
                quantidadeProduto.set(idProduto, quantidade);
            }
            
            request.setAttribute("QuantidadeProduto", quantidadeProduto);
        }
        
        
        if(acaoParametro.equals("Excluir")){
            
            ArrayList<String> quantidadeProduto = (ArrayList<String>)session.getAttribute("QuantidadeProduto");
            
            if(quantidadeProduto != null && quantidadeProduto.get(idProduto) != null)
                quantidadeProduto.remove(idProduto);
            
            ArrayList<Item> listaProdutosCarrinho = (ArrayList<Item>)session.getAttribute("Carrinho");
            listaProdutosCarrinho.remove(idProduto);
            
            
            session.setAttribute("Carrinho", listaProdutosCarrinho);
            session.setAttribute("QuantidadeProduto", quantidadeProduto);
            
            request.setAttribute("Carrinho", listaProdutosCarrinho);
            request.setAttribute("QuantidadeProduto", quantidadeProduto);
            
        }
                
        request.getRequestDispatcher("/Carrinho.jsp").forward(request, response);
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
