package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.MovieRepository;
import repository.impl.DbMovieRepository;

@Configuration
public class AppConfig
{
    @Bean
    public MovieRepository dbMovieRepository()
    {
        return new DbMovieRepository();
    }
}
