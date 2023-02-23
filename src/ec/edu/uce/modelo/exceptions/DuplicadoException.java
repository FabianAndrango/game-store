/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uce.modelo.exceptions;

/**
 *
 * @author SAHID
 */
public class DuplicadoException extends Exception {
    private Object obj;

    public DuplicadoException(String msg,Object obj) {
        super(msg);
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
    
}
