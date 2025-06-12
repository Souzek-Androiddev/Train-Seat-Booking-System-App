import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //false = seats available true = seats booked
        boolean[] seats = new boolean[20];
        String status;
        int seatNumber, choice;
        Scanner scanner = new Scanner(System.in);
       
        do {
            System.out.println("xxxxxx------Train Seat Booking System-----xxxxxx");
            // Displaying all seats
             for (int i = 0; i < seats.length; i++) {
             status = seats[i] ? "Booked" : "Available";
            System.out.println("Seat " + (i +1) + ": " + status);
         }
            System.out.println("1. Book a seat");
            System.out.println("2. Exit");
            System.out.println("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter seat number to book (1-20): ");
                seatNumber = scanner.nextInt();

                if (seatNumber < 1 || seatNumber > 20) {
                    System.out.println("Invalid seat number, Please choose between 1 and 20");
                } else if (seats[seatNumber - 1]) {
                     System.out.println("Seat already booked");
                } else {
                    seats[seatNumber -1] = true;
                    
                    System.out.println("Seat " + seatNumber + " booked successfully.");
                }

            } else if (choice == 2) {
                System.out.println("Exiting system");
            } else {
                System.out.println("Invalid option try again!");
            }

        } while (choice != 2);
        scanner.close();
    }
}

