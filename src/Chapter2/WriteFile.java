/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
import java.io.*;

public class WriteFile {

    public static void main(String[] args)// →4
    {
        Movie[] soccer = getsoccer();
        PrintWriter out = openWriter("soccer2.txt");
        for (Movie m : soccer) {
            writeMovie(m, out);
        }
        out.close();
    }

    private static Movie[] getsoccer() //→12
    {
        Movie[] soccer = new Movie[10];
        soccer[0] = new Movie("It's a Wonderful Life",
                1946, 14.95);
        soccer[1] = new Movie("Young Frankenstein",
                1974, 16.95);
        soccer[2] = new Movie("Star Wars",
                1977, 17.95);
        soccer[3] = new Movie("The Princess Bride",
                1987, 16.95);
        soccer[4] = new Movie("Glory",
                1989, 14.95);
        soccer[5] = new Movie("The Game",
                1997, 14.95);
        soccer[6] = new Movie("Shakespeare in Love",
                1998, 19.95);
        soccer[7] = new Movie("Zombieland",
                1997, 18.95);
        soccer[8] = new Movie("The King's Speech",
                1997, 19.95);
        soccer[9] = new Movie("Star Trek Into Darkness",
                1997, 19.95);
        return soccer;
    }

    private static PrintWriter openWriter(String name) //→37
    {
        try {
            File file = new File(name);
            PrintWriter out
                    = new PrintWriter(
                            new BufferedWriter(
                                    new FileWriter(file)), true);
            return out;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return null;
    }

    private static void writeMovie(Movie m, //→55
            PrintWriter out) {
        String line = m.title;
        line += "\t" + Integer.toString(m.year);
        line += "\t" + Double.toString(m.price);
        out.println(line);
    }

    private static class Movie //→63
    {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
