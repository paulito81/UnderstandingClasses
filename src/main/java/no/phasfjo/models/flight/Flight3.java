package no.phasfjo.models.flight;

import no.phasfjo.models.passenger.Passenger3;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Flight3 implements Comparable<Flight>, Iterable<Passenger3> {
    int seats = 150;
    int passengers;
    private final ArrayList<Passenger3> passengersList = new ArrayList<>();

    public void add1Passenger(Passenger3 ... newPassenger) {
        if(newPassenger.length > 1){
            Collections.addAll(passengersList, newPassenger);
        }
        if(hasSeating()){
            passengers +=1;
        }
    }

    private class FlightIterable implements Iterable<Passenger3>{
        @NotNull
        @Override
        public Iterator<Passenger3> iterator() {
            Passenger3[] passengers = new Passenger3[passengersList.size()];
            passengersList.toArray(passengers);
            Arrays.sort(passengers);
            return Arrays.asList(passengers).iterator();
        }
    }

    public Iterable<Passenger3> getOrderedPassengers() {

        return () -> {
            Passenger3[] passenger3s = new Passenger3[passengersList.size()];
            passengersList.toArray(passenger3s);
            Arrays.sort(passenger3s);
            return Arrays.asList(passenger3s).iterator();
        };
        //return new FlightIterable();
    }

    public Flight3() {
    }

    public Flight3(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    //Methods
    public void add1Passenger(String name){
        if(hasSeating()){
            passengers +=1;
        }
    }

    private boolean hasSeating(){
        return passengers < seats;
    }

    @Override
    public int compareTo(@NotNull Flight o) {
        return 0;
    }

    @NotNull
    @Override
    public Iterator<Passenger3> iterator() {
        return passengersList.iterator();
    }
}
