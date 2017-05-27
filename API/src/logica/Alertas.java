
package logica;

/**
 * Clase que permite dar aviso de la compra a la compañía para estar pendiente del paquete
 * @author Jennifer   
 */
public class Alertas {
    
    private Cliente cliente;
    private Compras compra;
    private PosArancelaria posArancelaria;

    /**
     * Recibe un cliente, los datos de la compra, y la posición arancelaria que corresponde para luego ser cobrada al flete 
     * @param cliente
     * @param compra
     * @param posArancelaria 
     */
    public Alertas(Cliente cliente, Compras compra, PosArancelaria posArancelaria) {
        this.cliente = cliente;
        this.compra = compra;
        this.posArancelaria = posArancelaria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compras getCompra() {
        return compra;
    }

    public void setCompra(Compras compra) {
        this.compra = compra;
    }

    public PosArancelaria getPosArancelaria() {
        return posArancelaria;
    }

    public void setPosArancelaria(PosArancelaria posArancelaria) {
        this.posArancelaria = posArancelaria;
    }
    
}
