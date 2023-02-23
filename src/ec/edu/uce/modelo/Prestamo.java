package ec.edu.uce.modelo;

import ec.edu.uce.modelo.exceptions.ElementoException;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Sahid
 */
public class Prestamo implements Serializable {

    public static final double IVA = 0.12;
    private static int contador = 0;
    private int id;
    private LocalDate fecha;
    private LocalDate vigencia;
    private int cantidad;
    private double total;
    private static ItemPrestamo[] itemPrestamos;
    private static int numItemPrestamos;
    private Usuario usuario;

    static {
        itemPrestamos = new ItemPrestamo[3];
        numItemPrestamos = 0;
        contador = 0;
    }

    /**
     * Metodo constructor sin argumentos Metodo constructor con argumentos
     * Metodo constructor llamado por el objeto
     */
    public Prestamo() {
        this.cantidad = contador++;
        this.fecha = LocalDate.now();
        vigencia = LocalDate.of(2024, 12, 10);
        cantidad = 9;
        total = 20.00;
//        itemPrestamos = new ItemPrestamo[3];
//        numItemPrestamos = 0;

    }

    public Prestamo(LocalDate fecha, LocalDate vigencia, int cantidad, double total) {
        this.cantidad = contador++;
        this.fecha = fecha;
        this.vigencia = vigencia;
        this.cantidad = cantidad;
        this.total = total;
//        this.itemPrestamos = new ItemPrestamo[3];
    }

    public Prestamo(Prestamo p) {
        this.cantidad = p.contador++;
        this.fecha = p.fecha;
        this.vigencia = p.vigencia;
        this.cantidad = p.cantidad;
        this.total = p.total;
    }

    public ItemPrestamo[] getItemPrestamos() {
        return itemPrestamos;
    }

    public void setItemPrestamos(ItemPrestamo[] itemPrestamos) {
        this.itemPrestamos = itemPrestamos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getVigencia() {
        return vigencia;
    }

    public void setVigencia(LocalDate vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Metodo para regresar el numero de cantidad de videojuegos
     *
     * @return Regresa el numero de la cantidad de videojuegos
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece el numero de la cantidad de videojuegos
     *
     * @param cantidad Numero que se le asignara a la cantidad de videojuegos
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ItemPrestamo getVideojuego(int posicion) {
        return itemPrestamos[posicion];
    }

    public void setVieojuego(ItemPrestamo[] videojuegos) {
        this.itemPrestamos = itemPrestamos;
    }

    public void setNumVideojuegos(int numVideojuegos) {
        this.numItemPrestamos = numVideojuegos;
    }

    public String formatearFechaDeIngreso() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(fecha);
        return fechaFormateada;
    }

    public String formatearVigencia() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(vigencia);
        return fechaFormateada;
    }

    /*Creamos los metodos get y set*/
    /**
     * Este metodo se encarga en agregar un videojuego en prestamo
     *
     * @author Sahid
     * @param cantidad
     * @param subtotal
     * @param videojuego
     *
     * @return numro de Videojuegos
     */
    public void nuevoItemPrestamo(int cantidad, double subtotal, Videojuego videojuego) {
        if (numItemPrestamos >= itemPrestamos.length) {
            ItemPrestamo auxItemPrestamo[] = itemPrestamos;
            itemPrestamos = new ItemPrestamo[numItemPrestamos + 1];
            System.arraycopy(auxItemPrestamo, 0, itemPrestamos, 0, auxItemPrestamo.length);
        }

        itemPrestamos[numItemPrestamos] = new ItemPrestamo(cantidad, subtotal, videojuego);
        numItemPrestamos++;

    }

    public void nuevoItemPrestamo(ItemPrestamo i) {
        if (numItemPrestamos >= itemPrestamos.length) {
            ItemPrestamo auxItemPrestamo[] = itemPrestamos;
            itemPrestamos = new ItemPrestamo[numItemPrestamos + 1];
            System.arraycopy(auxItemPrestamo, 0, itemPrestamos, 0, auxItemPrestamo.length);
        }

        itemPrestamos[numItemPrestamos] = new ItemPrestamo(i);
        numItemPrestamos++;

    }

    /**
     * Este metodo se encarga de listar
     *
     * @return lista que muestra la lista del Videojuego
     */
    public String listarItemPrestamo() {
        String lista = "";
        for (ItemPrestamo itemPrestamo : itemPrestamos) {
            if (itemPrestamo != null) {
                lista += itemPrestamo + "\r\n";
            }
        }
        return lista;
    }

    public ItemPrestamo buscarItemPrestamo(int posicion) throws ElementoException {
        if (posicion < itemPrestamos.length) {
            return itemPrestamos[posicion];
        } else {
            throw new ElementoException("ItemPrestmo fuera de rango ", posicion);
        }
    }

    public void editarItemPrestamo(int posicion, int cantidad, double subtotal) throws ElementoException {
        if (posicion < itemPrestamos.length) {
            itemPrestamos[posicion] = new ItemPrestamo();
        } else {
            throw new ElementoException("ItemPrestmo fuera de rango ", posicion);
        }
    }

    public void borrarItemPrestamo(int posicion) throws ElementoException {
        ItemPrestamo[] aux;
        int j = itemPrestamos.length - 1;
        aux = new ItemPrestamo[j];
        if (posicion <= numItemPrestamos) {
            System.arraycopy(itemPrestamos, 0, aux, 0, posicion);
            System.arraycopy(itemPrestamos, posicion + 1, aux, posicion, j - (posicion));
        } else {
            throw new ElementoException("ItemPrestamo fuera de rango ", posicion);
        }
        itemPrestamos = aux;
        numItemPrestamos--;

    }

    public double calcularTotal() {
        double tota = 0;
        for (ItemPrestamo itemPrestamo : itemPrestamos) {
            if (itemPrestamo != null) {
                tota += itemPrestamo.getSubtotal() * IVA + itemPrestamo.getSubtotal();
            }
        }
        return tota;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fecha=" + fecha + ", vigencia=" + vigencia + ", cantidad=" + cantidad + ", total=" + calcularTotal() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prestamo other = (Prestamo) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.usuario, other.usuario);
    }

    
}
