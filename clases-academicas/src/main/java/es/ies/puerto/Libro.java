package es.ies.puerto;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Libro {
    private String tirulo;
    private String autor;

    /**
     * Constructor por defecto.
     */
    public Libro() {
    }

    /**
     * Constructor general.
     * @param tirulo
     * @param autor
     */
    public Libro(String tirulo, String autor) {
        this.tirulo = tirulo;
        this.autor = autor;
    }

    public String getTirulo() {
        return this.tirulo;
    }

    public void setTirulo(String tirulo) {
        this.tirulo = tirulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Muestra los detalles del libro.
     * @return los detalles del libro.
     */
    public String detalle() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(this.tirulo, libro.tirulo) && Objects.equals(this.autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tirulo, autor);
    }

    @Override
    public String toString() {
        return "{" +
            " tirulo='" + getTirulo() + "'" +
            ", autor='" + getAutor() + "'" +
            "}";
    }
    
}
