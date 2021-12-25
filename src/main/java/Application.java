import repository.impl.DbMovieRepository;
import service.MovieReport;

public class Application
{
    public static void main(String[] args)
    {
        DbMovieRepository dbMovieRepository = new DbMovieRepository();
        MovieReport movieReport = new MovieReport(dbMovieRepository);
        System.out.println("Список фильмов: ");
        movieReport.generate();
    }
}
