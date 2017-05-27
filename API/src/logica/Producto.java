
package logica;

/**
 *producto comprado por internet
 * @author Jennifer
 */
public class Producto {

private String producto;
private int cantidad;
private double peso;
private double valor;
/***
 * 
 * @param producto
 * @param cantidad
 * @param peso
 * @param valor 
 */
    public Producto(String producto, int cantidad, double peso, double valor) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.peso = peso;
        this.valor = valor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    
}
