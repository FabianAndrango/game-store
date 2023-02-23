
package ec.edu.uce.modelo.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GeneroHumano {

    MASCULINO("Masc."),
    FEMENINO("Fem.");
    private final String abreviatura;


}
