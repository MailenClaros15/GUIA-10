/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Mascota;

import java.util.Comparator;

/**
 *
 * @author Edgardo
 */
public class Comparadores {
    public static Comparator<Mascota> ordenarPorNombreDes= new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1) {
         //como vamos a ordenar de forma descendente 
         return t1.getNombre().compareTo(t.getNombre());
         //este seria nuestro primer comparador 
        }
    };
            //si hacemo crtl y comparator nos daremos cuenta que este es una interfaz
            //interfaz generica significa que recibe t se puede comparar con t1 
            //entre comparadores 
            
     //  public static Comparator<video3entidades> ordenarPorEdades= new Comparator<video3entidades> () {
      //  @Override
       // public int compare(video3entidades t, video3entidades t1) {
       //  //comparador de edades 
       //  return t1.getEdad().compareTo(t.getEdad());  
       // }
      // };
       //UTILIDADES
}
