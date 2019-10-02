/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesNegocio;

import java.util.ArrayList;

/**
 *
 * @author brunomuller
 */
public class Item {
    private String Nome;
    private String UrlImagem;
    private String Unidade;
    private double Valor;
    
    
    public Item(String nome, String urlImagem, String unidade, double valor){
        this.Nome = nome;
        this.UrlImagem = urlImagem;
        this.Unidade = unidade;
        this.Valor = valor;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void setUrlImagem(String urlImagem){
        this.UrlImagem = urlImagem;
    }
    
    public String getUrlImagem(){
        return this.UrlImagem;
    }
    
    public void setUnidade(String unidade){
        this.Unidade = unidade;
    }
    
    public String getUnidade(){
        return this.Unidade;
    }
    
    public void setValor(double valor){
        this.Valor = valor;
    }
    
    public double getValor(){
        return this.Valor;
    }
    
    public static Item getItemByIndice(ArrayList<Item> listaItens, int index){
        return listaItens.get(index);
    }
    
    public static void teste(){
        System.out.print("baga");
    }
}
