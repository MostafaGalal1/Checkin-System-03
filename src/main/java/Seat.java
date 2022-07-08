enum Seat_Class{
    ECONOMY, PREMIUM_ECONOMY, BUSINESS, FIRST_CLASS;
}

public class Seat {
    private String seatNo;
    private Seat_Class seatClass;

    public void setSeatNo(String _seatNo){
        seatNo = _seatNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatClass(Seat_Class _seatClass){
        seatClass = _seatClass;
    }

    public Seat_Class getSeatClass() {
        return seatClass;
    }
}
