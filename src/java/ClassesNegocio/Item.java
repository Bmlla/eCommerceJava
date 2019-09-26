/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesNegocio;

/**
 *
 * @author brunomuller
 */
public class Item {
    private String Nome;
    private String UrlImagem;
    private String Unidade;
    
    
    public Item(String nome, String urlImagem, String unidade){
        this.Nome = nome;
        this.UrlImagem = urlImagem;
        this.Unidade = unidade;
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
}
