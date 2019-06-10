import java.util.ArrayList;
import java.lang.*;
import java.util.Random;

public class Kopp{
    private int id;
    private int sum;
    ArrayList<Terning> terninger = new ArrayList<Terning>();
    Random random = new Random();
    public Kopp (){
        this.id = 1;
        this.sum = 0;

        Terning terning1 = new Terning();
        terninger.add(terning1);
        Terning terning2 = new Terning();
        terninger.add(terning2);
    }
    public int Trill(){
        int sum = 0;
        for(int i = 0; i<terninger.size();i++){
            terninger.get(i).setVerdi(random.nextInt(6)+1);
            System.out.println("Terningen rullet til: " +terninger.get(i).getVerdi());
            sum += terninger.get(i).getVerdi();
        }
        this.sum = sum;
        return sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}