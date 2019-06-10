import java.util.ArrayList;

public class Terningspill {
    private int id;
    private Kopp kopp = new Kopp();
    int antSpillere;
    private ArrayList<Spiller> spillerliste = new ArrayList<Spiller>();

    public Terningspill(int antSpillere) {
        this.antSpillere = antSpillere;
    }

    public void leggTilSpiller(String navn) {

            spillerliste.add(new Spiller(navn));

    }

    public ArrayList<Spiller> spill() {
        Spiller vinner = null;
        antSpillere = spillerliste.size();
        for (int i = 0; i < antSpillere; i++) {
            System.out.println("Det er " + spillerliste.get(i).getNavn() + " sin tur!");
            spillerliste.get(i).spill(kopp);
            System.out.println(spillerliste.get(i).getNavn() + " scoret " +kopp.getSum() + " poeng!");
        }
        vinner = spillerliste.get(0);
        ArrayList<Spiller> vinnerliste = new ArrayList<Spiller>();
        for (int j = 0; j < antSpillere; j++) {
            if (spillerliste.get(j).getVerdi() > vinner.getVerdi()) {
                vinner = spillerliste.get(j);
            }
        }
        vinnerliste.add(vinner);
        for (int a = 0; a<antSpillere;a++){
            if(vinner.getVerdi() == spillerliste.get(a).getVerdi() && vinner.getNavn() != spillerliste.get(a).getNavn()){
                vinnerliste.add(spillerliste.get(a));
            }
        }

        return vinnerliste;
    }

    public ArrayList<Spiller> getSpillerliste() {
        return spillerliste;
    }

    public void setSpillerliste(ArrayList<Spiller> spillerliste) {
        this.spillerliste = spillerliste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kopp getKopp() {
        return kopp;
    }

    public void setKopp(Kopp kopp) {
        this.kopp = kopp;
    }

    public int getAntSpillere() {
        return antSpillere;
    }

    public void setAntSpillere(int antSpillere) {
        this.antSpillere = antSpillere;
    }
}