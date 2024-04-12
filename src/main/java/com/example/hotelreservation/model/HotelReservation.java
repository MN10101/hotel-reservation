package com.example.hotelreservation.model;

import java.time.LocalDate;

public class HotelReservation {
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String roomType;
    private boolean smokingPreference;
    private boolean breakfastIncluded;
    private boolean lateCheckOut;
    private boolean agreedToTerms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isSmokingPreference() {
        return smokingPreference;
    }

    public void setSmokingPreference(boolean smokingPreference) {
        this.smokingPreference = smokingPreference;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }

    public boolean isLateCheckOut() {
        return lateCheckOut;
    }

    public void setLateCheckOut(boolean lateCheckOut) {
        this.lateCheckOut = lateCheckOut;
    }

    public boolean isAgreedToTerms() {
        return agreedToTerms;
    }

    public void setAgreedToTerms(boolean agreedToTerms) {
        this.agreedToTerms = agreedToTerms;
    }
}
