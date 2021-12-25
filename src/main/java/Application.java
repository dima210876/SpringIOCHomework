import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.MovieRepository;
import service.MovieReport;

public class Application
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
        MovieRepository movieRepository = applicationContext.getBean(MovieRepository.class);
        MovieReport movieReport = new MovieReport(movieRepository);
        System.out.println("Список фильмов: ");
        movieReport.generate();
    }
}
