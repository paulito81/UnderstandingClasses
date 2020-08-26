package no.phasfjo.models.flight;

import no.phasfjo.models.passenger.Passenger3;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class Flight3 implements Comparable<Flight>, Iterable<Passenger3> {
    int seats = 150;
    int passengers;
    private ArrayList<Passenger3> passengersList = new ArrayList<>();

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
