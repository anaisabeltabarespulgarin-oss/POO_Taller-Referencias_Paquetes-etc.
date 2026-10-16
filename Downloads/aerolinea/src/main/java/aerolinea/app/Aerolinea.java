/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aerolinea.app;


import aerolinea.modelo.Pasajero;

import aerolinea.modelo.Vuelo;

/**
 *
 * @author Ana
 */
public class Aerolinea {

    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("AV-204", "Cartagena", 2);
        
        Pasajero sara = new Pasajero ("Sara");
        Pasajero tomas = new Pasajero ("Tomas");
        Pasajero lina = new Pasajero ("Lina");
        
        lina.mostrarReserva();
        sara.reservar(vuelo1);
        tomas.reservar(vuelo1);
        lina.reservar(vuelo1);
        System.out.println(vuelo1.getSillasDisponibles());
        
        vuelo1.setDestino("Santa marta");
        
        sara.mostrarReserva();
        tomas.mostrarReserva();
        lina.mostrarReserva();
        
        boolean mismaReserva = (sara.getVuelo() == tomas.getVuelo());
        System.out.println(mismaReserva);

        
    }
}
