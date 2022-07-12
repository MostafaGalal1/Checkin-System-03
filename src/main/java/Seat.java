enum Seat_Class {
    ECONOMY, PREMIUM_ECONOMY, BUSINESS, FIRST_CLASS
}

public class Seat {
    private String seatNo;
    private Seat_Class seatClass;
    public String getSeatNo() {
        return seatNo;
    }
    public Seat_Class getSeatClass() {
        return seatClass;
    }
    public void setSeatNo(final String seatNo) {
        this.seatNo = seatNo;
    }
    public void setSeatClass(final Seat_Class seatClass){
        this.seatClass = seatClass;
    }
}
