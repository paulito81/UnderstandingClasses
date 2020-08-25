package no.phasfjo.models.math;

public class Divider extends CalculateBase{

    public Divider(){};

    public Divider(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double newDivVal = getRightValue() != 0 ? getLeftValue() / getRightValue() : 0.0d;
        setResult(newDivVal);
    }
}
