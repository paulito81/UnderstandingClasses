package no.phasfjo.controller;
import no.phasfjo.models.flight.Flight2;

public class FlightController2 {

    public FlightController2(Flight2 flight){
        addPassenger(flight);
    }

    private void addPassenger(Flight2 flight2){
        System.out.println(flight2.toString());
    }
}
