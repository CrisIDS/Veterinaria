package com.mycompany.veterinaria;

import java.util.Scanner;

public class Persona {
    // Atributos
    private String nombreCompleto;
    private String numeroIdentificacion;
    private String telefono;
    private String correoElectronico;

    // Constructor
    public Persona() {
    this.nombreCompleto = "";
    this.numeroIdentificacion = "";
    this.telefono = "";
    this.correoElectronico = "";
}
    public Persona(String nombreCompleto, String numeroIdentificacion, String telefono, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    //  mostrarDatos
    public void mostrarDatos() {
        System.out.println("\n--- Datos Personales ---");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Identificación: " + numeroIdentificacion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo Electrónico: " + correoElectronico);
    }

    // actualizarDatos
    public void actualizarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Actualizar Datos Personales ---");

        System.out.print("Nuevo Nombre Completo (dejar en blanco para no cambiar): ");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.trim().isEmpty()) {
            this.setNombreCompleto(nuevoNombre.trim());
        }

        System.out.print("Nuevo Teléfono (dejar en blanco para no cambiar): ");
        String nuevoTelefono = scanner.nextLine();
        if (!nuevoTelefono.trim().isEmpty()) {
            this.setTelefono(nuevoTelefono.trim());
        }

        System.out.print("Nuevo Correo Electrónico (dejar en blanco para no cambiar): ");
        String nuevoCorreo = scanner.nextLine();
        if (!nuevoCorreo.trim().isEmpty()) {
            this.setCorreoElectronico(nuevoCorreo.trim());
        }

        System.out.println("Datos actualizados correctamente.");
    }
}
