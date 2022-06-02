package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author ajbazan01
 */
public class LecturaJSON {
    
    public static ArrayList<CruceroPOJO> LecturaJSON(String nombreFichero){
        
        ArrayList<CruceroPOJO> cruceros = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            cruceros.addAll(mapeador.readValue(new File(nombreFichero),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, CruceroPOJO.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cruceros;
        
        
    }
    
}
