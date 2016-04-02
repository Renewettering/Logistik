import java.util.Scanner;

/**
 * Created by Marketing on 02.04.2016.
 */
public class Logistik {
    public static void main(String[] args) {

        String tonnen,ortEingabe;
        int tonnenTour;
        Scanner scan = new Scanner(System.in);
        //String Eingabelieferort;

        // Toureneingabe tonnen
        Touren Eingabetouren = new Touren();
        System.out.println("Bitte geben sie die Tonnenanzahl von Ihrer Lieferung ein: ");
        tonnen = scan.nextLine();
        tonnenTour = Integer.parseInt(tonnen);
        Eingabetouren.EingabeTonnen = tonnenTour;


        //Toureneingabe lieferort
        Lieferorte Eingabelieferort = new Lieferorte();
        System.out.println("Bitte geben sie den Lieferort der Lieferung ein: ");
        ortEingabe = scan.nextLine();
        String ort =ortEingabe.toLowerCase();
        Eingabelieferort.EingabeLieferort = ort;

        Eingabelieferort.compare();
        Lkw lkw1 = new Lkw();
        lkw1.GrosseLkw();
        Lkw lkw2 = new Lkw();
        lkw2.GrosseLkw();
        Lkw lkw3 = new Lkw();
        lkw3.GrosseLkw();
        int zahl = lkw3.AnzahlGrosseLkw;
        double zahl1 = lkw1.Zuladung;
        System.out.println("Sie haben " + zahl + " LKW mit " + zahl1 +" Tonnen");





    }
}
