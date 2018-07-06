package componentScan.controller;

import componentScan.model.Animal;
import componentScan.repository.AnimalDao;
import componentScan.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControllerImpl implements Controller {

    @Autowired
    @Qualifier("sqlserver")
    private AnimalDao animalDao;

    @Autowired
    private Validator validator;

    @Override
    public void validateAnimals() {
        List<Animal> allAnimals = animalDao.getAnimals();
        allAnimals.forEach(animal -> {
            boolean isAnimalValid = validator.validateAnimal(animal);
            System.out.println(animal.getName() + " valid? - " + isAnimalValid);
        });
    }

    @Override
    public void makeAllAnimalSpeak() {
        List<Animal> allAnimals = animalDao.getAnimals();
        allAnimals.forEach(animal -> System.out.println(animal.getName() + " - I am speaking!"));
    }

    @Override
    public Integer methodToTest() {
        return 3;
    }
}
