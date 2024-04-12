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

        if (reservation.getName() == null || reservation.getName().isEmpty()) {
            model.addAttribute("nameError", "Guest name is required");
        }
        if (reservation.getEmail() == null || reservation.getEmail().isEmpty()) {
            model.addAttribute("emailError", "Guest email is required");
        }
        if (!reservation.isAgreedToTerms()) {
            model.addAttribute("termsError", "You must agree to the terms and conditions");
        }

        if (model.containsAttribute("nameError") || model.containsAttribute("emailError") || model.containsAttribute("termsError")) {
            return "reservationForm";
        }

        model.addAttribute("message", "Hotel reservation submitted successfully!");
        model.addAttribute("reservation", reservation);
        return "reservationConfig";
    }
}

