package no.phasfjo.controller;

import no.phasfjo.models.Passenger;

public class BagController {

    private double bagPrice = 0.0d;

    public double getBagPrice() {
        return bagPrice;
    }

    public void setBagPrice(double bagPrice) {
        this.bagPrice = bagPrice;
    }

    public BagController(Passenger passenger){
        bagPrice = bagValidation(passenger.getCheckedBags(), 1, 25.0d, 50.0d);
    }

    private double bagValidation(int bags, int threshold, double minVal, double maxVal){
          return bags > threshold ? minVal : maxVal;
    }
}
