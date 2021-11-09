package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give size for array");
        int size = input.nextInt();

        char a1[] = new char [size];
        for (int i = 0; i < size; i++){
        a1[i] = input.next().charAt(0);
        }

        int j = 0;

        char a2[] = new char [size];
        for(int i = size - 1; i >= 0; i--){
        a2[j] = a1[i];
        j++;
        }

        String str = Arrays.toString(a2);
        System.out.println("Reversed symbols" + str);
    }

}