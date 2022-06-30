package Tarea14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumno extends Persona{
    private String idAlumno;
    private String FechaNac;
    public Alumno(String idAlumno,int dni, String nombres, String apellidos, String fechaNacimiento) {

        super(dni,nombres,apellidos,fechaNacimiento);
        this.idAlumno = idAlumno;
        this.FechaNac = fechaNacimiento;
    }
    @Override
    public int calcularEdadAlu(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(this.FechaNac, fmt);
        LocalDate fechaHoy  = LocalDate.now();

        int edad = fechaHoy.getYear() - fechaNac.getYear();
        return edad;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public String getFechaNac() {
        return FechaNac;
    }
}
