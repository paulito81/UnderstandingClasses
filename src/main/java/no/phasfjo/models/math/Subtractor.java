package no.phasfjo.models.math;

public class Subtractor extends CalculateBase {

    @Override
    public void calculate(){
        double newSubVal = getLeftValue() + getRightValue();
        setResult(newSubVal);
    }
}
