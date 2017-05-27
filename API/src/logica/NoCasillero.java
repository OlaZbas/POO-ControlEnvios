
package logica;

/**
 *Guarda historial de casilleros creados en la compañía
 * @author Jennifer
 */
public class NoCasillero {
    
    public String numeroCasillero;
/**
 * 
 * @param numeroCasillero 
 */
    public NoCasillero(String numeroCasillero) {
        this.numeroCasillero = numeroCasillero;
    }

    public String getNumeroCasillero() {
        return numeroCasillero;
    }

    public void setNumeroCasillero(String numeroCasillero) {
        this.numeroCasillero = numeroCasillero;
    }
    
}
