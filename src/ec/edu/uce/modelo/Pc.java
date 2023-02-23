package ec.edu.uce.modelo;

import ec.edu.uce.modelo.tienda.Plataforma;

import java.io.Serializable;


public class Pc extends Plataforma implements Equipo, Serializable  {
    
    private String modelo;
    private String sistemaOperativo;
    private String accesorio;
    
    /*Creamos el metodo constrcutor por defecto*/
    
    public Pc(){
        super();
        modelo = "HP";
        sistemaOperativo = "Windows 11";
        accesorio= "Audiofonos";
        
    }
    
     /*Creamos el metodo constructor con argumentos*/

    public Pc( String empresaTitular, boolean multiplataforma, Requerimiento requerimiento, String modelo, String sistemaOperativo, String accesorio) {
        super(empresaTitular, multiplataforma, requerimiento);
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.accesorio=accesorio;
    }
    
   
    /*Creamos el metodo constructor con referencia a un objeto*/
    
    public Pc (Pc p){
        //super();
        this.modelo = p.modelo;
        this.sistemaOperativo = p.sistemaOperativo;
//        this.empresaTitular=p.empresaTitular;
//        this.empresaTitular=p.accesorio;
//        this.multiplataforma=p.multiplataforma;
        
    }
    
    /*Creamos los metodos get y set*/
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String nuevoModelo){
        this.modelo = nuevoModelo;
    }
    
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public void setSistemaOperativo(String nuevoSistemaOperativo){
        this.sistemaOperativo = nuevoSistemaOperativo;
    }
    
    public boolean equals(Object o) {
        boolean resultado = false;
        if (o != null && o instanceof Pc) {
            Pc d = (Pc) o;
            if (modelo == d.modelo && sistemaOperativo == d.sistemaOperativo) {
                resultado = true;
            }
        }
        return resultado;
    }
    
     /*Creamos el metodo ToString*/
    
    @Override
    public String toString(){
        return super.toString()+  "Pc{" + "modelo=" + modelo + ", Sistema Operativo=" + sistemaOperativo +'}';
    }

    @Override
    public String play() {

        return this.sistemaOperativo+" La plataforma  ha cumplido sus requrimiento listo para JUGAR ";
    }

    @Override
    public String actualizacion() {
//        System.out.println(sistemaOperativo + " Se actualizo correctamente ");
        return this.sistemaOperativo + " Se actualizo correctamente ";
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
