package logica;

/*
 * Registra los descuentos,beneficios o promociones que se le brinden al cliente
 * como primer envio, o compras en temporada baja
 *
 * @author Jennifer
 */
public class DtosAdicionales {

    private String concepto;
    private double valor;

    /**
     *
     * @param concepto
     * @param valor
     */
    public DtosAdicionales(String concepto, double valor) {
        this.concepto = concepto;
        this.valor = valor;
    }
    
       public DtosAdicionales() {
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
/*
 * Método que envia el valor según el tipo de descuento
 * @return 
 */
    public double CalcularDto(String concepto) {
        if (concepto == "primer envio") {
            this.valor = 20.0;
        } else if (concepto == "casillero gold"){
            this.valor = 40.0;
        }
        return this.valor;
    }
}
