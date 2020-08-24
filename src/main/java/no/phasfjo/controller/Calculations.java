package no.phasfjo.controller;
import no.phasfjo.models.math.MathEquation;

import java.util.HashMap;
import java.util.Map;

public class Calculations {

    public Calculations(){
        newCalculations();
    }

    private void newCalculations() {
        HashMap<String, Double> newResults = new HashMap<>();
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        System.out.println("--------RESULTS-----------");
        for (MathEquation equation : equations) {
            equation.execute();
            newResults.put(String.valueOf(equation.getOperationCode()), equation.getResult());
        }

        for(Map.Entry<String, Double> s : newResults.entrySet()){
            System.out.println("Result \t'" + s.getKey() + "':\t" + s.getValue());
        }
        System.out.println("---------------------\nAverage result: " + MathEquation.getAverageResult());

        System.out.println("\n----------------------\nUsing execute overloads:\n----------------------");

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overloaded result with doubles: " + equationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;
        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overloaded result with integer: " + equationOverload.getResult());

    }
}
