package edu.miu.cs.cs425.quiz.trainservicemgmtcliapp;

import edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.model.Passenger;
import edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.repository.PassengerRepository;
import edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.util.JSONUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TrainSchedulingApp {

    public static void main(String[] args) {
        System.out.println("Hello World\n.Welcome to the TrainSchedulingApp");
        var passengers = findPassengersOfAge20OrOlder();
        var jsonData = JSONUtil.convertListToJSON(passengers);
        System.out.println("JSON Data\n" + jsonData);
    }

    private static List<Passenger> findPassengersOfAge20OrOlder() {
        var passengers = PassengerRepository.getInstance().getPassengers();
        return Arrays.stream(passengers)
                .filter(p -> p.getAge() >= 20)
                .sorted(Comparator.comparing(Passenger::getFirstName))
                .toList();
    }
}
