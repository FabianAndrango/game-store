/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.uce.test;

import ec.edu.uce.modelo.tienda.Requerimiento;

/**
 *
 * @author User
 */
public class TestRequerimiento {

    public static void main(String[] args) {
        testConstructor();
        testConstructor1(500,16,"Intel core i7","Intel HD 4000");
        testGetSet();
    }
    public static void testConstructor(){
        Requerimiento requerimiento =new Requerimiento();
        System.out.println(requerimiento.toString());
    }
    public static void testConstructor1(int espacioNecesario, int memoriaRam, String procesador, String tarjetaGrafica){
        Requerimiento requerimiento =new Requerimiento();
        System.out.println(requerimiento.toString());
        
    }
    public static void testGetSet(){
        Requerimiento requerimiento= new Requerimiento();
        requerimiento.setEspacioNecesario(700);
        requerimiento.setMemoriaRam(16);
        requerimiento.setProcesador("Intel core 7");
        requerimiento.setTarjetaGrafica("Intel HD 4000");
        System.out.println("TestGetSet"+"\n Espacio necesario "+requerimiento.getEspacioNecesario()+" Memoria ram "+requerimiento.getMemoriaRam()+"procesador"+requerimiento.getProcesador()+"Trajeta grafica "+requerimiento.getTarjetaGrafica());
    }
}
