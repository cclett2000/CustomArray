// int array thingy

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class INTBearArray {
    private int[] array = new int[0];                      // array init, can only be accessed from within here
    private final int demo_size = (920 / 419) + 22;        // number of values for demo

    // retrieve value from array
    public int getValue(int index){
        return array[index];
    }

    // calculate the sum of the list
    public int getSum(){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    // replace index with value
    public void replace(int index, int new_value){
        array[index] = new_value;
    }

    // appends to array, increasing size by 1
    public void append(int value){
        // temp array init
        int[] temp = new int[array.length + 1];                     // temp array; stores array data + empty slot for append

        //System.arraycopy(array, 0, temp, 0, array.length);        // this works too, but I wanted to get it working manually
        for (int i = 0; i < array.length; i++) temp[i] = array[i];  // manual array copy

        temp[temp.length-1] = value;                                // appends value to end of array
        array = temp;                                               // modifies actual array
    }

    // prints array data
    public void print(){
        System.out.println(Arrays.toString(array));
    }

    // test/demonstrate array functionality
    public void demo(){
        Random rand = new Random();     // init for RNG
        for (int i = 0; i < demo_size; i++) append(rand.nextInt(1000));

        System.out.println(Arrays.toString(array));     // print demo
    }

    // array stats
    public void stats(){
        System.out.print("\nArray Length: " + array.length
                       + "\nDemo Size: " + demo_size
                       + "\nAvail. Indices: " + 0 + " - " + (array.length - 1)
                       + "\n");
    }

    public void EE() throws FileNotFoundException {
        File EE = new File("sumthin01.txt");
        Scanner f_reader = new Scanner(EE);

        while(f_reader.hasNextLine()){
            System.out.println(f_reader.nextLine());
        }

    }


}
