/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.gui;

import ec.edu.uce.modelo.DuplicadoException;
import ec.edu.uce.modelo.ElementoException;
import ec.edu.uce.modelo.GameStore;
import java.util.InputMismatchException;
import java.util.Scanner;

import ec.edu.uce.modelo.Videojuego;
import static ec.edu.uce.modelo.Videojuego.IDIOMA;
import static ec.edu.uce.util.Validaciones.esNumero;
import java.io.Serializable;

/**
 * Aqui importamos la excepciones
 */

/**
 * Detallamos los atributos de la clase gestionarVideojuego
 */
public class GestionarVideojuego implements Serializable{

    public GestionarVideojuego menu3;
    private Scanner leer;
    public final MenuPrincipal menu;
    private final GameStore gameStore;
    public String N = "";
    public int n = 0;
    public String titulo = "";
    public String desarrollador = "";
    public String redactor = "";
    public String idioma = "";
    public int codigo;
    public double precio;

    public GestionarVideojuego(GameStore gameStore, MenuPrincipal menu) {
        this.gameStore = gameStore;
        this.menu = menu;
        leer = new Scanner(System.in);
    }

    /**
     * Creamos un menu para mostrar las diferentes opciones que se puede
     * ingresar Utilizamos el do, while con un parseInt para detectar y
     * controlar la excepcion de nuestro programa Definimos un switch para
     * selecionar entre las 5 opciones del programa
     *
     * @param gast
     */
    public void menuVideojuego(GameStore gast) {
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("Bienvenido al ménu de Gestionar Videojuego");
            System.out.println("Escoja una opción");
            System.out.println("1. Registrar Videojuego");
            System.out.println("2. Consultar Videojuego");
            System.out.println("3. Buscar Videojuego");
            System.out.println("4. Modificar Videojuego");
            System.out.println("5. Eliminar Videojuego");
            System.out.println("6. Salir ");
            System.out.print("op: ");
            opcion = leer.next();
            if (!esNumero(opcion)) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
                menuVideojuego(gast);
                return;
            }
            switch (Integer.parseInt(opcion)) {
                case 1 ->
                    registrarVideojuego(gast);
                case 2 ->
                    consultarVideojuego(gast);

                case 3 ->
                    buscarVideojuego(gast);
                case 4 ->
                    modificarVideojuego(gast);
                case 5 ->
                    eliminarVideojuego(gast);
                case 6 ->
                    menu.desplegarMen(gast);
            }

        } while (Integer.parseInt(opcion) != 6);

    }

    /**
     * Se crea el metodo registrarVideojuego y validamos con el if,else.Leemos
     * los adatos como Nombre del videojuego y el codigo del mismo
     *
     * @param gast
     */
    public void registrarVideojuego(GameStore gast) {

        System.out.println("--------------- REGISTRO DE VIDEOJUEGO --------------");
        try {
            System.out.println("Ingrese el titulo del videojuego");
            titulo = leer.next();
            System.out.println("Ingrese el desarrolador del videojuego");
            desarrollador = leer.next();
            System.out.println("Ingrese el redactor del videojuego");
            redactor = leer.next();

            idioma = IDIOMA;
            System.out.println("Ingrese el codigo del videojuego");
            codigo = leer.nextInt();
            System.out.println("Ingrese el precio del videojuego");
            precio = leer.nextDouble();

            Videojuego v = new Videojuego(titulo, desarrollador, redactor, idioma, codigo, precio);
            try {
                gast.validarVideojuego(v);
                gast.nuevoVideojuego(titulo, desarrollador, redactor, idioma, codigo, precio);
            } catch (DuplicadoException ex) {
                System.out.println(ex.getMessage() + " " + ex.getObj());

            }

        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarVideojuego gv = new GestionarVideojuego(gameStore, menu);
            gv.registrarVideojuego(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * Además se verifica que el videojuego exista.Al terminar de consultar
     * sobre el videojuego, se vuelve a mostrar el menu para continuar o salir
     * del mismo
     *
     * @param gast
     */
    public void consultarVideojuego(GameStore gast) {
        /*Del mismo modo se valida con excepciones y leemos el clave,autor y categoria del genero. Además se verifica que el codigo se haya encontrado */

        System.out.println(gast.listarVideojuego());
        System.out.println("Hay " + GameStore.cont1 + " videojuegos regitrados ");

        /*Al terminar de consultar Genero, se vuelve a mostrar el menu para continuar o salir del mismo*/
        int opc;
        System.out.println("Desea Regresar al menu: ");
        System.out.println("Ingresar Numero ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuVideojuego(gast);
        } else {

            menu.desplegarMen(gast);
        }

    }

    /**
     * Se crea el metodo modificarVideojuego, en el cual se modifica por codigo
     * el videojuego
     *
     * @param gast
     */
    public void modificarVideojuego(GameStore gast) {

        System.out.println(gast.listarVideojuego());
        System.out.println("Escriba el numero de la posicion del videojuego que desea modificar ");

        try {
            System.out.println("Escriba la posicion del videojuego (Empiece desde el numero 0)");
            int n = 0;
            n = leer.nextInt();

            System.out.println("Ingrese el titulo del videojuego");
            titulo = leer.next();
            System.out.println("Ingrese el desarrolador del videojuego");
            desarrollador = leer.next();
            System.out.println("Ingrese el redactor del videojuego");
            redactor = leer.next();

            idioma = IDIOMA;
            System.out.println("Ingrese el codigo del videojuego");
            codigo = leer.nextInt();
            System.out.println("Ingrese el precio del videojuego");
            precio = leer.nextDouble();
            try {
                gast.editarVideojuego(n, titulo, desarrollador, redactor, idioma, codigo, precio);
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

            System.out.println("Con su modificacion la lista queda:\r\n " + gast.listarVideojuego());
        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarVideojuego gv = new GestionarVideojuego(gameStore, menu);
            gv.modificarVideojuego(gast);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * Definimos las variable codigo y encontramos Hacemos uso de las
     * excepciones y seleccionamos lo que deseamos eliminar
     *
     * @param gast
     */
    public void eliminarVideojuego(GameStore gast) {
        try {
            System.out.println(gast.listarVideojuego());

            System.out.println("Ingrese la posicion del videojuego que desea eliminar (Empiece desde el numero 0)");
            int n = 0;
            n = leer.nextInt();
            try {
                gast.borrarVideojuego(n);
                System.out.println("Se borro con exito: ");
                System.out.println(gast.listarVideojuego());
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita los ec.edu.uce.datos correctos =====");
            GestionarVideojuego gv = new GestionarVideojuego(gameStore, menu);
            gv.eliminarVideojuego(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void buscarVideojuego(GameStore gast) {

        try {

            System.out.println("Ingrese la posicion de su videojuego (Empiece desde el numero 0)");

            codigo = leer.nextInt();
            try {
                gast.buscarVideojuego(codigo);
                System.out.println("Su videojuego es: ");
                System.out.println(gast.buscarVideojuego(codigo));
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarVideojuego gv = new GestionarVideojuego(gameStore, menu);
            gv.buscarVideojuego(gast);
           
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        /*Al terminar de consultar Videojuego, se vuelve a mostrar el menu para continuar o salir del mismo*/
        int opc;
        System.out.println("Desea Regresar al menu: ");
        System.out.println("Ingresar Numero ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuVideojuego(gast);
        } else {

            menu.desplegarMen(gast);
        }

    }

}
