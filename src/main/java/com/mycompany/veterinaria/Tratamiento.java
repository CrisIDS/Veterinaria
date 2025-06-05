package com.mycompany.veterinaria;

public class Tratamiento {
    private String nombre;
    private String instrucciones;

    // Constructor
    public Tratamiento(String nombre, String instrucciones) {
        this.nombre = nombre;
        this.instrucciones = instrucciones;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    // Método para mostrar tratamiento
    public void mostrarTratamiento() {
        System.out.println("Tratamiento: " + nombre);
        System.out.println("Instrucciones: " + instrucciones);
    }
}
