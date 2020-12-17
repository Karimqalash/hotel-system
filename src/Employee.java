public abstract class Employee extends Person{
    private String password;

    static int employeeCount;

    public Employee(String name, String password){
        super(name);
        this.password = password;
        employeeCount ++;
    }

    public boolean validatePassword(String pass){
        if(password.equals(pass))   return true;
        return false;
    }

    public void print(){
        System.out.println("id: "+ this.getId()+ ", name: "+this.getName()+" ,password: "+this.password);
    }

    public abstract void menu();
}
