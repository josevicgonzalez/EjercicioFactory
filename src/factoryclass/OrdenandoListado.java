
package factoryclass;

import java.util.List;


public class OrdenandoListado {
    
    private Ordenando creandoOrden;
    
    public OrdenandoListado(String tipoOrdenamiento) {
        this.creandoOrden = PersonaFactory.ordenarPor(tipoOrdenamiento);
    }
    
    public void ordenarLista(List<Persona> listaPersonas) {
        creandoOrden.ordenar(listaPersonas);
    
    }
}



