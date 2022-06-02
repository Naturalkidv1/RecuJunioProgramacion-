package ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author ajbazan01
 */
public class Programa {

    private static ArrayList<CruceroPOJO> cruceroList = LecturaJSON.LecturaJSON("cruceros.json");
    private static Map<String[], Integer> lista = new TreeMap<>();

    private static void comparatorPrecio() {

        Collections.sort(cruceroList, (c1, c2) -> Double.compare(c1.getPrecio(), c2.getPrecio()));
    }

    private static Map<String[], Integer> mapCrucerosxDestino(ArrayList<CruceroPOJO> estructuraObjetos) {

        Map<String[], Integer> agendaCruceros = new HashMap();
        int contador = 1;

        for (CruceroPOJO crucero : estructuraObjetos) {
            if (agendaCruceros.containsKey(crucero.getDestinos())) {
                contador++;
                agendaCruceros.put(crucero.getDestinos(), contador);
            } else {
                contador = 1;
                agendaCruceros.put(crucero.getDestinos(), contador);

            }
        }

        return agendaCruceros;

    }

    public static void main(String[] args) {

        System.out.println("-- Lista sin ordenar --");
        cruceroList.forEach(System.out::println);

        System.out.println("\n-- Lista ordenada por precio (y en su defecto, nombre) --\n");
        // aún falta que se ordene por el nombre
        comparatorPrecio();
        cruceroList.forEach(System.out::println);
        
        System.out.print("\n");

        lista = mapCrucerosxDestino(cruceroList);
        
        lista.forEach((clave, valor) -> System.out.println("Clave " + Arrays.toString(clave) + " -- Objeto " + valor));
        
    }

}
