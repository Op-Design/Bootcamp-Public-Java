public class PuzzleTest{
    public static void main(String[] args){
        PuzzleJava testPuzzle = new PuzzleJava();
        // testPuzzle.getTenRolls();
        // testPuzzle.getRandomLetter();
        testPuzzle.generatePassword();
        testPuzzle.generatePassword(15);
        int [] sampleArray = {10, 5, 8, 6, 7};
        testPuzzle.shuffleArray(sampleArray);


    }

}