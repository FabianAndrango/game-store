package DOMINIO;

import UTIL.Categoria;
import java.io.Serializable;

public class Genero implements Serializable{

    private int clave;
    private String autor;
//    private String categoria;
    private Categoria categoria;
    public static int contador;

    static {
        contador = 0;
    }

    /*Creamos el metodo constrcutor por defecto*/
    public Genero() {
        this.clave = contador++;
        autor = "Activision";
        categoria= Categoria.SHOTTER;
    }

    /*Creamos el metodo constructor con argumentos*/
    public Genero(int clave, String autor, Categoria categoria) {
        this.clave = contador++;
        this.autor = autor;
        this.categoria = categoria;
    }

    /*Creamos el metodo constructor con referencia a un objeto*/
    public Genero(Genero g) {
        this.clave = g.contador++;
        this.autor = g.autor;
        this.categoria = g.categoria;
    }

    /*Creamos los metodos get y set*/
    public int getClave() {
        return clave;
    }

    public void setClave(int nuevoClave) {
        this.clave = nuevoClave;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria nuevoCategoria) {
        this.categoria = nuevoCategoria;
    }
    
public boolean equals(Object o) {
        boolean resp = false;
        Genero g = null;
        if (o != null && o instanceof Genero) {
            g = (Genero) o;
            if ( categoria.equals(g.categoria)) {
                resp = true;
            }
        }
        return resp;
    }

    /*Creamos el metodo ToString*/
    @Override
    public String toString() {
        return "Genero{" + "clave=" + clave + ", autor=" + autor + ", categoria=" + categoria + '}';
    }

}
