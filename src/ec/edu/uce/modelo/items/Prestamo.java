package ec.edu.uce.modelo.items;

import ec.edu.uce.modelo.tienda.Videojuego;
import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.usuario.Usuario;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Prestamo implements Serializable {

    public static final BigDecimal IVA = new BigDecimal("0.12");

    private static int contador = 0;

    private int id;

    private LocalDate fecha;
    private LocalDate vigencia;
    private int cantidad;
    private BigDecimal total;
    private static ItemPrestamo[] itemPrestamos;
    private static int numItemPrestamos;
    private Usuario usuario;

    static {
        itemPrestamos = new ItemPrestamo[3];
        numItemPrestamos = 0;
        contador = 0;
    }


    public Prestamo() {
        this(LocalDate.now(), LocalDate.now(), 5, null);
    }

    public Prestamo(LocalDate fecha, LocalDate vigencia, int cantidad, Usuario usuario) {
        this.id = contador++;
        this.fecha = fecha;
        this.vigencia = vigencia;
        this.cantidad = cantidad;
        this.usuario = usuario;
    }

    /*Creamos los metodos get y set*/

    /**
     * Este metodo se encarga en agregar un videojuego en prestamo
     *
     * @param cantidad
     * @param subtotal
     * @param videojuego
     * @return numro de Videojuegos
     * @author Sahid
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
        double total = 0;
        for (ItemPrestamo itemPrestamo : itemPrestamos) {
            if (itemPrestamo != null) {
                total += itemPrestamo.getSubtotal();
            }
        }
        total += total * IVA.doubleValue();
        return total;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestamo prestamo)) return false;
        return getId() == prestamo.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
