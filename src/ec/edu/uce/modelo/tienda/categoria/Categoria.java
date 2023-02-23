
package ec.edu.uce.modelo.tienda.categoria;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Categoria {
    ACCION("Acci."),
    AVENTURA("Avent.."),
    ARCADE("Arc."),
    DEPORTE("Dep."),
    ESTRATEGIA("Estrat."),
    SIMULACION("Simul."),
    MUSICAL("Musi."),
    TERROR("Terr."),
    SHOTTER("Sht."),
    RPG("RPG.") ;

    private final String abreviatura;

}
