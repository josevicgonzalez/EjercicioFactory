
package factoryclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FactoryClass {


    public static void main(String[] args) {
        
        int identificador;
        String nombreCompleto;
        String ordenEjecutar;
        
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        
        Map<Integer, String> listadoMapaPersonas = new HashMap<>();
        
            
        Scanner entradaTeclado = new Scanner(System.in);
        
        for (int i=0; i<5; i++){
           System.out.println("Ingrese el ID: (únicamente números enteros) ");
           identificador = entradaTeclado.nextInt();
           entradaTeclado.nextLine();
           
           System.out.println("Ingrse el nombre de la persona: ");
           nombreCompleto = entradaTeclado.nextLine();
            
           listaPersonas.add(new Persona(identificador, nombreCompleto));
           
        
        }   
        
        System.out.println("_________________________________________________");
        System.out.println("A continuación se muestran los datos de las personas en el orden que fueron ingresados:");
        System.out.println(" ");
        
        for (Persona perso:listaPersonas) {
            System.out.println("ID: " + perso.getId() +  " Nombre: " + perso.getNombre());
            listadoMapaPersonas.put(perso.getId(), perso.getNombre());
            System.out.println(listadoMapaPersonas.values());
             
        }
        
        System.out.println("_________________________________________________");
        System.out.println("¿En qué orden desea que se muestren los datos?");
        System.out.println("Para orden Ascedente ingrese la palabra asc y para orden Descendente ingrese la palabra desc ");
        System.out.println("Ingrese las letras tal cual como se muestran: asc para ascendente o desc para descendente");
        System.out.println("");
        ordenEjecutar = entradaTeclado.nextLine();
        
        if (ordenEjecutar.equals("asc")) {
            OrdenandoListado ordenandoAsc = new OrdenandoListado("asc");
            ordenandoAsc.ordenarLista(listaPersonas);
            System.out.println("Lista ordenada Ascendente:  ");
            for (Persona perso: listaPersonas) {
               System.out.println(perso);
            }
        }    
        else if (ordenEjecutar.equals("desc")) {
                  OrdenandoListado ordenandoDesc = new OrdenandoListado("desc");
                  ordenandoDesc.ordenarLista(listaPersonas);
                   System.out.println("Lista ordenada Descendiente:  ");
              for (Persona perso: listaPersonas) {
                    System.out.println(perso);
            }
                }
        else {
            System.out.println("Error:Ingrese un valor correcto");
        }
       
        
        
        }
       

    }
    

