package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperialAPITest {

    ImperialAPI imperialAPI = new ImperialAPI();

    @Test
    void inchToCenti() {
        double a = 3;
        assertEquals(7.62, imperialAPI.inchToCenti(a));
    }

    @Test
    void yardToMeter() {
        double a = 3;
        assertEquals(2.742230347349177, imperialAPI.yardToMeter(a));
    }
}