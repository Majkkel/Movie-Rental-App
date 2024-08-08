import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    static User[] users = new User[10];
    static ArrayList<Film> movies = new ArrayList<Film>();

    public static void main(String[] args)
    {
        users[0] =new User("michal", "123",2001);
        movies.add(new Film(12,"Avengers","Joss Whedon","Akcja, Sci-Fi","USA",2012));
        movies.add(new Film(18,"Piła","James Wan","Horror","USA",2004));
        movies.add(new Film(0,"Shrek","Andrew Adamson, Vicky Jenson","Animacja, Komediowy","USA",2001));
        movies.add(new Film(18,"Predator","John McTiernan","USA","USA, Meksyk",1987));
        movies.add(new Film(0,"Pinokio","Ben Sharpsteen, Hamilton Luske","Animacja","USA",1940));
        movies.add(new Film(0,"Jumanji","Joe Johnston","Fantasy","USA",1995));

        LoginPage loginPage = new LoginPage();
        //Biblioteka biblioteka = new Biblioteka();
        //BibliotekaDzieci b = new BibliotekaDzieci();
        //MainPage mainPage = new MainPage();
    }
}