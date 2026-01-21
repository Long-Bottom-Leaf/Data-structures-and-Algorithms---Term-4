package temperature;

import java.util.Scanner;

public class TemperatureAnalyzer {

    public static void main(String[] args) {

        /* For this project I decided to not use array list, since we are receiving a known number of inputs
        * and the array will only exist as long as the program is running.
        * If we wanted to add/remove temperatures later, then we would use array list */

        // Gather number of temp inputs
        Scanner input = new Scanner(System.in);
        System.out.println("This is the temperature analysis program!");
        System.out.println("Please enter the number of temperatures you'd like to analyze: ");

        int count = 0;
        count = input.nextInt();

        // Create temperature array


        input.close();
    }
}
