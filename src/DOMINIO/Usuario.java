package DOMINIO;

import UTIL.GeneroHumano;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Usuario  {
//implements Serializable
    String nombre;
    String apellido;
    int contrasenia;
    private static Prestamo[] prestamos;
    private static int numPrestamos;
    public static int contador;
    GeneroHumano genero;

    static {
        prestamos = new Prestamo[3];
        numPrestamos = 0;
        contador = 0;
    }

    /*Creamos el metodo constrcutor por defecto*/
    public Usuario() {
//        this("Pedro Pablo", "Leon Jaramillo", 1456, GeneroHumano.MASCULINO);
//        this.contrasenia = contador++;
////        nombre = "Pedro Pablo";
////        apellido = "Leon Jaramillo";
////        contrasenia = 1456;
////        prestamos = new Prestamo[3];
////        numPrestamos = 0;
    }

    /*Creamos el metodo constructor con argumentos*/
    public Usuario(String nombre, String apellido, int contrasenia, GeneroHumano genero) {
        this.contrasenia = contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.genero = genero;
//        this.prestamos = new Prestamo[3];
    }

    public Usuario(Usuario u) {
        this(u.nombre, u.apellido, u.contrasenia, u.genero);
        this.contrasenia = contador++;
//        this.nombre = u.nombre;
//        this.apellido = u.apellido;
//        this.contrasenia = u.contrasenia;
    }

    public GeneroHumano getGenero() {
        return genero;
    }

    public void setGenero(GeneroHumano genero) {
        this.genero = genero;
    }

    /* Creamos los metodos get y set*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getContraseña() {
        return contrasenia;
    }

    public void setContraseña(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Prestamo getPrestamos(int posicion) {
        return prestamos[posicion];
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
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
     * @throws DOMINIO.ElementoException
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
     * @throws DOMINIO.ElementoException
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

    public boolean equals(Object o) {
        boolean resp = false;
        Usuario u = null;
        if (o != null && o instanceof Usuario) {
            u = (Usuario) o;
            if (nombre.equals(u.nombre) && apellido.equals(u.apellido)) {
                resp = true;
            }
        }
        return resp;
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

    /*Creamos el metodo ToString*/
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasenia=" + contrasenia + ", genero=" + genero + '}';
    }

}
