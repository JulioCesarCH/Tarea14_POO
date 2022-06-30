
package Tarea14;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public abstract  class Persona {
    protected int dni;
    protected String nombres;
    protected String apellidos;
    protected String fechaNacimiento;

    public Persona(int dni, String nombres, String apellidos, String fechaNacimiento) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract int calcularEdadDoc();

    public abstract int calcularEdadAlu();

    protected int getDni() {
        return dni;
    }

    protected void setDni(int dni) {
        this.dni = dni;
    }

    protected String getNombres() {
        return nombres;
    }

    protected void setNombres(String nombres) {
        this.nombres = nombres;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    protected String getFechaNacimiento() {
        return fechaNacimiento;
    }

    protected void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
