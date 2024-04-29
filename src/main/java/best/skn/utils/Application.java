package best.skn.utils;

//? Java::Library
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application Class
 *
 * @author SKN Shukhan
 * @version 1.3.2
 * @since 2024-05-27
 * @use.case Java, Java Spring Boot
 * @dedicated.to Logno, Atoshi and My Parents
 */
@SpringBootApplication
public class Application {

  /**
   * Static Method `main`
   *
   * @param args default parameter for the `main` static method
   * @since v1.2.0
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
