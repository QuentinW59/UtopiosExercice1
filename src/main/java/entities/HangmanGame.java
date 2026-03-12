package entities;

import java.util.ArrayList;
import java.util.List;

public class HangmanGame {
    private String wordToGuess;
    private String mask; // ce qui va faire voir le nombre de lettres
    private List<Character> attempts = new ArrayList<>();
    private int lives = 7;

    public boolean testChar(char letter){
        return false;
    }

    public boolean testWin(){
        return false;
    }

}
