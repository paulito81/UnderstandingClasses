package no.phasfjo.models;

import no.phasfjo.models.math.MathProcessing;

public class DynamicHelper {
    private final MathProcessing[] handlers; // create an array of MathProcessing
    public DynamicHelper(MathProcessing[] handlers){ // use the array.
        this.handlers = handlers;
    }

    public void process(String statement){
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword  = parts[0];
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);

        MathProcessing theHandler = null;
        for(MathProcessing handler : handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyWord())){ //Ask handler with keywords it understands
                theHandler = handler;
                break;
            }
        }
        if(theHandler !=null) {
            double result = theHandler.doCalculation(leftVal, rightVal);
            System.out.println("Result = " + result);
        }
    }
}
