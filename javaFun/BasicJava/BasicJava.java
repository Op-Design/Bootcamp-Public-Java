// import java.util.Iterator;
import java.util.ArrayList;

public class BasicJava {
    
    public void printStart1Through255() {
        int [] myArray = new int [255];
        for (int iterator = 0; iterator < 255; iterator++){
            myArray[iterator] = iterator+1;
            System.out.print(myArray[iterator]);
        }
        // for (int i = 0; i < 7; i++){
        //     System.out.println("bar");
        //     System.out.println(i);
        // }
    }
    /* 
    Print 1-255
    Write a method that prints all the numbers from 1 to 255.
    */

    public void printOddStart1Through255(){
        int [] myArray = new int [255];
        for (int iterator = 0; iterator < 255; iterator++){
            if (iterator%2 == 0){
                myArray[iterator] = iterator+1;
                System.out.print(myArray[iterator]);
            }
        }
    }

    public int sum255(){
        int result = 0;
        for (int iterator=0; iterator<255; iterator++){
            result+=iterator+1;
        }
        return result;
    }

    public void printIterateThroughArray(int [] array){
        int iterator = 0;
        while(iterator < array.length){
            System.out.println(array[iterator]);
            iterator++;
        }
    }

    public void printArrayMaxValue(int [] array){
        int maxValue = array[0];
        for (int iterator=1; iterator<array.length; iterator++){
            if (array[iterator]>maxValue){
                maxValue = array[iterator];
            }
        }
        System.out.println(maxValue);
    }
    
    public ArrayList<Integer> returnArrayWithOddNumbers(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int iterator=0; iterator<256; iterator++){
            if (iterator%2 != 0){
                newArray.add(iterator);
                // System.out.print(newArray.get(iterator));
            }
        }

        return newArray;
    }


    // Ninja Bonus 

    public float getAverage(int [] array){
        int numberOfItems = array.length;
        float average = 0;
        float sum = 0;
        for (int iterator = 0; iterator<array.length; iterator ++){
            sum += array[iterator];
        }
        System.out.println(sum);
        average = sum/numberOfItems;
        System.out.println(average);
        return average;
    }
}
