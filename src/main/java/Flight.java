import java.util.List;

public class Flight {
    private String flightCode;
    private int duration;
    private String departure;
    private String arrival;
    private List<Seat> seats;

    public void setFlightCode(String _flightCode) { flightCode = _flightCode; }

    public void setDuration(int _duration){
        duration = _duration;
    }

    public void setArrival(String _arrival){
        arrival = _arrival;
    }

    public void setDeparture(String _departure){
        departure = _departure;
    }

    public void setSeats(List<Seat> _seats){
        seats = _seats;
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
