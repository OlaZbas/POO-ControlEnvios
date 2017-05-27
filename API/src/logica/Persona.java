
package logica;

/**
 *Metodo que registra todo el personal que tiene vinculo con la compañía
 * @author Jennifer
 */
public abstract class Persona {
    
    private String nombre;
    private int cedula;
    private String email;
    private int telefono;
/**
 * 
 * @param nombre
 * @param cedula
 * @param email
 * @param telefono 
 */
    public Persona(String nombre, int cedula, String email, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
