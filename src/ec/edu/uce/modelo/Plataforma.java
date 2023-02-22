package ec.edu.uce.modelo;

//Constructores sin argumentos, con argumentos y referencial
import java.io.Serializable;

/*
*Se cambia de Clase a una Clase abstacto en Plataforma
 */
public abstract class Plataforma implements Serializable {

    private String empresaTitular;
    private boolean multiplataforma;
    private Requerimiento requerimiento;
    private int GB;
    private int ram;
    private String procesador;
    private String GraficaVideo;

    public Plataforma() {
//   empresaTitular = "Nintendo";
//    multiplataforma = true;
        this("Nintendo", true, new Requerimiento(343, 44, "HOLAS", "DJJD"));

    }

    public Plataforma(String empresaTitular, boolean multiplataforma, Requerimiento requerimiento) {
        this.empresaTitular = empresaTitular;
        this.multiplataforma = multiplataforma;
        this.requerimiento = new Requerimiento(requerimiento);
    }

    public Plataforma(Plataforma pl) {

        this(pl.empresaTitular, pl.multiplataforma, pl.requerimiento);
//        this.empresaTitular = pl.empresaTitular;
//        this.multiplataforma = pl.multiplataforma;
//        this.requerimiento = pl.requerimiento;
    }

    //Metodos gets y sets de atributos
    public String getEmpresaTitular() {
        return empresaTitular;
    }

    public void setEmpresaTitular(String empresaTitular) {
        this.empresaTitular = empresaTitular;
    }

    public boolean getMultiplataforma() {
        return multiplataforma;
    }

    public void setMultiplataforma(boolean multiplataforma) {
        this.multiplataforma = multiplataforma;
    }

    //Relacion de Composicion
    public Requerimiento getRequerimiento() {
        return requerimiento;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getGraficaVideo() {
        return GraficaVideo;
    }

    public void setGraficaVideo(String GraficaVideo) {
        this.GraficaVideo = GraficaVideo;
    }

    public void setRequerimiento(Requerimiento nuevoRequerimiento) {

        requerimiento = nuevoRequerimiento;

    }

    public abstract String play();

    //Metodo toString, sirve para imprimir de manera ordenada en la consola
    @Override
    public String toString() {
        return "Plataforma" + " Empresa Titular= " + empresaTitular + " Multiplataforma= " + multiplataforma + " Requerimientos= " + requerimiento;
    }

}
