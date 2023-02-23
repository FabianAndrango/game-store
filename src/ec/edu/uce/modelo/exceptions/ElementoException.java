
package ec.edu.uce.modelo.exceptions;

import lombok.Getter;


@Getter
public class ElementoException extends Exception {

    private final int posicion;

    public ElementoException(String msg, int posicion) {
        super(msg);
        this.posicion = posicion;
    }

}
