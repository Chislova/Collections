import java.util.HashSet;

public class Sets {

    public static HashSet<String> intersection (HashSet<String> set1, HashSet<String> set2){
        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args) {

        HashSet <String> usaTop = new HashSet<String>();
        HashSet <String> ukTop = new HashSet<String>();

        usaTop.add("Suicidal");
        usaTop.add("Circles");
        usaTop.add("Bad Guy");
        usaTop.add("Woah");

        ukTop.add("We back");
        ukTop.add("Bad Guy");
        ukTop.add("No Idea");
        ukTop.add("Circles");

        System.out.println(intersection(usaTop,ukTop));


    }







}
