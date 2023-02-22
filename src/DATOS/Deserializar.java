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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author SAHID
 */
public class Deserializar {

    public Deserializar(Object o) {
        if (o != null && o instanceof Usuario) {
            try {
                Usuario e = (Usuario) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Usuario.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Usuario) dis.readObject();
                dis.close();

                System.out.println("Objeto Usuario Deserializado");
                System.out.println("Usuario" + e);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Propietario) {
            try {
                Propietario e = (Propietario) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Propietario.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Propietario) dis.readObject();
                dis.close();

                System.out.println("Objeto Propietario Deserializado");
                System.out.println("Propietario" + e);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof GameStore) {
            try {
                GameStore e = (GameStore) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("GameStore.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (GameStore) dis.readObject();
                dis.close();

                System.out.println("Objeto GameStore Deserializado");
                System.out.println("GameStore" + e);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Videojuego) {
            try {
                Videojuego e = (Videojuego) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Videojuego.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Videojuego) dis.readObject();
                dis.close();
                System.out.println("Objeto Videojuego Deserializado");
                System.out.println("Videojuego" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Plataforma) {
            try {
                Plataforma e = (Plataforma) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Plataforma.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Plataforma) dis.readObject();
                dis.close();

                System.out.println("Objeto Plataforma Deserializado");
                System.out.println("Plataforma" + e);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Pc) {
            try {
                Pc e = (Pc) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Pc.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Pc) dis.readObject();
                dis.close();
                System.out.println("Objeto Pc Deserializado");
                System.out.println("Pc" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Consola) {
            try {
                Consola e = (Consola) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Consola.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Consola) dis.readObject();
                dis.close();
                System.out.println("Objeto Consola Deserializado");
                System.out.println("Consola" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Genero) {
            try {
                Genero e = (Genero) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Genero.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Genero) dis.readObject();
                dis.close();
                System.out.println("Objeto Genero Deserializado");
                System.out.println("Genero" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Requerimiento) {
            try {
                Requerimiento e = (Requerimiento) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Requerimiento.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Requerimiento) dis.readObject();
                dis.close();
                System.out.println("Objeto Requerimiento Deserializado");
                System.out.println("Requerimiento" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof Prestamo) {
            try {
                Prestamo e = (Prestamo) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("Prestamo.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (Prestamo) dis.readObject();
                dis.close();
                System.out.println("Objeto Prestamo Deserializado");
                System.out.println("Prestamo" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof ItemPrestamo) {
            try {
                ItemPrestamo e = (ItemPrestamo) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("ItemPrestamo.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (ItemPrestamo) dis.readObject();
                dis.close();
                System.out.println("Objeto ItemPrestamo Deserializado");
                System.out.println("ItemPrestamo" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        if (o != null && o instanceof GestionarUsuario) {
            try {
                GestionarUsuario e = (GestionarUsuario) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("GestionarUsuario.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (GestionarUsuario) dis.readObject();
                dis.close();
                System.out.println("Objeto GestionarUsuario Deserializado");
                System.out.println("GestionarUsuario" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
         if (o != null && o instanceof GestionarPrestamo) {
            try {
                GestionarPrestamo e = (GestionarPrestamo) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("GestionarPrestamo.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (GestionarPrestamo) dis.readObject();
                dis.close();
                System.out.println("Objeto GestionarPrestamo Deserializado");
                System.out.println("GestionarPrestamo" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
         if (o != null && o instanceof GestionarPlataforma) {
            try {
                GestionarPlataforma e = (GestionarPlataforma) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("GestionarPlataforma.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (GestionarPlataforma) dis.readObject();
                dis.close();
                System.out.println("Objeto GestionarPlataforma Deserializado");
                System.out.println("GestionarPlataforma" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
         if (o != null && o instanceof GestionarGenero) {
            try {
                GestionarGenero e = (GestionarGenero) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("GestionarGenero.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (GestionarGenero) dis.readObject();
                dis.close();
                System.out.println("Objeto GestionarGenero Deserializado");
                System.out.println("GestionarGenero" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
         if (o != null && o instanceof GestionarVideojuego) {
            try {
                GestionarVideojuego e = (GestionarVideojuego) o;
                System.out.println("...");
                FileInputStream file = new FileInputStream("GestionarVideojuego.txt");
                ObjectInputStream dis = new ObjectInputStream(file);
                e = (GestionarVideojuego) dis.readObject();
                dis.close();
                System.out.println("Objeto GestionarVideojuego Deserializado");
                System.out.println("GestionarVideojuego" + e);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }



    }
    
    public static void main(String[] args) {
        Videojuego vi=new Videojuego();
        new Deserializar(vi);
    }
}
