
package ec.edu.uce.modelo.tienda;

import ec.edu.uce.modelo.exceptions.ElementoException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Videojuego implements Serializable {

    public static final String IDIOMA = "Espaniol";
    public static int contador = 0;

    private int id;

    private int codigo;
    private String titulo;
    private String desarollador;
    private String redactor;
    private double precio;
    private static Plataforma plataformas[];

    static {
        plataformas = new Plataforma[1];
    }

    public Videojuego() {
        this(1234, "Fifa mobile", "Electronict Arts", " Wilmer ", 10.00);
    }

    public Videojuego(int codigo, String titulo, String desarollador, String redactor, double precio) {
        this.id = contador++;
        this.codigo = codigo;
        this.titulo = titulo;
        this.desarollador = desarollador;
        this.redactor = redactor;
        this.precio = precio;
    }

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
     */
    public Plataforma buscarPlataforma(int posicion) throws ElementoException {
        if (posicion < plataformas.length) {
            return plataformas[posicion];
        } else {
            throw new ElementoException("Plataforma fuera de rango ", posicion);
        }
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Videojuego that)) return false;
        return getId() == that.getId() && getCodigo() == that.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCodigo());
    }
}
