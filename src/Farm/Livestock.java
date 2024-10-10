package Farm;

public class Livestock extends AbstractLiveStock {
    //Livestock class can effectively replace AbstractLiveStock class
    //this class has all the methods and members present in its parent class
    //As per LSP, any subclass should be able to replace its superclass

    public Livestock(String animal) {
        super(animal);
    }
    @Override
    public void feedAnimal(int amount) {
        setHealthLevel(getHealthLevel() + amount);
        if (getHealthLevel() > 100) {
            setHealthLevel(100);
        }
        setWeight(getWeight() + amount / 10);
    }

    @Override
    public void ageLivestock() {
        setAge(getAge() + 1);
        setHealthLevel(getHealthLevel() - 5);
        if (getHealthLevel() < 0) {
            setHealthLevel(0);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Livestock Information:");
        System.out.println("Animal: " + getAnimal());
        System.out.println("Health Level: " + getHealthLevel());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight());
    }
}




