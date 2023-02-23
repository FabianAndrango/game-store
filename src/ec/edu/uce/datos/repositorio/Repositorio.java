package ec.edu.uce.datos.repositorio;

import java.util.List;

public interface Repositorio<T> {

    List<T> obtenerTodos();

    T obtenerPorId(int id);

    void crear(T t);

    T guardar(T t);

    void eliminar(int id);


}
