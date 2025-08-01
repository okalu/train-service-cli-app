package edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.repository;

import edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.model.Passenger;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PassengerRepository {
    private static Passenger[] passengers;

    private static  PassengerRepository instance;

    public static synchronized PassengerRepository getInstance() {
        if (instance == null) {
            instance = new PassengerRepository();
        }
        return instance;
    }

    private void loadData() {
        passengers = new Passenger[] {
                new Passenger(1, "Daniel", "Agar", "(641) 123-0099",
                        LocalDate.of(1987,3,21),
                        "Picadilly",
                        LocalDateTime.of(2025,7,15,13,9,0)),
                new Passenger(2, "Anna", "Smith", "(641) 123-0099",
                        LocalDate.of(2001,12,7),
                        "Saints",
                        LocalDateTime.of(2025,7,15,13,9,0)),
                new Passenger(3, "Mike", "Johnson", "(641) 123-0099",
                        LocalDate.of(2008,2,28),
                        "Picadilly",
                        LocalDateTime.of(2025,7,15,13,9,0)),
        };
    }

    public Passenger[] getPassengers() {
        if (passengers == null || passengers.length == 0) {
            loadData();
        }
        return passengers;
    }
}
