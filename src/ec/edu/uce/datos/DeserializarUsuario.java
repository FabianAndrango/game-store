/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.datos;

import ec.edu.uce.modelo.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author fing.labcom
 */
public class DeserializarUsuario {

    public DeserializarUsuario(Object o) {
        if (o != null && o instanceof Usuario) {
            try {
                
             
                FileInputStream file = new FileInputStream("Usuario2.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                o = (Usuario) dis.readObject();
                dis.close();

                System.out.println("Objeto Usuario Deserializado");
                System.out.println("Usuario" + o);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
    }
}
