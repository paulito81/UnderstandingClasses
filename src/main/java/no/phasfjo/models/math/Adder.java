package no.phasfjo.models.math;

public class Adder extends CalculateBase {

    @Override
    public void calculate(){
        double newAddVal = getLeftValue() + getRightValue();
        setResult(newAddVal);
    }
}
