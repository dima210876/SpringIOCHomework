package repository;

import model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository
{
    List<Movie> findAll();
}
