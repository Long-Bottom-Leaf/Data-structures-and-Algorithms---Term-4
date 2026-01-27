package MovieTheatreSeating;

import java.util.Scanner;

public class Main {
    // Main program
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Seat Reservation System!");
            System.out.println("==========================");
            System.out.println("\n1. View Seating");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = input.nextInt();
            input.nextLine();

        } while (choice == 4) {
            input.close
        }
    }
}
