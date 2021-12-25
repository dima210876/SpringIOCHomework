import configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.MovieRepository;
import service.MovieReport;

public class Application
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieRepository movieRepository = applicationContext.getBean(MovieRepository.class);
        MovieReport movieReport = new MovieReport(movieRepository);
        System.out.println("Список фильмов: ");
        movieReport.generate();
    }
}
