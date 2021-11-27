// import java.util.Iterator;

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

    public void iterateThroughArray(int [] array){
        // System.out.println(array.length);
        int iterator = 0;
        while(iterator < array.length){
            System.out.println(array[iterator]);
            iterator++;
        }
    }


}
