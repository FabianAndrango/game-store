/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import java.io.Serializable;

/*se crea la clase Requerimiento y los atributos de la misma */
public class Requerimiento implements Serializable {

    private int espacioNecesario;
    private int memoriaRam;
    private String procesador;
    private String tarjetaGrafica;

    /*se crea el metodo constructor sin parametros y se inicializa los atributos*/
    public Requerimiento() {
        espacioNecesario = 500;
        memoriaRam = 16;
        procesador = "Intel Core i7";
        tarjetaGrafica = "Intel HD 4000";
    }
    /*Se define el metodo constructor Requerimiento con parametros y se inicializa los atributos*/
   
    /*Se crea el metodo constructor con referencias*/
    public Requerimiento(int espacioNecesario, int memoriaRam, String procesador, String tarjetaGrafica) {
        this.espacioNecesario = espacioNecesario;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
    }
    
    
     public Requerimiento(Requerimiento r) {
       this.espacioNecesario = r.espacioNecesario;
        this.memoriaRam = r.memoriaRam;
        this.procesador = r.procesador;
        this.tarjetaGrafica = r.tarjetaGrafica;
    }

    /*Se establece los metodos get/set de los atributos de la clase Requerimiento*/
    public int getEspacioNecesario() {
        return espacioNecesario;
    }

    public void setEspacioNecesario(int newespacioNecesario) {
        if (newespacioNecesario > 0) {
            espacioNecesario = newespacioNecesario;
        }
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int newmemoriaRam) {
        if (newmemoriaRam > 0) {
            memoriaRam = newmemoriaRam;
        }
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String newprocesador) {
        procesador = newprocesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String newtarjetaGrafica) {
        tarjetaGrafica = newtarjetaGrafica;
    }
    
  
    /*Se define el metodo toString de la clase requerimiento*/

    @Override
    public String toString() {
        return "Requerimiento{" + "espacioNecesario=" + espacioNecesario + ", memoriaRam=" + memoriaRam + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica + '}';
    }

}
