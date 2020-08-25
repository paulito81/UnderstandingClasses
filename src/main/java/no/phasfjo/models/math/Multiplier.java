package no.phasfjo.models.math;

public class Multiplier extends CalculateBase {

    public Multiplier(){};

    public Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double newMultiVal = getLeftValue() * getRightValue();
        setResult(newMultiVal);
    }
}
