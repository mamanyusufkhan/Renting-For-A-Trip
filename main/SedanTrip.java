package main;

public class SedanTrip extends Trip{
    public SedanTrip(
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
        System.out.println("== Comfortable Sedan Ride ==");
    }

    private void showTripInformation(){
        if (TripVerification.verifyingSedanTrip(this)) {
            System.out.println(getDistanceToBeCoveredDuringTripInKM() + " KM");
            System.out.println(getTotalTimeToBeTakenToCompleteTripInMinutes() + " totalTimeToBeTakenToCompleteTripInMinutes");
            System.out.println(TripCalculator.calculatePerHeadFareOfSedanTrip(this) + " Taka Per Person");
        } else {
            System.out.println("Invalid Trip Request");
        }
    }




}



