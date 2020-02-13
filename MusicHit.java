import java.util.Objects;

public class    MusicHit {
    private String song;
    private String singer;

    public MusicHit(String favSong, String favSinger){
        this.song = favSong;
        this.singer = favSinger;
            }

    public String getSong() {
        return song;
    }

    public String getSinger() {
        return singer;
     }

    public void setSong(String song) {
        this.song = song;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "MusicHit{" +
                "song='" + song + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicHit musicHit = (MusicHit) o;
        return Objects.equals(song, musicHit.song) &&
                Objects.equals(singer, musicHit.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(song, singer);
    }
}
