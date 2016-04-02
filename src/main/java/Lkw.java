/**
 * Created by Marketing on 02.04.2016.
 */
public class Lkw {

    String Marke;
    double Zuladung;
    boolean Verfuegbarkeit = true;
    static int Anzahl = 0;
    int AnzahlGrosseLkw;
    int AnzahlKleineLkw;
    int AnzahlHaenger;


    void GrosseLkw()
    {
        Marke = "MAN";
        Zuladung = 40;
        Verfuegbarkeit = true;
        Anzahl++;
        AnzahlGrosseLkw = Anzahl;
    }

    void KleineLkw()
    {
        Marke = "Iveco";
        Zuladung = 7.5;
        Verfuegbarkeit = true;
        Anzahl++;
        AnzahlKleineLkw = Anzahl;
    }

    void Haenger()
    {
        Marke = "Iveco";
        Zuladung = 4.5;
        Verfuegbarkeit = true;
        Anzahl++;
        AnzahlHaenger = Anzahl;
    }


}
