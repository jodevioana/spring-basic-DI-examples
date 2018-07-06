package byField.configuration;

import byField.controller.Controller;
import byField.controller.ControllerImpl;
import byField.repository.AnimalDao;
import byField.repository.AnimalDaoMongoDB;
import byField.repository.AnimalDaoSqlServer;
import byField.validator.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean
    public Validator validator() {
        return new Validator();
    }

    @Bean
    public Controller controller() {
        return new ControllerImpl();
    }

    @Bean
    public AnimalDao animalDao() {
        return new AnimalDaoMongoDB();
//        return new AnimalDaoSqlServer();
    }
}
