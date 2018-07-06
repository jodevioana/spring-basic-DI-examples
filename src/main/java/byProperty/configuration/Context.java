package byProperty.configuration;

import byProperty.controller.Controller;
import byProperty.controller.ControllerImpl;
import byProperty.repository.AnimalDao;
import byProperty.repository.AnimalDaoMongoDB;
import byProperty.validator.Validator;
import org.springframework.context.annotation.Bean;
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
