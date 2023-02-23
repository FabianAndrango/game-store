
package ec.edu.uce.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validaciones {
    public boolean validarClave (String clave){
        return clave.matches("^(?=.[0-9])"+"(?=.[a-z])(?=.*[A-Z])");
    }
    public static boolean validarString(String cadena){
        return cadena.matches("[a-zA-Z]+");
    }
    public static boolean validarEnteros(String entero){
        if(entero.isBlank()){
            return false;
        }
        if(esNumero(entero)){
            return entero.matches("[+-]?[\\d]*[.]?[\\d]+");
        }
        return false;
    }
    public boolean validarDouble(String Decimal){
        String regex ="^[0-9]+(.[0-9]+)?";
        Pattern patron = Pattern.compile(regex);
        if (Decimal == null){
            return false;
        }
        Matcher matcher = patron.matcher(Decimal);
        return matcher.matches();
    }
    
    public boolean validarEmail(String email){
        return email.matches("^[_a-z0-9-]*@\" + \"[a-z0-9-]+(\\\\.[a-z]{2,4})$");
    }
    
    public static boolean esNumero(String numero){
        try {
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
}
