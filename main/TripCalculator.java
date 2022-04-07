package main;


public class TripCalculator {

    public static int calculatePerHeadFareOfSedanTrip(Trip trip){
        int fare;

        fare = (50 + trip.getDistanceToBeCoveredDuringTripInKM() * 30 + trip.getTotalTimeToBeTakenToCompleteTripInMinutes() * 2) / trip.getNumberOfPassengersInsideVehicle();
        return fare - (fare % 5);
    }

    public static int calculatePerHeadFareOfMotorBikeTrip(Trip trip){
        int fare;
        fare = Math.max(25, trip.getDistanceToBeCoveredDuringTripInKM() * 20) / trip.getNumberOfPassengersInsideVehicle();
        return fare - (fare % 5);
    }

    public static int calculatePerHeadFareOfSevenSeaterBikeTrip(Trip trip){
        int fare;

        if (trip.getDistanceToBeCoveredDuringTripInKM() < 10)
            fare = 300 / trip.getNumberOfPassengersInsideVehicle();
        else
            fare = (trip.getDistanceToBeCoveredDuringTripInKM() * 30) / trip.getNumberOfPassengersInsideVehicle();

        return fare - (fare % 5);
    }
}
