package com.example.CoronaVirusTracker.Services;

import com.example.CoronaVirusTracker.models.LocationStats;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaVirusDataServiceTest {

    @Test
    @DisplayName("fetch data from Covid-API")
    void testFetchData() throws IOException, InterruptedException {
        CoronaVirusDataService dataService = new CoronaVirusDataService();
        dataService.fetchVirusData();
        List<LocationStats> stats = dataService.getAllStats();

        //kein guter Test//
        assertEquals(stats.size(), 273);

        assertEquals(stats.get(0).getCountry(), "Afghanistan");
    }

}
