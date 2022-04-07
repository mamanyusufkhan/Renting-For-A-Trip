package main;

public abstract class Trip {

    private int distanceToBeCoveredDuringTripInKM;
    private int totalTimeToBeTakenToCompleteTripInMinutes;
    private int numberOfPassengersInsideVehicle;

    public Trip(
                int distanceToBeCoveredDuringTripInKM,
                int totalTimeToBeTakenToCompleteTripInMinutes,
                int numberOfPassengersInsideVehicle) {

        this.distanceToBeCoveredDuringTripInKM = distanceToBeCoveredDuringTripInKM;
        this.totalTimeToBeTakenToCompleteTripInMinutes = totalTimeToBeTakenToCompleteTripInMinutes;
        this.numberOfPassengersInsideVehicle = numberOfPassengersInsideVehicle;
    }

    public abstract void requestTrip();





    public int getDistanceToBeCoveredDuringTripInKM() {
        return distanceToBeCoveredDuringTripInKM;
    }

    public int getTotalTimeToBeTakenToCompleteTripInMinutes() {
        return totalTimeToBeTakenToCompleteTripInMinutes;
    }

    public int getNumberOfPassengersInsideVehicle() {
        return numberOfPassengersInsideVehicle;
    }
}
