/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.video4entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * COMO ACTUALIZA YCOMO ELIMINAR EN LOS ARRAYLIST
 *
 * @author Edgardo
 */
public class Video4servicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<video4entidades> mascotas = new ArrayList();
//se puede utilizar ArrayList para tener algunas funciones disponibles 
    //Pero así tambien podemos utilizar simplemente List que tiene más amplias sus funciones

    public video4entidades crearMascota() {
        System.out.println("introducir nombre");
        String nombre = leer.next();

        System.out.println("introducir apodo");
        String apodo = leer.next();

        System.out.println("introducir tipo");
        String tipo = leer.next();

        return new video4entidades(nombre, apodo, tipo);

    }

    public void agregarMascota(video4entidades m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de la lista mascotas son: ");
        for (video4entidades aux : mascotas) {
            //no es coherente que sea String 
            System.out.println(aux.toString());
        }
        System.out.println("cantidad= " + mascotas.size());
    }

    public void fabricaChiquitos(int cantidad) {
        //cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
        //va a acrear Mascotas, TODOS chiquitos
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new video4entidades("fer", "chiquito", "beagle"));
            //esta es una manera rapida de crear muchos objetos sin pedir tantos datos
            //por que hardcodeo las mascotas.
            //Esto seria una fabrica de chiquitos 
        }
    }

    public void fabricaMascotas(int cantidad) {
        //se va a encargar de pedir los datos por teclado
        for (int i = 0; i < cantidad; i++) {
            video4entidades mascotaCreada = crearMascota();

            agregarMascota(mascotaCreada);
            //llamo el metodo y le paso la mascota creada de esta manera seguira funcionando sin ningun problema
            //y se delego o se dividio las tareas
            System.out.println(mascotaCreada.toString());
        }
    }

    //COMO ACTUALIZAR MASCOTA??
    //TODO añadir try and catch
    /*public void actualizarMascota(int index){
       //Necesita recibir como parametro el INDICE(index), de que mascota quiero modificar de mi collection
       video4entidades m= mascotas.get(index);
       //llamamos la lista que contiene estas mascotas, buscamos por indice (get.index) 
       //agarra segun el indice la mascota correspondiente y la mete en m(extraer)
       m.setApodo("roberto");
       //simplemente cambiamos el apodo 
       //se vera impactado en la collections y no va a hacer falta volver a subirla 
     */
    //Otra forma de ACTUALIZA MASCOTA 
    public void actualizarMascota(int index) {
        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("---------ACTUALIZAR---------");
            video4entidades m = crearMascota();
            //llamamos  al afuncion crear mascota creas una nueva mascota en la variable m y 
            //usamos el metodo set de mascotas 
            mascotas.set(index, m);
            //crearemos una nueva mascota 
        } else {
            System.out.println("Fallo al actuaizar.El indice es erroneo");
        }
    }

    public void eliminarMascota(int index) {
        if (index <= (mascotas.size() - 1)) {
         
            
        mascotas.remove(index);
        
        }
        else{
            System.out.println("Fallo al eliminar.El indice es erroneo");
        }
        
    }
    //
}
