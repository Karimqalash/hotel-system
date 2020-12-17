public class Manager extends Employee{

    public Manager(String name, String pass){
        super(name,pass);
    }
    public void menu() {
        System.out.println("please, choose any option :");
        System.out.println("1- View All Rooms \n" +
                "2- Make New Reservation \n" +
                "3- View All Reservations \n" +
                "4- Add New Customer \n" +
                "5- View All Customers \n" +
                "6- Delete Customer By Id \n" +
                "7- Sign Out\n" +
                "8- Exit");
    }
}
