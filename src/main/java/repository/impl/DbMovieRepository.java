package repository.impl;

import model.Movie;
import org.springframework.stereotype.Repository;
import repository.MovieRepository;

import java.util.List;

@Repository
public class DbMovieRepository implements MovieRepository
{
    private List<Movie> dbMovies = List.of(
            new Movie("Человек-паук: Нет пути домой", "Фантастика"),
            new Movie("Пираты карибского моря: На странных берегах", "Приключения"),
            new Movie("Малефисента", "Семейный"),
            new Movie("Шерлок Холмс", "Драма"),
            new Movie("Троя", "Исторический"),
            new Movie("Аладдин", "Мюзикл")
    );

    public DbMovieRepository() { }

    @Override
    public List<Movie> findAll()
    {
        return dbMovies;
    }
}
