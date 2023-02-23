
package ec.edu.uce.modelo.exceptions;

import lombok.Getter;

@Getter
public class DuplicadoException extends Exception {

    private final Object object;

    public DuplicadoException(String msg, Object object) {
        super(msg);
        this.object = object;
    }

}
