package byConstructor.controller;

import byConstructor.model.Animal;
import byConstructor.repository.AnimalDao;
import byConstructor.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ControllerImpl implements Controller {

    private AnimalDao animalDao;
    private Validator validator;

    @Autowired
    public ControllerImpl(AnimalDao animalDao, Validator validator) {
        this.animalDao = animalDao;
        this.validator = validator;
    }

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
}
