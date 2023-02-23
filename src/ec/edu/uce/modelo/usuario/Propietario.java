
package ec.edu.uce.modelo.usuario;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Propietario extends Usuario implements Serializable{

    private static int contador = 0;

    private int id;

    public Propietario(int cedula, String nombre, String apellido, GeneroHumano genero, String clave) {
        super(cedula, nombre, apellido, genero, clave);
        this.id = contador++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Propietario that)) return false;
        if (!super.equals(o)) return false;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }
}
