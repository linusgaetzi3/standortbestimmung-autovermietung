public abstract class Fahrzeug extends Autovermietung implements Versicherbar{
    private int anzahlSitzplätze;
    private boolean vermietet;
    private double maximalGeschwindigkeit;
    private String farbe;
    private final String kennzeichen;

    public Fahrzeug(int anzahlSitzplätze, boolean vermietet, double maximalGeschwindigkeit, String farbe, String kennzeichen) {
        this.anzahlSitzplätze = anzahlSitzplätze;
        this.vermietet = vermietet;
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
        this.farbe = farbe;
        this.kennzeichen = kennzeichen;
    }

    public abstract double berechneMietpreisProTag();


    public int getAnzahlSitzplätze() {
        return anzahlSitzplätze;
    }

    public void setAnzahlSitzplätze(int anzahlSitzplätze) {
        this.anzahlSitzplätze = anzahlSitzplätze;
    }

    public boolean isVermietet() {
        return vermietet;
    }

    public void setVermietet(boolean vermietet) {
        this.vermietet = vermietet;
    }

    public double getMaximalGeschwindigkeit() {
        return maximalGeschwindigkeit;
    }

    public void setMaximalGeschwindigkeit(double maximalGeschwindigkeit) {
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }


    public String getKennzeichen() {
        return kennzeichen;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "anzahlSitzplätze=" + anzahlSitzplätze +
                ", maximalGeschwindigkeit=" + maximalGeschwindigkeit + "Km/h" +
                ", farbe='" + farbe + '\'' +
                ", vermietet='" + vermietet +
                ", kennzeichen='" + kennzeichen + '\'' +
                '}';
    }
}

