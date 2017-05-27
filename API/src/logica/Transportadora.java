package logica;

/**
 *Registra las transportadoras existentes
 * @author Jennifer
 */
public class Transportadora {
    
    private String nombre;
    private int guiaCarrier;
/**
 * 
 * @param nombre
 * @param guiaCarrier no de guia del transportador 
 */
    public Transportadora(String nombre, int guiaCarrier) {
        this.nombre = nombre;
        this.guiaCarrier = guiaCarrier;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGuiaCarrier() {
        return guiaCarrier;
    }

    public void setGuiaCarrier(int guiaCarrier) {
        this.guiaCarrier = guiaCarrier;
    }
    
}
