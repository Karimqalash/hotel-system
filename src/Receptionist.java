public class Receptionist extends Employee{

    public Receptionist(String name, String pass){
        super(name, pass);
    }

    public void menu() {
        System.out.println("please, choose any option :");
        System.out.println("1- View All Rooms \n" +
                "2- Add New Receptionist \n" +
                "3- View All Receptionist \n" +
                "4- Delete Receptionist By id \n" +
                "5- Make New Reservation \n" +
                "6- View All Reservations \n" +
                "7- Delete A Reservation \n" +
                "8- Add New Customer \n" +
                "9- View All Customers \n" +
                "10- Delete Customer By Id \n" +
                "11- Sign Out\n" +
                "12- Exit");
    }
}
