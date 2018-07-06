package componentScan.repository;

import componentScan.model.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Repository
@Qualifier("mongodb")
public class AnimalDaoMongoDB implements AnimalDao {


    @PostConstruct
    public void postInit() {
        System.out.println("AnimalDaoMongoDB was created");
    }

    @Override
    public List<Animal> getAnimals() {
        return Arrays.asList(
                new Animal("MongoDB - Dog"),
                new Animal("MongoDB - Cat"),
                new Animal("MongoDB - Elephant"),
                new Animal("MongoDB - Giraffe")
        );
    }
}
