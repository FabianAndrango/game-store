/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

/**
 *
 * @author SAHID
 */
public class ElementoException extends Exception {
    int posicion;

      public ElementoException( String msg,int posicion) {
        super(msg);
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }
}
