package edu.escuelaing.arep.model;

import edu.escuelaing.arep.linkedList.MyLinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CalculateMeanAndDeviationService {
    private Calculate mean;
    private Calculate standardDeviation;
    private List<Double> myLinkedList;

    /**
     * service class constructor
     */
    public CalculateMeanAndDeviationService() {
        this.mean = new Mean();
        this.standardDeviation = new StandardDeviation();
    }

    /**
     * Method of reading the file and saving data in linkedlist
     *
     * @param file file containing the data
     * @throws IOException error of reader file
     */
    public void FileReaderInput(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        List<Double> myLinkedList = new MyLinkedList<>();
        while ((line = bufferedReader.readLine()) != null) {
            myLinkedList.add(Double.parseDouble(line));
        }
        fileReader.close();
        this.myLinkedList = myLinkedList;
    }

    /**
     * Method that Mean the data
     *
     * @return Mean
     */
    public Double calculateMean() {
        mean.calculateResult(myLinkedList);
        return mean.getResult();
    }

    /**
     * Method that Standard Deviation the data
     *
     * @return Standard Deviation
     */
    public Double calculateStandardDeviation() {
        standardDeviation.calculateResult(myLinkedList);
        return standardDeviation.getResult();
    }
}