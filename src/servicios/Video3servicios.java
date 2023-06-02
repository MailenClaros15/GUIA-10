/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import entidades.video3entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class Video3servicios {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private  List<video3entidades> mascotas= new ArrayList();
//se puede utilizar ArrayList para tener algunas funciones disponibles 
    //Pero así tambien podemos utilizar simplemente List que tiene más amplias sus funciones
    
     
       
    
    
    public video3entidades crearMascota(){
        System.out.println("introducir nombre");
        String nombre=leer.next();
        
        System.out.println("introducir apodo");
        String apodo=leer.next();
        
        System.out.println("introducir tipo");
        String tipo=leer.next();
        
       video3entidades m= new video3entidades(nombre,apodo,tipo);
       mascotas.add(m);
       //De esta manera cada vez que llamemos a crear mascota, llamaremos a mascota
       
       return m;
        
        
        
    }
    
    
    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la lista mascotas son: ");
        for (video3entidades aux:mascotas) {
            //no es coherente que sea String 
            System.out.println(aux.toString());
        }
        System.out.println("cantidad= "+mascotas.size());
    }
    
    public void fabricaChiquitos(int cantidad){
        //cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
        //va a acrear Mascotas, TODOS chiquitos
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new video3entidades("fer","chiquito","beagle"));
            //esta es una manera rapida de crear muchos objetos sin pedir tantos datos
            //por que hardcodeo las mascotas.
            //Esto seria una fabrica de chiquitos 
        }
    }
    
   public void fabricaMascotas(int cantidad){
       //se va a encargar de pedir los datos por teclado
       for (int i = 0; i < cantidad; i++) {
          video3entidades mascotaCreada= crearMascota();
           System.out.println(mascotaCreada.toString());
       }
   } 
}


