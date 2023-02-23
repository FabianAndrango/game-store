package ec.edu.uce.modelo.usuario;

import ec.edu.uce.modelo.items.Prestamo;
import ec.edu.uce.modelo.exceptions.ElementoException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Usuario  {

    private static int contador;

    private int id;

    private int cedula;
    private String nombre;
    private String apellido;
    private GeneroHumano genero;

    private String clave;

    private static Prestamo[] prestamos;
    private static int numPrestamos;

    static {
        prestamos = new Prestamo[3];
        numPrestamos = 0;
        contador = 0;
    }

    public Usuario() {
        this(0, "Sahid", "Carrion", GeneroHumano.MASCULINO, "1234");
    }

    /*Creamos el metodo constructor con argumentos*/

    public Usuario(int cedula, String nombre, String apellido, GeneroHumano genero, String clave) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.clave = clave;
    }

    /**
     * Este metodo se encarga en agregar un videojuego
     *
     * @author Sahid
     * @param fecha
     * @param vigencia
     * @param cantidad
     * @param total
     */
    public void nuevoPrestamo(LocalDate fecha, LocalDate vigencia, int cantidad, double total) {
        if (numPrestamos >= prestamos.length) {
            Prestamo auxPrestamo[] = prestamos;
            prestamos = new Prestamo[numPrestamos + 1];
            System.arraycopy(auxPrestamo, 0, prestamos, 0, auxPrestamo.length);
        }

        prestamos[numPrestamos] = new Prestamo(fecha, vigencia, cantidad, total);
        numPrestamos++;

    }

    public void nuevoPrestamo(Prestamo p) {
        if (numPrestamos >= prestamos.length) {
            Prestamo auxPrestamo[] = prestamos;
            prestamos = new Prestamo[numPrestamos + 1];
            System.arraycopy(auxPrestamo, 0, prestamos, 0, auxPrestamo.length);
        }

        prestamos[numPrestamos] = new Prestamo(p);
        numPrestamos++;

    }

    /**
     * Este metodo se encarga de listar
     *
     * @return lista que muestra la lista del Prestamo
     */
    public String listarPrestamo() {
        String lista = "";
        for (Prestamo prestamo : prestamos) {
            if (prestamo != null) {
                lista += prestamo + "\r\n";
            }
        }
        return lista;
    }

    /**
     * Este metodo se encarga de buscar
     *
     * @param posicion
     * @return lista que muestra la busqueda del Usuario
     */
    public Prestamo buscarPrestamo(int posicion) throws ElementoException {
        if (posicion < prestamos.length) {
            return prestamos[posicion];
        } else {
            throw new ElementoException("Prestamo fuera de rango ", posicion);
        }
    }

    /**
     * Este metodo se encarga de editar
     *
     * @param posicion
     * @param fecha
     * @param vigencia
     * @param cantidad
     * @param total
     * @throws ElementoException
     */
    public void editarPrestamo(int posicion, LocalDate fecha, LocalDate vigencia, int cantidad, double total) throws ElementoException {
        if (posicion < prestamos.length) {
            prestamos[posicion] = new Prestamo(fecha, vigencia, cantidad, total);
        } else {
            throw new ElementoException("Prestamo fuera de rango ", posicion);
        }
    }

    /**
     * Este metodo se encarga de eliminar
     *
     * @param posicion
     * @throws ElementoException
     */
    public void borrarPrestamo(int posicion) throws ElementoException {
        Prestamo[] aux;
        int j = prestamos.length - 1;
        aux = new Prestamo[j];
        if (posicion <= numPrestamos) {
            System.arraycopy(prestamos, 0, aux, 0, posicion);
            System.arraycopy(prestamos, posicion + 1, aux, posicion, j - (posicion));
        } else {
            throw new ElementoException("Prestamo fuera de rango", posicion);
        }
        prestamos = aux;
        numPrestamos--;

    }

    public double calcularTotal() {
        double total = 0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo != null) {
                total += prestamo.calcularTotal();
            }
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return getId() == usuario.getId() && getCedula() == usuario.getCedula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCedula());
    }
}
