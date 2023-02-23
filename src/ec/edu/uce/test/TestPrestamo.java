package ec.edu.uce.test;

import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.items.Prestamo;
import ec.edu.uce.modelo.usuario.Usuario;
import ec.edu.uce.modelo.tienda.Videojuego;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author SAHID
 */
public class TestPrestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ElementoException {
        // TODO code application logic here
        LocalDate fecha = LocalDate.now();
        LocalDate vigencia = LocalDate.of(2024, 12, 10);
//        Prestamo prestamo = new Prestamo(fecha, vigencia,9, 20.00);
        Usuario u = new Usuario();

        u.nuevoPrestamo(fecha = LocalDate.now(), vigencia = LocalDate.of(2024, 12, 10), 9, 5);

//        prestamo.setFecha(fecha);
//        prestamo.setVigencia(vigencia);
//       System.out.println(prestamo.getFecha());
//       System.out.println(prestamo.formatearFechaDeIngreso());
//       System.out.println(prestamo.getVigencia());
//       System.out.println(prestamo.formatearVigencia());
        System.out.println("Listar Genero \r\n" + u.listarPrestamo());

//     testConstructor();
//        testGetSet();
//
        Videojuego videojuego = new Videojuego("God of war", "Activicion ", "C. Barlok", "Español", 122, 22);
//        videojuego = new Videojuego("Cod", "Activicion ", "W. Dafoe", "Español", 255, 22);
        
        Prestamo v = new Prestamo();

        v.nuevoItemPrestamo(9, 5, videojuego);
        v.nuevoItemPrestamo(9, 5, videojuego);
        v.nuevoItemPrestamo(9, 5, videojuego);

        System.out.println("Su Prestamo contine lo siguiente: ");
        System.out.println("Los juegos son: \r\n " + v.listarItemPrestamo());

        System.out.println("Listar Videojuego \r\n" + v.listarItemPrestamo());

        System.out.println("Buscar Videojuego \r\n" + v.buscarItemPrestamo(2));

//        v.editarItemPrestamo(2, 9, 5, "Hola", "Sahid", "G", "Español", 0, 0);
//        System.out.println("\r\n" + "Modificar Videojuego \r\n" + v.listarItemPrestamo());
        v.borrarItemPrestamo(0);
        System.out.println("\r\n" + "Eliminar Videojuego \r\n" + v.listarItemPrestamo());

    }

//    public static void testConstructor(){
//        Prestamo prestamo = new Prestamo();
//        System.out.println(prestamo.toString());
//    }
////    
////    public static void testConstructor1(int codPropietario, String email){
////        GameStore propietario = new GameStore();
////        System.out.println(propietario.toString(codPropietario, email));
////    }
////    
//    public static void testGetSet(){
//        Date fecha=new Date(122, 11, 30);
//        Date vigencia=new Date(122, 12, 16);
//        Prestamo prestamo = new Prestamo(fecha, vigencia,9, 20.00);
//        Usuario u= new Usuario();
////        prestamo.setFecha(fecha);
////        prestamo.setVigencia(vigencia);
////       System.out.println(prestamo.getFecha());
////       System.out.println(prestamo.formatearFechaDeIngreso());
////       System.out.println(prestamo.getVigencia());
////       System.out.println(prestamo.formatearVigencia());
//u.listarPrestamo();
}
