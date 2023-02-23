
package ec.edu.uce.modelo.items;

import ec.edu.uce.modelo.tienda.Videojuego;
import ec.edu.uce.modelo.exceptions.SetterException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
public class ItemPrestamo implements Serializable {

    private static int contador = 0;

    private int id;

    private Videojuego videojuego;
    private int cantidad;
    private double subtotal;

    public ItemPrestamo() {
        cantidad = 0;
    }

    public ItemPrestamo(Videojuego videojuego, int cantidad, double subtotal) {
        this.videojuego = videojuego;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }


    public void setVideojuego(Videojuego videojuego) throws SetterException {
        if (videojuego == null){
            throw new SetterException("El videojuego no puede ser nulo");
        }
        this.videojuego = videojuego;
    }

    public double getSubtotal() {
        return cantidad * videojuego.getPrecio();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemPrestamo that)) return false;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
