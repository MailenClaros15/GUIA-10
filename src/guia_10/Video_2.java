/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;


import servicios.Video2servicio;

/**
 *
 * @author Edgardo
 */
public class Video_2 {
    //Nos encontraremos que justamente los List son padres o madres de los arraylist
    //En el video 2 observaremos este mismo.
    public static void main(String[] args) {
      Video2servicio ser = new Video2servicio ();
      ser.crearMascota();
      ser.crearMascota();
      ser.mostrarMascotas();
    }
}
