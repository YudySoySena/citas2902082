package org.citas2902082.java.entities;


import org.citas2902082.java.entities.enums.Speciality;
import org.citas2902082.java.entities.enums.TipoIdent;

public class Medico {
    public Integer id;
    public String nombre;
    public String apellidos;
    public TipoIdent tipoIdentificacion;
    public Integer numeroIdentificacion;
    public Integer registroMedico;
    public Speciality especialidad;
 
    public Medico(String nombre, String apellidos, TipoIdent tipoIdentificacion,
            Integer numeroIdentificacion, Integer registroMedico, Speciality especialidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    

}
