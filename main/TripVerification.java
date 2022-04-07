package main;


public class TripVerification {

    public static boolean verifyingSedanTrip(Trip trip){

        return checkIfNoPassengers(trip) && trip.getNumberOfPassengersInsideVehicle() <= 4 && trip.getDistanceToBeCoveredDuringTripInKM() <= 25;
    }

    public static boolean verifyingMotorBikeTrip(Trip trip){


        return trip.getNumberOfPassengersInsideVehicle() == 1 && trip.getDistanceToBeCoveredDuringTripInKM() <= 10;
    }

    public static boolean verifyingSevenSeaterTrip(Trip trip){


        return checkIfNoPassengers(trip) && trip.getNumberOfPassengersInsideVehicle() <= 7 && trip.getDistanceToBeCoveredDuringTripInKM() >= 10;
    }

    private static boolean checkIfNoPassengers(Trip trip){
        return !(trip.getNumberOfPassengersInsideVehicle() < 1);
    }
}
