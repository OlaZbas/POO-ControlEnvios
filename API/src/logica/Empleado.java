
package logica;

/**
 *Clase que extiende de "persona" 
 * @author Jennifer
 */
public class Empleado extends Persona{
    
    public int Codigo;

    /**
     * Lleva datos básicos y código que lo identifica dentro de la compañía
     * @param Codigo
     * @param nombre
     * @param cedula
     * @param email
     * @param telefono 
     */
    public Empleado(int Codigo, String nombre, int cedula, String email, int telefono) {
        super(nombre, cedula, email, telefono);
        this.Codigo = Codigo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
}
