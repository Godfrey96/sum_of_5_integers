
//a program to find the sum of 5 integers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int numbers;
        int sum = 0;

        System.out.println("Enter any five numbers: ");

        while(i < 5){

            Scanner input = new Scanner(System.in);
            numbers = input.nextInt();

            sum += numbers;
            i++;
        }

        System.out.println("Sum of five integers: " + sum);
    }
}