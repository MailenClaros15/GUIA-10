/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import entidades.Mascota;

import java.util.ArrayList;
import java.util.Collections;
import utilidades.Comparadores;

/**
 *
 * @author Edgardo
 */
public class Video_6 {
    //Como representar una matriz 
    //COLLECTION(S)
    public static void main(String[] args) {
       // ArrayList<ArrayList<String>> matriz=new ArrayList();
        //representa el primer arraylis la columna y la segunda loa fila
        ArrayList<Mascota> mascotas=new ArrayList();
        mascotas.add(new Mascota("fer","chiquito","perro"));
        mascotas.add(new Mascota("pepa","lola","gato"));
           
        Collections.sort(mascotas,Comparadores.ordenarPorNombreDes);
        for (Mascota mascota:mascotas) {
            System.out.println(mascota);
        }
        
    }
}
