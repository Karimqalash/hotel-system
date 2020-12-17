public class Customer extends Person implements Printable{
    private static int customerCount=0;
    private Reservation reservations[];
    private int reservationCount;

    public Customer(String name){
        super(name);
        reservations = new Reservation[100];
        customerCount++;
        reservationCount=0;
    }

    public int customerCount() {
        return customerCount;
    }

    public void addReservation(Reservation reservation) {
        if(reservationCount >99){
            System.out.println("sorry, you can't reserve any more");
            return;
        }
        reservations[reservationCount] = reservation;
        reservationCount++;
    }

    public void print() {
        System.out.printf("id :%d, name: %s \n", this.getId(), this.getName());
    }
}
