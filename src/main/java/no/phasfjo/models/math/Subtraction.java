package no.phasfjo.models.math;

public class Subtraction extends CalculateBase implements MathProcessing {

    public Subtraction(){};

    public Subtraction(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double newSubVal = getLeftValue() - getRightValue();
        setResult(newSubVal);
    }

    @Override
    public String getKeyWord() {
        return "subtract";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }
}
