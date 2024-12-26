package spring.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ContextConfiguration;
import spring.project.ProjectApplication; 

@SpringBootTest
@ContextConfiguration(classes = ProjectApplication.class)
class ProjectApplicationTests {

    @Test
    void contextLoads() {
    }

}
