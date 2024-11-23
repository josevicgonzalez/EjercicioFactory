
package factoryclass;

public class EjecutaOrdenFactory {
    public static Ordenando crearOrden(String tipo) {
    
        switch (tipo.toLowerCase()) {
        
            case "asc":
                return new OrdenAscendente();
            case "desc":
                return new OrdenDescendente();
            default:
                throw new IllegalArgumentException("Ingrse el dato correcto");
        }
    }
    
}
