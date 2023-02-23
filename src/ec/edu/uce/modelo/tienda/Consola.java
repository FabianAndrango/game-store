
package ec.edu.uce.modelo.tienda;

import ec.edu.uce.modelo.interfaces.Equipo;
import ec.edu.uce.modelo.tienda.Plataforma;
import ec.edu.uce.modelo.tienda.Requerimiento;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Consola extends Plataforma implements Equipo, Serializable {

    private static int contador = 0;

    private int id;

    protected int numeroEdicionDeConsola;
    protected String marca;
    private String accesorio;

    private boolean tieneActualizacion;

    public Consola() {
        this("Microsoft", true,
                new Requerimiento(100, 100, "Intel", "Nvidia"),
                100, 100, "Intel", "Nvidia", 1, "Xbox", "Control");
    }

    public Consola(String empresaTitular, boolean multiPlataforma, Requerimiento requerimiento, int GB, int ram,
                   String procesador, String graficaVideo, int numeroEdicionDeConsola, String marca, String accesorio) {
        super(empresaTitular, multiPlataforma, requerimiento, GB, ram, procesador, graficaVideo);
        this.id = contador++;
        this.numeroEdicionDeConsola = numeroEdicionDeConsola;
        this.marca = marca;
        this.accesorio = accesorio;
    }

    @Override
    public String toString() {
        return super.toString() + "Consola{" +
                "numeroEdicionDeConsola=" + numeroEdicionDeConsola +
                ", marca='" + marca + '\'' +
                ", accesorio='" + accesorio + '\'' +
                '}';
    }

    @Override
    public String play() {
        return "La plataforma CONSOLA ha cumplido sus requrimiento listo para JUGAR ";
    }

    @Override
    public boolean tieneActualizacion() {
        return isTieneActualizacion();
    }
}
