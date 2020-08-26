package no.phasfjo.models.math;

public class Adder extends CalculateBase implements MathProcessing{

    //explicit call default constructor from base
    public Adder(){};

    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double newAddVal = getLeftValue() + getRightValue();
        setResult(newAddVal);
    }

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }
}
