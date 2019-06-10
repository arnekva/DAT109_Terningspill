public class Spiller{
    private String navn;
    private int verdi;

    public Spiller(String navn) {
        this.navn = navn;
    }


    public void spill(Kopp kopp){
        verdi = kopp.Trill();
    }


    public void setVerdi(int verdi){
        this.verdi = verdi;
    }
    public int getVerdi(){
        return verdi;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}