package ie.atu.ChristmasProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingAvailabilityTest {
    ParkingAvailability ParkingNo;
    @BeforeEach
    void setUp() {
        ParkingNo = new ParkingAvailability(5);
    }

    //  tests if can output value of 1
    @Test
    void setUser_Parking() {
        int testValue = 1;
        ParkingNo.setUser_Parking(testValue);

        assertEquals(testValue, ParkingNo.getUser_Parking());
    }

    //  tests if yes option executes correct code
    @Test
    void setParking_OptionYes() {
        String testString = "yes";
        ParkingNo.setParking_Option(testString);

        assertEquals(testString, ParkingNo.getParking_Option());
    }

    //  tests if no option executes correct code
    @Test
    void setParking_OptionNo() {
        String testString = "no";
        ParkingNo.setParking_Option(testString);

        assertEquals(testString, ParkingNo.getParking_Option());
    }

    @AfterEach
    void tearDown() {
    }
}