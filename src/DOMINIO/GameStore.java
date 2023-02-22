/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import DATOS.DeserializarUsuario;
import DATOS.Serializar;
import DATOS.SerializarUsuario;
import UTIL.Categoria;
import UTIL.GeneroHumano;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameStore implements IAdministrarCRUD, Serializable {

    private String nombrePrincipal;
    private String ciudad;
    private String direccion;
    private String telefono;
    private static Genero generos[];
    private static int numGeneros;
    private static Videojuego videojuegos[];
    private static int numVideojuegos;
    private static Usuario usuarios[];
    private static int numUsuarios;
    public static int cont;
    public static int cont1;

    static {
        generos = new Genero[1];
        numGeneros = 0;
        videojuegos = new Videojuego[1];
        numVideojuegos = 0;
        usuarios = new Usuario[1];
        numUsuarios = 0;
        cont = 0;
        cont1 = 0;
    }

    /**
     * Metodo constructor sin argumentos Metodo constructor con argumentos
     * Metodo constructor llamado por el objeto
     */
    public GameStore() {
        this("Luxid", "Quito", "Ciudadela Ibarra", "09885456-6");

//        nombrePrincipal = "Luxid";
//        ciudad = "Quito";
//        direccion = "Ciudadela Ibarra";
//        telefono = "09885456-6";
//        generos = new Genero[1];
//        numGeneros = 0;
//        videojuegos = new Videojuego[1];
//        numVideojuegos = 0;
//        usuarios = new Usuario[1];
//        numUsuarios = 0;
    }

    public GameStore(String nombrePrincipal, String ciudad, String direccion, String telefono) {
        this.nombrePrincipal = nombrePrincipal;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public GameStore(GameStore g) {
        this(g.nombrePrincipal, g.ciudad, g.direccion, g.telefono);
//        this.nombrePrincipal = g.nombrePrincipal;
//        this.ciudad = g.ciudad;
//        this.direccion = g.direccion;
//        this.telefono = g.telefono;
    }

    public int getNumUsuario() {
        return numUsuarios;
    }

    public void setNumUsuario(int numUsuarios) {
        this.numUsuarios = numUsuarios;
    }

    /**
     * Metodo para regresar el nombre Prncipal
     *
     * @return Regresa el nombre Prncipal
     */
    public String getNombrePrincipal() {
        return nombrePrincipal;
    }

    /**
     * Metodo que le asigna Nombre Principal
     *
     * @param nombrePrincipal Nombre Del Usuario
     */
    public void setNombrePrincipal(String nombrePrincipal) {
        this.nombrePrincipal = nombrePrincipal;
    }

    /**
     * Metodo para regresar el nombre la Ciudad
     *
     * @return Regresa el nombre la Ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Metodo que le asigna ciudad al usuario
     *
     * @param ciudad Nombre de la ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Metodo para regresar la direccion
     *
     * @return Regresa el numero de la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo que le asigna direccion al usuario
     *
     * @param direccion Nombre de la direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para regresar el numero de telefono
     *
     * @return Regresa el numero del telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo que le asigna telefono al usuario
     *
     * @param telefono Numero de telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Genero getGeneros(int posicion) {
        return generos[posicion];
    }

    public void setGeneros(Genero[] generos) {
        this.generos = generos;
    }

    public int getNumGeneros() {
        return numGeneros;
    }

    public void setNumGeneros(int numGeneros) {
        this.numGeneros = numGeneros;
    }

    public Videojuego getVideojuegos(int posicion) {
        return videojuegos[posicion];
    }

    public void setVideojuegos(Videojuego[] videojuegos) {
        this.videojuegos = videojuegos;
    }

    public int getNumVideojuegos() {
        return numVideojuegos;
    }

    public void setNumVideojuegos(int numVideojuegos) {
        this.numVideojuegos = numVideojuegos;
    }

    /**
     * crear una nuevo genero
     *
     * @param clave
     * @param autor
     * @param categoria
     */
    public void nuevoGenero(int clave, String autor, Categoria categoria) {
        if (numGeneros >= generos.length) {
            Genero aux[] = generos;
            generos = new Genero[numGeneros + 1];
            System.arraycopy(aux, 0, generos, 0, aux.length);
        }
        generos[numGeneros] = new Genero(clave, autor, categoria);
        numGeneros++;
    }

    public void nuevoGenero(Genero g) {
        if (numGeneros >= generos.length) {
            Genero aux[] = generos;
            generos = new Genero[numGeneros + 1];
            System.arraycopy(aux, 0, generos, 0, aux.length);
        }
        generos[numGeneros] = new Genero(g);
        numGeneros++;
    }

    /**
     * listar el genero
     *
     * @return
     */
    public String listarGenero() {
        String lista = "";
        for (Genero genero : generos) {
            if (generos != null) {
                lista += genero + "\r\n";
            }
        }
        return lista;
    }

    /**
     * se busca el genero
     *
     * @param posicion
     * @return
     */
    public Genero buscarGenero(int posicion) throws ElementoException {
        if (posicion < generos.length) {
            return generos[posicion];
        } else {
            throw new ElementoException("Genero fuera de rango ", posicion);
        }
    }

    /**
     * se puede editar el genero
     *
     * @param posicion
     * @param clave
     * @param autor
     * @param categoria
     */
    public void editarGenero(int posicion, int clave, String autor, Categoria categoria) throws ElementoException {
        if (posicion < generos.length) {
            generos[posicion] = new Genero(clave, autor, categoria);
        } else {
            throw new ElementoException("Genero fuera de rango ", posicion);
        }
    }

    /**
     * se puede eliminar el genero
     *
     * @param posicion
     */
    public void borrarGenero(int posicion) throws ElementoException {
        Genero[] aux;
        int j = generos.length - 1;
        aux = new Genero[j];
        if (posicion <= numGeneros) {
            System.arraycopy(generos, 0, aux, 0, posicion);
            System.arraycopy(generos, posicion + 1, aux, posicion, j - (posicion));
        } else {
            throw new ElementoException("Genero fuera de rango", posicion);
        }
        generos = aux;
        numGeneros--;

    }

    /**
     * Este metodo se encarga en agregar un videojuego
     *
     * @author Sahid
     * @param titulo titulo del videojuego
     * @param desarrollador nombre del que desarrollo el juego
     * @param redactor nombre del que creo la historia
     * @param idioma idioma del videojuego
     * @param codigo numero del codigo del videojuego
     * @param precio
     */
    public void nuevoVideojuego(String titulo, String desarrollador, String redactor, String idioma, int codigo, double precio) {
        if (numVideojuegos >= videojuegos.length) {
            Videojuego aux[] = videojuegos;
            videojuegos = new Videojuego[numVideojuegos + 1];
            System.arraycopy(aux, 0, videojuegos, 0, aux.length);
        }
        videojuegos[numVideojuegos] = new Videojuego(titulo, desarrollador, redactor, idioma, codigo, precio);
        numVideojuegos++;
        cont1++;
    }

    public void nuevoVideojuego(Videojuego v) {
        if (numVideojuegos >= videojuegos.length) {
            Videojuego aux[] = videojuegos;
            videojuegos = new Videojuego[numVideojuegos + 1];
            System.arraycopy(aux, 0, videojuegos, 0, aux.length);
        }
        videojuegos[numVideojuegos] = new Videojuego(v);
        numVideojuegos++;
        cont1++;
    }

    /**
     * Este metodo se encarga de listar
     *
     * @return lista que muestra la lista del Videojuego
     */
    public String listarVideojuego() {
        String lista = "";
        for (Videojuego videojuego : videojuegos) {
            if (videojuegos != null) {
                lista += videojuego + "\r\n";
            }
        }
        return lista;
    }

    /**
     * Este metodo se encarga de buscar
     *
     * @param posicion
     * @return lista que muestra la busqueda del Videojuego
     */
    public Videojuego buscarVideojuego(int posicion) throws ElementoException {
        if (posicion < videojuegos.length) {
            return videojuegos[posicion];
        } else {
            throw new ElementoException("Videojuego fuera de rango ", posicion);
        }
    }

    /**
     * Este metodo se encarga de editar
     *
     * @param posicion
     * @param titulo
     * @param desarrollador
     * @param redactor
     * @param idioma
     * @param codigo
     * @param precio
     */
    public void editarVideojuego(int posicion, String titulo, String desarrollador, String redactor, String idioma, int codigo, double precio) throws ElementoException {
        if (posicion < videojuegos.length) {
            videojuegos[posicion] = new Videojuego(titulo, desarrollador, redactor, idioma, codigo, precio);
        } else {
            throw new ElementoException("Videojuego fuera de rango ", posicion);
        }
    }

    /**
     * Este metodo se encarga de eliminar
     *
     * @param posicion
     */
    public void borrarVideojuego(int posicion) throws ElementoException {
        Videojuego[] aux;
        int j = videojuegos.length - 1;
        aux = new Videojuego[j];
        if (posicion <= numVideojuegos) {
            System.arraycopy(videojuegos, 0, aux, 0, posicion);
            System.arraycopy(videojuegos, posicion + 1, aux, posicion, j - (posicion));
        } else {
            throw new ElementoException("Videojuego fuera de rango", posicion);
        }
        videojuegos = aux;
        numVideojuegos--;
        cont1--;

    }

    /**
     * Este metodo se encarga en agregar un videojuego
     *
     * @author Sahid
     * @param Nombre
     * @param Apellido
     * @param Contrasenia
     */
    public void nuevoUsuario(String nombre, String apellido, int contrasenia, GeneroHumano genero) {
        if (numUsuarios >= usuarios.length) {
            Usuario auxUsuario[] = usuarios;
            usuarios = new Usuario[numUsuarios + 1];
            System.arraycopy(auxUsuario, 0, usuarios, 0, auxUsuario.length);
        }

        usuarios[numUsuarios] = new Usuario(nombre, apellido, contrasenia, genero);
        
        numUsuarios++;
        cont++;

    }

    public void nuevoUsuario(Usuario u) {
        if (numUsuarios >= usuarios.length) {
            Usuario auxUsuario[] = usuarios;
            usuarios = new Usuario[numUsuarios + 1];
            System.arraycopy(auxUsuario, 0, usuarios, 0, auxUsuario.length);
        }

        usuarios[numUsuarios] = new Usuario(u);
        
        numUsuarios++;
        cont++;

    }

    /**
     * Este metodo se encarga de listar
     *
     * @return lista que muestra la lista del Videojuego
     */
    public String listarUsuario() {
        String lista = "";
        for (Usuario usuario : usuarios) {
            if (usuarios != null) {
                lista += usuario + "\r\n";
            }
        }
        return lista;
    }

    /**
     * Este metodo se encarga de buscar
     *
     * @param posicion
     * @return lista que muestra la busqueda del Usuario
     */
    public Usuario buscarUsuario(int posicion) throws ElementoException {
        if (posicion < usuarios.length) {
            return usuarios[posicion];
        } else {
            throw new ElementoException("Usuario fuera de rango ", posicion);
        }
    }

    /**
     * Este metodo se encarga de editar
     *
     * @param posicion
     * @param Nombre
     * @param Apellido
     * @param Contrasenia
     */
    public void editarUsuario(int posicion, String nombre, String apellido, int contrasenia, GeneroHumano genero) throws ElementoException {
        if (posicion < usuarios.length) {
            usuarios[posicion] = new Usuario(nombre, apellido, contrasenia, genero);
        } else {
            throw new ElementoException("Usuario fuera de rango ", posicion);
        }
    }
    
     public void editarUsuario(int posicion, Usuario usuario)throws ElementoException{
        if (posicion < usuarios.length) {
        usuarios[posicion] = usuario;
        } else {
            throw new ElementoException("Usuario fuera de rango ", posicion);
        }
    }

    /**
     * Este metodo se encarga de eliminar
     *
     * @param posicion
     */
    public void borrarUsuario(int posicion) throws ElementoException {
        Usuario[] aux;
        int j = usuarios.length - 1;
        aux = new Usuario[j];
        if (posicion <= numUsuarios) {
            System.arraycopy(usuarios, 0, aux, 0, posicion);
            System.arraycopy(usuarios, posicion + 1, aux, posicion, j - (posicion));
        } else {
            throw new ElementoException("Usuario fuera de rango", posicion);
        }
        usuarios = aux;
        numUsuarios--;
        cont--;

    }

    public boolean equals(Object o) {
        boolean resp = false;
        GameStore gs = null;
        if (o != null && o instanceof GameStore) {
            gs = (GameStore) o;
            if (nombrePrincipal.equals(gs.nombrePrincipal) && direccion.equals(gs.direccion)) {
                resp = true;
            }
        }
        return resp;
    }

    /**
     *
     * @param g
     * @return
     */
    public boolean validarGenero(Genero g) throws DuplicadoException {
        boolean resp = false;

        for (Genero ge : generos) {
            if (ge != null) {
                if (ge.equals(g)) {
                    resp = true;
                    throw new DuplicadoException("Genero Duplicado", ge);
                }
            }
        }
        return resp;
    }

    public boolean validarVideojuego(Videojuego v) throws DuplicadoException {
        boolean resp = false;

        for (Videojuego vid : videojuegos) {
            if (vid != null) {
                if (vid.equals(v)) {
                    resp = true;
                    throw new DuplicadoException("Videojuego Duplicado", vid);
                }
            }
        }
        return resp;
    }

    public boolean validarUsuario(Usuario u) throws DuplicadoException {
        boolean resp = false;

        for (Usuario usu : usuarios) {
            if (usu != null) {
                if (usu.equals(u)) {
                    resp = true;
                    throw new DuplicadoException("Usuario Duplicado", usu);
                }
            }
        }
        return resp;
    }

    /*Metodo toString, sirve para imprimir de manera ordenada en la consola*/
    @Override
    public String toString() {
        return "GameStore{" + "nombrePrincipal=" + nombrePrincipal + ", ciudad=" + ciudad + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public String nuevo(Object obj) {
        String resp = "No se creo el elemento";
        if (obj instanceof Usuario) {

            Usuario u = (Usuario) obj;
            this.nuevoUsuario(u);

            resp = "Elemento agreagado con exito";
        }
        if (obj instanceof Genero) {
            Genero g = (Genero) obj;
            this.nuevoGenero(g);
            resp = "Elemento agreagado con exito";
        }
        if (obj instanceof Videojuego) {
            Videojuego v = (Videojuego) obj;
            this.nuevoVideojuego(v);
            resp = "Elemento agreagado con exito";
        }
        return resp;

    }

    @Override
    public String borrar(Object obj) {
        int posicion = 0;
        String mensaje="";
        for (Usuario usuario : usuarios) {
            if (usuario.equals((Usuario) obj)) {
                try {
                    this.borrarUsuario(posicion);
                    mensaje="Se elimino correctamente "+usuario;
                } catch (ElementoException ex) {

                    mensaje="No se elimino correctamente";
                    
                }
            }
            posicion++;

        }
        return mensaje;
    }

    @Override
    public String listar() {
        return this.listarUsuario();
    }

    @Override
    public String editar(Object obj)throws ElementoException {
        int posicion = 0;
        String mensaje="";
        for (Usuario usuario : usuarios) {
            if (usuario.equals((Usuario) obj)) {
               
                try {
                    this.editarUsuario(posicion,usuario);
                    mensaje="Se edito correctamente";
                } catch (ElementoException ex) {

                    mensaje="Error al editar";
                }
                
            }

        }
        return mensaje;

    }

    @Override
    public Object buscarPorId(Integer id)throws ElementoException {
        Usuario usua = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getContraseña() == id) {
                usua = (Usuario) usuario;
            }
        }
        return usua;
    }
    
    public void descargar(){
        for(Usuario u: usuarios){
            new SerializarUsuario(u);
        }    
    }
    public void cargar(){
        for(Usuario u: usuarios){
            new DeserializarUsuario(u);
        }
    }
}
