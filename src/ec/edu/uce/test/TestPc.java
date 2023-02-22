package ec.edu.uce.test;


import ec.edu.uce.modelo.Pc;



public class TestPc {

   
    public static void main(String[] args) {
        
        testConstructor();
        testConstructor1("","Activision");
        testGetSet();
    }
    
    public static void testConstructor(){
        Pc p = new Pc();
        System.out.println(p.toString());
    }
    
    public static void testConstructor1(String modelo, String sistemaOperativo){
        Pc p = new Pc();
        System.out.println(p.toString());
    }
    
    public static void testGetSet(){
        Pc p = new Pc ();
        p.setModelo("HP");
        p.setSistemaOperativo("Activision");
        
        System.out.println("TestGetSet " + "\n Modelo= " + p.getModelo() + "\n Sistema Operativo= " + p.getSistemaOperativo());
    }
    }
    
