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
public class Globals {
    public static ArrayList<Item> AdicionaElementosNaListaCarrinho(ArrayList<Item> listaItens, Item item){
        System.out.print("Baga");
        listaItens.add(item);
        return listaItens;
    }
}


