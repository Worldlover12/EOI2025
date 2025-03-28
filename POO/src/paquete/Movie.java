package paquete;

public class Movie {

    private String title=this.title;
    private String genre=this.genre;
    private String rating=this.rating;

    public Movie(String title, String genre, String rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public void watch(){
        System.out.println("Veo la peli");
    }

    public static void main(String[] args) {
    }
}
