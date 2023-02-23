package ec.edu.uce.vistas;

/*Importamos las excepciones,validaciones , la clase gameStore, propietario, scanner, Formato fecha, calendario*/
import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.GameStore;
import ec.edu.uce.modelo.items.Prestamo;
import ec.edu.uce.utilidades.Validaciones;

import java.util.Scanner;
import java.util.InputMismatchException;
import ec.edu.uce.modelo.usuario.Usuario;
import ec.edu.uce.modelo.tienda.Videojuego;
import static ec.edu.uce.utilidades.Validaciones.esNumero;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;

public class GestionarPrestamo implements Serializable {

    /*Se define la clase Gestionar Prestamo y se crea el metodo validacion,se define el arreglo de codigo, fecha,vigencia. */
    public final MenuPrincipal menu;
    private final Usuario usuario;
    private final GameStore gameStore;
    private final Videojuego videojuego;
    Validaciones val = new Validaciones();
    private Scanner leer;
    public GestionarPrestamo gesp;
    private final Prestamo item;
    public int n = 0;
    public int cant;
    public double total;
    public LocalDate fecha;
    public LocalDate vigencia;
    public int anio;
    public int mes;
    public int dia;
    public int anio1;
    public int mes1;
    public int dia1;
    public double subtotal;

    public int pos;
    public int m = 0;


    /*Se crea el metodo para leer los ec.edu.uce.datos requeridos en el programa*/
    public GestionarPrestamo(GameStore gameStore, Usuario usuario, MenuPrincipal menu, Prestamo item, Videojuego videojuego) {
        this.gameStore = gameStore;
        this.usuario = usuario;
        this.menu = menu;
        this.item = item;
        this.videojuego = videojuego;
        leer = new Scanner(System.in);
    }

    /*Se establece el metodo menuPrestamo el cual motrara las diferentes opciones del programa*/
    public void menuPrestamo(GameStore gast, Usuario usuario, Prestamo item, Videojuego videojuego) throws ElementoException {
        /*Definimos la variable op para leer la opcion que se escoje*/
        String opcion;
        /*Llamamos al menu principal y usamos las excepciones para controlar errores al ingresar lso ec.edu.uce.datos*/

        do {
            System.out.println("========================================");
            System.out.println("Bienvenido al ménu de Gestrionar Prestamo");
            System.out.println("Escoja una opción");
            System.out.println("1. Registrar un Prestamo");
            System.out.println("2. Consultar un Prestamo");
            System.out.println("3. Buscar un Prestamo");
            System.out.println("4. Modificar un Prestamo");
            System.out.println("5. Eliminar un Prestamo");
            System.out.println("6. Salir ");
            System.out.print("op: ");
            opcion = leer.next();
            if (!esNumero(opcion)) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
                menuPrestamo(gast, usuario, item, videojuego);
                return;
            }
            switch (Integer.parseInt(opcion)) {
                case 1 ->
                    registrarPrestamo(gast, usuario, item, videojuego);
                case 2 ->
                    consultarPrestamo(gast, usuario, item, videojuego);
                case 3 ->
                    buscarPrestamo(gast, usuario, item, videojuego);
                case 4 ->
                    modificarPrestamo(gast, usuario, item, videojuego);
                case 5 ->
                    eliminarPrestamo(gast, usuario, item, videojuego);
                case 6 ->
                    menu.desplegarMen(gast);
            }

        } while (Integer.parseInt(opcion) != 6);
    }

    public void registrarPrestamo(GameStore gast, Usuario usuario, Prestamo item, Videojuego videojuego) throws ElementoException {

        /*Utilizamos la excepiones para verificar los ec.edu.uce.datos del programa*/
 /*Leemos el codigo del prestamo, la fecha del prestamo y su vigencia*/
        System.out.println("Seleccione el videojuego");
        System.out.println(gast.listarVideojuego());
        int i = leer.nextInt();
        videojuego = gast.buscarVideojuego(i);
        try {

            System.out.println("Ingrese la cantidad ");
            cant = leer.nextInt();

            System.out.println("Su fecha de prestamo es: ");
            System.out.println("Ingrese el anio (El anio solo ingrese como el ejemplo 2023)");
            anio = leer.nextInt();
            System.out.println("Ingrese el mes ");
            mes = leer.nextInt();
            System.out.println("Ingrese el dia ");
            dia = leer.nextInt();
            System.out.println("Vigente hasta:");
            System.out.println("Ingrese el anio (El anio solo ingrese como el ejemplo 2023)");
            anio1 = leer.nextInt();
            System.out.println("Ingrese el mes desde 1 - 12 ");
            mes1 = leer.nextInt();
            System.out.println("Ingrese el dia 1 - 31");
            dia1 = leer.nextInt();

            item.nuevoItemPrestamo(cant, subtotal, videojuego);
            usuario.nuevoPrestamo(LocalDate.of(anio, Month.of(mes), dia),
                    LocalDate.of(anio1, Month.of(mes1), dia1), cant, total);
            System.out.println("Recuerde que posteriormente este codigo se le solicitara para consultar, modificar o eliminar");
        } catch (InputMismatchException ime) {
            System.err.println(" ===== Solamente tendra acceso si ingresa los ec.edu.uce.datos correctamente  =====");
            GestionarPrestamo gp= new GestionarPrestamo(gameStore,usuario,  menu,  item,  videojuego);
            gp.registrarPrestamo(gast, usuario, item, videojuego);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void modificarPrestamo(GameStore gast, Usuario usuario, Prestamo item, Videojuego videojuego) {
        /*Se define el metodo modificarPrestamo y utlizamos los metodos eliminar y registrar prestamo*/
        System.out.println(usuario.listarPrestamo());
        try {
            System.out.println("Ingresa la posicion");
            pos = leer.nextInt();

            System.out.println("Ingrese la cantidad ");
            cant = leer.nextInt();

            System.out.println("Su fecha de prestamo es: ");
            System.out.println("Ingrese el anio (El anio solo ingrese como el ejemplo 2023)");
            anio = leer.nextInt();
            System.out.println("Ingrese el mes ");
            mes = leer.nextInt();
            System.out.println("Ingrese el dia");
            dia = leer.nextInt();
            System.out.println("Vigente hasta:");
            System.out.println("Ingrese el anio (El anio solo ingrese como el ejemplo 2023)");
            anio1 = leer.nextInt();
            System.out.println("Ingrese el mes desde 1 - 12 ");
            mes1 = leer.nextInt();
            System.out.println("Ingrese el dia 1 - 31");
            dia1 = leer.nextInt();
            try {
                item.editarItemPrestamo(pos, cant, subtotal);
                usuario.editarPrestamo(pos, LocalDate.of(anio, Month.of(mes), dia), LocalDate.of(anio1, Month.of(mes1), dia1), cant, total);
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

            System.out.println("Con su modificacion la lista queda:\r\n " + usuario.listarPrestamo());
        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita los ec.edu.uce.datos correctos =====");
            GestionarPrestamo gp= new GestionarPrestamo(gameStore,usuario,  menu,  item,  videojuego);
            gp.modificarPrestamo(gast, usuario, item, videojuego);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void consultarPrestamo(GameStore gast, Usuario usuario, Prestamo item, Videojuego videojuego) throws ElementoException {
        /*Se utliza las excepciones try y catch*/

        System.out.println(usuario.listarPrestamo());
        System.out.println(item.listarItemPrestamo());

        /*Al terminar de consultar Genero, se vuelve a mostrar el menu para continuar o salir del mismo*/
        int opc;
        System.out.println("Desea Regresar al menu: ");
        System.out.println("Ingresar Numero ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuPrestamo(gast, usuario, item, videojuego);
        } else {
            menu.desplegarMen(gast);
        }

    }

    public void eliminarPrestamo(GameStore gast, Usuario usuario, Prestamo item, Videojuego videojuego) {
        /*definimos las variables para leer los ec.edu.uce.datos necesarios y utlizarlos como contadores*/

        try {
            /*Utilizamos las excepciones try y catch*/
            System.out.println(usuario.listarPrestamo());
            System.out.println(item.listarItemPrestamo());
            int n = 0;
            System.out.println("Ingrese el numero de lista de prestamo que desea eliminar (Empiece desde el numero 0)");
            n = leer.nextInt();
            try {
                usuario.borrarPrestamo(n);
                System.out.println("Se borro con exito: ");
                System.out.println(usuario.listarPrestamo());
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

            System.out.println("Ingrese el numero de lista de item prestamo que desea eliminar");
            int m = leer.nextInt();
            try {
                item.borrarItemPrestamo(m);
                System.out.println("Se borro con exito: ");
                System.out.println(item.listarItemPrestamo());
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException ime) {
            System.err.println(" ===== Solamente tendra acceso si ingresa los ec.edu.uce.datos correctamente  =====");
            GestionarPrestamo gp= new GestionarPrestamo(gameStore,usuario,  menu,  item,  videojuego);
            gp.eliminarPrestamo(gast, usuario, item, videojuego);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private void buscarPrestamo(GameStore gast, Usuario usuario, Prestamo item, Videojuego videojuego) throws ElementoException {

        try {

            int n = 0;
            System.out.println("Ingrese la posicion de su prestamo (Empiece desde el numero 0)");
            n = leer.nextInt();
            try {
                usuario.buscarPrestamo(n);
                System.out.println("Su prestamo es: ");
                System.out.println(usuario.buscarPrestamo(n));
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }
            System.out.println("Ingrese la posicion de su item prestamo");
            m = leer.nextInt();
            try {
                item.buscarItemPrestamo(m);
                System.out.println("Su item prestamo es: ");
                System.out.println(item.buscarItemPrestamo(m));
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException ime) {
            System.err.println(" ===== Solamente tendra acceso si ingresa los ec.edu.uce.datos correctamente  =====");
            GestionarPrestamo gp= new GestionarPrestamo(gameStore,usuario,  menu,  item,  videojuego);
            gp.buscarPrestamo(gast, usuario, item, videojuego);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        /*Al terminar de consultar Genero, se vuelve a mostrar el menu para continuar o salir del mismo*/
        int opc;
        System.out.println("Desea Regresar al menu: ");
        System.out.println("Ingresar Numero ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuPrestamo(gast, usuario, item, videojuego);
        } else {
            menu.desplegarMen(gast);
        }

    }
}
