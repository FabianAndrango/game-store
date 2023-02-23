package ec.edu.uce.datos.servicios.modelo;

import ec.edu.uce.datos.repositorio.UsuarioRepositorio;
import ec.edu.uce.datos.servicios.UsuarioService;
import ec.edu.uce.modelo.usuario.Usuario;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServiceImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario obtenerPorCedulaClave(int cedula, String clave) {

        Usuario usuario = usuarioRepositorio.obtenerPorCedula(cedula);

        if (usuario == null){
            return null;
        }

        if (usuario.getClave().equals(clave)){
            return usuario;
        }

        return null;
    }
}
