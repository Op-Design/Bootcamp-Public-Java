// import java.util.Random;


public class PuzzleJava {

    public int[] getTenRolls(){
        int[] tenArray = new int [10];
        // Random randMachine = new Random();
        for (int iterator = 0; iterator<10; iterator++){
            // tenArray [iterator] = randMachine.nextInt(21);
            tenArray [iterator] = iterator;
            System.out.println(tenArray[iterator]);
        }
        return tenArray;
    }
}
