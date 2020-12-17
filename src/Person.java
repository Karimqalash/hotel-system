public class Person {
    private static int id_count=0;
    private int id;
    private String name;

    public Person(String name) {
        this.name=name;
        this.id=id_count;
        id_count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
