/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.datos;

import ec.edu.uce.modelo.usuario.Usuario;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author fing.labcom
 */
public class SerializarUsuario {

    public SerializarUsuario(Object obj) {
        if (obj != null && obj instanceof Usuario) {
            try {
                FileOutputStream file = new FileOutputStream("Usuario2.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();

           

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
