package ec.edu.uce.testeo;

import ec.edu.uce.modelo.tienda.Plataforma;

public class TestPlataforma {

    public static void main(String[] args) {
        testConstructor();
//        testConstructor1("Play Station", true, 2, 8, "Core Intel 7.0", "RTX 2060 Gb");
        testGetSet();
    }

    public static void testConstructor() {
        Plataforma plataforma = new Plataforma() {
            @Override
            public String play() {
               
                return " La Plataforma ha cumplido con todos los requisitos ";
            }
        };
        System.out.println(plataforma.toString());
    }

//    public static void testConstructor1(String empresaTitular, boolean multiplataforma, Requerimiento requerimiento) {
//        Plataforma plataforma = new Plataforma(String empresaTitular, boolean multiplataforma, Requerimiento requerimiento) {
//            @Override
//            public String play() {
//                
//                return " La Plataforma ha cumplido con todos los requisitos ";
//            }
//        };
//        System.out.println(plataforma.toString());
//    }

    public static void testGetSet() {
        Plataforma plataforma = new Plataforma() {
            @Override
            public String play() {
        
                return " La Plataforma ha cumplido con todos los requisitos ";
            }
        };
        plataforma.setEmpresaTitular("Sega");
        plataforma.setMultiplataforma(true);

        System.out.println("TestGetSet " + "\n Empresa Titular= " + plataforma.getEmpresaTitular() + "\n Multiplataforma= " + plataforma.getMultiplataforma());
    }
}
