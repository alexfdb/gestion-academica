package es.ies.puerto;
import java.util.Date;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Persona {
    protected String nombre;
    protected Date fechaNacimiento;

    /**
     * Constructor por defecto.
     */
    public Persona() {
    }

    /**
     * Constructor general.
     * @param nombre
     * @param fechaNacimiento
     */
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Función que muestra el nombre y la edad de la persona.
     * @return el nombre y la edad de la persona.
     */
    public String saludar() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(this.nombre, persona.nombre) && Objects.equals(this.fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            "}";
    }
    
}
