public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("karim");
        Employee d = new Receptionist("ali", "123");
        Room r = new Room("Royal", 1);
        Reservation a = new Reservation(3, r, c, d);
        a.print();
    }   
}