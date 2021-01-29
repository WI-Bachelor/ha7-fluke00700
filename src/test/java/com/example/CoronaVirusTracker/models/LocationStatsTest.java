package com.example.CoronaVirusTracker.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationStatsTest {

    @Test
    @DisplayName("should return the string of a location containing stat in this order state,country,latestTotalCases")
    void testReturnString() {
        LocationStats testStat = new LocationStats();
        testStat.setState("Bermuda");
        testStat.setCountry("United Kingdom");
        testStat.setLatestTotalCases(690);

        var expected = "LocationStats{state='Bermuda', country='United Kingdom', latestTotalCases=690}";

        assertEquals(expected, testStat.toString());
    }

}
