package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Enter size for array");
        int size = input.nextInt();
        double array[] = new double[size];
        double max = -100;

        System.out.println("Enter numbers");

        
        for (int i = 0 ; i < array.length; i++) {
          array[i] = input.nextDouble();
        if (max < array[i] ) {
          max = array[i];

        }

        }
        
    System.out.println("Max number: " + max);


        

        
    }

}