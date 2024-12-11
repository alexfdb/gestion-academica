package es.ies.puerto;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Curso {
    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes;

    /**
     * Constructor por dfecto.
     */
    public Curso() {
    }

    /**
     * Constructor solo con el codigo.
     * @param codigo
     */
    public Curso(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Constructor general.
     * @param nombre
     * @param codigo
     * @param estudiantes
     */
    public Curso(String nombre, String codigo, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = estudiantes;
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

    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Agrega un estudiante a la lista.
     * @return true si el estudiante due añadido.
     */
    public boolean agregarEstudiante() {
        return true;
    }

    /**
     * Muestra los estudiantes que hay en la lista.
     * @return la lista de estudiantes.
     */
    public String listarEstudiantes() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Curso)) {
            return false;
        }
        Curso cusro = (Curso) o;
        return Objects.equals(this.codigo, cusro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", estudiantes='" + getEstudiantes() + "'" +
            "}";
    }
    
}
