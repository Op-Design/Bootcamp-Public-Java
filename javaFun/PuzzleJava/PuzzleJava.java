import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    public int[] getTenRolls(){
        int[] randomArrayOfTen = new int [10];
        Random randMachine = new Random();
        for (int i = 0; i<10; i++){
            randomArrayOfTen [i] = randMachine.nextInt(11);
            // System.out.println(randomArrayOfTen[i]);
        }
        return randomArrayOfTen;
    }

    public char getRandomLetter(){
        char[] alphaArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random randMachine = new Random ();
        int randomIndexToPull = randMachine.nextInt(25);
        char randomLetter = alphaArray[randomIndexToPull];
        // System.out.println(randomLetter);
        return randomLetter;
    }

    public char[] generatePassword(){
        char [] generatedPassword = new char [8];
        for (int i = 0; i<8; i++){
            PuzzleJava passwordGenerator = new PuzzleJava();
            char letter = passwordGenerator.getRandomLetter();
            generatedPassword[i] = letter;
            System.out.print(generatedPassword[i]);
        }
        System.out.println();
        return generatedPassword;
    }

    public char[] generatePassword(int passwordLength){
        char [] generatedPassword = new char [passwordLength];
        for (int i = 0; i<passwordLength; i++){
            PuzzleJava passwordGenerator = new PuzzleJava();
            char letter = passwordGenerator.getRandomLetter();
            generatedPassword[i] = letter;
            System.out.print(generatedPassword[i]);
        }
        return generatedPassword;
    }

    // Sensei Bonus

    public ArrayList<Object> shuffleArray (ArrayList<Object> array){
        ArrayList<Object> arrayToShuffle = new ArrayList<Object>();
        


    }


}
