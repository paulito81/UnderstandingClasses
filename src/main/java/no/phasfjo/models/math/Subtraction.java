package no.phasfjo.models.math;

public class Subtraction extends CalculateBase {

    public Subtraction(){};

    public Subtraction(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double newSubVal = getLeftValue() - getRightValue();
        setResult(newSubVal);
    }
}
