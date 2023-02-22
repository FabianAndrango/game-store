/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import java.io.Serializable;

/**
 *
 * @author User
 */
/*Se establece la clase consola con la relación de herencia y definimos sus atributos*/
public class Consola extends Plataforma implements Equipo, Serializable {

    protected int numeroEdicionDeConsola;
    protected String marca;
    private String accesorio;

    /*Se crea el metodo constructor sin argumentos y se inicializa los atributos*/
    public Consola() {
        super();
        numeroEdicionDeConsola = 1011062;
        marca = "Xbox";
        accesorio=" mando personalizado";
    }

    /*Se crea el metodo constructor con argumentos y se inicializa los atributos */
    public Consola( String empresaTitular, boolean multiplataforma, Requerimiento requerimiento, int numeroEdicionDeConsola, String marca, String accesorio ) {
        super(empresaTitular, multiplataforma, requerimiento);
        this.numeroEdicionDeConsola = numeroEdicionDeConsola;
        this.marca = marca;
        this.accesorio=accesorio;
    }
    /*Se crea el metodo constructor con referencia al objeto */
    public Consola(Consola c) {
       //super();
       this.numeroEdicionDeConsola=c.numeroEdicionDeConsola;
       this.marca=c.marca;
       this.accesorio=c.accesorio;
//       this.empresaTitular=c.empresaTitular;
//       this.multiplataforma=c.multiplataforma;
       
       
    }
    /*Se establece los metodos get/set de cada atributo de la clase*/
    public int getNumeroEdicionDeConsola() {
        return numeroEdicionDeConsola;
    }
    public void setNumeroEdicionDeConsola(int newnumeroEdicionDeConsola) {
        numeroEdicionDeConsola = newnumeroEdicionDeConsola;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String newmarca) {
        marca = newmarca;
    }
    public boolean equals(Object o) {
        boolean resultado = false;
        if (o != null && o instanceof Consola) {
            Consola d = (Consola) o;
            if (marca == d.marca && numeroEdicionDeConsola == d.numeroEdicionDeConsola) {
                resultado = true;
            }
        }
        return resultado;
    }
    /*Se define el metodo toString de la clase */
    @Override
    public String toString() {
        return super.toString()+ " marca : " + marca + " Numero de Edicion de consola : " + numeroEdicionDeConsola;
    }

    @Override
    public String play() {
        
        return  " La plataforma CONSOLA ha cumplido sus requrimiento listo para JUGAR ";
    }

    @Override
    public String actualizacion() {
       
        return " La Consola se actualizo a la version mas reciente ";
    }

    @Override
    public String getAccesorio() {
        return accesorio;
    }

    @Override
    public void setAccesorio(String ac) {
        this.accesorio=ac;
    }
}
