package codingchallenge2i;

import java.util.Scanner;

/*
 * Author: Alan Ramsay
 * Date: 19/04/2022
 * Time Started: 12:25
 * Time Finished: 13:40
 */

public class CodingChallenge2i {

    public static void main(String[] args) {

        System.out.println("TASK 1"); //iterates in multiples of A until X

        //Scanner to enter value A
        Scanner scanA = new Scanner(System.in);
        System.out.print("Enter the number to be multiplied: ");
        int A = scanA.nextInt();

        int B = 0;
        int counter = 0;

        //Scanner to enter value X
        Scanner scanXver2 = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication to stop on: ");
        int X = scanXver2.nextInt();

        // This will repeat until the total equals the closest number to the 
        // chosen number to stop on
        for (int i = 0; B + 2 <= X; i++) {
            B = B + A;
            System.out.println(B);
            counter = i;
        }

        // Outputs for task
        System.out.println("The multiplication is finished");
        System.out.println("It repeated " + (counter + 1) + " times");
        System.out.println("The last number in the multiplication was " + B + "\n\n");

        System.out.println("PART 2"); // multiples of  A + 1 until 2X

        int C = 0;
        int counter2 = 0;
        int X2 = X * 2;

        // This will repeat until the total equals the closest number to the 
        // chosen number doubled to stop on
        for (int i = 0; C + 3 <= X2; i++) {
            C = C + A + 1;
            System.out.println(C);
            counter2 = i;
        }

        // Outputs for task
        System.out.println("The multiplication is finished");
        System.out.println("It repeated " + (counter2 + 1) + " times");
        System.out.println("The last number in the multiplication was " + C + "\n\n");

        System.out.println("PART 3"); // multiples of A + 2 until 3X

        int D = 0;
        int counter3 = 0;
        int X3 = X * 3;

        // This will repeat until the total equals the closest number to the 
        // chosen number doubled to stop on
        for (int i = 0; D + 3 <= X3; i++) {
            D = D + A + 2;
            System.out.println(D);
            counter3 = i;
        }

        // Outputs for task
        System.out.println("The multiplication is finished");
        System.out.println("It repeated " + (counter3 + 1) + " times");
        System.out.println("The last number in the multiplication was " + D);

    }

}
