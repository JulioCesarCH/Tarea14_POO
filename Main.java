package Tarea14;

public class Main {
    public static void main(String arg[]) {
        // registrar cursos
        Curso POO = new Curso("POO", "Programacion Orientada a Objetos");
        Curso PGII = new Curso("PGII", "lenguaje de programacion II");
        Curso ISW = new Curso("ISW", "Ingenieria de Software");
        // registrar alumnos
        Alumno julio = new Alumno("1",12345678 ,"Julio", "Cueva","15/08/1993");
        Alumno beker = new  Alumno("2", 87654321,"Beker", "Hilario","10/07/1992");

        // registrar docentes
        Docente edgardo = new Docente(12345678, "Edgardo", "Ramirez","01/05/1983");
        Docente alberto = new Docente(87654321, "Alberto", "Salvador","09/06/1980");

         //registrar matricula
         // alumno julio
         Matricula Ma12022I01 = new Matricula("1.2022I.01");
         Ma12022I01.setAlumno(julio);

        // alumno beker
         Matricula Ma22022I01 = new Matricula("2.2022I.01");
         Ma22022I01.setAlumno(beker);
        
         System.out.println("Codigo de Matricula: "+Ma12022I01.getidMatricula());

         for(Alumno a: Ma12022I01.getAlumno())
         {  
            System.out.println("Alumno: "+a.getNombres() + " " + a.getApellidos());
            System.out.println("Edad: "+a.calcularEdadAlu());
                    for(Curso c: Ma12022I01.getCurso())
                    {
                        System.out.println("Curso: "+c.getnCurso());
                    }
                    for(Docente d: Ma12022I01.getDocente())
                    {
                        System.out.println("Docente: "+d.getNombres()+" "+d.getApellidos());
                        System.out.println("Edad: "+d.calcularEdadDoc());
                    }
        }


        System.out.println("Codigo de Matricula: "+Ma22022I01.getidMatricula());
         
        for(Alumno a: Ma22022I01.getAlumno())
        {  
           System.out.println("Alumno: "+a.getNombres() + " " + a.getApellidos());
            System.out.println("Edad: "+a.calcularEdadAlu());
                    for(Curso c: Ma22022I01.getCurso())
                    {
                        System.out.println("Curso: "+c.getnCurso());
                    }
                    for(Docente d: Ma22022I01.getDocente())
                    {
                        System.out.println("Docente: "+d.getNombres()+" "+d.getApellidos());
                        System.out.println("Edad: "+d.calcularEdadDoc());
                    }
        }
}
}
