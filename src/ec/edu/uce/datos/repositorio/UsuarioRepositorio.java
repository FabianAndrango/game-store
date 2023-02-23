package ec.edu.uce.datos.repositorio;

import ec.edu.uce.modelo.usuario.Usuario;

public interface UsuarioRepositorio extends Repositorio<Usuario> {

    Usuario obtenerPorCedula(String cedula);

}
