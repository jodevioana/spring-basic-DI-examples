package byField.controller;

import byField.model.Animal;
import byField.repository.AnimalDao;
import byField.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ControllerImpl implements Controller{

    @Autowired
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
}
