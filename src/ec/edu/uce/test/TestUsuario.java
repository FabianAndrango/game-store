package ec.edu.uce.test;

import ec.edu.uce.modelo.exceptions.ElementoException;
import ec.edu.uce.modelo.usuario.Usuario;
import java.time.LocalDate;
import java.util.Date;

public class TestUsuario {
    public static void main(String[] args) throws ElementoException{
        
        Date fecha=new Date(122, 11, 30);
        Date vigencia=new Date(122, 12, 16);
//        testConstructor();
//        testConstructor1("pablo","palacio","123456789", "12-02-2020","cuatro dias","1","fifa");
//        testGetSet();
//        
//        Date fecha=new Date(122, 11, 30);
//        Date vigencia=new Date(122, 12, 16);
//        Prestamo prestamo = new Prestamo(fecha, vigencia,9, 20.00);
        Usuario u= new Usuario();
        u.nuevoPrestamo(LocalDate.now(), LocalDate.of(2024, 12, 10), 0, 0);
        
        
//        prestamo.setFecha(fecha);
//        prestamo.setVigencia(vigencia);
//       System.out.println(prestamo.getFecha());
//       System.out.println(prestamo.formatearFechaDeIngreso());
//       System.out.println(prestamo.getVigencia());
//       System.out.println(prestamo.formatearVigencia());
           System.out.println("Listar Genero \r\n" + u.listarPrestamo());
           
          //Usuario u = new Usuario();

        //u.nuevoPrestamo( , 0, 0);
        //u.nuevoPrestamo(, , 0, 0);
         u.nuevoPrestamo(LocalDate.now(), LocalDate.of(2024, 12, 10), 0, 0);

        System.out.println("Su Prestamo contine lo siguiente: ");
        System.out.println("Los juegos son: \r\n " + u.listarPrestamo());

        System.out.println("Listar Prestamo \r\n" + u.listarPrestamo());

        System.out.println("Buscar Prestamo \r\n" + u.buscarPrestamo(2));
        
        u.editarPrestamo(0,LocalDate.now(), LocalDate.of(2024, 12, 10), 0, 0);
        System.out.println("\r\n" + "Modificar Prestamo \r\n" + u.listarPrestamo());

        u.borrarPrestamo(0);
        System.out.println("\r\n" + "Eliminar Videojuego \r\n" + u.listarPrestamo());

    }
        
    }
    
//    public static void testConstructor(){
//        Usuario Usuario = new Usuario();
//        System.out.println(Usuario.toString());
//    }
//    
//    public static void testConstructor1(String Nombre,String Apellido,String Contrasenia, Date fecha, Date vigencia, int cantidad, String Videojuego){
//        Usuario Usuario = new Usuario("fecha","vigencia","cantidad","videojuego");
//        System.out.println(Usuario.toString(Nombre, Apellido,Contrasenia));
//    }
//    
//    public static void testGetSet(){
//        Usuario Usuario = new Usuario();
//        Usuario.setNombre("Pedro");
//        Usuario.setApellido("Leon");
//        Usuario.setContrasenia("Pedro12");
//        System.out.println("TestGetSet " + "\n Nombre = " + Usuario.getNombre()+ "\n Email= " + Usuario.getApellido()+ "\n Contraseña = " + Usuario.getContrasenia);
//        //System.out.println("TestGetSet " + "\n Codigo del Propietario= " + propietario.getCodPropietario()+ "\n Email= " + propietario.getEmail());
//    }
//
//    private static void testConstructor1(String pablo, String palacio, String string, String string0, String cuatro_dias, String string1, String fifa) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }


