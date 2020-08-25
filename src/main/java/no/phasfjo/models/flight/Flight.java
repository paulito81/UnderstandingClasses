package no.phasfjo.models.flight;

public class Flight {

    private int amountPassengers;
    private int passengerSeats;
    private String flightName;
    private int flightNumber;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }


    public int getAmountPassengers() {
        return amountPassengers;
    }

    public void setAmountPassengers(int amountPassengers) {
        this.amountPassengers = amountPassengers;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public Flight() {
    }

    public Flight(String flightName){
        this.flightName = flightName;
    }

    public Flight(int amountPassengers, int passengerSeats, String flightName, int flightNumber) {
        this.amountPassengers = amountPassengers;
        this.passengerSeats = passengerSeats;
        this.flightName = flightName;
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "amountPassengers=" + amountPassengers +
                ", passengerSeats=" + passengerSeats +
                ", flightName='" + flightName + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }
}

