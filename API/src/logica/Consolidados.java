/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/*
 * Clase que permite realizar consolidados si llegan mas de dos paquetes al
 * casillero
 *
 * @author Jennifer
 */
public class Consolidados {

    private double valor;
    private boolean opcion;
    private Envio guiaPadre;

    /*
     * Tiene como parámetro la opción de consolidar o no
     *
     * @param valor
     * @param opcion
     * @param guiaPadre
     */
    public Consolidados(double valor, boolean opcion, Envio guiaPadre) {
        this.valor = valor;
        this.opcion = opcion;
        this.guiaPadre = guiaPadre;
    }
    
    public Consolidados(){
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion = opcion;
    }

    public Envio getGuiaPadre() {
        return guiaPadre;
    }

    public void setGuiaPadre(Envio guiaPadre) {
        this.guiaPadre = guiaPadre;
    }
/*
 * Método que consolida paquetes, si es verdadero devuelve valor para cobrar en envio
 * @param consolida
 * @return 
 */
   public void Consolidar(int consolida) throws NumberFormatException{
        this.valor = 0;

        if (consolida == 1) {
            valor = 2.0;
        } else if (consolida == 0) {
            valor = 1.0;
        } else {
            throw new NumberFormatException("");
        }
    }
}
