package edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.StringJoiner;

public class Passenger {
    private Integer passengerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String trainStation;
    private LocalDateTime datetimeBoarded;

    public Passenger(Integer passengerId, String firstName, String lastName, String phoneNumber, LocalDate dateOfBirth, String trainStation, LocalDateTime datetimeBoarded) {
        this.passengerId = passengerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.trainStation = trainStation;
        this.datetimeBoarded = datetimeBoarded;
    }

    public Passenger() {
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(String trainStation) {
        this.trainStation = trainStation;
    }

    public LocalDateTime getDatetimeBoarded() {
        return datetimeBoarded;
    }

    public void setDatetimeBoarded(LocalDateTime datetimeBoarded) {
        this.datetimeBoarded = datetimeBoarded;
    }

    public Integer getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Passenger.class.getSimpleName() + "[", "]")
                .add("passengerId=" + passengerId)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("phoneNumber='" + phoneNumber + "'")
                .add("dateOfBirth=" + dateOfBirth)
                .add("trainStation='" + trainStation + "'")
                .add("datetimeBoarded=" + datetimeBoarded)
                .toString();
    }
}
