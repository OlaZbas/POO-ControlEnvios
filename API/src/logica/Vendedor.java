package logica;

/**
 * Empleado de la compañía quien registra las ventas y hace seguimiento a sus
 * clientes Hereda de Empleado
 *
 * @author Jennifer
 */
public class Vendedor extends Empleado {

    /**
     *
     * @param Codigo
     * @param nombre
     * @param cedula
     * @param email
     * @param telefono
     */
    public Vendedor(int Codigo, String nombre, int cedula, String email, int telefono) {
        super(Codigo, nombre, cedula, email, telefono);
    }

    @Override
    public int getCodigo() {
        return Codigo;
    }
/**
 * 
 * @param Codigo 
 */
    @Override
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

}
