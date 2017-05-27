package logica;

/**
 *Clase que registra la compra que se realizó, con datos de transportadora y tienda a la cual se compro para después pre 
 * Alertar la compra
 * @author Jennifer
 */
public class Compras {
    
    private Producto producto;
    private NoCasillero casillero;
    private Tienda tienda;
    private Transportadora transportadora;
    private String Fecha;

    /**
     * Se vincula al cliente por medio del casillero
     * @param producto
     * @param casillero
     * @param tienda
     * @param transportadora
     * @param Fecha 
     */
    public Compras(Producto producto, NoCasillero casillero, Tienda tienda, Transportadora transportadora, String Fecha) {
        this.producto = producto;
        this.casillero = casillero;
        this.tienda = tienda;
        this.transportadora = transportadora;
        this.Fecha = Fecha;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public NoCasillero getCasillero() {
        return casillero;
    }

    public void setCasillero(NoCasillero casillero) {
        this.casillero = casillero;
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
        
}
