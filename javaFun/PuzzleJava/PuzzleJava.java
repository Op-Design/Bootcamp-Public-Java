import java.util.Random;

public class PuzzleJava {

    public int[] getTenRolls(){
        int[] randomArrayOfTen = new int [10];
        Random randMachine = new Random();
        for (int i = 0; i<10; i++){
            randomArrayOfTen [i] = randMachine.nextInt(11);
            // randomArrayOfTen [i] = i;
            System.out.println(randomArrayOfTen[i]);
        }
        return randomArrayOfTen;
    }

    public char getRandomLetter(){
        // int[] alphaArray = new int [25];
        char[] alphaArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // for (int i; i < 25; i++){
            
        // }
        Random randMachine = new Random ();
        int randomIndexToPull = randMachine.nextInt(25);
        char randomLetter = alphaArray[randomIndexToPull];
        System.out.println(randomLetter);
        return randomLetter;
    }


}
