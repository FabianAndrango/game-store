/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATOS;

import DOMINIO.Consola;
import DOMINIO.GameStore;
import DOMINIO.Genero;
import DOMINIO.ItemPrestamo;
import DOMINIO.Pc;
import DOMINIO.Plataforma;
import DOMINIO.Prestamo;
import DOMINIO.Propietario;
import DOMINIO.Requerimiento;
import DOMINIO.Usuario;
import DOMINIO.Videojuego;
import GUI.GestionarGenero;
import GUI.GestionarPlataforma;
import GUI.GestionarPrestamo;
import GUI.GestionarUsuario;
import GUI.GestionarVideojuego;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author SAHID
 */
public class Serializar {

    public Serializar(Object obj) {

        if (obj != null && obj instanceof Usuario) {
            try {
                FileOutputStream file = new FileOutputStream("Usuario.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();

                System.out.println("Objeto Serializado");

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof Propietario) {

            try {

                FileOutputStream file = new FileOutputStream("Propietario.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof Plataforma) {

            try {

                FileOutputStream file = new FileOutputStream("Plataforma.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof Pc) {

            try {

                FileOutputStream file = new FileOutputStream("Pc.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof Consola) {

            try {

                FileOutputStream file = new FileOutputStream("Consola.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof GameStore) {

            try {

                FileOutputStream file = new FileOutputStream("GameStore.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof Videojuego) {

            try {

                FileOutputStream file = new FileOutputStream("Videojuego.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (obj != null && obj instanceof Prestamo) {

            try {

                FileOutputStream file = new FileOutputStream("Prestamo.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof Genero) {

            try {

                FileOutputStream file = new FileOutputStream("Genero.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof Requerimiento) {

            try {

                FileOutputStream file = new FileOutputStream("Requerimiento.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof ItemPrestamo) {

            try {

                FileOutputStream file = new FileOutputStream("ItemPrestamo.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (obj != null && obj instanceof GestionarUsuario) {

            try {

                FileOutputStream file = new FileOutputStream("GestionarUsuario.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
         if (obj != null && obj instanceof GestionarPrestamo) {

            try {

                FileOutputStream file = new FileOutputStream("GestionarPrestamo.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
         if (obj != null && obj instanceof GestionarPlataforma) {

            try {

                FileOutputStream file = new FileOutputStream("GestionarPlataforma.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
          if (obj != null && obj instanceof GestionarGenero) {

            try {

                FileOutputStream file = new FileOutputStream("GestionarGenero.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
         if (obj != null && obj instanceof GestionarVideojuego) {

            try {

                FileOutputStream file = new FileOutputStream("GestionarVideojuego.txt");
                ObjectOutputStream salida = new ObjectOutputStream(file);
                salida.writeObject(obj);
                salida.close();
                System.out.println("Objeto Serializado");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
    
    public static void main(String[] args) {
        Videojuego vi=new Videojuego();
       new Serializar(vi);
    }
    

}
