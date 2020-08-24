package no.phasfjo.models.flight;

import no.phasfjo.models.Passenger;

public class Flight2 {

    int passengers, seats, totalCheckedBags;

    public int getSeats() {
        return 150;
    }

    public void add1Passenger(){
        if(hasSeating()) {
            passengers +=1 ;
        }
    }
    public void add1Passenger(int bags){
        if(hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }

    public void add1Passenger(Passenger p){
        add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(int bags, int carryOns){
        if(carryOns <= 2){
            add1Passenger(bags);
        }
    }
    public void add1Passenger(Passenger p, int carryOns){
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    public void addPassengers(Passenger... list){

        if(hasSeating(list.length)){
            passengers += list.length;
            for(Passenger passenger : list){
                totalCheckedBags += passenger.getCheckedBags();
            }
        }
    }

    private boolean hasSeating(){
        return passengers < getSeats();
    }

    private boolean hasSeating(int count){
        return passengers + count <= seats;
    }

    @Override
    public String toString() {
        return "Flight2{" +
                "passengers=" + passengers +
                ", seats=" + seats +
                ", totalCheckedBags=" + totalCheckedBags +
                '}';
    }
}
