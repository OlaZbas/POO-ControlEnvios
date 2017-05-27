
package logica;

/*
 *Datos de la compra, una vez llega a la compañía se le asigna un número de guía con el cual será reconocida en todo
 * el proceso
 * @author Jennifer
 */
public class Envio {
    
    private String Noguia;
    private String fechaRecibido;
    private Tienda tienda;
    private Transportadora transportadora;
    private NoCasillero noCasillero;
    private VrFlete flete;

    /*
     * Conserva los datos de la compra en la tienda. 
     * el parámetro de flete registra el valor del paquete dependiendo de la tabla de valores menos los descuentos asociados
     * a su casillero
     * @param Noguia
     * @param fechaRecibido
     * @param tienda
     * @param transportadora
     * @param noCasillero
     * @param flete 
     */
    public Envio(String Noguia, String fechaRecibido, Tienda tienda, Transportadora transportadora, NoCasillero noCasillero, VrFlete flete) {
        this.Noguia = Noguia;
        this.fechaRecibido = fechaRecibido;
        this.tienda = tienda;
        this.transportadora = transportadora;
        this.noCasillero = noCasillero;
        this.flete = flete;
    }

    public Envio() {
    }

    
    public String getNoguia() {
        return Noguia;
    }

    public void setNoguia(String Noguia) {
        this.Noguia = Noguia;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public NoCasillero getNoCasillero() {
        return noCasillero;
    }

    public void setNoCasillero(NoCasillero noCasillero) {
        this.noCasillero = noCasillero;
    }

    public VrFlete getFlete() {
        return flete;
    }

    public void setFlete(VrFlete flete) {
        this.flete = flete;
    }
    
}
