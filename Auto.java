public class Auto extends Fahrzeug implements Versicherbar{


    public Auto(int anzahlSitzplätze, boolean vermietet, double maximalGeschwindigkeit, String farbe, String kennzeichen) {
        super(anzahlSitzplätze, vermietet, maximalGeschwindigkeit, farbe, kennzeichen);
    }

    @Override
    public double berechneMietpreisProTag() {
        return 30 + getAnzahlSitzplätze() * 5;
    }

    @Override
    public double berechneVersicherungPrämie() {
        return 200 + getAnzahlSitzplätze() * 0.05;
    }
    public void auto(){

    }
}
