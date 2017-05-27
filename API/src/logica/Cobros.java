
package logica;

/*
 *Clase que recibe el consolidado de todos los cobros aplicados a la guia para ser referenciados en la factura final
 * @author Jennifer
 */
public class Cobros implements Liquidacion{
    
    private String concepto;
    private double valor;
    private Envio envio;

    /*
     * Puede contener valores como posición arancelaria, Vr.flete, descuentos, consolidados
     * @param concepto
     * @param valor
     * @param envio 
     */
    public Cobros(String concepto, double valor, Envio envio) {
        this.concepto = concepto;
        this.valor = valor;
        this.envio  = envio;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }   

    @Override
    public void vrFlete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void PosArancel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
