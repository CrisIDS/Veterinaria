package com.mycompany.veterinaria;

import java.util.Date;

public class Cita {

    private Date fecha;
    private Mascota mascota;
    private Veterinario veterinario;

    // Constructor
    public Cita(Date fecha, Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public void mostrarResumen() {
        System.out.println("Cita para revisión general (simulada)");
        System.out.println("Fecha: " + fecha);
        System.out.println("Mascota: " + mascota.getNombre());
        System.out.println("Veterinario: " + veterinario.getNombreCompleto());
    }

    public void registrarDiagnostico(String diagnostico) {
        System.out.println("Diagnóstico registrado: " + diagnostico);
    }

    // Puedes agregar getters si los necesitas
    public Date getFecha() {
        return fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
}
