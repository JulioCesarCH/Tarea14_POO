package Tarea14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Docente extends Persona{
    private String FechaNac;
    public Docente(int dni, String nombres, String apellidos, String fechaNacimiento) {

        super(dni,nombres,apellidos,fechaNacimiento);
        this.FechaNac = fechaNacimiento;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String fechaNac) {
        FechaNac = fechaNac;
    }
    @Override
    public int calcularEdadDoc(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(this.FechaNac, fmt);
        LocalDate fechaHoy  = LocalDate.now();

        int edad = fechaHoy.getYear() - fechaNac.getYear();
        return edad;
    }

}
