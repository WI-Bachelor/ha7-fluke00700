package com.example.CoronaVirusTracker.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationStatsTest {

    @Test
    @DisplayName("should return the string of a location containing stat in this order state,country,latestTotalCases")
    void canReturnString() {
        LocationStats testStat = new LocationStats();
        testStat.setLatestTotalCases(690);
        testStat.setCountry("United Kingdom");
        testStat.setState("Bermuda");
        var expected = "LocationStats{state='Bermuda', country='United Kingdom', latestTotalCases=690}";

        assertEquals(expected, testStat.toString());
    }

}
