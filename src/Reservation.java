import java.time.LocalDate; // import the LocalDate class

public class Reservation {
    private static int reservationCount=0;
    private int duration;
    private int id;
    private LocalDate dateCreated;
    private Room room;
    private Customer customer;
    private Employee employee;

    public Reservation(int duration, Room room, Customer customer, Employee employee) {
        this.id=reservationCount;
        this.dateCreated = LocalDate.now();
        this.duration=duration;
        this.room=room;
        this.customer=customer;
        this.employee=employee;
        reservationCount++;
    }

    public int getId() {
        return id;
    }

    public int reservationCount() {
        return reservationCount;
    }

    public void print() {
        System.out.printf("id :%d, date created: %s, duration: %d, room: %d, customer: %s, employee: %s \n", this.id,this.dateCreated, this.duration, this.room.getNumber(), this.customer.getName(), this.employee.getName());
    }
}