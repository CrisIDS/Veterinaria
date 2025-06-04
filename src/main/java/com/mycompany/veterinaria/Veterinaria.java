package com.mycompany.veterinaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veterinaria {

    private final List<Cliente> listaClientes; // Lista para almacenar los clientes registrados
    private final Scanner scanner; // Para la entrada de datos

    public Veterinaria() {
        this.listaClientes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

  
    public void registrarCliente() {
        System.out.println("\n--- Registrar Nuevo Cliente ---");

        System.out.print("Nombre Completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Numero de Identificación: ");
        String numeroIdentificacion = scanner.nextLine();

        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();

        System.out.print("Correo Electronico: ");
        String correoElectronico = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombreCompleto, numeroIdentificacion, telefono, correoElectronico);
        this.listaClientes.add(nuevoCliente); // Agregar el cliente a la lista
        System.out.println("Cliente " + nombreCompleto + " registrado exitosamente.");
    }

    public void registrarMascota() {
        System.out.println("\n--- Registrar Mascota para Cliente Existente ---");
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados. Por favor, registre un cliente primero.");
            return;
        }

        System.out.print("Ingrese el numero de identificación del cliente al que desea agregar una mascota: ");
        String idCliente = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getNumeroIdentificacion().equals(idCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            clienteEncontrado.agregarMascota(); // Llama al método agregarMascota del objeto Cliente
        } else {
            System.out.println("Cliente con identificacion " + idCliente + " no encontrado.");
        }
    }

    // esqueletos
    public void programarCita() {
        System.out.println("Funcionalidad para programar una cita...");
    }

    public void registrarTratamiento() {
        System.out.println("Funcionalidad para registrar un tratamiento...");
    }

    public void registrarPago() {
        System.out.println("Funcionalidad para registrar un pago...");
    }

    public void generarReporteCitas() {
        System.out.println("Funcionalidad para generar reporte de citas...");
    }

    public void generarReportePagos() {
        System.out.println("Funcionalidad para generar reporte de pagos...");
    }

    // Método: mostrar_menu()
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENU PRINCIPAL VETERINARIA ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Mascota ");
            System.out.println("3. Programar Cita ");
            System.out.println("4. Registrar Tratamiento ");
            System.out.println("5. Registrar Pago ");
            System.out.println("6. Generar Reporte de Citas ");
            System.out.println("7. Generar Reporte de Pagos ");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> registrarCliente();
                case 2 -> registrarMascota();
                case 3 -> programarCita();
                case 4 -> registrarTratamiento();
                case 5 -> registrarPago();
                case 6 -> generarReporteCitas();
                case 7 -> generarReportePagos();
                case 0 -> System.out.println("Saliendo del programa. ¡Hasta pronto!");
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        Veterinaria miVeterinaria = new Veterinaria();
        miVeterinaria.mostrarMenu();
    }
}