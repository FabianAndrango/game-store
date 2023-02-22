package ec.edu.uce.gui;

import ec.edu.uce.modelo.GameStore;
import ec.edu.uce.modelo.Prestamo;
import ec.edu.uce.modelo.Usuario;
import ec.edu.uce.modelo.Videojuego;
import java.util.Scanner;
import java.util.InputMismatchException;
//import java.io.IOException;

public class MenuPrincipal {

    private int opcion;
    private Scanner leer;

//    public GestionarPropietario gepr;
    public GestionarUsuario gesu;
    public GestionarVideojuego gese;
    public GestionarPrestamo gesp;
    public GestionarGenero gesc;
//    public GestionarResenia gesf;
    public GestionarPlataforma gesv;
    public Prestamo item;
    public GameStore gast;
    public Videojuego videojuego;
    public Usuario usuario;

    public MenuPrincipal() {
        gast = new GameStore();
        usuario = new Usuario();
        videojuego = new Videojuego();
        item= new Prestamo();

        gesu = new GestionarUsuario(gast, this);
        gese = new GestionarVideojuego(gast, this);
        gesp = new GestionarPrestamo(gast, usuario, this, item, videojuego);
        gesc = new GestionarGenero(gast, this);
        gesv = new GestionarPlataforma(gast, videojuego, this);

        leer = new Scanner(System.in);
    }

    public void desplegarMen(GameStore gast) {

        try {

            do {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("            BIENVENIDO AL SISTEMA DE GAME STORE *G.S*                ");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("\n1.Gestionar Usuario");
                System.out.println("\n2.Gestionar Videojuego");

                System.out.println("\n3.Gestionar Prestamo");
                System.out.println("\n4.Gestionar Plataforma");
                System.out.println("\n5.Gestionar Genero");

                System.out.println("RECUERDE DE CREAR EL USUARIO PRIMERO PARA SEGUIR CON LAS SIGUIENTES OPCIONES");

                System.out.println("\n6.Salir ");

                System.out.print("Op: ");
                opcion = leer.nextInt();
                System.out.println("------------------------------------------------");
                System.out.println("------------------------------------------------");
                switch (opcion) {

                    case 1:
                        gesu.menuUsuario(gast);
                        

                        break;

                    case 2:

                        gese.menuVideojuego(gast);
                        break;

                    case 3:
                        //seleccione el usuario
                        System.out.println("Seleccione el Usuario");
                        System.out.println(gast.listarUsuario());
                       int e = leer.nextInt();
                        //ingrese la posicion
                        usuario = gast.buscarUsuario(e);
                        gesp.menuPrestamo(gast, usuario, item, videojuego);
                        break;
                    case 4:

                        System.out.println("Seleccione el videojuego");
                        System.out.println(gast.listarVideojuego());
                        int i = leer.nextInt();
                        videojuego = gast.buscarVideojuego(i);
                        gesv.menuPlataforma(gast, videojuego);
                        break;
                    case 5:

                        gesc.menuGenero(gast);
                        break;


                    case 6:
                        System.out.println("Hasta la proxima");
                        System.exit(0);
                        break;

                }
            } while (opcion != 6);
        } catch (InputMismatchException e) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            MenuPrincipal mn = new MenuPrincipal();
            mn.desplegarMen(gast);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
