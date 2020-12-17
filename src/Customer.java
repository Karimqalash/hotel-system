public class Customer extends Person {
    private static int customerCount=0;
    private Reservation reservations[];
    private int reservationCount;

    public Customer(String name){
        super(name);
        customerCount++;
        reservationCount=0;
    }

    public int customerCount() {
        return customerCount;
    }

    public void addReservation(Reservation reservation) {
        reservations[reservationCount] = reservation;
        reservationCount++;
    }

    public void print() {
        System.out.printf("id :%d, name: %s \n", this.getId(), this.getName());
    }
}
