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
        char upperCaseLetter = Character.toUpperCase(letter);// on definit aue la lettre est majuscule
        if(!attempts.contains(upperCaseLetter)){
            attempts.add(upperCaseLetter);// on ajoute les lettres utilises
        }
        // si on ne trouve pas la lettre donc inferieur a 0 on perd une vie si non premiere occurence trouvé on continue
        if(wordToGuess.toUpperCase().indexOf(upperCaseLetter) >= 0){
            updateMask(upperCaseLetter);
            return true;
        } else {
            lives--;
            return false;
        }
    }

    private void updateMask(char letter){
        StringBuilder newMask = new StringBuilder(mask);
        for (int i = 0; i < wordToGuess.length(); i++) {
            // si la lettre est en double ou triple la boucle mettra le mask a jour avec le nombre de lettres correspondant
            if(Character.toUpperCase(wordToGuess.charAt(i)) == letter){
                newMask.setCharAt(i, wordToGuess.charAt(i));
            }
        }
        this.mask = newMask.toString();
    }

    public boolean testWin(){
        return lives > 0 && !mask.contains("_");
    }

}
