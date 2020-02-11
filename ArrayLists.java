import java.util.ArrayList;

public class ArrayLists {

    public static ArrayList<String> songsIntersection (ArrayList<String> A, ArrayList<String> B) {
        ArrayList<String> album = new ArrayList<>();
        for(String a : A) {
            if(B.contains(a)) {
                album.add(a);
            }
        }
        return album;
    }


     public static void main(String[] args) {
        ArrayList<String> oldSongs = new ArrayList<>();
        ArrayList<String> bestSongs = new ArrayList<>();

        oldSongs.add("Dessert Rose");
        oldSongs.add("Yellow Submarine");
        oldSongs.add("Favorite Game");
        oldSongs.add("Sunshine Reggae");
        oldSongs.add("All the small things");

        bestSongs.add("Favorite Game");
        bestSongs.add("All the small things");
        bestSongs.add("Shape of my heart");
        bestSongs.add("Smells Like Teen Spirit");
        bestSongs.add("Sunshine Reggae");
        System.out.println(songsIntersection(oldSongs,bestSongs));

     }
}
