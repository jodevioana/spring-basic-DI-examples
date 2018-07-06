package byField.repository;

import byField.model.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class AnimalDaoSqlServer implements AnimalDao {

    @Override
    public List<Animal> getAnimals() {
        return Arrays.asList(
                new Animal("SQLServer - Snake"),
                new Animal("SQLServer - Iguana"),
                new Animal("SQLServer - Salamander")
        );
    }
}
