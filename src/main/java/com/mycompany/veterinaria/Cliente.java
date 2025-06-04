package com.mycompany.veterinaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Persona {

    private final List<String> listaMascotas; 

    public Cliente(String nombreCompleto, String numeroIdentificacion, String telefono, String correoElectronico) {
        super(nombreCompleto, numeroIdentificacion, telefono, correoElectronico); 
        this.listaMascotas = new ArrayList<>(); 
    }

    public void agregarMascota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la mascota a agregar para " + this.getNombreCompleto() + ": ");
        String nombreMascota = scanner.nextLine();
        if (!nombreMascota.trim().isEmpty()) {
            this.listaMascotas.add(nombreMascota.trim());
            System.out.println(nombreMascota.trim() + " ha sido agregada a la lista de mascotas de " + this.getNombreCompleto() + ".");
        } else {
            System.out.println("El nombre de la mascota no puede estar vacío.");
        }
    }

    public void listarMascotas() {
        System.out.println("\n--- Mascotas de " + this.getNombreCompleto() + " ---");
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas para este cliente.");
        } else {
            for (int i = 0; i < listaMascotas.size(); i++) {
                System.out.println((i + 1) + ". " + listaMascotas.get(i));
            }
        }
    }
    @Override 
    public void mostrarDatos() {
        super.mostrarDatos(); 
        this.listarMascotas(); 
    }
}