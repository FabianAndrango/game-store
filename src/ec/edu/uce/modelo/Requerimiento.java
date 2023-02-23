/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.modelo;

import ec.edu.uce.modelo.exceptions.SetterException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Requerimiento implements Serializable {

    private static int contador;

    private int id;

    private int espacioNecesario;
    private int memoriaRam;
    private String procesador;
    private String tarjetaGrafica;

    public Requerimiento() {
        this(500, 16, "Intel Core i7", "Intel HD 4000");

    }

    public Requerimiento(int espacioNecesario, int memoriaRam, String procesador, String tarjetaGrafica) {
        this.id = ++contador;
        this.espacioNecesario = espacioNecesario;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void setEspacioNecesario(int espacioNecesario) {
        if (espacioNecesario < 0) {
            throw new SetterException("El espacio necesario no puede ser negativo")
        }
        this.espacioNecesario = espacioNecesario;
    }

    public void setMemoriaRam(int memoriaRam) {
        if (memoriaRam < 0) {
            throw new SetterException("La memoria ram no puede ser negativa")
        }
        this.memoriaRam = memoriaRam;
    }
}
