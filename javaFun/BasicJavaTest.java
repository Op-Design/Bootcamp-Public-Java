public class BasicJavaTest {
    public static void main(String [] arg){
        BasicJava myArray = new BasicJava();

        // myArray.printStart1Through255();
        
        // myArray.printOddStart1Through255();
        
        // int result = myArray.sum255();
        // // System.out.println(result);

        int [] arrayToIterate = {1,3,5,7,9,13};
        // myArray.printIterateThroughArray(arrayToIterate);

        int [] arrayForMaxValue0 = arrayToIterate;
        int [] arrayForMaxValue1 = {-1,-3,-5,-7,-9,-13};
        int [] arrayForMaxValue2 = {0,3,-5,7,-9,1};
        myArray.printArrayMaxValue(arrayForMaxValue0);
        myArray.printArrayMaxValue(arrayForMaxValue1);
        myArray.printArrayMaxValue(arrayForMaxValue2);
    }
}
