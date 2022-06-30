package Tarea14;

public class Matricula {
    private String idMatricula;
    private int contA;
    private int contC;
    private int contD;
    private Alumno[] alumno;
    private Curso[] curso;
    private Docente[] docente;
    public Matricula(String idMatricula) {
        this.idMatricula = idMatricula;
        this.alumno = new Alumno[2];
        this.contA = 0;
        this.contC = 0;
        this.contD = 0;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno[this.contA] = alumno;
        this.contA++;
    }

    public Alumno[] getAlumno() {
        return this.alumno;
    }

    public void setCurso(Curso curso) {
        this.curso[this.contC] = curso;
        this.contC++;
    }

    public Curso[] getCurso() {
        return this.curso;
    }

    public void setDocente(Docente docente) {
        this.docente[this.contD] = docente;
        this.contD++;
    }

    public Docente[] getDocente() {
        return this.docente;
    }

    public String getidMatricula() {
        return idMatricula;
    }

    public void setidMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getcontA() {
        return contA;
    }

    public void setcontA(int contA) {
        this.contA= contA;
    }

    public int getcontC() {
        return contC;
    }

    public void setcontC(int contC) {
        this.contC = contC;
    }

    public int getcontD() {
        return contD;
    }

    public void setcontD(int contD) {
        this.contD= contD;
    }
}
