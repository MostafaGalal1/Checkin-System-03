import org.junit.Assert;
import org.junit.Test;

public class Testing {
    private final Flight flight_test = new Flight();
    private final Seat seat_test = new Seat();

    @Test
    public void test_FlightCode(){
        flight_test.setFlightCode("CA3442");
        String flightCode = flight_test.getFlightCode();
        Assert.assertEquals(flightCode, "CA3442");
    }

    @Test
    public void test_Duration(){
        flight_test.setDuration(13);
        int duration = flight_test.getDuration();
        Assert.assertEquals(duration, 13);
    }

    @Test
    public void test_Departure(){
        flight_test.setDeparture("New York");
        String departure = flight_test.getDeparture();
        Assert.assertEquals(departure, "New York");
    }

    @Test
    public void test_Arrival(){
        flight_test.setArrival("Venice");
        String arrival = flight_test.getArrival();
        Assert.assertEquals(arrival, "Venice");
    }

    @Test
    public void test_setSeatNo(){
        seat_test.setSeatNo("B23");
        String arrival = seat_test.getSeatNo();
        Assert.assertEquals(arrival, "B23");
    }

}

