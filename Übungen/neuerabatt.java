package Übungen;

public class neuerabatt {

    public static void main(String[] args) {
        // Beispielausgangswerte
        double bestellwert = 2500; // Beispielwert
        double bisherigesKundenBestellvolumen = 15000; // Beispielwert
        boolean istPremiumKunde = true; // Beispielwert

        berechneUndZeigeKundenrabatt(2000,60000, true);
    }

    private static void berechneUndZeigeKundenrabatt(double bestellwert, double bisherigesKundenBestellvolumen, boolean istPremiumKunde) {
        double mengenrabatt = 0;
        double treuerabatt = 0;
        double bonusRabatt = 0;
        double gesamtRabatt;

        // Mengenrabatt berechnen
        if (bestellwert >= 5000) {
            mengenrabatt = 5;
        } else if (bestellwert >= 2000) {
            mengenrabatt = 3;
        } else if (bestellwert >= 500) {
            mengenrabatt = 2;
        } else if (bestellwert >= 100) {
            mengenrabatt = 1;
        }

        // Premiumkunde Mengenrabatt verdoppeln
        if (istPremiumKunde) {
            mengenrabatt *= 2;
        }

        // Treuerabatt berechnen
        if (bisherigesKundenBestellvolumen > 50000) {
            treuerabatt = 12.5;
        } else if (bisherigesKundenBestellvolumen > 10000) {
            treuerabatt = 7.5;
        }

        // Bonus-Rabatt prüfen
        if (bestellwert > 2 * bisherigesKundenBestellvolumen) {
            bonusRabatt = 3;
        }

        // Gesamtrabatt berechnen
        gesamtRabatt = mengenrabatt + treuerabatt + bonusRabatt;

        // Rabattgrenze prüfen und anpassen
        if (!istPremiumKunde && gesamtRabatt > 15) {
            gesamtRabatt = 15;
        } else if (istPremiumKunde && gesamtRabatt > 20) {
            gesamtRabatt = 20;
        }

        // Bestellwert nach Rabatt
        double bestellwertNachRabatt = bestellwert - (bestellwert * gesamtRabatt / 100);

        // Ausgabe
        System.out.println("Ursprünglicher Bestellwert: " + bestellwert + " EUR");
        System.out.println("Gesamtrabatt: " + gesamtRabatt + "%");
        System.out.println("Bestellwert nach Rabatt: " + bestellwertNachRabatt + " EUR");
    }
}


