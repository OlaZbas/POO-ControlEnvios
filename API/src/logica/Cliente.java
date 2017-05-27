
package logica;

/*
 *Clase que extiende de "persona", contiene los datos básicos conectado a un casillero proporcionado por la compañía
 * @author Jennifer
 */
public class Cliente extends Persona{
    
    
    private NoCasillero NoCasillero;
    private String DireccionCasillero;
    private double descuentoEnFlete;

    /*
     * Dentro de los parámetros establecidos se tiene el descuento asignado al casillero, es opcional para ser liquidaddo mas
     * adelante en el flete
     * @param NoCasillero
     * @param DireccionCasillero
     * @param descuentoEnFlete
     * @param nombre
     * @param cedula
     * @param email
     * @param telefono 
     */
    public Cliente(NoCasillero NoCasillero, String DireccionCasillero, double descuentoEnFlete, String nombre, int cedula, String email, int telefono) {
        super(nombre, cedula, email, telefono);
        this.NoCasillero = NoCasillero;
        this.DireccionCasillero = DireccionCasillero;
        this.descuentoEnFlete = descuentoEnFlete;
    }

    public NoCasillero getNoCasillero() {
        return NoCasillero;
    }

    public void setNoCasillero(NoCasillero NoCasillero) {
        this.NoCasillero = NoCasillero;
    }

    public String getDireccionCasillero() {
        return DireccionCasillero;
    }

    public void setDireccionCasillero(String DireccionCasillero) {
        this.DireccionCasillero = DireccionCasillero;
    }

    public double getDescuentoEnFlete() {
        return descuentoEnFlete;
    }

    public void setDescuentoEnFlete(double descuentoEnFlete) {
        this.descuentoEnFlete = descuentoEnFlete;
    }
 
}
