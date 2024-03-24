package Übungen;

public class Rabatt {

    public static void main(String[] args) {
        
        double bestellwert;
        double bisherigesVolumen;
        boolean istPremiumKunde;

        berechneKundedenrabatt(2000, 60000, true);

    }

    public static void berechneKundedenrabatt(double bestellwert, double bisherigesVolumen, boolean istPremiumKunde){

        double mengenrabatt = 0;
        double treuerabatt = 0;
        double bonusrabatt = 0;
        double gesamtrabatt;

        if (bestellwert >= 100){
            mengenrabatt = 1;
        } else if (bestellwert >= 500){
            mengenrabatt = 2;
        } else if (bestellwert >= 2000){
            mengenrabatt = 3;
        } else if (bestellwert >= 5000){
            mengenrabatt = 5;
        }

        // if (bestellwert >= 5000) {
        //     mengenrabatt = 5;
        // } else if (bestellwert >= 2000) {
        //     mengenrabatt = 3;
        // } else if (bestellwert >= 500) {
        //     mengenrabatt = 2;
        // } else if (bestellwert >= 100) {
        //     mengenrabatt = 1;
        // }

        if (istPremiumKunde){
            mengenrabatt *=2;
        }

        if (bisherigesVolumen > 10000){
            treuerabatt = 7.5;
        } else if (bisherigesVolumen > 50000){
            treuerabatt = 12.5;
        }

        if (bestellwert > 2 * bisherigesVolumen){
            bonusrabatt = 3;
        }

        gesamtrabatt = mengenrabatt+treuerabatt+bonusrabatt;

        if (!istPremiumKunde && gesamtrabatt>15){ 
                gesamtrabatt = 15;
            }
         else if (istPremiumKunde && gesamtrabatt>15){
            gesamtrabatt = 20;
        }

        double bestellWertnachRabatt = (bestellwert - (bestellwert*(gesamtrabatt/100)));


        System.out.println("Bei einem Bestellwert von "+bestellwert);
        System.out.println("Gibt es einen Gesamtrabatt von "+ gesamtrabatt);
        System.out.println("Somit beträgt der Preis mit abzug des Rabatts: "+bestellWertnachRabatt);
    }

}
