package entities;
import lombok.*;

import java.util.Random;

@Data
public class WordGenerator {
    private static final String[] _word = {"JAVA", "CESI", "UTOPIOS", "EXAMEN","DEVELOPPEMENT"};

    public String generateWord(){
        int randomIndex = new Random().nextInt(_word.length);
        return _word[randomIndex];
    }
}
