package no.phasfjo.controller;

import no.phasfjo.models.flight.Flight3;
import no.phasfjo.models.passenger.Passenger3;

public class FlightController3 {

    private final Flight3 flight3;

    public FlightController3(Flight3 flight3){
        this.flight3 = flight3;
    }

    public void addPassenger(Passenger3 ... passenger){
        for(Passenger3 f : passenger){
            flight3.add1Passenger(f.getName());
            System.out.println(f.getName());
        }
    }
}
