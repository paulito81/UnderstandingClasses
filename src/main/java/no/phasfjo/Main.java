package no.phasfjo;

import no.phasfjo.controller.BagController;
import no.phasfjo.controller.Calculations;
import no.phasfjo.controller.FlightController;
import no.phasfjo.models.*;
import no.phasfjo.models.flight.Flight;
import no.phasfjo.models.flight.Flight2;
import no.phasfjo.models.flight.Flight3;
import no.phasfjo.models.math.*;
import org.jetbrains.annotations.NotNull;

import static no.phasfjo.controller.FlightController.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        performAwesomeCalculations();
    }

    private static void runAll(){
        flights();
        calculations();
        bags();
        flights2();
        flights3();
        cargoFlight();
        flightsF1();
        flightsF3();
    }

    private static void flights(){
        Flight nycToLax = new Flight(1, 2, "NYC", 10);
        Flight denToVerdana = new Flight(1,3,"DOV", 20);
        FlightController flightController = new FlightController(
                Arrays.asList(nycToLax, denToVerdana));
            flightController.addNewPassenger(1, 2, "LAX", 16);
        List<Flight> fList = swapFlight(nycToLax, denToVerdana);

        for(Flight s : fList){
            System.out.println(s.getFlightName());
        }
        System.out.println(swapNumbers(nycToLax, denToVerdana));
    }

    private static void calculations(){
        new Calculations();
    }
    private static void bags(){
        Passenger passenger = new Passenger(1, 1);
        BagController bagController = new BagController(passenger);
        System.out.println(bagController.getBagPrice());
    }

    private static void flights2() {
        Flight2 flight2 = new Flight2();
        flight2.add1Passenger();
        flight2.add1Passenger(2);
        Passenger passenger2 = new Passenger(0,2);
        flight2.add1Passenger(passenger2, 1);
        short threeBags = 3;
        flight2.add1Passenger(threeBags, 2); //automatic convert short to int
       // FlightController2 flightController2 = new FlightController2(flight2);
    }

    private static void flights3(){
        Flight2 flight = new Flight2();
        Passenger luisa = new Passenger(0,1);
        Passenger john = new Passenger(0,2);
        flight.addPassengers(luisa, john);

        Passenger harish = new Passenger(0,2);
        Passenger julie = new Passenger(0,2);
        Passenger ashanti = new Passenger(0,0);
        flight.addPassengers(harish, julie, ashanti);
    }

    private static void cargoFlight(){
        CargoFlight cargoFlight = new CargoFlight();
        cargoFlight.add1Package(1.0f, 2.5f, 3.0f);
        Passenger jack = new Passenger(0,2);
        cargoFlight.add1Passenger(jack);

        System.out.println("---CARGO FLIGHT METHOD---");
        System.out.println(cargoFlight.toString());
        Flight2 f = new CargoFlight(); //valid since it inheritance from FLight
        Passenger jack2 = new Passenger(0,2);
        f.add1Passenger(jack2);

        Flight2[] squad = new Flight2[5];
        squad[0] = new Flight2();
        squad[1] = new CargoFlight();
        squad[2] = new CargoFlight();
        squad[3] = new Flight2();
        squad[4] = new CargoFlight();

        System.out.println("----FLIGHT2 MULTIPLE ARRAY----");
        for(Flight2 fe : squad){
            System.out.println(fe);
        }
    }
    private static void flightsF1(){
        Flight3 flight3 = new Flight3();
        System.out.println(flight3.getSeats());

        CargoFlight cargoFlight = new CargoFlight();
        System.out.println(cargoFlight.getSeats());

        Flight2 flight2 = new CargoFlight();
        System.out.println(flight2.getSeats());
        flight2.add1Passenger();
    }

    private static void flightsF3(){
        Flight2 f1 = new Flight2();
        System.out.println(f1.getSeats());
        CargoFlight cargoFlight = new CargoFlight();
        System.out.println(cargoFlight.getSeats());
        Flight2 flight2 = new CargoFlight();
        System.out.println(flight2.getSeats());
        flight2.add1Passenger();
        cargoFlight.add1Passenger();
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal){
        calculation.setLeftValue(leftVal);
        calculation.setRightValue(rightVal);
        calculation.setResult(calculation.getResult());
        calculation.calculate();
        System.out.println("Calculation result: " + calculation.getResult());
    }

    private static void performAwesomeCalculations(){
        Divider divider = new Divider();
        doCalculation(divider, 100.0d, 50.0d);

        Adder adder = new Adder();
        doCalculation(adder,25.0d, 92.0d );

        Multiplier multiplier = new Multiplier();
        doCalculation(multiplier,11.0d, 3.0d );

        Subtractor subtractor = new Subtractor();
        doCalculation(subtractor, 225.0d, 17.0d);
    }

}
