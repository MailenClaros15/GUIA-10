/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import servicios.Video4servicio;

/**
 *
 * @author Edgardo
 */
public class Video_4 {
    public static void main(String[] args) {
        //FUNCIONALIDADES LOCAS DE LOS ARRAYS
        String[] nombres = {"pepe","pepa"};
        List<String> nombresList =new ArrayList(Arrays.asList(nombres));
        //nos posicionamos en el contructor (). crtl+espacio = para ver las dimenciones que podemos agregar
        //agregamos la clase Array que tiene metodos estaticos, que significa aslist??
        //en este caso tenemos nombre pepe y pepa los desacomodamos,saca los elementos y justamente lo convierte en un arraylist
        //o una lista
         List<String> nombresList2 =new ArrayList();
         nombresList2.addAll(nombresList);
         //exploremos los metodos que tiene 
         //en este caso podemos agregar de forma masiva y siqueremos agregarle un indice y aclarar en que posicion va 
         
         
        /* Video4servicio sv=new Video4servicio();
         sv.fabricaMascotas(2);
         sv.mostrarMascotas();
         sv.actualizarMascota(0);
         sv.mostrarMascotas();
         sv.eliminarMascota(0);
         sv.mostrarMascotas();*/
         
         
    }
    
}
