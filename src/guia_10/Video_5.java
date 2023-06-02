/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Edgardo
 */
public class Video_5 {
    public static void main(String[] args) {
        List<String> nombres=new ArrayList();
        nombres.add("lola");
        nombres.add("roman");
        nombres.add("chiquito");
        //manera de recorrerlo
        for (String aux:nombres) {
            System.out.println(aux);
        }
        
        //segunda manera
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
      // nombres.forEach{(e)->System.out.println(e)};
      nombres.stream().count();
      //llamado consecutivo de funcionalidades
      //Como recorrer o eliminar??
      //opcion 1 (erronea)
      for(String aux:nombres){
          if(aux.equals("lola")){
              nombres.remove(aux);
              //sdabe desde q nacio tiene q recorrer todos los nombres
              // entonces al eliminar algo entremedio no sabe si segguir o no 
          }
      }
      //opcion 2
        for (int i = 0; i < nombres.size(); i++) {
            String m=nombres.get(i);
            if(m.equals("lola")){
                nombres.remove(m);
                //tomamos en la variable m los objetos 
                //si m igual a lola se remueve 
                // No rompe el bucle a no ser de que cambiemos el size por la cantdad 
                //o el tipo de posicion q capaz es correcta pero aun asi se rompe 
            }
        }
        //ITERATOR
        
        //esto se usa mas cuando se habla de lsita enlazadas 
        Iterator<String> it= nombres.iterator();
        while(it.hasNext()){
            String aux =it.next();
        
                //iterator toma lista y desarma los objetos
                //me los da en una fila para recorrerlos
                //lo recorremos y creamos otro iterator
                // cuando tenemos it.next()= toma un objeta y cuando yo digo it.hasnext evalua y salta al siguiente 
                //hasnext conrrobora q existe 
                // hasta que se encuentra en el ultimo 
               if(aux.equals("lola")){
                   it.remove();
               }
               //esto tambien lo podemos hacer en el servicio
               
               //public void eliminarMascotaPorNombre(String nombre){
               //for(int i=0;i< mascotas.size();i++){
               // Mascota m= mascotas.get(i);
               //if(m.getNombre().equals(nombre)){
               //mascotas.remove(i);
               //}
               //} }
               
               //Para actualizar seria casi igual
               
               //public void ActualizarMascotaPorNombre (String nombre viejo,String nombreNuevo) ´{
               // for(int i=0;i<mascotas.size();i++){
               // Mascota m=mascotas.get(i);
               //if(m.getNombre().equals(nombreViejo){
               //m.setNombre(nombreNuevo);
               //}
              //}
              //}
        }
        
        
        
        
    }
}
