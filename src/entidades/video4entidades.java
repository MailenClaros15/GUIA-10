/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Edgardo
 */
public class video4entidades {
    private String tipo;
    private String nombre;
    private String apodo;

    public video4entidades() {
    }

    public video4entidades(String tipo, String nombre, String apodo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "video3entidades{" + "tipo=" + tipo + ", nombre=" + nombre + ", apodo=" + apodo + '}';
    }
    
    
}
