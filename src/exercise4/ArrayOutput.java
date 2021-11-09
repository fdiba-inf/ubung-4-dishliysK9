package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();
        int[] array = new int[size];
        
        for(int i = 0; i < array.length; i++){
        array[i] = input.nextInt();
        }

         for(int i = 0; i < array.length; i++){
           System.out.println();
           for(int n = 0; n < i; n++) {
          System.out.print(" ");
         }
         System.out.print(array[i]);

        }
        }
        
        
    }

