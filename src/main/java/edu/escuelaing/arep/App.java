package edu.escuelaing.arep;

import edu.escuelaing.arep.model.CalculateMeanAndDeviationService;

import java.io.*;

/**
 * Author: Carlos Andrés Ramírez Torres
 * ARSW 2020 - I
 */
public class App {
    /**
     * Start program of calculate the mean and standard deviation
     * @param args path of file
     * @throws IOException error of reader file
     */
    public static void main( String[] args ) throws IOException {
        String pathFile = args[0];
        File file = new File(pathFile);
        if( file.isDirectory() ){
            File[] files = file.listFiles();
            for(File f : files){
                if(f.isFile()){
                    calculateResult(f);
                }
            }
        } else {
            calculateResult(file);
        }
    }

    /**
     * Allows you to invoke the methods of the service to get the answers
     * @param file file containing the data
     * @throws IOException error of reader file
     */
    public static void calculateResult(File file) throws IOException {
        CalculateMeanAndDeviationService calculateService = new CalculateMeanAndDeviationService();
        calculateService.FileReaderInput(file);
        System.out.printf("La media es: %.2f", calculateService.calculateMean());
        System.out.println("\n");
        System.out.printf("La desviación estandar es: %.2f", calculateService.calculateStandardDeviation());
        System.out.println("\n");

    }
}