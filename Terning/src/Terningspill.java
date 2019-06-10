import java.util.ArrayList;

public class Terningspill {
    private int id;
    private Kopp kopp = new Kopp();
    int antSpillere;
    private ArrayList<Spiller> spillerliste = new ArrayList<Spiller>();

    public Terningspill(int antSpillere) {
        this.antSpillere = antSpillere;
    }

    public ArrayList<Spiller> leggTilSpiller(String navn) {

        for (int i = 0; i < antSpillere; i++) {
            spillerliste.add(new Spiller(navn));

        }

        return spillerliste;
    }

    public Spiller spill() {
        Spiller vinner = null;
        antSpillere = spillerliste.size();
        for (int i = 0; i < antSpillere; i++) {
            spillerliste.get(i).spill(kopp);
        }
        vinner = spillerliste.get(0);
        for (int j = 0; j < antSpillere; j++) {
            if (spillerliste.get(j).getVerdi() > vinner.getVerdi()) {
                vinner = spillerliste.get(j);
            }

        }
        return vinner;
    }
}