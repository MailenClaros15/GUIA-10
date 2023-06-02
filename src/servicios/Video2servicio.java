/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class Video2servicio {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private  List<String> mascotas= new ArrayList();
//se puede utilizar ArrayList para tener algunas funciones disponibles 
    //Pero así tambien podemos utilizar simplemente List que tiene más amplias sus funciones
    
     
       
    
    
    public void crearMascota(){
        System.out.println("introducir nombre");
        String nombre=leer.next();
        
        System.out.println("introducir apodo");
        String apodo=leer.next();
        
        System.out.println("introducir tipo");
        String tipo=leer.next();
        
       String mascota=nombre+" "+apodo+" "+tipo;
       //De esta manera cada vez que llamemos a crear mascota, llamaremos a mascota
        mascotas.add(mascota);
        
        
        
    }
    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la lista mascotas son: ");
        for (String aux:mascotas) {
            System.out.println(aux);
        }
        System.out.println("cantidad= "+mascotas.size());
    }
}
