package es.ies.puerto;
import java.util.Date;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Estudiante extends Persona{
    private String matricula;

    /**
     * Constructor por defecto.
     */
    public Estudiante() {
    }

    /**
     * Constructor solo con la matricula.
     * @param matricula
     */
    public Estudiante(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Constructor general con los atributos heredados de la clase Persona.
     * @param matricula
     * @param nombre
     * @param fechaNacimiento
     */
    public Estudiante(String matricula, String nombre, Date fechaNacimiento) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Confirma que el estudiante progresa en sus estudios.
     * @return true si el estudiante estudia.
     */
    public boolean estudiar() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estudiante)) {
            return false;
        }
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(this.matricula, estudiante.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            "}";
    }
    
}
