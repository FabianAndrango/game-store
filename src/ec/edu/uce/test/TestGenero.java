package ec.edu.uce.test;


import ec.edu.uce.modelo.tienda.genero.Genero;
import ec.edu.uce.modelo.tienda.categoria.Categoria;


public class TestGenero {

   
    public static void main(String[] args) {
        testConstructor();
        testConstructor1(12345,"Activision","Accion");
        testGetSet();
    }
    
    public static void testConstructor(){
        Genero g = new Genero();
        System.out.println(g.toString());
    }
    
    public static void testConstructor1(int clave, String autor, String categoria){
        Genero g = new Genero();
        System.out.println(g.toString());
    }
    
    public static void testGetSet(){
        Genero g = new Genero ();
        g.setClave(12345);
        g.setAutor("Activision");
        
        System.out.println("TestGetSet " + "\n Clave= " + g.getClave() + "\n Autor= " + g.getAutor() + "\n Categoria= " + Categoria.ACCION);
    }
}
    
  
