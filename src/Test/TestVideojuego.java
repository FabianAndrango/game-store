
package Test;
import DOMINIO.ElementoException;
import DOMINIO.Requerimiento;
import DOMINIO.Videojuego;

public class TestVideojuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ElementoException {
        // TODO code application logic here
//        testConstructor();
//        testConstructor1("fifa mobile","electronic arts","", "español",1234,"pc", "deporte");
//        testGetSet();
        Videojuego z = new Videojuego();
       
        System.out.println("Plataforma: ");

        z.nuevaPlataforma("Nintendo", true, new Requerimiento(343, 44, "HOLAS", "DJJD"));

        System.out.println("Listar Plataforma \r\n" + z.listarPlataforma());

        System.out.println("Buscar Plataforma \r\n" + z.buscarPlataforma(2));

        z.editarPlataforma(0, "Nintendo", true, new Requerimiento(343, 44, "HOLAS", "DJJD"));
        System.out.println("\r\n" + "Modificar Plataforma \r\n" + z.listarPlataforma());

        z.borrarPlataforma(1);
        System.out.println("\r\n" + "Eliminar Plataforma \r\n" + z.listarPlataforma());

    }

//    public static void testConstructor(){
//        Videojuego juego = new Videojuego();
//        System.out.println(juego.toString());
//    }
//    
//    public static void testConstructor1(int clave, String autor, String categoria,String empresatitular,boolean multiplataforma,String titulo,String desarollador,String idioma){
//        Videojuego juego = new Videojuego();
//        System.out.println(juego.toString());
//    }
//    
//    public static void testGetSet(){
//        Videojuego juego = new Videojuego ();
//        juego.setCodigo(1234);
//        juego.setTitulo("fifa mobile");
//        
//        System.out.println("TestGetSet " + "\n titulo= " + juego.getTitulo() + "\n desarollador= " + juego.getDesarollador() + "\n redactor= " + juego.getRedactor() + "\n idioma=" + juego.getIdioma() + "\n codigo= " + juego.getCodigo());
//    }
}
