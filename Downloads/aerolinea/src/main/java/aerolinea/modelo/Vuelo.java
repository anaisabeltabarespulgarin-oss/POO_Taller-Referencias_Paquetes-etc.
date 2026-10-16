/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

/**
 *
 * @author Ana
 */



public class Vuelo {
    private String codigo;
    private String destino;
    private int sillasDisponibles;
    
    public Vuelo(String codigo, String destino, int sillasDisponibles) {
        this.codigo = codigo;
        this.destino = destino;
        if(sillasDisponibles >= 0) {
            this.sillasDisponibles = sillasDisponibles;
        }
        else {
            this.sillasDisponibles = 0;
        }
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setDestino(String destino){
        if (destino != null && !destino.trim().isEmpty()){
            this.destino = destino;
        }
    }
    
    public boolean resaervarSilla() {
        if (sillasDisponibles > 0) {
            sillasDisponibles--;
            return true;
        }
        return false;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @return the sillasDisponibles
     */
    public int getSillasDisponibles() {
        return sillasDisponibles;
    }


    /**
     * @param sillasDisponibles the sillasDisponibles to set
     */
    public void setSillasDisponibles(int sillasDisponibles) {
        this.sillasDisponibles = sillasDisponibles;
    }
    
    
    
}


