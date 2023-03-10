/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.datos;

import ec.edu.uce.modelo.tienda.Consola;
import ec.edu.uce.modelo.GameStore;
import ec.edu.uce.modelo.tienda.genero.Genero;
import ec.edu.uce.modelo.items.ItemPrestamo;
import ec.edu.uce.modelo.tienda.Pc;
import ec.edu.uce.modelo.tienda.Plataforma;
import ec.edu.uce.modelo.items.Prestamo;
import ec.edu.uce.modelo.usuario.Propietario;
import ec.edu.uce.modelo.tienda.Requerimiento;
import ec.edu.uce.modelo.usuario.Usuario;
import ec.edu.uce.modelo.tienda.Videojuego;
import ec.edu.uce.vistas.GestionarGenero;
import ec.edu.uce.vistas.GestionarPlataforma;
import ec.edu.uce.vistas.GestionarPrestamo;
import ec.edu.uce.vistas.GestionarUsuario;
import ec.edu.uce.vistas.GestionarVideojuego;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
