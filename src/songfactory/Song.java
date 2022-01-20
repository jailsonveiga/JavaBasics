package songfactory;

public class Song {
    public String title;
    public String artist;
    public String genre;
    public int seconds;

    public Song(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return
                "Title: " + title +
                ", Artist: " + artist +
                ", Genre: " + genre +
                ", Seconds: " + seconds;
    }
}
