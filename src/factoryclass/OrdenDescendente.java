
package factoryclass;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenDescendente implements Ordenando {
    
     public static void ordenarDesc(List<Persona> listaPersonas) {
       
    }

    @Override
    public void ordenar(List<Persona> listaPersonas) {
       Collections.sort(listaPersonas, Collections.reverseOrder());
    }

    

    
    
}


