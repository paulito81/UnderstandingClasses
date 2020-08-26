package no.phasfjo;

import no.phasfjo.controller.BagController;
import no.phasfjo.controller.Calculations;
import no.phasfjo.controller.FlightController;
import no.phasfjo.controller.FlightController3;
import no.phasfjo.models.CrewMember;
import no.phasfjo.models.DynamicHelper;
import no.phasfjo.models.FlightCrewJob;
import no.phasfjo.models.flight.CargoFlight;
import no.phasfjo.models.flight.Flight;
import no.phasfjo.models.flight.Flight2;
import no.phasfjo.models.flight.Flight3;
import no.phasfjo.models.math.*;
import no.phasfjo.models.passenger.Passenger;
import no.phasfjo.models.passenger.Passenger3;

import static no.phasfjo.controller.FlightController.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        flyEvenMore();
    }

    private static void runAll() {
        flights();
        calculations();
        bags();
        flights2();
        flights3();
        cargoFlight();
        flightsF1();
        flightsF3();
        performAwesomeCalculations();
        performEvenMoreAwesomeCalculations();
        performEnums();
        crewMembers();
        executeInteractively();
        passengerDemo();
        flySomeMore();
        dynamicInteractivity();
        flyFastFlyHard();
        flyEvenMore();
    }

    private static void flights() {
        Flight nycToLax = new Flight(1, 2, "NYC", 10);
        Flight denToVerdana = new Flight(1, 3, "DOV", 20);
        FlightController flightController = new FlightController(
                Arrays.asList(nycToLax, denToVerdana));
        flightController.addNewPassenger(1, 2, "LAX", 16);
        List<Flight> fList = swapFlight(nycToLax, denToVerdana);

        for (Flight s : fList) {
            System.out.println(s.getFlightName());
        }
        System.out.println(swapNumbers(nycToLax, denToVerdana));
    }

    private static void calculations() {
        new Calculations();
    }

    private static void bags() {
        Passenger passenger = new Passenger(1, 1);
        BagController bagController = new BagController(passenger);
        System.out.println(bagController.getBagPrice());
    }

    private static void flights2() {
        Flight2 flight2 = new Flight2();
        flight2.add1Passenger();
        flight2.add1Passenger(2);
        Passenger passenger2 = new Passenger(0, 2);
        flight2.add1Passenger(passenger2, 1);
        short threeBags = 3;
        flight2.add1Passenger(threeBags, 2); //automatic convert short to int
        // FlightController2 flightController2 = new FlightController2(flight2);
    }

    private static void flights3() {
        Flight2 flight = new Flight2();
        Passenger luisa = new Passenger(0, 1);
        Passenger john = new Passenger(0, 2);
        flight.addPassengers(luisa, john);

        Passenger harish = new Passenger(0, 2);
        Passenger julie = new Passenger(0, 2);
        Passenger ashanti = new Passenger(0, 0);
        flight.addPassengers(harish, julie, ashanti);
    }

    private static void cargoFlight() {
        CargoFlight cargoFlight = new CargoFlight();
        cargoFlight.add1Package(1.0f, 2.5f, 3.0f);
        Passenger jack = new Passenger(0, 2);
        cargoFlight.add1Passenger(jack);

        System.out.println("---CARGO FLIGHT METHOD---");
        System.out.println(cargoFlight.toString());
        Flight2 f = new CargoFlight(); //valid since it inheritance from FLight
        Passenger jack2 = new Passenger(0, 2);
        f.add1Passenger(jack2);

        Flight2[] squad = new Flight2[5];
        squad[0] = new Flight2();
        squad[1] = new CargoFlight();
        squad[2] = new CargoFlight();
        squad[3] = new Flight2();
        squad[4] = new CargoFlight();

        System.out.println("----FLIGHT2 MULTIPLE ARRAY----");
        for (Flight2 fe : squad) {
            System.out.println(fe);
        }
    }

    private static void flightsF1() {
        Flight3 flight3 = new Flight3();
        System.out.println(flight3.getSeats());

        CargoFlight cargoFlight = new CargoFlight();
        System.out.println(cargoFlight.getSeats());

        Flight2 flight2 = new CargoFlight();
        System.out.println(flight2.getSeats());
        flight2.add1Passenger();
    }

    private static void flightsF3() {
        Flight2 f1 = new Flight2();
        System.out.println(f1.getSeats());
        CargoFlight cargoFlight = new CargoFlight();
        System.out.println(cargoFlight.getSeats());
        Flight2 flight2 = new CargoFlight();
        System.out.println(flight2.getSeats());
        flight2.add1Passenger();
        cargoFlight.add1Passenger();
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal) {
        calculation.setLeftValue(leftVal);
        calculation.setRightValue(rightVal);
        calculation.setResult(calculation.getResult());
        calculation.calculate();
        System.out.println("Calculation result: " + calculation.getResult());
    }

    private static void performEvenMoreAwesomeCalculations() {
        CalculateBase[] calculations = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtraction(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d),
        };
        System.out.println("******************\nArray Calculations:\n******************");
        for (CalculateBase calculation : calculations) {
            calculation.calculate();
            System.out.format("Result: " + calculation.getClass().getName().replace("no.phasfjo.models.math.", "") + "\t = " + calculation.getResult() + "]");
        }
    }

    private static void performAwesomeCalculations() {
        Divider divider = new Divider();
        doCalculation(divider, 100.0d, 50.0d);

        Adder adder = new Adder();
        doCalculation(adder, 25.0d, 92.0d);

        Multiplier multiplier = new Multiplier();
        doCalculation(multiplier, 11.0d, 3.0d);

        Subtraction subtractor = new Subtraction();
        doCalculation(subtractor, 225.0d, 17.0d);
    }

    private static void performEnums() {
        FlightCrewJob pilotJob = FlightCrewJob.PILOT;
        FlightCrewJob flightAttendantJob = FlightCrewJob.FLIGHT_ATTENDANT;
        displayJobResponsibility(pilotJob);
        displayJobResponsibility(flightAttendantJob);
    }

    private static void displayJobResponsibility(FlightCrewJob job) {
        switch (job) {
            case FLIGHT_ATTENDANT -> System.out.println("The Flight attendant: Assures passenger safety");
            case COPILOT -> System.out.println("The Co-Pilot: Assists in flying the plane");
            case PILOT -> System.out.println("The Pilot: Flies the plane");
            default -> System.err.println("Error not a valid value");
        }
    }

    private static void crewMembers() {
        CrewMember geetha = new CrewMember(FlightCrewJob.PILOT, "Geetha");
        CrewMember bob = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT, "Bob");
        whoIsInCharge(geetha, bob);
    }

    private static void whoIsInCharge(CrewMember member1, CrewMember member2) {
        CrewMember theBoss = member1.getJob().compareTo(member2.getJob()) > 0 ? member1 : member2;
        System.out.println(theBoss.getJob().getTitle() + " " + theBoss.getName() + " is boss");
    }

    static void executeInteractively() {
        System.out.println("Skriv inn et matte operasjon og to tall.\t(eks. add 10 20)");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" "); // Use this to split up text input.
        performOperation(parts);
    }

    private static boolean checkValidation(String[] parts) {
        return parts.length > 2 && !parts[0].equals("") && !parts[1].equals("") && !parts[2].equals("");
    }
    private static boolean checkValidation(String parts){
        //TODO create a test for values
        return !parts.equals("") && parts.length() > 3  ;
    }

    private static void performOperation(String[] parts) {
        if (checkValidation(parts)) {
            MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
            double leftVal = Double.parseDouble(parts[1]);
            double rightVal = Double.parseDouble(parts[2]);
            Calculations calc = new Calculations(operation, leftVal, rightVal);
            CalculateBase calculateBase = calc.createCalculation(operation, leftVal, rightVal);
            calculateBase.calculate();
            System.out.println("Operation performed: " + operation);
            System.out.println(calculateBase.getResult());
        } else {
            System.err.print("Error, you did not type a correct value. You typed: ");
            Arrays.stream(parts).forEach(System.err::println);
        }
    }

    private static void passengerDemo() {
        Passenger3[] passengers = {
                new Passenger3("Luisa", 1, 180),
                new Passenger3("Jack", 1, 90),
                new Passenger3("Ashanti", 3, 730),
                new Passenger3("Harish", 2, 150)
        };

        Arrays.sort(passengers); // order the array based on the comparable interface
        for (Passenger3 p : passengers) {
            System.out.println(p.toString());
        }
    }

    private static void flySomeMore() {
        Flight3 flight3 = new Flight3(175);
        FlightController3 flightController3 = new FlightController3(flight3);
        flightController3.addPassenger(
                new Passenger3("Santiago"),
                new Passenger3("Julie"),
                new Passenger3("John"),
                new Passenger3("Geetha")
        );
    }

    private static void dynamicInteractivity(){
        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new PowerOf(),
                new Adder(),
                new Multiplier(),
                new Divider(),
                new Subtraction()
        });
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if( checkValidation(userInput)){
            helper.process(userInput);
        }
        else{
            System.err.println("No value!");
        }
    }

    private static void flyFastFlyHard(){
        Passenger3 steve = new Passenger3("Steve", 3, 180);
        Passenger3.RewardProgram platinum = new Passenger3.RewardProgram();
        platinum.setMemberLevel(3);
        if(steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel())
            System.out.println("Steve is Platinum customer");
    }

    private static void flyEvenMore(){
        Flight3 f175 = new Flight3(175);
        Passenger3[] passengersList = {
        new Passenger3("Luisa", 1, 190),
        new Passenger3("Jack", 1, 90),
        new Passenger3("Ashanti", 3, 730),
        new Passenger3("Harish", 2, 150)
        };
        f175.add1Passenger(passengersList);
        for(Passenger3 p : f175.getOrderedPassengers())
            System.out.println(p.getName());
    }
}