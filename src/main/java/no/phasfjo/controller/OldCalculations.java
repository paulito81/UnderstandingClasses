package no.phasfjo.controller;

import no.phasfjo.models.math.MathEquation;

import java.util.HashMap;
import java.util.Map;

public class OldCalculations {
    public OldCalculations(){
        newCalculations();
    }

    private void newCalculations(){
        HashMap<String, Double> newResults = new HashMap<>();

        double[] leftValues = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightValues= {50.0d, 92.0d, 17.0d, 3.0d};
        char[] operationCodes= {'d', 'a', 's', 'm'};
        double[] results = new double[operationCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for (int i = 0; i < operationCodes.length; i++) {
            results[i] = execute(operationCodes[i], leftValues[i], rightValues[i]);
            newResults.put(String.valueOf(operationCodes[i]), results[i] );
        }
        for(double currentResult : results){
            System.out.println("Result : " + currentResult);
        }

        for(Map.Entry<String, Double> s : newResults.entrySet()){
            System.out.println("Result '" + s.getKey() + "':\t" + s.getValue());
        }

    }

    private MathEquation create(double leftValue, double rightValue, char operationCodes) {
        MathEquation equation = new MathEquation();
        equation.setLeftValue(leftValue);
        equation.setRightValue(rightValue);
        equation.setOperationCode(operationCodes);
        return equation;
    }

    private double execute(char operationCode, double leftValue, double rightValue) {
        double result;
        switch (operationCode) {
            case 'a' -> result = leftValue + rightValue;
            case 's' -> result = leftValue - rightValue;
            case 'm' -> result = leftValue * rightValue;
            case 'd' -> result = rightValue != 0 ? leftValue / rightValue : 0.0d;
            default -> {
                System.err.println("Invalid operationCode: " + operationCode);
                result = 0.0d;
            }
        }
        return result;
    }
}
