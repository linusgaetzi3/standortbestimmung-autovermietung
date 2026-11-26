

public class Main {

    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Autovermietung autovermietung = createObjectsForAutovermietung();
        boolean weiter = true;

        while (weiter) {
            System.out.println("=== Autovermietung Menü ===");
            System.out.println("1) Alle Fahrzeuge anzeigen");
            System.out.println("2) Fahrzeuge mieten anhand Kennzeichen");
            System.out.println("3) Fahrzeug zurückgeben anhand Kennzeichen");
            System.out.println("0) Beenden");
            System.out.println("Auswahl: ");

            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    autovermietung.alleFahrzeugeAnzeigen();
                    break;
                case "2":
                    autovermietung.pruefeObFahrzeugVermietet();
                    autovermietung.fahrzeugMietenAnhandKennzeichen();
                    break;
                case "3":
                    autovermietung.pruefeObFahrzeugVermietet();
                    autovermietung.fahrzeugZurückgebenAnhandKennzeichen();
                    break;
                case "0":
                    weiter = false;
                    System.out.println("Programm wir beendet...");
                    break;
                default:
                    System.out.println("Ungültige Eingabe, bitte erneut Versuchen.");
            }
            System.out.println();
        }
        scanner.close();

    }

    private static Autovermietung createObjectsForAutovermietung() {
        Autovermietung autovermietung = new Autovermietung();
        Fahrzeug auto = new Auto(5, false, 205, "black", "ZH95647");
        Fahrzeug auto2 = new Auto(4, false, 230, "white", "AG7456327");
        Fahrzeug motorrad = new Motorrad(2, false, 180, "silver", "LZ86738");
        Fahrzeug motorrad2 = new Motorrad(3, false, 195, "red", "ZH4652728");
        autovermietung.fahrzeugHinzufuegen(auto);
        autovermietung.fahrzeugHinzufuegen(auto2);
        autovermietung.fahrzeugHinzufuegen(motorrad);
        autovermietung.fahrzeugHinzufuegen(motorrad2);
        return autovermietung;
    }

}