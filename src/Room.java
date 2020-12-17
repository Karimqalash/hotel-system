public class Room {
    private int room_count = 0;
    private String type;
    private int number;
    private Reservation reservation;

    public Room(String type, int number){
        this.number = number;
        this.type = type;
        room_count++;
    }

    public void reserve(int duration, Customer customer, Employee employee) {
        if(isReserved()){
            System.out.println("Room is Not available to reserve");
            return;
        }
        reservation = new Reservation(duration, this, customer,employee);
    }

    public boolean isReserved() {
        return reservation != null;
    }

    public void free() {
        reservation = null;
    }
}
