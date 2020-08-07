package edu.escuelaing.arep.model;

import java.util.List;

public class StandardDeviation implements Calculate {
    private Double result;

    @Override
    public Double getResult() {
        return result;
    }

    @Override
    public void calculateResult(List<Double> myLinkedList) {
        double counter = 0;
        double mean = calculateMean(myLinkedList);
        for(Double data : myLinkedList){
            counter += Math.pow((data - mean),2);
        }
        try {
            this.result = Math.sqrt((counter / (myLinkedList.size() - 1)));
        } catch (Exception e){
            throw new ArithmeticException("Division by zero!");
        }
    }

    /**
     * Mean is necessary to calculate standard deviation
     * @param myLinkedList list containing the data for the calculation
     * @return Mean
     */
    public Double calculateMean(List<Double> myLinkedList){
        double counter = 0;
        for(Double data : myLinkedList){
            counter += data;
        }
        try{
            return counter/myLinkedList.size();
        } catch (Exception e){
            throw new ArithmeticException("Division by zero!");
        }
    }
}