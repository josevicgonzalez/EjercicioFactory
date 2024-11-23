
package factoryclass;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class OrdenAscendente implements Ordenando {

        public void ordenarAsc(List<Persona> listaPersonas) {
       
        
    }

    @Override
    public void ordenar(List<Persona> listaPersonas) {
       Collections.sort(listaPersonas);
    }

 
    
}
