
package ec.edu.uce.modelo.usuario;


import java.io.Serializable;

public class Propietario extends Usuario implements Serializable{

    private int codPropietario;
    private String email;
    public Propietario() {
        super();
        codPropietario = 7853;
        email = "lokita_golosa@hotmail.com";
    }

    public Propietario(String nombre, String apellido, int contrasenia, GeneroHumano genero,int codPropietario, String email) {
        super(nombre, apellido, contrasenia, genero);
        this.codPropietario = codPropietario;
        this.email = email;
    }
    public  Propietario(Propietario propietario) {
        this.nombre = propietario.nombre;
        this.apellido = propietario.apellido;
        this.contrasenia = propietario.contrasenia;
        this.codPropietario = propietario.codPropietario;
        this.email = propietario.email;
    }

    /*Metodos gets y sets*/
    public int getCodPropietario() {
        return codPropietario;
    }

    public void setCodPropietario(int codPropietario) {
        this.codPropietario = codPropietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Validacion de Duplicado, aplicación de instance of y casting de objeto
    public boolean equals(Object o) {
        boolean resultado = false;
        if (o != null && o instanceof Propietario) {
            Propietario d = (Propietario) o;
            if (codPropietario == d.codPropietario && email == d.email) {
                resultado = true;
            }
        }
        return resultado;
    }

    /*Metodo toString, con super de clase padre, sirve para mostrar los ec.edu.uce.datos de manera ordenada en la consola*/
    @Override
    public String toString() {
        return "Propietario" + super.toString()+ "\n Codigo del Propietario= " + codPropietario + "\n Email= " + email;
    }

}
