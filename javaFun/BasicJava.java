public class BasicJava {
    
    public void printStart1Through255() {
        int [] myArray = new int [255];
        for (int i = 0; i < 255; i++){
            myArray[i] = i+1;
            System.out.print(myArray[i]);
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
}
