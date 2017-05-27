
package logica;

import java.util.List;

/**
 *Compañia encargada del transporte del envío desde su recepción en Miami hasta la residencia en Colombia
 * @author Jennifer
 */
public class Empresa {

    private String nombre;
    private List<Persona> personas;

    /**
     * Maneja un listado de personal que interviene en toda la operación
     * @param nombre
     * @param personas 
     */
    public Empresa(String nombre, List<Persona> personas) {
        this.nombre = nombre;
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }           

}
