package no.phasfjo.models;

import no.phasfjo.models.flight.Flight2;

public class CargoFlight extends Flight2 {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    int seats;

    public int getSeats() {
        return 12;
    }

    public void add1Package(float height, float width, float depth){
        float size = height * width * depth;
        if(hasCargoSpace(size)){
            usedCargoSpace += size;
        }
        else{
            handleNoSpace();
        }
    }

    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace(){
        System.out.println("Not enough space");
    }

    @Override
    public String toString() {
        return "CargoFlight{" +
                "maxCargoSpace=" + maxCargoSpace +
                ", usedCargoSpace=" + usedCargoSpace +
                '}';
    }
}
