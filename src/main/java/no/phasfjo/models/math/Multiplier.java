package no.phasfjo.models.math;

public class Multiplier extends CalculateBase implements MathProcessing{

    public Multiplier(){};

    public Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double newMultiVal = getLeftValue() * getRightValue();
        setResult(newMultiVal);
    }

    @Override
    public String getKeyWord() {
        return "multiply";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }
}
