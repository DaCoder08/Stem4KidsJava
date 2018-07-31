import java.util.ArrayList;
public class Main{
    public static void main(String args[]){
        ArrayList<String> thingies = new ArrayList<>();
        Candidate TrumpGuy = new Candidate("Russia","Walls","Wealth");
        Candidate KidGuy = new Candidate("Kids","Playing","Having Fun");
        Candidate DumbGuy = new Candidate("Being An Idiot","Knowing Nothing","The Worst Guy");
        thingies.add(TrumpGuy.intrest1);
        thingies.add(TrumpGuy.intrest2);
        thingies.add(TrumpGuy.intrest3);
        thingies.add(KidGuy.intrest1);
        thingies.add(KidGuy.intrest2);
        thingies.add(KidGuy.intrest3);
        thingies.add(DumbGuy.intrest1);
        thingies.add(DumbGuy.intrest2);
        thingies.add(DumbGuy.intrest3);
        System.out.println(thingies);
    }
}
