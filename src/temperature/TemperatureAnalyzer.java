package temperature;

import java.util.Arrays;
import java.util.Scanner;

public class TemperatureAnalyzer {

    public static void main(String[] args) {

        /* For this project I decided to not use an array list, since we are receiving a known number of inputs
        * and the array will only exist as long as the program is running.
        * If we wanted to add/remove temperatures later, then we would use array list */

        // Gather number of temp inputs
        Scanner input = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("This is the temperature analysis program!");
        System.out.println("Please enter the number of temperatures you'd like to analyze: ");

        int count = 0;
        count = input.nextInt();

        // Create temperature array
        double[] temperatures = new double[count];

        // Get temps for each day
        for (int i = 0; i < count; i++) {
            System.out.println("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = input.nextDouble();
        }

        // Calculate sum of temperatures
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }

        System.out.println("The total temperature is: " + sum);

        // Calculate temperature average
        double average = sum / count;



        System.out.print(Arrays.toString(temperatures));
        input.close();
    }
}
