package ie.atu.ChristmasProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ie.atu.ChristmasProject.GenerateValues.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketAvailabilityTest {

    TicketAvailability TickNum;

    @BeforeEach
    void setUp() {
        TickNum = new TicketAvailability(2,2);
    }

    //  tests if can set user_seat to 1
    @Test
    void setUser_seat() {
        TickNum.setUser_seat(1);
        assertEquals(1, TickNum.getUser_seat());
    }

    //  tests if can set user_stand to 1
    @Test
    void setUser_standing() {
        TickNum.setUser_standing(1);
        assertEquals(1, TickNum.getUser_standing());

    }

    // checks if responds to string sit with correct code execution
    @Test
    void SetSeat_kindSit(){
        String testString = "sit";

        TickNum.setSeat_kind("SIT");
        assertEquals(testString, TickNum.getSeat_kind());
    }

    // checks if responds to string stand with correct code execution
    @Test
    void SetSeat_kindStand(){
        String testString = "stand";

        TickNum.setSeat_kind("Stand");
        assertEquals(testString, TickNum.getSeat_kind());
    }

    //  checks if can generate correct string length
    @Test
    void setTicketRef() {
        int testValue = 20;     //  length of string
        TickNum.setTicket_ref(generateString());

        assertEquals(testValue, TickNum.getTicket_ref().length());
    }

    @AfterEach
    void tearDown() {
    }
}