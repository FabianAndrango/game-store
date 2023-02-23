package ec.edu.uce.datos.repositorio.modelo;

import ec.edu.uce.datos.repositorio.UsuarioRepositorio;
import ec.edu.uce.modelo.usuario.GeneroHumano;
import ec.edu.uce.modelo.usuario.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioRepositorioImpl implements UsuarioRepositorio {

    private final List<Usuario> usuarios;

    public UsuarioRepositorioImpl() {
        this.usuarios = new ArrayList<>();
        obtenerDatosDesdeArchivo();
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return usuarios;
    }

    @Override
    public Usuario obtenerPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void crear(Usuario usuario) {
        Usuario buscarUsuario = obtenerPorCedula(usuario.getCedula());
        if (buscarUsuario == null && usuario.getId() == 0) {
            usuario.setId(usuarios.size() + 1);
            usuarios.add(usuario);
            System.out.println("Usuario creado correctamente");
        }
        System.out.println("Usuario ya existe");
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        Usuario buscarUsuario = obtenerPorCedula(usuario.getCedula());
        if (buscarUsuario != null) {
            buscarUsuario.setNombre(usuario.getNombre());
            buscarUsuario.setApellido(usuario.getApellido());
            buscarUsuario.setGenero(usuario.getGenero());
            buscarUsuario.setClave(usuario.getClave());
            System.out.println("Usuario actualizado correctamente");
            return buscarUsuario;
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        Usuario usuario = obtenerPorId(id);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuario eliminado correctamente");
        }
        System.out.println("Usuario no existe");
    }

    @Override
    public Usuario obtenerPorCedula(int cedula) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCedula() == cedula) {
                return usuario;
            }
        }
        return null;
    }


    private void obtenerDatosDesdeArchivo() {
        try (InputStream inputStream = new FileInputStream(obtenerArchivo("usuarios.txt"))) {
            try (Scanner scanner = new Scanner(inputStream)) {
                String[] tokens = scanner.nextLine().split(";");
                while (scanner.hasNextLine()) {
                    int id = Integer.parseInt(tokens[0]);
                    int cedula = Integer.parseInt(tokens[1]);
                    String nombre = tokens[2];
                    String apellido = tokens[3];
                    String genero = tokens[4];
                    GeneroHumano generoHumano = GeneroHumano.valueOf(genero);
                    String clave = tokens[5];
                    Usuario usuario = new Usuario(cedula, nombre, apellido, generoHumano, clave);
                    usuario.setId(id);
                    usuarios.add(usuario);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private String obtenerArchivo(String file) throws FileNotFoundException {
        return System.getProperty("user.dir") + "\\src\\ec\\edu\\uce\\datos\\archivos\\" + file;
    }

    public void guardarDatosAlArchivo() {
        try (FileOutputStream inputStream = new FileOutputStream(obtenerArchivo("usuarios.txt"))) {
            try (PrintWriter printWriter = new PrintWriter(inputStream)) {
                printWriter.println("id;cedula;nombre;apellido;genero;clave");
                for (Usuario usuario : usuarios) {
                    printWriter.println(usuario.getId() + ";" + usuario.getCedula() + ";" + usuario.getNombre() + ";" + usuario.getApellido() + ";" + usuario.getGenero() + ";" + usuario.getClave());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
