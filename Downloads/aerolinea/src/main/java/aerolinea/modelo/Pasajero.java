/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

/**
 *
 * @author Ana
 */

public class Pasajero {
    private String nombre;
    private Vuelo vuelo;
    
    public Pasajero(String nombre){
        this.nombre = nombre;
        this.vuelo = null;
    }
    
    public void reservar(Vuelo vueloAReservar) {
        if (vueloAReservar == null) {
            System.out.println(nombre + ": sin reserva");
            return;
        }
        if (vueloAReservar.resaervarSilla()) {
            System.out.println(nombre + "reservo en: " + vueloAReservar.getCodigo());  
        }
        else {
            System.out.println(nombre + "vuelo: " + vueloAReservar.getCodigo() + "lleno");
            System.out.println(vueloAReservar.getSillasDisponibles());
        }
    }
    
    public void mostrarReserva() {
        if (vuelo != null){
            System.out.println(nombre + "viaja a: " + vuelo.getDestino());
        }
        else {
            System.out.println(nombre + ": sin reserva.");
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
     * @return the vuelo
     */
    public Vuelo getVuelo() {
        return vuelo;
    }

    /**
     * @param vuelo the vuelo to set
     */
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
}
