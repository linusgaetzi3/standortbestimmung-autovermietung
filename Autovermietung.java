import java.util.ArrayList;
import java.util.Scanner;

public class Autovermietung {
    ArrayList<Fahrzeug> fahrzeugArrayList = new ArrayList<>();

    public void fahrzeugHinzufuegen(Fahrzeug fahrzeug) {
        fahrzeugArrayList.add(fahrzeug);
    }

    public void alleFahrzeugeAnzeigen() {
        for (Fahrzeug fahrzeug : fahrzeugArrayList) {
            System.out.println(fahrzeug.toString());
        }
    }

    public int pruefeObFahrzeugVermietet() {
        int anzahlFrei = 0;
        for (int i = 0; i < fahrzeugArrayList.size(); i++) {
            if (!fahrzeugArrayList.get(i).isVermietet()) {
                System.out.println("Das " + i + " " + fahrzeugArrayList.get(i) + " ist noch nicht vermietet.");
                anzahlFrei++;
            } else {
                System.out.println("Das " + i + " " + fahrzeugArrayList.get(i) + " ist schon vermietet.");
            }
        }
        return anzahlFrei;
    }

    public Fahrzeug sucheNachKennzeichen(String kennzeichen) {
        for (Fahrzeug fahrzeug : fahrzeugArrayList) {
            if (fahrzeug.getKennzeichen().equals(kennzeichen.toUpperCase())) {
                return fahrzeug;
            }
        }
        return null;
    }

    public void fahrzeugMietenAnhandKennzeichen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welches Fahrzeug willst du mieten? Gib das Kennzeichen ein: ");
        String kennzeichen = scanner.next();
        Fahrzeug fahrzeug = sucheNachKennzeichen(kennzeichen);
        try {
            for (int i = 0; i < fahrzeugArrayList.size(); i++) {
                if (!fahrzeug.isVermietet()) {
                    fahrzeug.setVermietet(true);
                    System.out.println("Erfolgreich gemietet mit " + fahrzeug.berechneMietpreisProTag() + "CHF Mietgebühren pro Tag und du hast " + fahrzeug.berechneVersicherungPrämie() + "CHF Versicherungsprämie");
                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("Ungültiges Kennzeichen!");
        }
    }

    public void fahrzeugZurückgebenAnhandKennzeichen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welches Fahrzeug willst du zurückgeben? Gib das Kennzeichen ein: ");
        String kennzeichen = scanner.next();
        Fahrzeug fahrzeug = sucheNachKennzeichen(kennzeichen);
        try {


            for (int i = 0; i < fahrzeugArrayList.size(); i++) {
                if (fahrzeug.isVermietet()) {
                    fahrzeug.setVermietet(false);
                    System.out.println("Erfolgreich zurückgegeben mit " + fahrzeug.berechneVersicherungPrämie() + "CHF Versicherungsprämie (Cashback innerhalb von 3 Tagen nach rückgabe einlösen!)");
                }
                if (!fahrzeug.isVermietet()) {
                    System.out.println("Das Fahrzeug ist noch nicht vermietet, du kannst es nicht zurückgeben!");
                }


            }
        } catch (NullPointerException e) {
            System.out.println("Ungültiges Kennzeichen!");
        }
    }
}



