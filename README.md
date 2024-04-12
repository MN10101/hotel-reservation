# Hotel Reservation System

This is a simple hotel reservation system implemented using Spring Boot and Thymeleaf.

## Overview

The project consists of a backend written in Java using Spring Boot, which handles the business logic and data management. It includes a simple web interface for users to make hotel reservations.

## Features

- Allows users to enter their name, email, phone number, check-in and check-out dates, room type, and additional preferences such as smoking preference, breakfast inclusion, and late check-out.
- Validates user input to ensure all required fields are filled and that the user agrees to the terms and conditions.
- Provides feedback to the user in case of errors during the reservation process.
- Displays a confirmation message upon successful reservation.

## Getting Started

1. Clone the repository to your local machine.
2. Open the project in your favorite Java IDE.
3. Build and run the project.
4. Access the reservation form by navigating to `http://localhost:8080/form` in your web browser.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- HTML
- CSS

## Project Structure

- `com.example.hotelreservation.controller`: Contains the controller classes responsible for handling HTTP requests.
- `com.example.hotelreservation.model`: Contains the model classes representing the data entities used in the application.
- `resources/templates`: Contains the Thymeleaf HTML templates used to render the web pages.
- `resources/static`: Contains static resources such as CSS files.





src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── hotelreservation
│   │               ├── controller
│   │               │   └── HotelReservationController.java
│   │               └── model
│   │                   └── HotelReservation.java
│   └── resources
│       └── templates
│           ├── reservationConfig.html
│           └── reservationForm.html
└── test
    └── java
        └── com
            └── example
                └── hotelreservation
                    └── HotelReservationApplicationTests.java
Running the Application
To run the application, you can execute the main method in the HotelReservationApplication class. Alternatively, you can use the provided Maven or Gradle build tools to build and run the project.

## Author

Mahmoud Najmeh

License
This project is licensed under the MIT License.


![1](https://github.com/MN10101/hotel-reservation/assets/78208459/3a778429-3284-455d-8020-2ba0cababf3a)

![2](https://github.com/MN10101/hotel-reservation/assets/78208459/4a772ac9-dc9c-4970-8972-4438df57f54c)
