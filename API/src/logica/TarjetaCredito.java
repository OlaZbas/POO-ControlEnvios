
package logica;

/**
 *Registra las tarjetas del cliente para cobrar envios autorizados
 * @author Jennifer
 */
public class TarjetaCredito {
 
    private Cliente cliente;
    private NoCasillero noCasillero;
    private int noTarjeta;
    private String franquicia;
    private String fechaVencimiento;

    /**
     * 
     * @param cliente
     * @param noCasillero
     * @param noTarjeta
     * @param franquicia
     * @param fechaVencimiento 
     */

    public TarjetaCredito(Cliente cliente, NoCasillero noCasillero, int noTarjeta, String franquicia, String fechaVencimiento) {
        this.cliente = cliente;
        this.noCasillero = noCasillero;
        this.noTarjeta = noTarjeta;
        this.franquicia = franquicia;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NoCasillero getNoCasillero() {
        return noCasillero;
    }

    public void setNoCasillero(NoCasillero noCasillero) {
        this.noCasillero = noCasillero;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.453330BC-2E33-5F2D-4DD6-A6CF39773A9F]
    // </editor-fold> 
    public TarjetaCredito (Cliente cliente, NoCasillero noCasillero) {
    }
    
}
