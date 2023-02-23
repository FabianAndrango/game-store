/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.testeo;

import ec.edu.uce.modelo.tienda.genero.Genero;
import ec.edu.uce.modelo.tienda.Plataforma;
import ec.edu.uce.modelo.items.Prestamo;
import ec.edu.uce.modelo.usuario.Usuario;
import ec.edu.uce.modelo.tienda.Videojuego;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SAHID
 */
public class FuenteDato {

    private File datafile;

    public FuenteDato(String filePath) {

        this.datafile = new File(filePath);

    }

    public void leerDato() {

        try {
            Scanner entrada = new Scanner(datafile);

            Usuario gast;

            int numUsuarios = entrada.nextInt();

            for (int i = 0; i <= numUsuarios; i++) {
                System.out.println(i);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            Scanner entrada = new Scanner(datafile);

            Videojuego vi;

            int numVideojuegos = entrada.nextInt();

            for (int i = 0; i <= numVideojuegos; i++) {
                System.out.println(i);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            Scanner entrada = new Scanner(datafile);

            Genero genero;

            int numGeneros = entrada.nextInt();

            for (int i = 0; i <= numGeneros; i++) {
                System.out.println(i);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            Scanner entrada = new Scanner(datafile);

            Plataforma plataforma;

            int numPlataformas = entrada.nextInt();

            for (int i = 0; i <= numPlataformas; i++) {
                System.out.println(i);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            Scanner entrada = new Scanner(datafile);

            Prestamo prestamo;

            int numPrestamos = entrada.nextInt();

            for (int i = 0; i <= numPrestamos; i++) {
                System.out.println(i);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
