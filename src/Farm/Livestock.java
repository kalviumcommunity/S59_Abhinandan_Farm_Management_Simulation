package Farm;

//use of classes can be seen here
public class Livestock {
    private String animal;
    private int healthLevel;
    private int age;
    private int weight;

    public Livestock(String animal) {
        this.animal = animal;;
        this.healthLevel = 100;
        this.age = 0;
        this.weight = 0;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animalName) {
        this.animal = animalName;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        if(this.healthLevel > 100) {
            this.healthLevel = 100;
        }
        else if (healthLevel < 0) {
            this.healthLevel = 0;
        }
        else {
            this.healthLevel = healthLevel;
        }
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

    public void FeedAnimal(int amount) {
        this.healthLevel += amount;
        if (this.healthLevel > 100) {
            this.healthLevel = 100;
        }
        this.weight += amount / 10;
    }

    public void ageLivestock() {
        this.age++;
        this.healthLevel -= 5; // Health decreases with age
        if (this.healthLevel < 0) {
            this.healthLevel = 0;
        }
    }

    public void displayInfo() {
        System.out.println("Livestock Information:");
        System.out.println("Animal: " + animal);
        System.out.println("Health Level: " + healthLevel);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}




