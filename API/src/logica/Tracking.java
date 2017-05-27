
package logica;

/**
 *Historial de estados del paquete segun la operación
 * @author Jennifer
 */
public class Tracking {
 
    private Envio envio;
    private String Estado;
    private String fechaEstado;
/**
 * 
 * @param envio
 * @param Estado
 * @param fechaEstado 
 */
    public Tracking(Envio envio, String Estado, String fechaEstado) {
        this.envio = envio;
        this.Estado = Estado;
        this.fechaEstado = fechaEstado;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(String fechaEstado) {
        this.fechaEstado = fechaEstado;
    }    
    
}
