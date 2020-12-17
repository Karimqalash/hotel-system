public class Person {
    private static int idCounter;
    private int id;
    private String name;

    public Person(String name){
        idCounter++;
        this.name = name;
        this.id = idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
