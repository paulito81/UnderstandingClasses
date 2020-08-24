package no.phasfjo.models.math;

public class Divider extends CalculateBase{

    @Override
    public void calculate(){
        double newDivVal = getRightValue() != 0 ? getLeftValue() / getRightValue() : 0.0d;
        setResult(newDivVal);
    }
}
