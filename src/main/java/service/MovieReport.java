package service;

import model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MovieRepository;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MovieReport
{
    private final MovieRepository movieRepository;

    public void generate()
    {
        List<Movie> movies = movieRepository.findAll();
        AtomicInteger i = new AtomicInteger(1);
        movies.forEach(movie -> System.out.println(i.getAndIncrement() + ". " + movie.toString()));
    }

    @Autowired
    public MovieReport(MovieRepository movieRepository)
    {
        this.movieRepository = movieRepository;
    }
}
