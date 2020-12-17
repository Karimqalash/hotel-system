public class Reservation {
    private static int reservationCount=0;
    private int duration;
    private int id;
    private Room room;
    private Customer customer;
    private Employee employee;

    public Reservation(int duration, Room room, Customer customer, Employee employee) {
        this.id=reservationCount;
        this.duration=duration;
        this.room=room;
        this.customer=customer;
        this.employee=employee;
        reservationCount++;
    }
}