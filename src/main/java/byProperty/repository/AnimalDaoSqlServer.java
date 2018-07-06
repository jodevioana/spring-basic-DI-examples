package byProperty.repository;

import byProperty.model.Animal;

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
