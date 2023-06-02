/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import java.util.ArrayList;

/**
 *
 * @author Edgardo
 */
public class Video_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //normal array 
  String [] nombreArray=new String[5];
   for (int i = 0; i < nombreArray.length; i++) {
    nombreArray[i]="chiquito "+(i+1);
}
        for (String var:nombreArray) {
            System.out.println(var);
        }
  //collections
  ArrayList<String> nombresArrayList=new ArrayList ();
  nombresArrayList.add("chiquito");
  nombresArrayList.add("chiquito");
  nombresArrayList.add("chiquito");
  //para añadir elemntos a nuestra ArrayList usamos el add
        System.out.println(nombresArrayList.size());
        //para saber la dimension,usamos size
        
  nombresArrayList.remove("chiquito");
  //para eliminar un elemento usamos remove 
        System.out.println(nombresArrayList.size());
 //sout(integer.MAX_VALUE);
//PARA SABER CUANTOS TERMINOS PUEDE ABARCAR UN INTEGER,LOS DIJITOS QUE SOPORTA,MAXIMA DIMENSION,ETC 
    } 
    
}
