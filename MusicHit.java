public class MusicHit {
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
}
