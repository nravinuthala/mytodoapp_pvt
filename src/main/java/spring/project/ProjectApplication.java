import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProjectApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        // Check deployment type from system properties
        String deploymentType = System.getProperty("deployment.type", "embedded");
        System.out.println("Running with deployment type: " + deploymentType);

        SpringApplication.run(ProjectApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ProjectApplication.class);
    }
}
