/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import servicios.Video3servicios;

/**
 *
 * @author Edgardo
 */
public class Video_3 {
     public static void main(String[] args) {
         Video3servicios sv=new Video3servicios();
         sv.fabricaMascotas(3);
         //detro del parentesis podemos odificar la cantidad
         sv.mostrarMascotas();
     }
}
