
package logica;

/**
 *Empresa por la cual fue realizada la compra
 * @author Jennifer
 */
public class Tienda {
    
    private String nombre;

    /**
     * 
     * @param nombre 
     */
    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
