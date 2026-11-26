public class Main {

    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Autovermietung autovermietung = new Autovermietung();
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
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "0":
                    weiter = false;
                    System.out.println("Programm wir beendet...");
                    break;
            }

        }
    }
}