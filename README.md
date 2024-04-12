# Hotel Reservation System

This project is a simple Hotel Reservation System implemented using Spring Boot and Thymeleaf. It allows users to submit their reservation details through a form and processes the reservation.

## Technologies Used

- **Spring Boot**: For building the web application and handling HTTP requests.
- **Thymeleaf**: As the template engine for server-side rendering of HTML pages.
- **Java**: The programming language used for backend logic.
- **HTML/CSS**: For frontend layout and styling.

## Controller

```java
package com.example.hotelreservation.controller;

import com.example.hotelreservation.model.HotelReservation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class HotelReservationController {

    @GetMapping("/form")
    public String reservationForm(Model model) {
        model.addAttribute("reservation", new HotelReservation());
        model.addAttribute("roomTypes", Arrays.asList("Single", "Double", "Suite"));
        return "reservationForm";
    }

    @PostMapping("/process")
    public String process(@Valid @ModelAttribute("reservation") HotelReservation reservation, Model model) {
        // Processing reservation logic
    }
}
Model
java
Copy code
package com.example.hotelreservation.model;

import java.time.LocalDate;

public class HotelReservation {
    // Model attributes
}
Views
html
Copy code
<!-- reservationForm.html -->
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- HTML Head Section -->
</head>
<body>
<div class="container">
    <!-- Reservation Form Section -->
</div>
</body>
</html>
html
Copy code
<!-- reservationConfig.html -->
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- HTML Head Section -->
</head>
<body>
<div class="container">
    <!-- Reservation Confirmation Section -->
</div>
</body>
</html>
CSS Styling
css
Copy code
body {
    /* Body styling */
}

.container {
    /* Container styling */
}

/* Additional CSS styles for form elements, error messages, and buttons */
Project Structure
css
Copy code
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

Author
Mahmoud Najmeh

License
This project is licensed under the MIT License.


![1](https://github.com/MN10101/hotel-reservation/assets/78208459/3a778429-3284-455d-8020-2ba0cababf3a)

![2](https://github.com/MN10101/hotel-reservation/assets/78208459/4a772ac9-dc9c-4970-8972-4438df57f54c)
