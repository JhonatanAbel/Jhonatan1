package semana5.ejercicio02;

public class Curso {
    private String nombre;
    private Docente[] docentes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.docentes = new Docente[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarDocente(Docente docente) {
        // Verificar si el docente ya está asignado al curso
        for (Docente d : docentes) {
            if (d == docente) {
                return; // El docente ya está asignado, no se agrega nuevamente
            }
        }

        // Agregar el docente al arreglo
        Docente[] nuevosDocentes = new Docente[docentes.length + 1];
        for (int i = 0; i < docentes.length; i++) {
            nuevosDocentes[i] = docentes[i];
        }
        nuevosDocentes[docentes.length] = docente;
        docentes = nuevosDocentes;
    }

    public void mostrarDocentes() {
        System.out.println("Docentes asignados al curso " + nombre + ":");
        for (Docente docente : docentes) {
            System.out.println(docente.getNombre());
        }
    }
}




