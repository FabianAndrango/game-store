package ec.edu.uce.modelo.tienda;

import ec.edu.uce.modelo.interfaces.Equipo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
public class Pc extends Plataforma implements Equipo, Serializable {

    private static int contador = 0;

    private int id;

    private String modelo;
    private String sistemaOperativo;
    private String accesorio;


    public Pc() {
        this("Microsoft", true, new Requerimiento(100, 100, "Intel", "Nvidia"), 100, 100, "Intel", "Nvidia", "HP", "Windows", "Mouse");
    }


    public Pc(String empresaTitular, boolean multiPlataforma, Requerimiento requerimiento, int GB, int ram, String procesador, String graficaVideo, String modelo, String sistemaOperativo, String accesorio) {
        super(empresaTitular, multiPlataforma, requerimiento, GB, ram, procesador, graficaVideo);
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.accesorio = accesorio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pc pc)) return false;
        if (!super.equals(o)) return false;
        return getId() == pc.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }

    @Override
    public String toString() {
        return super.toString() + "Pc{" +
                "modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", accesorio='" + accesorio + '\'' +
                '}';
    }

    @Override
    public String play() {
        return this.sistemaOperativo + " La plataforma  ha cumplido sus requrimiento listo para JUGAR ";
    }

    @Override
    public boolean tieneActualizacion() {
        return false;
    }
}
