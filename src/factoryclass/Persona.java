
package factoryclass;


public class Persona implements Comparable<Persona> {
    private int Id;
    private String nombre;

    public Persona() {
    }

    public Persona(int Id, String nombre) {
        this.Id = Id;
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "Id=" + Id + ", nombre=" + nombre + '}';
    }
    
    
    
    
    @Override
     public int compareTo(Persona otraPersona) {
        return Integer.compare(this.Id, otraPersona.Id);
    }

    
    
}
