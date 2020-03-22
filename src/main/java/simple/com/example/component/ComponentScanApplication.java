package simple.com.example.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanApplication.class);
        ComponentDAO componentDAO1 = applicationContext.getBean(ComponentDAO.class);
        ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO1);
        LOGGER.info("{}", componentDAO2);
    }

}
