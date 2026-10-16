/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package biblioteca.app;

import biblioteca.modelo.Socio;

import biblioteca.modelo.Libro;

/**
 *
 * @author Ana
 */
public class Biblioteca {

    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad", "Garcia Marquez");
        l1.mostrarInfo();
        
        Libro l2 = l1;
        Libro l3 = new Libro("Cien años de soledad", "Garcia Marquez");
        l2.prestar();
        
        System.out.println(l1.estaDisponible());
        System.out.println(l3.estaDisponible());
        System.out.println(l1 == l2);
        System.out.println(l1 == l3);
        
        Libro l4 = null;
        if(l4 == null){
            System.out.println("No hay libro");
        }
        else {
            l4.mostrarInfo();
        }
        
        l1.setTitulo("la amortajada");
        System.out.println(l1.getTitulo());
        
        Libro l5 = new Libro("", "Anonimo");
        System.out.println(l5.getTitulo());
        
        Socio camila = new Socio("Camila");
        camila.prestarLibro(l3);
        camila.prestarLibro(l1);
        camila.prestarLibro(null);
        
        System.out.println(camila.getlibrosPrestados());
        System.out.println(l3.estaDisponible());
        
        
    }
    
    
}
