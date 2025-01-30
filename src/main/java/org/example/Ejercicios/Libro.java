package org.example.Ejercicios;

public class Libro {

    private static int TOTAL_LIBROS = 0;
    private static int LIBROS_DISPONIBLES = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estuduantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        TOTAL_LIBROS++;
        LIBROS_DISPONIBLES++;
        this.id = calcularId();
        this.disponible = true;
        this.estuduantePrestado = null;
        this.editorial = editorial;
        this.editorial.anyadirLibro(this);
    }

    //region Geters y Seters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public Estudiante getEstuduantePrestado() {
        return estuduantePrestado;
    }

    public void setEstuduantePrestado(Estudiante estuduantePrestado) {
        this.estuduantePrestado = estuduantePrestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    //endregion

    private String calcularId() {
        return String.format("LIB%03d", TOTAL_LIBROS + 1);
    }

    public void prestar(Estudiante estudiante) {
        if (disponible && !estudiante.getLibrosPrestados().contains(this)) {
            disponible = false;
            System.out.println("El libro '" + getTitulo() + "' ha sido prestado con éxito a " + estudiante.getNombre());
            LIBROS_DISPONIBLES--;
            estuduantePrestado = estudiante;
            estudiante.anyadirLibro(this);
            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Se ha generado el prestamo: " + prestamo);
        } else if (estudiante.getLibrosPrestados().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene prestado el libro '" + getTitulo() + "'");
        } else {
            System.out.println("El libro '" + getTitulo() + "' no está disponible");
        }
    }

    public void devolver(Estudiante estudiante) {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + getTitulo() + "' ha sido devuelto con éxito por " + estuduantePrestado.getNombre());
            LIBROS_DISPONIBLES++;
            estuduantePrestado = null;
            estudiante.borrarLibro(this);
        } else {
            System.out.println("El libro '" + getTitulo() + "' ya está disponible");
        }
    }

    public boolean estaDisponible() {
        return this.disponible;
    }

    public static int getTotales() {
        return TOTAL_LIBROS;
    }

    public static int getDisponibles() {
        return LIBROS_DISPONIBLES;
    }

    @Override
    public String toString() {
        if (estuduantePrestado != null) {
            return "Libro: titulo = " + titulo + ", autor = " + autor + ", id = " + id + ", disponible = " + disponible + ", estudiantePrestado = " + estuduantePrestado.getNombre() + ", editorial = " + editorial.getNombre();
        } else {
            return "Libro: titulo = " + titulo + ", autor = " + autor + ", id = " + id + ", disponible = " + disponible + ", editorial = " + editorial.getNombre();
        }
    }
}