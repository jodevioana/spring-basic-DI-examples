package componentScan.repository;

import componentScan.model.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Repository
@Qualifier("sqlserver")
public class AnimalDaoSqlServer implements AnimalDao {

    @PostConstruct
    public void postInit() {
        System.out.println("AnimalDaoSqlServer was created");
    }

    @Override
    public List<Animal> getAnimals() {
        return Arrays.asList(
                new Animal("SQLServer - Snake"),
                new Animal("SQLServer - Iguana"),
                new Animal("SQLServer - Salamander")
        );
    }
}
