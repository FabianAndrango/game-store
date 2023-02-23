package ec.edu.uce.testeo;

import ec.edu.uce.modelo.exceptions.DuplicadoException;
import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.GameStore;
import ec.edu.uce.modelo.tienda.genero.Genero;
import ec.edu.uce.modelo.usuario.Usuario;
import ec.edu.uce.modelo.tienda.Videojuego;
import ec.edu.uce.modelo.usuario.GeneroHumano;
import ec.edu.uce.modelo.tienda.categoria.Categoria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Sahid
 */
public class TestGameStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DuplicadoException, ElementoException {
        // TODO code application logic here

//        testConstructor();
//        
//        testGetSet();
        GameStore z = new GameStore();

        System.out.println("Genero: ");

        z.nuevoGenero(2225, "Kevin Opr.", Categoria.ACCION );
        z.nuevoGenero(2585, "C. Lucke", Categoria.MUSICAL);
        z.nuevoGenero(285, "S. Wolf", Categoria.RPG);

        System.out.println("Listar Genero \r\n" + z.listarGenero());

//        System.out.println("Buscar Genero \r\n" + z.buscarGenero(2));
//
//        z.editarGenero(2, 254656, "R. Ayol", "Deporte");
//        System.out.println("\r\n" + "Modificar Genero \r\n" + z.listarGenero());
//
//        z.borrarGenero(1);
//        System.out.println("\r\n" + "Eliminar Genero \r\n" + z.listarGenero());
        System.out.println("Videojuego: ");
        z.nuevoVideojuego("God of war", "Activicion ", "C. Barlok", "Español", 122, 22);
        z.nuevoVideojuego("Cod", "Activicion ", "W. Dafoe", "Español", 255, 22);
        z.nuevoVideojuego("Resident Evil", "Sony", "C. Ray", "Aleman", 10, 222);

        System.out.println("Listar Videojuego \r\n" + z.listarVideojuego());
//
//        System.out.println("Buscar Videojuego \r\n" + z.buscarVideojuego(2));
//        z.editarVideojuego(1, "League of Leyends", "Acne", "J. Crasimsky", "Ingles", 55,55);
//        System.out.println("\r\n" + "Modificar Videojuego \r\n" + z.listarVideojuego());
//
//        z.borrarVideojuego(1);
//        System.out.println("\r\n" + "Eliminar Videojuego \r\n" + z.listarVideojuego());

        System.out.println("Usuario: ");
        z.nuevoUsuario("Kevin", "Cuzco", 5, GeneroHumano.MASCULINO);
        z.nuevoUsuario("Sahid", "Cevallos", 444, GeneroHumano.MASCULINO);
        z.nuevoUsuario("Carlos", "Cajamarca", 888, GeneroHumano.MASCULINO);

        System.out.println("Listar Usuario \r\n" + z.listarUsuario());

//        System.out.println("Buscar Usuario \r\n" + z.buscarUsuario(0));
//        z.editarUsuario(0, "Carlos", "Cajamarca", 888);
//        System.out.println("\r\n" + "Modificar Usuario \r\n" + z.listarUsuario());
//
//        z.borrarUsuario(2);
//        System.out.println("\r\n" + "Eliminar Usuario \r\n" + z.listarUsuario());
//
        System.out.println("Usuario: ");
        Usuario u = new Usuario("Kevin", "Cuzco", 56, GeneroHumano.MASCULINO);

        if (z.validarUsuario(u)) {
            System.out.println("Error, Usuario encontrado ");
            System.out.println(z.buscarUsuario(0));
        } else {
            z.nuevoUsuario(u);
        }

        u = new Usuario("Wilmer", "Andrango", 54, GeneroHumano.MASCULINO);

        if (z.validarUsuario(u)) {
            System.out.println("Error, Usuario encontrado ");
            System.out.println(z.buscarUsuario(0));
        } else {
            z.nuevoUsuario(u);
        }
        System.out.println("La lista es:");

        System.out.println(z.listarUsuario());

        System.out.println("Genero: ");

        Genero g = new Genero(3434, "Kevin Opr.", Categoria.DEPORTE);
        if (z.validarGenero(g)) {
            System.out.println("Error, Genero encontrado ");
            System.out.println(z.buscarGenero(0));
        } else {
            z.nuevoGenero(g);
        }

        g = new Genero(3434, "Richard PDF.", Categoria.RPG);
        if (z.validarGenero(g)) {
            System.out.println("Error, Genero encontrado ");
            System.out.println(z.buscarGenero(0));
        } else {
            z.nuevoGenero(g);
        }
        System.out.println("La lista es:");

        System.out.println(z.listarGenero());

        System.out.println("Videojuego: ");
        Videojuego v = new Videojuego("Cod", "Activicion ", "Wilmer", "Español", 255, 22);
        if (z.validarVideojuego(v)) {
            System.out.println("Error, Genero encontrado ");
            System.out.println(z.buscarVideojuego(0));
        } else {
            z.nuevoVideojuego(v);
        }

        v = new Videojuego("The last of us", "Nautidog ", "Crhistofer", "Español", 255, 22);
        if (z.validarVideojuego(v)) {
            System.out.println("Error, Genero encontrado ");
            System.out.println(z.buscarVideojuego(0));
        } else {
            z.nuevoVideojuego(v);
        }
        System.out.println("La lista es:");

        System.out.println(z.listarVideojuego());

    }

}
//    
//    public static void testConstructor(){
//        GameStore gs = new GameStore();
//        System.out.println(gs.toString());
//    }
//    
//    
//    
//    public static void testGetSet(){
//        GameStore gs = new GameStore();
//        gs.setNombrePrincipal("Lunix");
//        gs.setCiudad("Quito");
//        gs.setDireccion("El Dorado");
//        gs.setTelefono("069985566");
//        
//        System.out.println("TestGetSet " + "\n Nombre Principal= " + gs.getNombrePrincipal()+ "\n Ciudad= " + gs.getCiudad()+ "\n Direccion= " + gs.getDireccion()+ "\n Telefono= " + gs.getTelefono());
//    }
//   

