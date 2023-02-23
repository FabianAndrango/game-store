package ec.edu.uce.gui;

import ec.edu.uce.modelo.exceptions.DuplicadoException;
import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.GameStore;
import java.util.InputMismatchException;
import ec.edu.uce.modelo.usuario.Usuario;
import ec.edu.uce.modelo.usuario.GeneroHumano;
import java.util.Scanner;
import ec.edu.uce.util.Validaciones;
import static ec.edu.uce.util.Validaciones.esNumero;
import java.io.Serializable;

public class GestionarUsuario implements Serializable{

    Validaciones val = new Validaciones();

    private Scanner leer;
    private final MenuPrincipal menu;
    private final GameStore gameStore;
    public GestionarUsuario menu2;
    public String N = "";
    public int n = 0;
    public String nombre = "";
    public String apellido = "";
    public int contrasenia;
    public GeneroHumano genero;
    public String[] serv = new String[20];

    public GestionarUsuario(GameStore gameStore, MenuPrincipal menu) {
        this.gameStore = gameStore;
        this.menu = menu;
        leer = new Scanner(System.in);
    }

    /**
     * Este metodo se ocupa por mediante Teclado por un menu en el que el
     * Usuario debe colocar Como tambien sde usa las sentencias de Try-catch y
     * do-while para su respectivas introducion y validacion para el usuario
     *
     *
     */
    public void menuUsuario(GameStore gast) {
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("Bienvenido al ménu de Administrar Usuario");
            System.out.println("Escoja una opción");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Modificar un usuario");
            System.out.println("3. Buscar un usuario");
            System.out.println("4. Consultar un usuario");
            System.out.println("5. Eliminar un usuario");
            System.out.println("6. Regresar ");
            System.out.print("op: ");
            opcion = leer.next();
            if (!esNumero(opcion)) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
                menuUsuario(gast);
                return;
            }
            switch (Integer.parseInt(opcion)) {
                case 1 ->
                    registrarUsuario(gast);
                case 2 ->
                    modificarUsuario(gast);
                case 3 ->
                    buscarUsuario(gast);
                case 4 ->{
                    gast.cargar();
                    consultarUsuario(gast);
                }
                    
                case 5 ->
                    eliminarUsuario(gast);
                case 6 ->{
                    gast.descargar();
                    menu.desplegarMen(gast);
                    }
                //case default 
                        //break;
            }

        } while (Integer.parseInt(opcion) != 6);
    }

    public void registrarUsuario(GameStore gast) {
        int opción;
        try {

            System.out.println("Ingrese su nombre");
            nombre = leer.next();
            System.out.println("Ingrese su apellido");
            apellido = leer.next();
            System.out.println("Ingrese contrasenia");
            contrasenia = leer.nextInt();

            try {

                do {
                    System.out.println("Escoja su Genero");
                    System.out.println("1. MASCULINO");
                    System.out.println("2. FEMENINO");
                    opción = leer.nextInt();
                    switch (opción) {
                        case 1:
                            genero = genero.MASCULINO;
                            break;

                        case 2:
                            genero = genero.FEMENINO;
                            break;
                    }

                } while (opción != 1 && opción != 2);
            } catch (InputMismatchException e) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
                GestionarUsuario gu = new GestionarUsuario(gameStore, menu);
                gu.registrarUsuario(gast);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            Usuario u = new Usuario(nombre, apellido, contrasenia, genero);

            try {
                gast.validarUsuario(u);
                gast.nuevoUsuario(nombre, apellido, contrasenia, genero);
            } catch (DuplicadoException ex) {
                System.out.println(ex.getMessage() + " " + ex.getObject());
            }

        } catch (InputMismatchException e) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarUsuario gu = new GestionarUsuario(gameStore, menu);
            gu.registrarUsuario(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void modificarUsuario(GameStore gast) {

        int opción;
        System.out.println(gast.listarUsuario());
        try {

            System.out.println("Escriba el numero de posicion de la lista junto con lo que desea modificar ");
            System.out.println("Escriba la posicion (Empiece desde el numero 0)");
            int n = 0;

            n = leer.nextInt();

            System.out.println("Ingrese el nombre del usuario");
            nombre = leer.next();
            System.out.println("Ingrese el apellido del usuario");
            apellido = leer.next();
            System.out.println("Ingrese la contrasenia del usuario");
            contrasenia = leer.nextInt();

            try {

                do {
                    System.out.println("Escoja su Genero");
                    System.out.println("1. MASCULINO");
                    System.out.println("2. FEMENINO");
                    opción = leer.nextInt();
                    switch (opción) {
                        case 1:
                            genero = genero.MASCULINO;
                            break;

                        case 2:
                            genero = genero.FEMENINO;
                            break;
                    }

                } while (opción != 1 && opción != 2);
            } catch (InputMismatchException e) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
                GestionarUsuario gu = new GestionarUsuario(gameStore, menu);
                gu.modificarUsuario(gast);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                gast.editarUsuario(n, nombre, apellido, contrasenia, genero);
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());

            }

            System.out.println("Con su modificacion la lista queda:\r\n " + gast.listarUsuario());
        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarUsuario gu = new GestionarUsuario(gameStore, menu);
            gu.modificarUsuario(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void consultarUsuario(GameStore gast) {
        /*Se lista todos los generos registrados*/
        System.out.println(gast.listarUsuario());
        System.out.println("Hay " + GameStore.cont + " usuarios registrados");
        /*Al terminar de consultar Genero, se vuelve a mostrar el menu para continuar o salir del mismo*/
        int opc;
        System.out.println("Desea Regresar al ménu: ");
        System.out.println("Ingresar Número ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuUsuario(gast);
        } else {

            menu.desplegarMen(gast);
        }

    }

    //Metodo Buscar Usuario, permite consultar la informacion de los atributos de un objeto de la clase plataforma
    private void buscarUsuario(GameStore gast) {
        /*Se utliza las excepciones try y catch*/
        try {

            int n = 0;
            System.out.println("Ingrese la posicion de su Usuario (Recuerde que desde el numero 0 se escribe la posicion)");
            n = leer.nextInt();
            try {
                gast.buscarUsuario(n);
                System.out.println("Su usuario es: ");
                System.out.println(gast.buscarUsuario(n));
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException ime) {
            System.err.println(" ===== Solamente tendra acceso si ingresa los ec.edu.uce.datos correctamente  =====");
            GestionarUsuario gu = new GestionarUsuario(gameStore, menu);
            gu.buscarUsuario(gast);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        /*Al terminar de consultar Genero, se vuelve a mostrar el menu para continuar o salir del mismo*/

        int opc;
        System.out.println("Desea Regresar al ménu: ");
        System.out.println("Ingresar Número ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuUsuario(gast);
        } else {

            menu.desplegarMen(gast);
        }

    }

    /*
    Se crea un metodo eliminarUsuario
    Para eliminar por la posicion
    Donde se agrega un Exception donde dara un mensaje si  
    por teclado se escribe una posicion fura de rango
     */
    public void eliminarUsuario(GameStore gast) {

        try {
            System.out.println(gast.listarUsuario());
            int n = 0;

            System.out.println("Ingrese el numero de lista de usuario que desea eliminar (Empiece desde el numero 0)");

            n = leer.nextInt();
            try {
                gast.borrarUsuario(n);
                System.out.println("Se borro con exito: ");
                System.out.println(gast.listarUsuario());

            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException e) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarUsuario gu = new GestionarUsuario(gameStore, menu);
            gu.eliminarUsuario(gast);
 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
