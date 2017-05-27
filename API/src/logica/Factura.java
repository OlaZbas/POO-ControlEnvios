
package logica;

/**
 *Método que muestra la factura con sus datos básicos, según la pre-liquidación 
 * @author Jennifer
 */
public class Factura {
    
    private String noFactura;
    private Cliente cliente;
    private Envio envio;
    private Cobros cobros;
    private int valorTotal;

/**
 * Muestra todos los datos de parametros y qué se le cobró. En valorTotal trae el valor de la "Liquidación"
 * @param noFactura
 * @param cliente
 * @param envio
 * @param cobros
 * @param valorTotal 
 */
 
    public Factura(String noFactura, Cliente cliente, Envio envio, Cobros cobros, int valorTotal) {
        this.noFactura = noFactura;
        this.cliente = cliente;
        this.envio = envio;
        this.cobros = cobros;
        this.valorTotal = valorTotal;
    }

    public Cobros getCobros() {
        return cobros;
    }

    public void setCobros(Cobros cobros) {
        this.cobros = cobros;
    }

    public String getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(String noFactura) {
        this.noFactura = noFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }    
    
}
