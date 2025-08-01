package edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.util;

import edu.miu.cs.cs425.quiz.trainservicemgmtcliapp.model.Passenger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JSONUtil {

    public static String convertListToJSON(List<Passenger> passengers) {
        JSONArray  jsonArray = new JSONArray();
        passengers.stream().forEach(passenger -> {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("passengerId", passenger.getPassengerId());
            jsonObject.put("firstName", passenger.getFirstName());
            jsonObject.put("lastName", passenger.getLastName());
            jsonObject.put("phoneNumber", passenger.getPhoneNumber());
            jsonObject.put("dateOfBirth", passenger.getDateOfBirth());
            jsonObject.put("trainStation", passenger.getTrainStation());
            jsonObject.put("datetimeBoarded", passenger.getDatetimeBoarded());
            jsonArray.put(jsonObject);
        });
        return jsonArray.toString(2);
    }
}
