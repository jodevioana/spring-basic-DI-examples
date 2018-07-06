package byField.validator;

import byField.model.Animal;
@SuppressWarnings("Duplicates")

public class Validator {

    public boolean validateAnimal(Animal animal) {
        return (Math.random() * 10) < 5;
    }
}
