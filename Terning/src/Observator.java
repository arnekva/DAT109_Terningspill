import java.util.ArrayList;
import java.util.Scanner;

public class Observator {
    public static void main(String args[]) {

        Scanner tastatur = new Scanner(System.in);
        System.out.print("Hvor mange spillere? ");
        int ant = tastatur.nextInt();
        tastatur.nextLine();
        Terningspill terningspill = new Terningspill(ant);
        for (int i = 1; i <= ant; i++) {
            System.out.print("Navn på spiller " + i + "/" + ant + ": ");
            terningspill.leggTilSpiller(tastatur.next());
        }

        ArrayList<Spiller> vinner = terningspill.spill();
        if (vinner.size() > 1) {
            System.out.println("Det er flere vinnere! Gratulerer til: " );
            for (int i = 0; i < vinner.size(); i++) {
                System.out.print(vinner.get(i).getNavn());
                if(i==vinner.size()-2){
                    System.out.print(" og ");
                } else if(i<vinner.size()-2){
                    System.out.print(", ");
                }
            }
            System.out.print(" som "+ (vinner.size()>2 ? "alle": "begge") +" scoret " + vinner.get(0).getVerdi() + " poeng!");
        } else {
            System.out.println("\n" + vinner.get(0) + " vant med scoren " + vinner.get(0).getVerdi());
        }
    }
}
