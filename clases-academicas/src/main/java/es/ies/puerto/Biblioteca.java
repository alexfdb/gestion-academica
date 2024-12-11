package es.ies.puerto;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Registra un libro en la biblioteca.
     * @return true si el libro fue registrado.
     */
    public boolean registrarLibro() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Biblioteca)) {
            return false;
        }
        Biblioteca biblioteca = (Biblioteca) o;
        return Objects.equals(this.nombre, biblioteca.nombre) && Objects.equals(this.libros, biblioteca.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, libros);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", libros='" + getLibros() + "'" +
            "}";
    }
    
}
