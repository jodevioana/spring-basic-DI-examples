package byProperty.validator;

import byProperty.model.Animal;

public class Validator {

    public boolean validateAnimal(Animal animal) {
        return (Math.random() * 10) < 5;
    }
}
