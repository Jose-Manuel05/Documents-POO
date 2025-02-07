package org.example.pruebasLombok;

import lombok.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representa un instituto educativo con un nombre, una población de estudiantes y listas de cursos y estudiantes.
 * Se utiliza Lombok para generar automáticamente los métodos {getter}, {setter}, {toString} y constructores.
 *
 * @author [Jose Manuel]
 * @version 1.0
 * @since 2024
 */

@Getter @Setter // Genera los métodos getter y setter
@ToString // Genera el método toString
@AllArgsConstructor // Genera un constructor con todos los argumentos

public class Instituto {

    private String nombre;
    private int poblacion;
    private ArrayList<Curso> listaCursos = new ArrayList<>(); // Inicializa la lista de cursos
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(); // Inicializa la lista de estudiantes

    // Constructor que asigna un nombre por defecto si el nombre es nulo
    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }
    /**
     * Agrega un estudiante a la lista de estudiantes del instituto.
     *
     * @param estudiante El estudiante a agregar.
     * @throws IllegalArgumentException Si el estudiante es {null}.
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            listaEstudiantes.add(estudiante);
        } else {
            System.out.println("No se puede añadir un estudiante nulo.");
        }
    }

    /**
     * Agrega un curso a la lista de cursos del instituto, evitando duplicados.
     *
     * @param curso El curso a agregar.
     * @throws IllegalArgumentException Si el curso es {null} o ya existe en la lista.
     */
    public void agregarCurso(Curso curso) {
        if (curso != null && !listaCursos.contains(curso)) {
            listaCursos.add(curso);
        } else {
            System.out.println("No se puede añadir un curso nulo o duplicado.");
        }
    }

    /**
     * Obtiene una copia de la lista de estudiantes del instituto.
     *
     * @return Una nueva lista con los estudiantes registrados.
     */
    public List<Estudiante> getListaEstudiantes() {
        return new ArrayList<>(listaEstudiantes);
    }

    /**
     * Obtiene una copia de la lista de cursos del instituto.
     *
     * @return Una nueva lista con los cursos registrados.
     */
    public List<Curso> getListaCursos() {
        return new ArrayList<>(listaCursos);
    }


}
