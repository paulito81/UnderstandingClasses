package no.phasfjo.models;

public class Passenger2 {

    int freeBags;
    int checkedBags;
    double perBagFee;

    public Passenger2(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d );
        this.freeBags = freeBags;
    }

    public Passenger2(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    public Passenger2(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
