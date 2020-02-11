import java.util.ArrayList;

public class Main {

    public static ArrayList<MusicHit> songsIntersection (ArrayList<MusicHit> A, ArrayList<MusicHit> B) {
        ArrayList<MusicHit> album = new ArrayList<>();
        for(MusicHit a : A) {
            if(B.contains(a)) {
                album.add(a);
            }
        }
        return album;
    }


    public static void main(String[] args) {
        ArrayList<MusicHit> oldSongs = new ArrayList<>();
        ArrayList<MusicHit> bestSongs = new ArrayList<>();


        MusicHit a = new MusicHit("DesertRose", "Sting");
        MusicHit b = new MusicHit("Yellow Submarine", "Beatles");
        MusicHit c = new MusicHit("Favorite Game", "Cardigans");
        MusicHit d = new MusicHit("Sunshine Reggae", "Laid Back");
        MusicHit e = new MusicHit("All the small things", "Blink 182");

        MusicHit f = new MusicHit("Favorite Game", "Cardigans");
        MusicHit g = new MusicHit("All the small things", "Blink 182");
        MusicHit h = new MusicHit("Shape of my heart", "Sting");
        MusicHit i = new MusicHit("Smells Like Teen Spirit", "Nirvana");
        MusicHit j = new MusicHit("Sunshine Reggae", "Laid Back");


        oldSongs.add(a);
        oldSongs.add(b);
        oldSongs.add(c);
        oldSongs.add(d);
        oldSongs.add(e);

        bestSongs.add(f);
        bestSongs.add(g);
        bestSongs.add(h);
        bestSongs.add(i);
        bestSongs.add(j);
        System.out.println( songsIntersection(oldSongs,bestSongs).toString());


    }
}
