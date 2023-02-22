/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SAHID
 */
public class CopiarArchivo {
    public static void main(String[] args) {

        try {
            FileReader entrada = new FileReader("Proyecto.txt");

            try {
                FileWriter salida = new FileWriter("Salida.txt");
                char[] buffer = new char[128];
                int lectura;
                lectura = entrada.read(buffer);
                while (lectura != -1) {
                    salida.write(buffer, 0, lectura);
                    lectura = entrada.read(buffer);

                }

                salida.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                entrada.close();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
