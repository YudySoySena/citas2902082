package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Cita {
    public Integer id;
    public LocalDateTime fecha;
    public Medico medico;
    public Paciente paciente;
    public Consultorio consultorio;

    
    public Cita(LocalDateTime fecha, Medico medico, Paciente paciente, Consultorio consultorio) {
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    

}
