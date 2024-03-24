package Übungen;

public class Autobong {

    public static void main(String[] args) {
        
        double wurst = 2.40;
        double Brieftasche = 50.0;
        double anzW = 0;
        double summe = 0;

        if (summe > Brieftasche){
            System.out.println("Du hast zu wenig geld");
        }
                else { 
                    while (summe <= Brieftasche){
                        summe += wurst;
                        anzW++;
                    }
                }
                System.out.println(summe);
                System.out.println(anzW);
    }
}
    


