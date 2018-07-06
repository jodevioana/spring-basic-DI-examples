package componentScan.validator;

import componentScan.model.Animal;
import org.springframework.stereotype.Component;

@Component
public class Validator {

    public boolean validateAnimal(Animal animal) {
        return (Math.random() * 10) < 5;
    }
}
