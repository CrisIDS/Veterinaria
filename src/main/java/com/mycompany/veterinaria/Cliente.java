package com.mycompany.veterinaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Persona {

    private List<Mascota> mascotas;

    public Cliente(String nombreCompleto, String numeroIdentificacion, String telefono, String correoElectronico) {
        super(nombreCompleto, numeroIdentificacion, telefono, correoElectronico);
        this.mascotas = new ArrayList<>();
    }

    // Método para agregar mascota desde código
    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    // Método opcional si quieres ingresar por consola
    public void agregarMascotaPorConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la mascota a agregar para " + this.getNombreCompleto() + ": ");
        String nombreMascota = scanner.nextLine();
        if (!nombreMascota.trim().isEmpty()) {
            this.mascotas.add(new Mascota(nombreMascota, "Desconocido", "Desconocido", 0, this));
            System.out.println(nombreMascota.trim() + " ha sido agregada.");
        } else {
            System.out.println("El nombre de la mascota no puede estar vacío.");
        }
    }

    public void listarMascotas() {
        System.out.println("\n--- Mascotas de " + this.getNombreCompleto() + " ---");
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            for (int i = 0; i < mascotas.size(); i++) {
                System.out.println((i + 1) + ". " + mascotas.get(i).getNombre());
            }
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        listarMascotas();
    }
}
