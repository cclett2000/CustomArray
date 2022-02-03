// int array thingy


import java.util.Arrays;
import java.util.Random;

public class INTBearArray {
    private int[] array = new int[0];               // array init, can only be accessed from within here
    private int[] temp;                             // temp array init
    private final int demo_size = 25;               // number of values for demo

    // replace index with value
    public void replace(int index, int new_value){
        this.array[index] = new_value;
    }

    // appends to array, increasing size by 1
    public void append(int value){
        this.temp = new int[array.length + 1];                          // temp array; stores array data + empty slot for append

        //System.arraycopy(array, 0, temp, 0, array.length);            // this works too, but I wanted to get it working manually
        for (int i = 0; i < array.length; i++) temp[i] = array[i];      // manual array copy

        this.temp[temp.length-1] = value;                               // appends value to end of array
        this.array = temp;                                              // modifies actual array
    }

    // prints array data
    public void print(){
        System.out.println(Arrays.toString(this.array));
    }

    // test/demonstrate array functionality
    public void demo(){
        Random rand = new Random();                                                // init for RNG
        for (int i = 0; i < demo_size; i++) append(rand.nextInt(1000));     // add RN to array

        System.out.println(Arrays.toString(this.array));
    }

    // array stats
    public void stats(){
        System.out.print("\nArray Length: " + array.length
                       + "\nDemo Size: " + demo_size + "\n");
    }


}