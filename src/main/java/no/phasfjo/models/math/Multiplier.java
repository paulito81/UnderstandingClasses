package no.phasfjo.models.math;

public class Multiplier extends CalculateBase {

    @Override
    public void calculate(){
        double newMultiVal = getLeftValue() + getRightValue();
        setResult(newMultiVal);
    }
}
