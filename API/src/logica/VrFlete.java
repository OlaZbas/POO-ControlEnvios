package logica;

/*
 * Clase que permite registrar el valor del flete para su liquidación
 * @author Jennifer
 */
public class VrFlete {

    private RangoPesos valorPeso;
    private double descuentoCliente;
    private double valorFlete;

    /**
     *
     * @param valorPeso
     * @param descuentoCliente
     */
    public VrFlete(RangoPesos valorPeso, double descuentoCliente) {
        this.valorPeso = valorPeso;
        this.descuentoCliente = descuentoCliente;
    }

    public RangoPesos getValorPeso() {
        return valorPeso;
    }

    public void setValorPeso(RangoPesos valorPeso) {
        this.valorPeso = valorPeso;
    }

    public double getDescuentoCliente() {
        return descuentoCliente;
    }

    public void setDescuentoCliente(double descuentoCliente) {
        this.descuentoCliente = descuentoCliente;
    }

    public double getValorFlete() {
        return valorFlete;
    }

    public void setValorFlete(double valorFlete) {
        this.valorFlete = valorFlete;
    }

    /*
 * Método que realiza el cálculo final del flete, realizando la resta de descuentos del cliente si los tiene.
 * @return 
     */
    private double CalcularFlete() {
        this.valorFlete = this.valorPeso.getValorApagar() - this.descuentoCliente;
        return this.valorFlete;
    }
}
