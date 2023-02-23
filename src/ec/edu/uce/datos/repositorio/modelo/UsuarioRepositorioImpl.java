package ec.edu.uce.datos.repositorio.modelo;

import ec.edu.uce.datos.repositorio.UsuarioRepositorio;
import ec.edu.uce.modelo.usuario.Usuario;

import java.util.List;

public class UsuarioRepositorioImpl implements UsuarioRepositorio {
    @Override
    public List<Usuario> obtenerTodos() {
        return null;
    }

    @Override
    public Usuario obtenerPorId(int id) {
        return null;
    }

    @Override
    public void crear(Usuario usuario) {

    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Usuario obtenerPorCedula(String cedula) {
        return null;
    }
}
