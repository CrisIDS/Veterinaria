package com.mycompany.veterinaria;

import java.time.LocalDate;

public class Pago {
    private double monto;
    private String metodo; // Efectivo, Tarjeta, Transferencia, etc.
    private LocalDate fecha;
    private String descripcion; // Por qué se hizo el pago

    public Pago(double monto, String metodo, LocalDate fecha, String descripcion) {
        this.monto = monto;
        this.metodo = metodo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    // Getters
    public double getMonto() {
        return monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters
    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Mostrar detalles del pago
    public void mostrarPago() {
        System.out.println("\n--- Detalles del Pago ---");
        System.out.println("Fecha: " + fecha);
        System.out.println("Monto: $" + monto);
        System.out.println("Método: " + metodo);
        System.out.println("Descripción: " + descripcion);
    }
}
