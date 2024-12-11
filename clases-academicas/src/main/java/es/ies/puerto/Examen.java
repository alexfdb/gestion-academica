package es.ies.puerto;
import java.util.Date;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Examen {
    private Date fecha;
    private String codigo;

    /**
     * Constructor por defecto.
     */
    public Examen() {
    }

    /**
     * Constructor solo con el codigo.
     * @param codigo
     */
    public Examen(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Constructor general.
     * @param fecha
     * @param codigo
     */
    public Examen(Date fecha, String codigo) {
        this.fecha = fecha;
        this.codigo = codigo;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Muestra los detalles del examen.
     * @return os detalles del examen.
     */
    public String detalles() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Examen)) {
            return false;
        }
        Examen examen = (Examen) o;
        return Objects.equals(this.codigo, examen.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, codigo);
    }

    @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            ", codigo='" + getCodigo() + "'" +
            "}";
    }
    
}
