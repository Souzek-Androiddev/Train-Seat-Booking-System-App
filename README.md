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
- [👤 Author](#-author)

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


