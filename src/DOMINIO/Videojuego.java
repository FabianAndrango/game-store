/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import java.io.Serializable;

public class Videojuego implements Serializable  {

    public static final String IDIOMA = "Espaniol";
    private String titulo;
    private String desarollador;
    private String redactor;
//    private String idioma;
    private int codigo;
    private double precio;
    private static Plataforma plataformas[];
    private static int numPlataformas;
    public static int contador;

    static {
        plataformas = new Plataforma[1];
        numPlataformas = 0;
        contador = 0;
    }

    /*Creamos el metodo constrcutor por defecto*/
    public Videojuego() {
        this.codigo = contador++;
        titulo = "fifa mobile";
        desarollador = "electronict arts";
        redactor = " Wilmer ";
//        idioma = "Español";
        codigo = 1234;
        precio = 10.00;

//        plataformas = new Plataforma[1];
//        numPlataformas = 0;
    }

    /*Creamos el metodo constructor con argumentos*/
    public Videojuego(String titulo, String desarollador, String redactor, String idioma, int codigo, double precio) {
        this.codigo = contador++;
        this.titulo = titulo;
        this.desarollador = desarollador;
        this.redactor = redactor;
//        this.idioma = idioma;
        this.codigo = codigo;
        this.precio = precio;
//        this.plataformas = new Plataforma[1];
//        this.numPlataformas = 0;
    }

    /*Creamos el metodo constructor con referencia a un objeto*/
    public Videojuego(Videojuego v) {
        this(v.titulo, v.desarollador, v.redactor, v.IDIOMA, v.codigo, v.precio);
        this.codigo = v.contador++;
//        this.titulo = v.titulo;
//        this.desarollador = v.desarollador;
//        this.redactor = v.redactor;
////        this.idioma = v.idioma;
//        this.codigo = v.codigo;
//        this.precio = v.precio;
    }

    /*Creamos los metodos get y set*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarollador() {
        return desarollador;
    }

    public void setDesarollador(String desarollador) {
        this.desarollador = desarollador;

    }

    public String getRedactor() {
        return redactor;
    }

    public void setRedactor(String redactor) {
        this.redactor = redactor;
    }

//    public String getIdioma() {
//        return idioma;
//    }
//
//    public void setIdioma(String idioma) {
//        this.idioma = idioma;
//    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Plataforma getPlataforma(int posicion) {
        return plataformas[posicion];
    }

    public void setPlataformas(Plataforma[] plataformas) {
        this.plataformas = plataformas;
    }

    public int getNumPlataformas() {
        return numPlataformas;
    }

    public void setNumPlataformas(int numPlataformas) {
        this.numPlataformas = numPlataformas;
    }

    /**
     * crear una nueva plataforma
     *
     */
    public void nuevaPlataforma(String empresaTitular, boolean multiplataforma, Requerimiento requerimiento) {
        if (numPlataformas >= plataformas.length) {
            Plataforma aux[] = plataformas;
            plataformas = new Plataforma[numPlataformas + 1];
            System.arraycopy(aux, 0, plataformas, 0, aux.length);
        }
        plataformas[numPlataformas] = new Plataforma(empresaTitular, multiplataforma, requerimiento) {
            @Override
            public String play() {

                return " La Plataforma ha cumplido con todos los requisitos ";
            }
        };
        numPlataformas++;
    }

    public void nuevaPlataforma(Plataforma pl) {
        if (numPlataformas >= plataformas.length) {
            Plataforma aux[] = plataformas;
            plataformas = new Plataforma[numPlataformas + 1];
            System.arraycopy(aux, 0, plataformas, 0, aux.length);
        }
        plataformas[numPlataformas] = new Plataforma(pl) {
            @Override
            public String play() {

                return " La Plataforma ha cumplido con todos los requisitos ";
            }
        };
        numPlataformas++;
    }

    /**
     * listar la plataforma
     *
     */
    public String listarPlataforma() {
        String lista = "";
        for (Plataforma Plataforma : plataformas) {
            if (plataformas != null) {
                lista += Plataforma + "\r\n";
            }
        }
        return lista;
    }

    /**
     * se busca la plataforma
     *
     */
    public Plataforma buscarPlataforma(int posicion) throws ElementoException {
        if (posicion < plataformas.length) {
            return plataformas[posicion];
        } else {
            throw new ElementoException("Plataforma fuera de rango ", posicion);
        }
    }

    /**
     * se puede editar la plataforma
     *
     */
    public void editarPlataforma(int posicion, String empresaTitular, boolean multiplataforma, Requerimiento requerimiento) throws ElementoException {
        if (posicion < plataformas.length) {
            plataformas[posicion] = new Plataforma(empresaTitular, multiplataforma, requerimiento) {
                @Override
                public String play() {

                    return " La Plataforma ha cambiado de requisitos ";
                }
            };
        } else {
            throw new ElementoException("Plataforma fuera de rango ", posicion);
        }
    }

    /**
     * se puede eliminar la plataforma
     *
     */
    public void borrarPlataforma(int posicion) throws ElementoException {
        Plataforma[] aux;
        int p = plataformas.length - 1;
        aux = new Plataforma[p];
        if (posicion <= numPlataformas) {
            System.arraycopy(plataformas, 0, aux, 0, posicion);
            System.arraycopy(plataformas, posicion + 1, aux, posicion, p - (posicion));
        } else {
            throw new ElementoException("Plataforma fuera de rango", posicion);
        }
        plataformas = aux;
        numPlataformas--;

    }

    /*Metodo toString, sirve para imprimir de manera ordenada en la consola*/
    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", desarollador=" + desarollador + ", redactor=" + redactor + ", idioma=" + IDIOMA + ", codigo=" + codigo + ", precio=" + precio + '}';
    }

    public boolean equals(Object o) {
        boolean resp = false;
        Videojuego v = null;
        if (o != null && o instanceof Videojuego) {
            v = (Videojuego) o;
            if (titulo.equals(v.titulo)) {
                resp = true;
            }
        }
        return resp;
    }
}
