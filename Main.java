import java.util.*;


public class Main {

    /**
     * Method for ArrayList intersection
     */
    public static List<MusicHit> songsIntersection(List<MusicHit> A, List<MusicHit> B) {
        List<MusicHit> album = new ArrayList<>();
        for (MusicHit a : A) {
            if (B.contains(a)) {
                album.add(a);
            }
        }
        return album;
    }

    /**
     * Method for HashSet intersection
     */
    public static Set<MusicHit> intersection(Set<MusicHit> set1, Set<MusicHit> set2) {
        Set<MusicHit> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        List<MusicHit> oldSongs = new ArrayList<>();
        List<MusicHit> bestSongs = new ArrayList<>();

        oldSongs.add(new MusicHit("DesertRose", "Sting"));
        oldSongs.add(new MusicHit("Yellow Submarine", "Beatles"));
        oldSongs.add(new MusicHit("Favorite Game", "Cardigans"));
        oldSongs.add(new MusicHit("Sunshine Reggae", "Laid Back"));
        oldSongs.add(new MusicHit("All the small things", "Blink 182"));

        bestSongs.add(new MusicHit("Shape of my heart", "Sting"));
        bestSongs.add(new MusicHit("Yesterday", "Beatles"));
        bestSongs.add(new MusicHit("Favorite Game", "Cardigans"));
        bestSongs.add(new MusicHit("Smells Like Teen Spirit", "Nirvana"));
        bestSongs.add(new MusicHit("All the small things", "Blink 182"));

        System.out.println("Array intersection is: " + songsIntersection(oldSongs, bestSongs));

        Set<MusicHit> usaTop = new HashSet<>();
        Set<MusicHit> ukTop = new HashSet<>();

        usaTop.add(new MusicHit("Favorite Game", "Cardigans"));
        usaTop.add(new MusicHit("DesertRose", "Sting"));
        usaTop.add(new MusicHit("Shape of my heart", "Sting"));
        usaTop.add(new MusicHit("All the small things", "Blink 182"));

        ukTop.add(new MusicHit("Shape of my heart", "Sting"));
        ukTop.add(new MusicHit("Smells Like Teen Spirit", "Nirvana"));
        ukTop.add(new MusicHit("Sunshine Reggae", "Laid Back"));
        ukTop.add(new MusicHit("Yellow Submarine", "Beatles"));

        System.out.println("Set intersection is: " + intersection(usaTop, ukTop));

        Map<Integer, MusicHit> radioSchedule = new HashMap<>();
        radioSchedule.put(1, new MusicHit("Roses", "SAiNt JHN"));
        radioSchedule.put(2, new MusicHit("Ride It", "Regard"));
        radioSchedule.put(3, new MusicHit("Credo", "Zivert"));
        radioSchedule.put(4, new MusicHit("everything i wanted", "Billie Eilish"));
        radioSchedule.put(5, new MusicHit("Paradise", "Rompasso"));

        // Iterations for ArrayList
        for (int i = 0; i < oldSongs.size(); i++) {
            System.out.println((i + 1) + "-й элемент массива = " + oldSongs.get(i));
        }

        //bestSongs.forEach(song -> System.out.println(song + " with index " + bestSongs.indexOf(song)));
        for (MusicHit song : bestSongs) {
            System.out.println(song + " with index of the song " + bestSongs.indexOf(song));
        }

        int j = 0;
        while (oldSongs.size() > j) {
            System.out.println(oldSongs.get(j) + " with index " + j);
            j++;
        }

        // Iteration for Set
        for (MusicHit topSet : ukTop) {
            System.out.println(topSet);
        }

        // Iteration for Map
        //radioSchedule.forEach((k, v) -> System.out.println("Number: " + k + " Composition: " + v));
        for (Integer key : radioSchedule.keySet()) {
            System.out.println("Key = " + key);
        }

        for (MusicHit value : radioSchedule.values()) {
            System.out.println("Value = " + value);
        }

        for (Map.Entry<Integer, MusicHit> radio : radioSchedule.entrySet()) {
            System.out.println("Key = " + radio.getKey() + ", Value = " + radio.getValue());
        }

    }
}
