public class BasicJava {
    
    public String printStart1Through255{
        int [] myArray = new int [255];
        for (int iterator = 0; iterator < 256; iterator++){
            myArray[iterator] = iterator;
            System.out.println(myArray[iterator]);
            iterator++;
        }
    }
    /* 
    Print 1-255
    Write a method that prints all the numbers from 1 to 255.
    */
}
