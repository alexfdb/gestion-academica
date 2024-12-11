package es.ies.puerto;
import java.util.Date;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Profesor extends Persona{
    private String especialidad;

    /**
     * Constructor por defecto.
     */
    public Profesor() {
    }

    /**
     * Constructor general.
     * @param especialidad
     */
    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Constructor general con los atributos heredados de la clase Persona.
     * @param especialidad
     * @param nombre
     * @param fechaNacimiento
     */
    public Profesor(String especialidad, String nombre, Date fechaNacimiento) {
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Confirma que el profesor progresa en su enseñanza.
     * @return true si el profesor enseña.
     */
    public boolean enseniar() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return Objects.equals(this.especialidad, profesor.especialidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especialidad);
    }

    @Override
    public String toString() {
        return "{" +
            " especialidad='" + getEspecialidad() + "'" +
            "}";
    }
    
}
