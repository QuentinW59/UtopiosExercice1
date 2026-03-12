package entities;

import jdk.jfr.DataAmount;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class HangmanGame {
    private String wordToGuess;
    private String mask; // ce qui va faire voir le nombre de lettres
    private List<Character> attempts = new ArrayList<>();
    private int lives = 7;

    //Constructeur supplémentaire pour le test
    public HangmanGame(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.lives = 7;
        this.attempts = new ArrayList<>();
        this.mask = "_".repeat(wordToGuess.length());
    }

    public boolean testChar(char letter){
        return false;
    }

    public boolean testWin(){
        return false;
    }

}
