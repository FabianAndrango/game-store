/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DOMINIO;

/**
 *
 * @author SAHID
 */
public interface IAdministrarCRUD {
   /**
     * M�todo que permite crear un nuevo Objeto de cualquier clase.
     * 
     * @param obj Es el nuevo Objeto que se va a crear
     * 
     * @return Un mensaje para alertar al usuario
     */
    public String nuevo(Object obj);
    
    /**
     * M�todo que permite modificar el estado de un Objeto
     * 
     * @param obj El Objeto a ser actualizado
     * 
     * @return Un mensaje para alertar al usuario
     */
    public String editar(Object obj)throws ElementoException;
    
    /**
     * Metodo que permite eliminar un Objeto
     * 
     * @param obj El Objeto a ser eliminado
     * 
     * @return Un mensaje para alertar al usuario
     */
    public String borrar(Object obj);
    
    /**
     * Metodo que permite buscar un Objeto
     * 
     * @param id El id del Objeto que se esta buscando
     * 
     * @return El Objeto encontrado, si el objeto no existe, retorna null
     */
    public Object buscarPorId(Integer id)throws ElementoException;
    
    /**
     * Metodo que permita listar un Conjunto de Objetos
     * 
     * @return La lista de Objetos almacenados
     */
    public String listar();
}
