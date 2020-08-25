package no.phasfjo.models.pilot;

import no.phasfjo.models.flight.Flight;

public class FullLicensePilot extends Pilot {
    @Override
    public boolean canAccept(Flight f) {
        return true;
    }
}
