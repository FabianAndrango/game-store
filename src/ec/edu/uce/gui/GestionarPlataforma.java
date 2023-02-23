///Importación de las excepciones,la clase Scanner, el dominio y el menu principal
package ec.edu.uce.gui;

import ec.edu.uce.modelo.tienda.Consola;
import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.GameStore;
import ec.edu.uce.modelo.tienda.Pc;
import ec.edu.uce.modelo.tienda.Plataforma;
import ec.edu.uce.modelo.tienda.Requerimiento;
import ec.edu.uce.modelo.tienda.Videojuego;
import ec.edu.uce.util.Validaciones;
import static ec.edu.uce.util.Validaciones.esNumero;
import java.io.Serializable;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestionarPlataforma implements Serializable {

    //Atributos de la clase gestionarPlataforma
    Validaciones val = new Validaciones();
    private Scanner leer;
    public final MenuPrincipal menu;
    private final Videojuego videojuego;
    public GestionarPlataforma gesv;
    private final GameStore gameStore;
    public Requerimiento requerimiento;
    public int n = 0;
    //public int codigo;
    public String empresaTitular = "";
    public boolean multiplataforma;
    public int espacioNecesario;
    public int memoriaRam;
    public String procesador = "";
    public String tarjetaGrafica = "";

    //Clase Gestionar plataforma con el metodo Scanner para poder ingresar ec.edu.uce.datos
    public GestionarPlataforma(GameStore gameStore, Videojuego videojuego, MenuPrincipal menu) {
        this.videojuego = videojuego;
        this.menu = menu;
        this.gameStore = gameStore;
        leer = new Scanner(System.in);
    }

    //Menu de Plataforma para manejar de manera ordenada las opciones
    public void menuPlataforma(GameStore gast, Videojuego videojuego) throws ElementoException {
        String opcion;
        //Utilizamos las excepiones try, catch para detectar y controlar la excepcion de nuestro programa

        do {
            System.out.println("========================================");
            System.out.println("Bienvenido al ménu de Gestionar Plataforma");
            System.out.println("Escoja una opción");
            System.out.println("1. Registrar una Plataforma");
            System.out.println("2. Editar una Plataforma");
            System.out.println("3. Consultar una Plataforma");
            System.out.println("4. Buscar una Plataforma");
            System.out.println("5. Eliminar una Plataforma");
            System.out.println("6. Regresar ");
            System.out.print("op: ");
            opcion = leer.next();
            //Definimos un switch para selecionar entre las 5 opciones del programa
            if (!esNumero(opcion)) {
                System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
                menuPlataforma(gast, videojuego);
                return;
            }
            switch (Integer.parseInt(opcion)) {
                case 1 ->
                    registrarPlataforma(gast, videojuego);
                case 2 ->
                    modificarPlataforma(gast, videojuego);
                case 3 ->
                    consultarPlataforma(gast, videojuego);
                case 4 ->
                    buscarPlataforma(gast, videojuego);

                case 5 ->
                    eliminarPlataforma(gast, videojuego);
                case 6 ->
                    menu.desplegarMen(gast);
            }

        } while (Integer.parseInt(opcion) != 6);

    }

    //Metodo Registrar plataforma, permite llenar los atributos de la clase plataforma
    public void registrarPlataforma(GameStore gast, Videojuego videojuego) {

        /*Utilizamos la excepiones para verificar los ec.edu.uce.datos del programa*/
        try {
            /*Leemos el codigo del prestamo, la fecha del prestamo y su vigencia*/

            System.out.println("Bienvenido registre su plataforma del videojuego");
            System.out.println("Ingrese la empresa titular ");
            empresaTitular = leer.next();
            System.out.println("Ingrese si es multiplataforma(si = true, no = false)");
            multiplataforma = leer.nextBoolean();
            System.out.println("Ingrese el numero de gb que desea ingresar ");
            espacioNecesario = leer.nextInt();
            System.out.println("Ingrese el numero de Memoria Ram que necesita el videojuego");
            memoriaRam = leer.nextInt();
            System.out.println("Ingrese el procesador que requiere el videojuego ");
            procesador = leer.next();
            System.out.println("Ingrese el nombre de la tarjeta Grafica que el videojuego necesita ");
            tarjetaGrafica = leer.next();

//                videojuego.nuevaPlataforma(empresaTitular, multiplataforma, espacioNecesario, memoriaRam, procesador, tarjetaGrafica);
            videojuego.nuevaPlataforma(empresaTitular, multiplataforma, new Requerimiento(espacioNecesario, memoriaRam, procesador, tarjetaGrafica));
            Plataforma p = new Pc();
            p.play();
            Plataforma c = new Consola();
            c.play();

            System.out.println("La base de ec.edu.uce.datos esta llena");

            System.out.println("Recuerde que posteriormente este codigo se le solicitara para consultar, modificar o eliminar");
            /*Atrapamos los errores y desplegamos los mesajes indicando que ha ocurrido en el momento de ejecución*/
        } catch (InputMismatchException e) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarPlataforma gp = new GestionarPlataforma(gameStore, videojuego, menu);
            gp.registrarPlataforma(gast, videojuego);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    //El metodo modificar cumple las funciones de eliminar y registrar al mismo tiempo por lo que se referencia a ambos
    public void modificarPlataforma(GameStore gast, Videojuego videojuego) throws ElementoException {
        /*Se escoge la posicion del cual el usuario desea modificar y al poner la posicion que desea lo modifica como un registrar otra vez*/
        System.out.println(videojuego.listarPlataforma());
        System.out.println("Escriba el numero de posicion de la lista junto con lo que desea modificar (Empiece desde el numero 0) ");
        int n = 0;
        try {
            System.out.println("Escriba la posicion");
            n = leer.nextInt();
        } catch (InputMismatchException ie) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarPlataforma gp = new GestionarPlataforma(gameStore, videojuego, menu);
            gp.consultarPlataforma(gast, videojuego);
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

        System.out.println("Ingrese la empresa titular ");
        empresaTitular = leer.next();
        System.out.println("Ingrese si es multiplataforma(si = true, no = false)");
        multiplataforma = leer.nextBoolean();
        System.out.println("Ingrese el numero de gb que desea ingresar ");
        espacioNecesario = leer.nextInt();
        System.out.println("Ingrese el numero de Memoria Ram que necesita el videojuego");
        memoriaRam = leer.nextInt();
        System.out.println("Ingrese el procesador que requiere el videojuego ");
        procesador = leer.next();
        System.out.println("Ingrese el nombre de la tarjeta Grafica que el videojuego necesita ");
        tarjetaGrafica = leer.next();
        try {
            videojuego.editarPlataforma(n, empresaTitular, multiplataforma, new Requerimiento(espacioNecesario, memoriaRam, procesador, tarjetaGrafica));
        } catch (ElementoException ex) {
            System.out.println(ex.getMessage() + " Posicion " + ex.getPosicion());
        }

        System.out.println("Con su modificacion la lista queda:\r\n " + videojuego.listarPlataforma());

    }

//Metodo Consultar Plataforma, permite listar la informacion de todos los objetos de la clase plataforma
    public void consultarPlataforma(GameStore gast, Videojuego videojuego) throws ElementoException {
        /*Se lista todos los generos registrados*/
        System.out.println(videojuego.listarPlataforma());
        /*Al terminar de consultar Genero, se vuelve a mostrar el menu para continuar o salir del mismo*/
        int opc;
        System.out.println("Desea Regresar al ménu: ");
        System.out.println("Ingresar Número ");
        System.out.println("1.Si ");
        System.out.println("2.No ");
        System.out.println("op: ");
        opc = leer.nextInt();
        if (opc == 1) {
            menuPlataforma(gast, videojuego);
        } else {

            menu.desplegarMen(gast);
        }

    }

//Metodo Buscar Plataforma, permite consultar la informacion de los atributos de un objeto de la clase plataforma
    private void buscarPlataforma(GameStore gast, Videojuego videojuego) throws ElementoException {
        /*Se utliza las excepciones try y catch*/
        try {
            System.out.println(videojuego.listarPlataforma());
            int n = 0;
            System.out.println("Ingrese la posicion de su plataforma (Recuerde que desde el numero 0 se escribe la posicion)");
            n = leer.nextInt();
            try {
                videojuego.buscarPlataforma(n);
                System.out.println("Su plataforma es: ");
                System.out.println(videojuego.buscarPlataforma(n));
            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }

        } catch (InputMismatchException ime) {
            System.err.println(" ===== Solamente tendra acceso si ingresa los ec.edu.uce.datos correctamente  =====");
            GestionarPlataforma gp = new GestionarPlataforma(gameStore, videojuego, menu);
            gp.buscarPlataforma(gast, videojuego);

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
            menuPlataforma(gast, videojuego);
        } else {

            menu.desplegarMen(gast);
        }

    }

    private void eliminarPlataforma(GameStore gast, Videojuego videojuego) {
        /*definimos las variables para leer los ec.edu.uce.datos necesarios y utlizarlos como contadores*/

        try {
            /*Utilizamos las excepciones try y catch*/
            System.out.println(videojuego.listarPlataforma());
            int n = 0;
            System.out.println("Ingrese el numero de posicion de plataforma que desea eliminar (Recuerde que desde el numero 0 se escribe la posicion)");
            n = leer.nextInt();
            try {
                videojuego.borrarPlataforma(n);
                System.out.println("Se borro con exito: ");
                System.out.println(videojuego.listarPlataforma());

            } catch (ElementoException ex) {
                System.out.println(ex.getMessage() + " Posicion: " + ex.getPosicion());
            }
        } catch (InputMismatchException e) {
            System.err.println(" ===== Solamente tendra acceso si digita numeros =====");
            GestionarPlataforma gp = new GestionarPlataforma(gameStore, videojuego, menu);
            gp.eliminarPlataforma(gast, videojuego);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
