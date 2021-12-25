package model;

public class Movie
{
    private String name;
    private String genre;

    public Movie(String name, String genre)
    {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return "{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
