public class Film {

    String title;
    String directory;
    String genre;
    String production;
    int rating;
    int date;

    Film(int rating,String title, String directory, String genre,String production,int date)
    {
        this.rating = rating;
        this.title = title;
        this.directory = directory;
        this.genre = genre;
        this.production = production;
        this.date = date;
    }
    @Override
    public String toString()
    {
        return  "Rating: " + this.rating + "\n" +
                "     Tytul: " + this.title + "\n" +
                "     Reżyseria: " + this.directory + "\n" +
                "     Gatunek: " + this.genre + "\n" +
                "     Produkcja: " + this.production + "\n" +
                "     Premiera: " + this.date + "\n";
    }

    public String getTitle() {
        return title;
    }
    public void setTublishingHouse(String title) {
        this.title = title;
    }

    public String getDirectory() {
        return directory;
    }
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProduction() {
        return production;
    }
    public void setProduction(String production) {
        this.production = production;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
}
