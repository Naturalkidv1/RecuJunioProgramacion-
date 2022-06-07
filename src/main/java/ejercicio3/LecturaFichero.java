/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ajbazan01
 */
public class LecturaFichero {

    // Fichero a leer con datos de ejemplo
    private static final String idFichero = "matriz.txt";

    // Variables para guardar los datos que se van leyendo
    private static String[] tokens;
    private static String linea;

    private static Landscape[][] terreno = new Landscape[calcularFila()][calcularColumna()];

    private static int calcularColumna() {

        int contCol = 0;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en funciónn del carácter separador de campos

                tokens = linea.split(" ");

                contCol = tokens.length;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return contCol;

    }

    private static int calcularFila() {

        int contFila = 0;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en funciónn del carácter separador de campos

                tokens = linea.split("\n");

                for (String string : tokens) {
                    contFila++;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return contFila;

    }

    public static void recorrerAreaIslas(int ii, int jj) {

        ArrayList<Landscape> l1 = new ArrayList<>();
        ArrayList<Landscape> l2 = new ArrayList<>();
        ArrayList<Landscape> l3 = new ArrayList<>();
        ArrayList<Landscape> l4 = new ArrayList<>();

        for (int i = ii - 1; i < ii + 1; i++) {

            for (int j = jj - 1; j < jj + 1; j++) {

                //System.out.print(terreno[i][j] + "\t");
                if ((i >= 0 && i <= terreno.length) || (j >= 0 && j <= terreno[i].length)) {
                    l1.add(terreno[i][j]);
                }

            }

            for (int j = jj + 1; j < jj + 2; j++) {

                //System.out.print(terreno[i][j] + "\t");
                if ((i >= 0 && i <= terreno.length) || (j >= 0 && j <= terreno[i].length)) {
                    l2.add(terreno[i][j]);
                }

            }

        }

        for (int i = ii + 1; i < ii + 2; i++) {

            if ((i >= 0 && i <= terreno.length)) {
                for (int j = jj - 1; j < jj + 1; j++) {

                    //System.out.print(terreno[i][j] + "\t");
                    
                    
                    // REPOSITORIO DE CRIS TIENE LO QUE NECESITAS //
                    
                    if (true) {
                        
                    }
                    l3.add(terreno[i][j]);

                }
            }

            for (int j = jj + 1; j < jj + 2; j++) {

                //System.out.print(terreno[i][j] + "\t");
                l4.add(terreno[i][j]);

            }

        }

    }

    public static void main(String[] args) {

        System.out.println("Leyendo el fichero: " + idFichero);
        int i = 0;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en funciónn del carácter separador de campos

                tokens = linea.split("\n");
                tokens = linea.split(" ");

                //ArrayList<Landscape> terreno = new ArrayList<>();
                //-----------------------
                for (int j = 0; j < tokens.length; j++) {

                    if (tokens[j].equals("x")) {

                        terreno[i][j] = new Landscape(true, false);

                        /*if (((i == 1) && (j == 1))||((i == 4) && (j == 4))) {
                            terreno[i][j] = new Landscape(true, true);
                        }*/
                        if ((i >= 0 && i <= terreno.length) || (j >= 0 && j <= terreno[i].length)) {
                            recorrerAreaIslas(i, j);
                        }

                    } else if (tokens[j].equals("a")) {

                        terreno[i][j] = new Landscape(false, false);
                    }

                }

                i++;
                //contador++;
                //-----------------------
            }

            for (Landscape[] terreno1 : terreno) {
                System.out.println("");
                for (Landscape terreno11 : terreno1) {
                    System.out.print(terreno11 + " ");
                }
            }
            System.out.println("\n");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
