package main;

public class MotorBikeTrip extends Trip{

    public MotorBikeTrip(
            int distanceToBeCoveredDuringTripInKM,
            int totalTimeToBeTakenToCompleteTripInMinutes,
            int numberOfPassengersInsideVehicle) {
        super(distanceToBeCoveredDuringTripInKM, totalTimeToBeTakenToCompleteTripInMinutes, numberOfPassengersInsideVehicle);

    }

    public void requestTrip() {

        showRideInformation();
        showTripInformation();
    }

    private void showRideInformation(){
        System.out.println("== Ride Swift in Bike ==");
    }

    private void showTripInformation(){
        if (TripVerification.verifyingMotorBikeTrip(this)) {
            System.out.println(getDistanceToBeCoveredDuringTripInKM() + " KM");
            System.out.println(getTotalTimeToBeTakenToCompleteTripInMinutes() + " totalTimeToBeTakenToCompleteTripInMinutes");
            System.out.println(TripCalculator.calculatePerHeadFareOfMotorBikeTrip(this) + " Taka Per Person");
        } else {
            System.out.println("Invalid Trip Request");
        }
    }




}

