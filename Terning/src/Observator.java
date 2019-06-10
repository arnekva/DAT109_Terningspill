import java.util.Scanner;

public class Observator {
    public static void main(String args[]) {

        Scanner tastatur = new Scanner(System.in);
        System.out.print("Hvor mange spillere?");
        int ant = tastatur.nextInt();tastatur.nextLine();
        Terningspill terningspill = new Terningspill(ant);
        for (int i = 1; i <= ant; i++) {
            System.out.print("Navn på spiller " + i + ".");
            terningspill.leggTilSpiller(tastatur.next());
        }
    Spiller vinner = terningspill.spill();
        System.out.println(vinner.getNavn() + " vant med scoren " + vinner.getVerdi());
    }
}
