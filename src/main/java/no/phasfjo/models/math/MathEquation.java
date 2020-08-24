package no.phasfjo.models.math;

public class MathEquation {

    private double leftValue;
    private double rightValue;
    private char operationCode;
    private double result;

    // counting numbers of equations
    private static int numberOfCalculations;
    private static double sumOfResults;

    public double getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public double getRightValue() {
        return rightValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public char getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(char operationCode) {
        this.operationCode = operationCode;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public MathEquation() {
    }

    public MathEquation(char operationCode) {
        this.operationCode = operationCode;
    }

    public MathEquation(char operationCode, double leftValue, double rightValue ) {
        this(operationCode);
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public void execute(){
        switch (operationCode) {
            case 'a' -> result = leftValue + rightValue;
            case 's' -> result = leftValue - rightValue;
            case 'm' -> result = leftValue * rightValue;
            case 'd' -> result = rightValue != 0 ? leftValue / rightValue : 0.0d;
            default -> {
                System.err.println("Invalid operationCode: " + operationCode);
                result = 0.0d;
            }
        }
        numberOfCalculations++;
        sumOfResults += result;
    }
    // overload execute method
    public void execute(double leftValue, double rightValue){
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        execute();
    }
    // overload execute method2 using doubles anyway
    public void execute(int leftValue, int rightValue){
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        execute();
        result = (int) result;
    }

    public static double getAverageResult(){
        return sumOfResults / numberOfCalculations;
    }
}
