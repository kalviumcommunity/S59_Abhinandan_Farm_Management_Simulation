package Farm;

public abstract class AbstractLiveStock {
    protected String animal;
    protected int healthLevel;
    protected int age;
    protected int weight;

    public AbstractLiveStock(String animal) {
        this.animal = animal;
        this.healthLevel = 100;
        this.age = 0;
        this.weight = 0;
    }
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void feedAnimal(int amount);
    public abstract void ageLivestock();
    public abstract void displayInfo();
}
