package test;

import main.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {
    @Test
    public void Sedan() {
        double actual = TripCalculator.calculatePerHeadFareOfSedanTrip(new SedanTrip(10, 10, 3));
        Assertions.assertEquals(120, actual);
    }

    @Test
    public void MotorBike_LessThan25() {
        double actual = TripCalculator.calculatePerHeadFareOfMotorBikeTrip(new MotorBikeTrip(1, 2, 1));
        Assertions.assertEquals(25, actual);
    }

    @Test
    public void MotorBike_MoreThan25() {
        double actual = TripCalculator.calculatePerHeadFareOfMotorBikeTrip(new MotorBikeTrip(5, 15, 1));
        Assertions.assertEquals(100, actual);
    }


    @Test
    public void SevenSeater_LessThan10KM() {
        double actual = TripCalculator.calculatePerHeadFareOfSevenSeaterBikeTrip(new SevenSeaterTrip( 1, 2, 7));
        Assertions.assertEquals(40, actual);
    }

    @Test
    public void SevenSeater_MoreThan2KM() {
        double actual = TripCalculator.calculatePerHeadFareOfSevenSeaterBikeTrip(new SevenSeaterTrip( 100, 200, 6));
        Assertions.assertEquals(500, actual);
    }

}