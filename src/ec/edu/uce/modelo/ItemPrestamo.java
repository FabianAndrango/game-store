/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author fing.labcom
 */
public class ItemPrestamo implements Serializable {

    private Videojuego videojuego;
    private int cantidad;
    private double subtotal;

    public ItemPrestamo() {
        cantidad = 0;
    }

    public ItemPrestamo(int cantidad, double subtotal, Videojuego videojuego) {
        this.cantidad = cantidad;
        this.subtotal=subtotal;
        this.videojuego = new Videojuego(videojuego);
    }
    public ItemPrestamo(ItemPrestamo i){
        this.cantidad = i.cantidad;
        this.subtotal=i.subtotal;
        this.videojuego=i.videojuego;
    }
    
    
    public Videojuego getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego videojuego) {
        if (videojuego != null) {
            this.videojuego = videojuego;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return cantidad * videojuego.getPrecio();
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) {return true;}
        if(!(o instanceof ItemPrestamo that)) {return false;}
        return Objects.equals(getVideojuego(), that.getVideojuego());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getVideojuego());
    }
    
    //Metodo toString, sirve para imprimir de manera ordenada en la consola
    @Override
    public String toString() {
        return "Item Prestamo" + "Videojuego Prestado= " + videojuego.toString() + " ,Cantidad= " + cantidad + " ,Subtotal= " + getSubtotal();
    }
}
