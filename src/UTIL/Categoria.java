/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package UTIL;

/**
 *
 * @author SAHID
 */
public enum Categoria {
    ACCION("Acci."), AVENTURA("Avent.."), ARCADE("Arc."), DEPORTE("Dep."), ESTRATEGIA("Estrat."), SIMULACION("Simul."), MUSICAL("Musi."), TERROR("Terr."),
    SHOTTER("Sht."), RPG("RPG.") ;

    private Categoria(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String dameCate() {
        return abreviatura;
    }
    
    private String abreviatura;

}
