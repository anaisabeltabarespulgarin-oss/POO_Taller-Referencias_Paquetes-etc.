/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.modelo;

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
            librosprestados++;
            System.out.println(getNombre() + "recibio " + libro.getTitulo());
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
