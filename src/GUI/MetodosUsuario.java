/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DOMINIO.Genero;
import DOMINIO.Plataforma;
import DOMINIO.Prestamo;
import DOMINIO.Usuario;
import DOMINIO.Videojuego;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class MetodosUsuario {

    Vector principal = new Vector();

    public void guardar(Usuario usuarios) {
        principal.addElement(usuarios);
    }

    public void guardarArchivo(Usuario u) {
        try {
            FileWriter fw = new FileWriter("Usuario1.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(u.getNombre());
            pw.print("|" + u.getApellido());
            pw.print("|" + u.getContraseña());
            pw.println("|" + u.getGenero());
            pw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public DefaultTableModel listaUsuarios() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre ");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("Contrasenia");
        cabeceras.addElement("Genero");
        DefaultTableModel mdTabla = new DefaultTableModel(cabeceras, 0);

        try {
            FileReader fr = new FileReader("Usuario1.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdTabla;
    }

    public void guardar(Videojuego videoJuego) {
        principal.addElement(videoJuego);
    }

    public void guardarArchivo(Videojuego v) {
        try {
            FileWriter fw = new FileWriter("Videojuego1.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(v.getTitulo());
            pw.print("|" + v.getDesarollador());
            pw.print("|" + v.getRedactor());
            pw.print("|" + v.getCodigo());
            pw.print("|" + v.getPrecio());
            pw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public DefaultTableModel listaVideojuegos() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Titulo ");
        cabeceras.addElement("Desarrollador");
        cabeceras.addElement("Redactor");
        cabeceras.addElement("Codigo");
        cabeceras.addElement("Precio");
        DefaultTableModel mdTabla = new DefaultTableModel(cabeceras, 0);

        try {
            FileReader fr = new FileReader("Videojuego1.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdTabla;
    }

    public void guardar(Plataforma plataforma) {
        principal.addElement(plataforma);
    }

    public void guardarArchivo(Plataforma p) {
        try {
            FileWriter fw = new FileWriter("Plataforma1.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(p.getEmpresaTitular());
            pw.print("|" + p.getMultiplataforma());
            pw.print("|" + p.getGB());
            pw.print("|" + p.getRam());
            pw.print("|" + p.getProcesador());
            pw.println("|" + p.getGraficaVideo());
            pw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public DefaultTableModel listaPlataforma() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Empresa Titular");
        cabeceras.addElement("Multiplataforma");
        cabeceras.addElement("Numero GB");
        cabeceras.addElement("Numero RAM");
        cabeceras.addElement("Procesador");
        cabeceras.addElement("Grafica de Video");

        DefaultTableModel mdTabla5 = new DefaultTableModel(cabeceras, 0);

        try {
            FileReader fr = new FileReader("Plataforma1.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdTabla5.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdTabla5;
    }

    public void guardarPres(Prestamo unPrestamo) {
        principal.addElement(unPrestamo);
    }

    public void guardarPrestamo(Prestamo prestamo) {
        try {
            FileWriter fw = new FileWriter("Prestamo1.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(prestamo.getCantidad());
            pw.print("|" + prestamo.getFecha());
//            pw.print("|" + prestamo.getItemPrestamos());
//            pw.print("|" + prestamo.getTotal());
//            pw.print("|" + prestamo.getVideojuego(0));
            pw.println("|" + prestamo.getVigencia());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void listaPrestamo(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try (FileReader fr = new FileReader("Prestamo1.txt")) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = br.readLine();
                int fila = 0;
                while (line != null) {
                    String[] tokens = line.split("|");
                    model.addRow(new Object[1]);
                    tabla.setValueAt(tokens[0], fila, 0);
                    tabla.setValueAt(tokens[1], fila, 1);
                    tabla.setValueAt(tokens[2], fila,2);
                   //10|10/09/8|41/56/89
                    fila++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void guardar(Genero genero) {
        principal.addElement(genero);
    }

    public void guardarGenero(Genero genero) {
        try {
            FileWriter fw = new FileWriter("Genero.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("|" + genero.getClave());
            pw.print("|" + genero.getAutor());
            pw.println("|" + genero.getCategoria());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel listaGenero() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Clave");
        cabeceras.addElement("Autor");
        cabeceras.addElement("Categoria");
        DefaultTableModel mdl2Tabla = new DefaultTableModel(cabeceras, 0);
        try {
            FileReader fr = new FileReader("Genero.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdl2Tabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdl2Tabla;
    }

}
