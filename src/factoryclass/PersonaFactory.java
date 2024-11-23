
package factoryclass;


public class PersonaFactory {
    
    public static Ordenando ordenarPor(String tipoOrden) {
    
      if (tipoOrden.equalsIgnoreCase("asc")) {
          return new OrdenAscendente();     
      }
      else if (tipoOrden.equalsIgnoreCase("desc")) {
    
          return new OrdenDescendente();
    }
          return null;
    }
    
}
