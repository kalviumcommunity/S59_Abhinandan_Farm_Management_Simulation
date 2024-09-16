package Farm;

public class Cow extends AbstractLiveStock {

    public Cow() {
        super("Cow");
    }

    @Override
    public void feedAnimal(int amount) {
        setHealthLevel(getHealthLevel() + amount);
        if (getHealthLevel() > 100) {
            setHealthLevel(100);
        }
        setWeight(getWeight() + amount / 8);
        System.out.println("The cow has been fed.");
    }

    @Override
    public void ageLivestock() {
        setAge(getAge() + 1);
        setHealthLevel(getHealthLevel() - 5);
        System.out.println("The cow has aged. Current age: " + getAge());
    }

    @Override
    public void displayInfo() {
        System.out.println("Livestock: Cow");
        System.out.println("Health Level: " + getHealthLevel());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight());
    }
}
