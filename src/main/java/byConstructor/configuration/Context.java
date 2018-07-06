package byConstructor.configuration;

import byConstructor.controller.Controller;
import byConstructor.controller.ControllerImpl;
import byConstructor.repository.AnimalDao;
import byConstructor.repository.AnimalDaoMongoDB;
import byConstructor.validator.Validator;
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
        return new ControllerImpl(animalDao(), validator());
    }

    @Bean
    public AnimalDao animalDao() {
        return new AnimalDaoMongoDB();
//        return new AnimalDaoSqlServer();
    }
}
