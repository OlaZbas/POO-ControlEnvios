
package logica;

/**
 * Empleado de la compañía quien realiza las labores de bodegaje y despacho
 * Hereda de Empleado
 * @author Jennifer
 */
public class Operador extends Empleado{
    
    /**
     * 
     * @param Codigo
     * @param nombre
     * @param cedula
     * @param email
     * @param telefono 
     */
    public Operador(int Codigo, String nombre, int cedula, String email, int telefono) {
        super(Codigo, nombre, cedula, email, telefono);
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
}
