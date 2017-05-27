
package logica;

/**
 *metodo que registra valor de arancel para cobrar impuestos dependiendo del producto comprado
 * @author Jennifer
 */
public class PosArancelaria {

    private String numero;
    private String Descripcion;
    private int valor;
/**
 * 
 * @param numero
 * @param Descripcion
 * @param valor 
 */
    public PosArancelaria(String numero, String Descripcion, int valor) {
        this.numero = numero;
        this.Descripcion = Descripcion;
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7C82A3F5-9A37-47AB-A714-D0CA68671D09]
    // </editor-fold> 
    public PosArancelaria (String Descripcion, int valor) {
    }

}
