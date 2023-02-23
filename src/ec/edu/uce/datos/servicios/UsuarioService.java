package ec.edu.uce.datos.servicios;

import ec.edu.uce.modelo.usuario.Usuario;

public interface UsuarioService {

    Usuario obtenerPorCedulaClave(String cedula, String clave);

}
