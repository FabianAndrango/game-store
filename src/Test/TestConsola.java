/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Test;

import DOMINIO.Consola;
import DOMINIO.Requerimiento;

/**
 *
 * @author User
 */
public class TestConsola {

    public static void main(String[] args) {
        testConstructor();
//        testConstructor1("Nintendo", true, new Requerimiento(343, 44, "HOLAS", "DJJD"),"Xbox", "mando de Spider.man");
//        testGetSet();
    }
    public static void testConstructor(){
        Consola consola= new Consola();
        System.out.println(consola.toString());
    }
    public static void testConstructor1(String empresaTitular, boolean multiplataforma, Requerimiento requerimiento, int numeroEdicionDeConsola, String marca, String accesorio ){
        Consola consola= new Consola( empresaTitular,multiplataforma, requerimiento, numeroEdicionDeConsola, marca, accesorio);
        System.out.println(consola.toString());
    }
    public static void testGetSet() {
        Consola consola= new Consola();
        consola.setMarca("Xbox");
        consola.setNumeroEdicionDeConsola(1011062);
        System.out.println("Test GetSet "+"\n marca "+consola.getMarca()+"\n Numero de edicion de consola "+consola.getNumeroEdicionDeConsola());
    }
}

