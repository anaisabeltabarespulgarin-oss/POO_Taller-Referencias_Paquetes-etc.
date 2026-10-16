/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import biblioteca.modelo.Libro;
import biblioteca.modelo.Libro;

/**
 *
 * @author Ana
 */
public class Socio {
    private String nombre;
    private int librosPrestados;
    
    public Socio(String nombre){
        this.nombre = nombre;
        this.librosPrestados = 0;
    }
    
    public int getlibrosPrestados (){
        return librosPrestados;
    }
    
    public void prestarLibro(Libro libro){
        if (libro == null ){
            System.out.println("No hay libro para prestar");
        }
        else{
            libro.prestar();
            librosPrestados++;
            System.out.println(getNombre() + "recibio " + libro.getTitulo());
        }
    }
    
    public void devolverLibro(Libro libro) {
        if (libro != null && librosPrestados > 0) {
            libro.devolver();
            librosPrestados--;
            System.out.println("Has devuelto el libro.");
        }
        else {
            System.out.println("No has devuelto el libro.");
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param librosPrestados the librosPrestados to set
     */
    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}
