public class BasicJavaTest {
    public static void main(String [] arg){
        BasicJava myArray = new BasicJava();

        // myArray.printStart1Through255();
        
        // myArray.printOddStart1Through255();
        
        // int result = myArray.sum255();
        // // System.out.println(result);

        int [] arrayToIterate = {1,3,5,7,9,13};
        myArray.iterateThroughArray(arrayToIterate);
    }
}
