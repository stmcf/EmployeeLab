package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void payRise(double rise){
        if(rise > 0 ){
        this.salary += rise;
        }
    }
    public double payBonus(){
        return this.salary/100;
    }

    public void setName(String name){
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

//    public static boolean checkInput(String name) {
//        if(name != null && !str.trim().isEmpty())
//            return false;
//        return true;
////    }
//    }
}
