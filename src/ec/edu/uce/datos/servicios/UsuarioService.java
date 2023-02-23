package ec.edu.uce.datos.servicios;

import ec.edu.uce.modelo.usuario.Usuario;

public interface UsuarioService {

    Usuario obtenerPorCedulaClave(int cedula, String clave);

}
