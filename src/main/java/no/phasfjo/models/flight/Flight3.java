package no.phasfjo.models.flight;

public class Flight3 {
    int seats = 150;
    int passengers;

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

    public void add1Passenger(){
        if(hasSeating()){
            passengers +=1;
        }
    }
    private boolean hasSeating(){
        return passengers < seats;
    }
}
