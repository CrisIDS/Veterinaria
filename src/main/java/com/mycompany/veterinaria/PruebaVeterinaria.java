package com.mycompany.veterinaria;

import java.util.Date;

public class PruebaVeterinaria {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Cristian Mirón", "001", "7777-7777", "cristian@mail.com");

        // Crear mascota
        Mascota mascota = new Mascota("Rocky", "Perro", "Labrador", 4, cliente);
        cliente.agregarMascota(mascota);

        // Crear veterinario
        Veterinario veterinario = new Veterinario("Dra. Ana López", "VET123", "2222-2222", "ana@vet.com", "Cirugía");

        // Crear cita
        Cita cita = new Cita(new Date(), mascota, veterinario);
        mascota.agregarCita(cita);
        veterinario.asignarCita(cita);

        // Crear tratamiento
        Tratamiento tratamiento = new Tratamiento("Antibiótico", "Tomar cada 12 horas por 5 días");

        // Registrar tratamiento
        veterinario.registrarTratamiento(cita, tratamiento);

        // Mostrar información
        System.out.println("=== Cliente ===");
        cliente.mostrarDatos();

        System.out.println("\n=== Mascota ===");
        mascota.mostrarDatos();
        mascota.mostrarHistorial();

        System.out.println("\n=== Veterinario ===");
        System.out.println("Nombre: " + veterinario.getNombreCompleto());
        System.out.println("Especialidad: " + veterinario.getEspecialidad());
        veterinario.verAgenda();
    }
}

