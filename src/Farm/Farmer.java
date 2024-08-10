package Farm;

public class Farmer {
    private String name;
    private int age;

    public Farmer(String name, int age) {
        this.name = name;
        this.age = age;    //use of this pointer can be seen here
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age =  age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayFarmerInfo() {
        System.out.println("Farmer Information: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

};
