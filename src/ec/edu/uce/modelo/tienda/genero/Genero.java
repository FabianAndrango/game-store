package ec.edu.uce.modelo.tienda.genero;

import ec.edu.uce.modelo.tienda.categoria.Categoria;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Genero implements Serializable{

    private static int contador = 0;

    private int id;

    private String autor;
    private Categoria categoria;


    public Genero() {
        this("Activision", Categoria.SHOTTER);

    }

    public Genero(String autor, Categoria categoria) {
        this.id = contador++;
        this.autor = autor;
        this.categoria = categoria;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero genero)) return false;
        return getId() == genero.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
