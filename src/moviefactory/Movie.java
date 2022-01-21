package moviefactory;

public class Movie {
    public String title;
    public String director;
    public float runtimeInMinute;
    public boolean hasBeenReleased;

    public Movie(String title, String director, float runtimeInMinute, boolean hasBeenReleased) {
        this.title = title;
        this.director = director;
        this.runtimeInMinute = runtimeInMinute;
        this.hasBeenReleased = hasBeenReleased;
    }

    @Override
    public String toString() {
        return "Movie: " + "\n" +
                " - Title: " + title + "\n" +
                " - Director: " + director + "\n" +
                " - RuntimeInMinute: " + runtimeInMinute + "\n" +
                " - HasBeenReleased: " + hasBeenReleased;
    }
}
