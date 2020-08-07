package edu.escuelaing.arep.model;

import java.util.List;

public class Mean implements Calculate {
    private Double result;

    @Override
    public Double getResult() {
        return result;
    }

    @Override
    public void calculateResult(List<Double> myLinkedList) {
        double counter = 0;
        for (Double data : myLinkedList) {
            counter += data;
        }
        try {
            this.result = counter / myLinkedList.size();
        } catch (Exception e) {
            throw new ArithmeticException("Division by zero!");
        }
    }
}