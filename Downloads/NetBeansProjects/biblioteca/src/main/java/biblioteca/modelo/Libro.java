/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.modelo;

/**
 *
 * @author Ana
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;
    
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    
    public boolean estaDisponible(){
    return isDisponible();
    }
    
    public void prestar(){
        setDisponible(false);
    }
    
    public void devolver() {
        setDisponible(true);
    }
    
    public void mostrarInfo() {
    System.out.println(getTitulo() + "de" + getAutor() + " | disponible: " + isDisponible());
    }
    
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty())  {
            System.out.println("Titulo invalido");
        }
        else {
            this.titulo = titulo;
        }
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
