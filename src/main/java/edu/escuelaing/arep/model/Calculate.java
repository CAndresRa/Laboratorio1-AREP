package edu.escuelaing.arep.model;

import java.util.List;

public interface Calculate {
    /**
     * @return result of operation
     */
    public Double getResult();

    /**
     * Allow calculate mean and standard deviation
     * @param myLinkedList list containing the data for the calculation
     */
    public void calculateResult(List<Double> myLinkedList);
}