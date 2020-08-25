package no.phasfjo.models.math;

public class Adder extends CalculateBase {

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
}
