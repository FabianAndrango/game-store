

package Test;

import DOMINIO.Prestamo;
import DOMINIO.Propietario;
import UTIL.GeneroHumano;
import java.util.Date;

public class TestPropietario {
    public static void main(String[] args){
        testConstructor();
        testConstructor1("Casta", "Carquez",1458, 6646,"kakatuagalar@gmail.com");
        testGetSet();
//        testPrestamo();
    }
    
    public static void testConstructor(){
        Propietario propietario = new Propietario();
        System.out.println(propietario.toString());
    }
    
    public static void testConstructor1(String nombre, String apellido, int contrasenia, int codPropietario, String email){
        Propietario propietario = new Propietario(nombre, apellido, contrasenia,GeneroHumano.MASCULINO, codPropietario, email);
        System.out.println(propietario.toString());
    }
    
    public static void testGetSet(){
        Propietario propietario = new Propietario();
        propietario.setNombre("Sera");
        propietario.setApellido("Seca");
        propietario.setContraseña(7895);
        propietario.setCodPropietario(222);
        propietario.setEmail("yemadehuevo@uce.edu.ec");
        propietario.setPrestamos(new Prestamo[4]);
        
        
        System.out.println("TestGetSet \n Nombre= "+propietario.getNombre()+"\n Apellido= "+propietario.getApellido()+"\n Contrasenia= "+propietario.getContraseña()+"\n Codigo del Propietario= " + propietario.getCodPropietario()+ "\n Email= " + propietario.getEmail());
    }
    
//    public static void testPrestamo(){
//        Propietario propietario = new Propietario();
//        
//        propietario.nuevoPrestamo(new Date(2000, 9, 11), new Date(2000,11,22), 0, 0);
//        propietario.nuevoPrestamo(new Date(2000, 9, 12), new Date(2000,11,22), 0, 0);
//        propietario.listarPrestamo();
//        propietario.editarPrestamo(0, new Date(2000, 9, 1), new Date(2000,11,22), 0, 0);
//         propietario.buscarPrestamo(0);
//         propietario.borrarPrestamo(0);
//         propietario.listarPrestamo();
//         
//    }
}