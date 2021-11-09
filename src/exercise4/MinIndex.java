package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Enter size for array");
        int size = input.nextInt();
        int array[] = new int[size];
        int min = 0;
   
        System.out.println("Enter numbers");

        
        for (int i = 0 ; i < array.length; i++) {
          array[i] = input.nextInt();
        if (min > array[i] ) {
         min = i;

        }

        }
        
    System.out.println("Min index: " + min);


        

        
    }

}