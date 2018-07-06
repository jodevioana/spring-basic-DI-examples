package byProperty.controller;

import byProperty.model.Animal;
import byProperty.repository.AnimalDao;
import byProperty.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ControllerImpl implements Controller {

    private AnimalDao animalDao;
    private Validator validator;


    @Autowired
    public void setAnimalDao(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    @Autowired
    public void setValidator(Validator validator) {
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
