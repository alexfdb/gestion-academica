package es.ies.puerto;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Materia {
    private String nombre;
    private String codigo;

    /**
     * Constructor por defecto.
     */
    public Materia() {
    }

    /**
     * Constructor solo con el codigo.
     * @param codigo
     */
    public Materia(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Constructor general.
     * @param nombre
     * @param codigo
     */
    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Muestra los detalles de la materia.
     * @return
     */
    public String detalles() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Materia)) {
            return false;
        }
        Materia materia = (Materia) o;
        return Objects.equals(this.codigo, materia.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            "}";
    }
    
}
