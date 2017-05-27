/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/*
 * Clase que contiene rango de valores segun el peso del producto
 * @author Jennifer
 */
public class RangoPesos {

    private double pesoFlete;
    private double valorApagar;

    /**
     *
     * @param pesoFlete
     */
    public RangoPesos(double pesoFlete) {
        this.valorApagar = calcularValorxPes();
    }

    public double getPesoFlete() {
        return pesoFlete;
    }

    public void setPesoFlete(double pesoFlete) {
        this.pesoFlete = pesoFlete;
    }

    public double getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(double valorApagar) {
        this.valorApagar = valorApagar;
    }

    /*
 * metodo que permite calcular valor segun el peso del paquete
 * @param pesoFlete
 * @return 
     */
    private double calcularValorxPes() {
        if (pesoFlete >= 0 && pesoFlete <= 5) {
            this.valorApagar = 10000;
        } else if (pesoFlete >= 5.1 && pesoFlete <= 10) {
            this.valorApagar = 20000;
        } else if (pesoFlete >= 10.1 && pesoFlete <= 15) {
            this.valorApagar = 30000;
        }
        return this.valorApagar;
    }
}
