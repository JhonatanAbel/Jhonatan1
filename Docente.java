package semana5.ejercicio02;

public class Docente {
    private String nombre;
    private Curso[] cursos;

    public Docente(String nombre) {
        this.nombre = nombre;
        this.cursos = new Curso[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso curso) {
        // Verificar si el curso ya está asignado al docente
        for (Curso c : cursos) {
            if (c == curso) {
                return; // El curso ya está asignado, no se agrega nuevamente
            }
        }

        // Agregar el curso al arreglo
        Curso[] nuevosCursos = new Curso[cursos.length + 1];
        for (int i = 0; i < cursos.length; i++) {
            nuevosCursos[i] = cursos[i];
        }
        nuevosCursos[cursos.length] = curso;
        cursos = nuevosCursos;

        // Agregar el docente al curso
        curso.agregarDocente(this);
    }

    public void mostrarCursos() {
        System.out.println("Cursos asignados al docente " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println(curso.getNombre());
        }
    }
}
