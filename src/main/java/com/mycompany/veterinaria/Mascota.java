package com.mycompany.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private Cliente duenio;  // Relación con Cliente
    private ArrayList<Cita> historialCitas;

    // Constructor
    public Mascota(String nombre, String especie, String raza, int edad, Cliente duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.duenio = duenio;
        this.historialCitas = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public ArrayList<Cita> getHistorialCitas() {
        return historialCitas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
    }

    // Métodos
   private List<Mascota> mascotas = new ArrayList<>();

public void agregarMascota(Mascota mascota) {
    mascotas.add(mascota);
}



    public void agregarCita(Cita cita) {
        historialCitas.add(cita);
    }

    public void mostrarHistorial() {
        System.out.println("\n--- Historial de citas de " + nombre + " ---");
        for (Cita cita : historialCitas) {
            cita.mostrarResumen();
        }
    }

    public void mostrarDatos() {
        System.out.println("\n--- Datos de la Mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + duenio.getNombreCompleto());
    }
}
