package no.phasfjo.models.pilot;

import no.phasfjo.models.flight.Flight;

public class CargoOnlyPilot extends Pilot {
    @Override
    public boolean canAccept(Flight f) {
        return f.getAmountPassengers() == 0;
    }
}
