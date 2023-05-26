package semana5.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Estructura ");
        Curso curso2 = new Curso("POO ");
        Curso curso3 = new Curso("Base de Datos");
        Docente docente1 = new Docente("Jose");
        Docente docente2 = new Docente("Jhonatan");
        Docente docente3 = new Docente("Breiner");

        //Asignamos los docentes del curso1
        curso1.agregarDocente(docente1);
        curso1.agregarDocente(docente2);

        //Asignamos los docentes del curso2
        curso2.agregarDocente(docente1);
        curso2.agregarDocente(docente3);
        curso2.agregarDocente(docente2);

        //Asignamos los docentes del curso3
        curso3.agregarDocente(docente3);

        docente1.agregarCurso(curso1);

        curso1.mostrarDocentes();
        curso2.mostrarDocentes();
        curso3.mostrarDocentes();
        docente1.mostrarCursos();

    }
}
