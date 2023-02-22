/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;


import DOMINIO.GameStore;
import static DOMINIO.Videojuego.IDIOMA;
import GUI.MenuPrincipal;
import UTIL.Categoria;
import UTIL.GeneroHumano;
import java.sql.SQLException;

/**
 *
 * @author Sahid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static GameStore gast= new GameStore(); 
    public static void main(String[] args) throws SQLException {
        MenuPrincipal m = new MenuPrincipal();
        inicializar();
        m.desplegarMen(gast);
        
    }
    
    public static void inicializar() {
        gast.nuevoUsuario("Julio", "Molina", 255, GeneroHumano.MASCULINO);
        gast.nuevoUsuario("Wilmer", "XD", 45, GeneroHumano.MASCULINO);
        gast.nuevoVideojuego("Counter Strike", "EA", "Kevin Opr.",IDIOMA, 182, 60);
        gast.nuevoGenero(556, "Richard PDF.", Categoria.MUSICAL);
    }
    

}
