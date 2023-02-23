package ec.edu.uce.modelo.tienda;

import ec.edu.uce.modelo.Requerimiento;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public abstract class Plataforma implements Serializable {

    private static int contador;

    private int id;

    private String empresaTitular;
    private boolean multiPlataforma;
    private Requerimiento requerimiento;
    private int GB;
    private int ram;
    private String procesador;
    private String GraficaVideo;

    public Plataforma() {
        this("Microsoft", true, new Requerimiento(100, 100, "Intel", "Nvidia"), 100, 100, "Intel", "Nvidia");

    }

    public Plataforma(String empresaTitular, boolean multiPlataforma, Requerimiento requerimiento, int GB, int ram, String procesador, String graficaVideo) {
        this.id = ++contador;
        this.empresaTitular = empresaTitular;
        this.multiPlataforma = multiPlataforma;
        this.requerimiento = requerimiento;
        this.GB = GB;
        this.ram = ram;
        this.procesador = procesador;
        GraficaVideo = graficaVideo;
    }

    public abstract String play();

}
