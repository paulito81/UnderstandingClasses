package no.phasfjo.controller;

import no.phasfjo.models.flight.Flight;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class FlightController {

    private List<Flight> listOfFlight = new ArrayList<>();

    public List<Flight> getListOfFlight() {
        return listOfFlight;
    }

    public void setListOfFlight(List<Flight> listOfFlight) {
        this.listOfFlight = listOfFlight;
    }

    public FlightController(){
    }

    public FlightController(List<Flight> flights){
        for(Flight f : Objects.requireNonNull(populateFlights(flights))){
            System.out.println("{Flight created: " + f.getFlightName() + ", " +
                    "Available seats:" +f.getPassengerSeats() + ", " +
                    "Passengers: " + f.getAmountPassengers() +"}");
        }
    }

    private List<Flight> populateFlights(List<Flight> flights){
        if(flights.size() > 0) {
           listOfFlight.addAll(flights);
           return listOfFlight;
        }
        return null;
    }

    public void addNewPassenger(int passengers, int seats, String flight, int flightNumber){

        if(passengers!= 0 && flightNumber > 1 && hasSeating(passengers, seats) && !flight.equals("")){

            successfully(passengers, seats, flight, flightNumber);
            passengers +=1;
            seats -=1;
            listOfFlight.add(new Flight(passengers, seats, flight, flightNumber));
        }
        else {
            System.err.println("Error missing values! " +
                    "\nFlight name: " + flight +
                    "\nFlight number: " + flightNumber +
                    "\nPassenger amount = " + passengers +
                    "\nOr possible missing amount of passenger seats = " + seats);
        }
    }
    private void successfully(int passengers, int seats, String flight, int flightNumber){
        String one = passengers + " new passengers has booked a seat on "
                + flight+", flightNumber: '" + flightNumber +
                "'. And there are " + seats + " seats left. With a total of " + passengers + 1 + " passengers.";
        String two = passengers + " new passenger has booked a seat on "
                + flight+". With flightNumber [" + flightNumber +
                "]. And there are " + seats + " seats left. With a total of " + passengers + 1 + " passengers.";
        switch (passengers) {
            case 1 -> System.out.println(one);
            case 2 -> System.out.println(two);
            default -> System.err.println("Error");
        }
    }
    private void overbookedFlight(){
        System.out.println("We are sorry, but the flight is overbooked!");
    }

    public boolean hasRoom(Flight flight, int total){
        return true;
    }

    private boolean hasSeating(int passengers, int seats){
        return passengers < seats;
    }
    //TODO does not work if its not public
    public static List<Flight> swapFlight(Flight a, Flight b){
       List<Flight> list = new ArrayList<>();
        Flight c = a;
        a = b;
        b = c;

        list.add(a);
        list.add(b);
        return list;
    }

    //TODO does not work if its not public
   public static String swapNumbers(Flight i, Flight j){
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
       return "Flight number: " + k;

    }
}
