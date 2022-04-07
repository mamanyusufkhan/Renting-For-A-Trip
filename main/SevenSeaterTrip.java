package main;

public class SevenSeaterTrip extends Trip{
    public SevenSeaterTrip(
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
        System.out.println("== Ride with Friends and Family in Seven-Seater ==");
    }

    private void showTripInformation(){
        if (TripVerification.verifyingSevenSeaterTrip(this)) {
            System.out.println(getDistanceToBeCoveredDuringTripInKM() + " KM");
            System.out.println(getTotalTimeToBeTakenToCompleteTripInMinutes() + " totalTimeToBeTakenToCompleteTripInMinutes");
            System.out.println(TripCalculator.calculatePerHeadFareOfSevenSeaterBikeTrip(this) + " Taka Per Person");
        } else {
            System.out.println("Invalid Trip Request");
        }
    }





}
