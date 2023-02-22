/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package UTIL;

/**
 *
 * @author SAHID
 */
public enum GeneroHumano {
    
    MASCULINO("Masc."),FEMENINO("Fem.");
    private GeneroHumano(String abreviatura){
        this.abreviatura = abreviatura;
    }
    public String dameAbreviatura() {
 return abreviatura;
    }
    private String abreviatura;
    
    
}
