/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.gui;

/**
 *
 * @author User
 */
/*Aqui importamos las excepciones,la clase Scanner, el dominio y el menu principal*/
import ec.edu.uce.modelo.exceptions.DuplicadoException;
import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.GameStore;
import ec.edu.uce.modelo.tienda.genero.Genero;
import java.util.Scanner;

import ec.edu.uce.modelo.tienda.categoria.Categoria;
import ec.edu.uce.util.Validaciones;
import static ec.edu.uce.util.Validaciones.esNumero;
import java.io.Serializable;
import java.util.InputMismatchException;

public class GestionarGenero implements Serializable {

    Validaciones val = new Validaciones();
    /*Detallamos los atributos de la clase gestionarGenero */

    private Scanner leer;
    public final MenuPrincipal menu;
    private final GameStore gameStore;
    public Categoria cat;
    public GestionarUsuario menu2;
    public String N = "";
    public int n = 0;
    public String autor = "";
    public int clave = 0;
//    public String cat = "";
    public Validaciones v;


    /*Creamos la clase gestionarGenero el método Scanner para leer los ec.edu.uce.datos necesarios*/
    public GestionarGenero(GameStore gameStore, MenuPrincipal menu) {
        this.gameStore = gameStore;
        this.menu = menu;
        leer = new Scanner(System.in);

    }


    /*Creamos un menu para mostrar las diferentes opciones que se puede ingresar */
    public void menuGenero(GameStore gast) {

        String opcion;
        /*Utilizamos las excepiones try, catch para detectar y controlar la excepcion de nuestro programa */

        do {
            System.out.println("========================================");
            System.out.println("Bienvenido al ménu de Gestionar Genero");
            System.out.println("Escoja una opción");
            System.out.println("1. Registrar el genero");
            System.out.println("2. Consultar genero");
            System.out.println("3. Buscar genero");
            System.out.println("4. Modificar genero");
            System.out.println("5. Eliminar genero");
            System.out.println("6. Regresar ");
            System.out.print("op: ");
            opcion = leer.next();
            /*Definimos un switch para selecionar entre las 5 opciones del programa*/
            if (!esNumero(opcion)) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
                menuGenero(gast);
                return;
            }
            switch (Integer.parseInt(opcion)) {
                case 1 ->
                    registrarGenero(gast);
                case 2 ->
                    consultarGenero(gast);

                case 3 ->
                    buscarGenero(gast);
                case 4 ->
                    modificarGenero(gast);

                case 5 ->
                    eliminarGenero(gast);
                case 6 ->
                    menu.desplegarMen(gast);
            }

        } while (Integer.parseInt(opcion) != 6);

    }

    public void registrarGenero(GameStore gast) {
        /*Se crea el metodo registrarGenero y validamos con try,catch. Leemos los adatos como nombre del genero, codigo del mismo, etc*/
        int opción;
        try {
            System.out.println("Ingrese la clave del genero");
            clave = leer.nextInt();
            System.out.println("Ingrese el autor del genero");
            autor = leer.next();

            try {

                do {
                    System.out.println("Escoja la Categoria");
                    System.out.println("1. ACCION");
                    System.out.println("2. AVENTURA");
                    System.out.println("3. ARCADE");
                    System.out.println("4. DEPORTE");
                    System.out.println("5. ESTRATEGIA");
                    System.out.println("6. SIMULACION");
                    System.out.println("7. MUSICAL");
                    System.out.println("8. TERROR");
                    System.out.println("9. SHOTTER");
                    System.out.println("10. RPG");
                    opción = leer.nextInt();
                    switch (opción) {
                        case 1:
                            cat = cat.ACCION;
                            break;

                        case 2:
                            cat = cat.AVENTURA;
                            break;

                        case 3:
                            cat = cat.ARCADE;
                            break;

                        case 4:
                            cat = cat.DEPORTE;
                            break;

                        case 5:
                            cat = cat.ESTRATEGIA;
                            break;

                        case 6:
                            cat = cat.SIMULACION;
                            break;

                        case 7:
                            cat = cat.MUSICAL;
                            break;

                        case 8:
                            cat = cat.TERROR;
                            break;

                        case 9:
                            cat = cat.SHOTTER;
                            break;

                        case 10:
                            cat = cat.RPG;
                            break;
                    }

                } while (opción != 1 && opción != 2 && opción != 3 && opción != 4 && opción != 5 && opción != 6 && opción != 7 && opción != 8 && opción != 9 && opción != 10);
            } catch (InputMismatchException e) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");

                registrarGenero(gast);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            Genero g = new Genero(clave, autor, cat);
            try {
                gast.validarGenero(g);
                gast.nuevoGenero(clave, autor, cat);
            } catch (DuplicadoException ex) {
                System.out.println(ex.getMessage() + " " + ex.getObject());
            }

        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarGenero gg = new GestionarGenero(gameStore, menu);
            gg.registrarGenero(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void consultarGenero(GameStore gast) {
        /*Se lista todos los generos registrados*/
        System.out.println(gast.listarGenero());
        /*Al terminar de consultar Genero, se vuelve a mostrar el menu para continuar o salir del mismo*/
        int opc;
        System.out.println("Desea Regresar al ménu: ");
        System.out.println("Ingresar Número ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuGenero(gast);
        } else {

            menu.desplegarMen(gast);
        }

    }

    public void buscarGenero(GameStore gast) {
        try {

            System.out.println(gast.listarGenero());
            int n = 0;
            System.out.println("Ingrese la posicion de su usuario (Empiece desde el numero 0)");
            n = leer.nextInt();
            try {
                gast.buscarGenero(n);
                System.out.println("Su genero es: ");
                System.out.println(gast.buscarGenero(n));
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }
        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarGenero gg = new GestionarGenero(gameStore, menu);
            gg.buscarGenero(gast);
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
            menuGenero(gast);
        } else {
            menu.desplegarMen(gast);
        }

    }

    public void eliminarGenero(GameStore gast) {

        /*Hacemos uso de las excepciones y leemos el genero de la categoria que deseamos eliminar para ello encontramos el genero el en arreglo*/
        try {
            System.out.println(gast.listarGenero());
            int n = 0;
            System.out.println("Ingrese el numero de lista de genero que desea eliminar (Empiece desde el numero 0)");
            n = leer.nextInt();
            try {
                gast.borrarGenero(n);
                System.out.println("Se borro con exito: ");
                System.out.println(gast.listarGenero());
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion " + ex.getPosicion());
            }

        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita los ec.edu.uce.datos correctos  =====");
            GestionarGenero gg = new GestionarGenero(gameStore, menu);
            gg.eliminarGenero(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void modificarGenero(GameStore gast) {
        /*Se crea el metodo eliminar genero, en el cual se agrega los metodos eliminar y registrar genero*/
        int opción;
        System.out.println(gast.listarGenero());
        System.out.println("Escriba el numero de posicion de la lista junto con lo que desea modificar (Empiece desde el numero 0) ");
        int n = 0;
        try {
            System.out.println("Escriba la posicion");
            n = leer.nextInt();
        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            modificarGenero(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Ingrese la clave del genero");
        clave = leer.nextInt();
        System.out.println("Ingrese el autor del genero");
        autor = leer.next();
        try {

            do {
                System.out.println("Escoja la Categoria");
                System.out.println("1. ACCION");
                System.out.println("2. AVENTURA");
                System.out.println("3. ARCADE");
                System.out.println("4. DEPORTE");
                System.out.println("5. ESTRATEGIA");
                System.out.println("6. SIMULACION");
                System.out.println("7. MUSICAL");
                System.out.println("8. TERROR");
                System.out.println("9. SHOTTER");
                System.out.println("10. RPG");
                opción = leer.nextInt();
                switch (opción) {
                    case 1:
                        cat = cat.ACCION;
                        break;

                    case 2:
                        cat = cat.AVENTURA;
                        break;

                    case 3:
                        cat = cat.ARCADE;
                        break;

                    case 4:
                        cat = cat.DEPORTE;
                        break;

                    case 5:
                        cat = cat.ESTRATEGIA;
                        break;

                    case 6:
                        cat = cat.SIMULACION;
                        break;

                    case 7:
                        cat = cat.MUSICAL;
                        break;

                    case 8:
                        cat = cat.TERROR;
                        break;

                    case 9:
                        cat = cat.SHOTTER;
                        break;

                    case 10:
                        cat = cat.RPG;
                        break;
                }

            } while (opción != 1 && opción != 2 && opción != 3 && opción != 4 && opción != 5 && opción != 6 && opción != 7 && opción != 8 && opción != 9 && opción != 10);
            try {
                gast.editarGenero(n, clave, autor, cat);
                System.out.println("Con su modificacion la lista queda:\r\n " + gast.listarGenero());
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException e) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarGenero gg = new GestionarGenero(gameStore, menu);
            gg.modificarGenero(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
