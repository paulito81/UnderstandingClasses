package no.phasfjo.models.math;

public class Divider extends CalculateBase implements MathProcessing{

    public Divider(){};

    public Divider(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double newDivVal = getRightValue() != 0 ? getLeftValue() / getRightValue() : 0.0d;
        setResult(newDivVal);
    }

    @Override
    public String getKeyWord() {
        return "divide";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightValue(rightVal);
        calculate();
        return getResult();
    }
}
