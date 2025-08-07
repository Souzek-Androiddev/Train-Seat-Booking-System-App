# TRAIN SEAT BOOKING SYSTEM

A CONSOLE JAVA APPLICATION

Live URL: []()

## 📌 Table of Contents

- [🚀 Getting Started](#-getting-started)
- [🛠 Tech Stack](#-tech-stack)
- [📦 Setup & Run Instructions](#-setup-run-instructions)
- [💻 Running the Application](#-running-the-application)
- [📋 Approach](#-approach)
- [📸 Screenshots](#-screenshots)
- [🚀 Deployment](#-deployment)
- [👤 Developers](#-developers)

## 🚀 Getting Started

## 🛠 Tech Stack

Java

## 📦 Setup & Run Instructions

Clone the repository and run the command:

git clone <https://github.com/ruebeniosdev/TrainSeatBookingSystem.git>

### Running the Application

run App.java

## 📸 Screenshots

![alt text](<src/images/Screenshot 2025-06-11 145902.png>)

## 📋 Approach

Used a boolean array to represent each seat if its false means the seat is available and true means its already booked.
The system displays 20 seats and lets user select a seat number to book when a use inputs a seat number. the app checks:

- if its within range(1-20).
- if the seat is already booked.
  if the system is availble the system marks it as booked and confirms it to the user. if not it gives back an error message .
- the system prevents double booking by checking the array before assigning a seat.

## 📋 Explanation of "View Seats" Option

The "View Seats" option allows the user to check the current status of all 20 seats at any time during the program.
Here's how it works:

            1. Iterating Through the `seats` Array:
            A `for` loop is used to iterate through the `seats` array, which holds the booking status of each seat (`true` for booked, `false` for available).
            For each seat, the program checks whether the value in the array is `true` or `false`.

            2. Displaying Seat Status:
            If the seat is available (`false`), the program prints:
     
            Seat X: Available
     
            If the seat is booked (`true`), the program prints:
     
            Seat X: Booked
     
            3. User Access:
            This option is helpful because the user can select it at any time during the program,
            to check which seats are available or booked without making any changes.

            Example Output:

            Current Seat Status:
            Seat 1: Available
            Seat 2: Available
            Seat 3: Booked
            Seat 4: Available

            Seat 20: Booked


            This gives the user a clear view of the seat statuses and helps them decide which seat to book next

## 📋 Explanation of "Exit" Option (choice == 0)

The "Exit" option allows the user to leave the program. Here’s how it works:

            1. Stopping the Loop:
            The program runs inside a `do-while` loop. This ensures the menu is displayed repeatedly until the user chooses to exit.
            Once the user selects the "Exit" option (choice == 0), the condition of the loop (choice != 0) becomes `false`, which stops the loop.

            2. Exiting Gracefully:
            Before exiting, the program can display a **summary** of the booking status (e.g., total seats, booked seats, and available seats). 
              This gives the user a final overview.

            3. Confirmation:
            After displaying the summary, the program prints a message like:
     
            Exiting system
    
            The program then terminates.            

## 📋 In Summary

        "View Seats" Option:
        Allows the user to check the status of all seats (available or booked) at any time.
        A `for` loop is used to iterate through the `seats` array and print the status of each seat.
        This helps the user make informed decisions about seat bookings.

        "Exit" Option:
        When the user selects "Exit" (choice == 0), the loop stops, and the program exits gracefully.
        A booking summary can be displayed before exiting to provide the final status of booked and available seats.

        This approach makes the program user-friendly, giving the user full control over checking seat statuses and exiting when they are done!

## 👤 Developers
Akankobateng Rueben Ansoliwen

Abdul Salim Sulemana

