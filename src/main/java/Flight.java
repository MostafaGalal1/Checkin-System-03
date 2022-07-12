import java.util.List;

public class Flight {
    private String flightCode;
    private int duration;
    private String departure;
    private String arrival;
    private List<Seat> seats;

    public void setFlightCode(String flightCode) { this.flightCode = flightCode; }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setArrival(String arrival){
        this.arrival = arrival;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public void setSeats(List<Seat> seats){
        this.seats = seats;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public int getDuration(){
        return duration;
    }

    public String getDeparture(){
        return departure;
    }

    public String getArrival(){
        return arrival;
    }

    public List<Seat> getSeats(){
        return seats;
    }

}
