package com.mycompany.veterinaria;

import java.util.ArrayList;

public class Veterinario extends Persona {
    private String especialidad;
    private ArrayList<Cita> agendaCitas;

    public Veterinario() {
        this.agendaCitas = new ArrayList<>();
    }

    public Veterinario(String nombreCompleto, String identificacion, String telefono, String correo, String especialidad) {
        super(nombreCompleto, identificacion, telefono, correo);
        this.especialidad = especialidad;
        this.agendaCitas = new ArrayList<>();
    }

    public void asignarCita(Cita cita) {
        agendaCitas.add(cita);
    }

    public void verAgenda() {
        System.out.println("Agenda del veterinario " + getNombreCompleto() + ":");
        for (Cita cita : agendaCitas) {
            cita.mostrarResumen();
        }
    }

    public void registrarTratamiento(Cita cita, Tratamiento tratamiento) {
        String resumen = "Tratamiento aplicado: " + tratamiento.getNombre()
                   + " - Instrucciones: " + tratamiento.getInstrucciones();
        cita.registrarDiagnostico(resumen);
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
