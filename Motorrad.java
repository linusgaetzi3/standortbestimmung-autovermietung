public class Motorrad extends Fahrzeug implements Versicherbar{
    public Motorrad(int anzahlSitzplätze, boolean vermietet, double maximalGeschwindigkeit, String farbe) {
        super(anzahlSitzplätze, vermietet, maximalGeschwindigkeit, farbe);
    }

    @Override
    public double berechneMietpreisProTag() {
        return 30 + getAnzahlSitzplätze() * 5;
    }

    @Override
    public double berechneVersicherungPrämie() {
        return 200 + getAnzahlSitzplätze() * 0.05;
    }
}
