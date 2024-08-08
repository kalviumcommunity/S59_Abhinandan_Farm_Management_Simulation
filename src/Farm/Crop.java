package Farm;

// use of classes can be seen here
public class Crop {
    private String type;
    private String growthStage;
    private int waterLevel;
    private String description;

    public Crop(String type, int initialWaterLevel) {
        this.type = type;
        this.growthStage = "Seedling";
        this.waterLevel = initialWaterLevel;
        this.description = "A generic crop.";
    }

    public Crop(String type, int initialWaterLevel, String description) {
        this.type = type;
        this.growthStage = "Seedling";
        this.waterLevel = initialWaterLevel;
        this.description = description;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void waterCrop(int amount) {
        if(this.waterLevel < 40) {
            this.waterLevel += amount;
            System.out.println(type + " crop watered. Current water level: " + waterLevel);
        }
        else{
            System.out.println(type + " crop is already sufficiently watered. Current water level: " + waterLevel);
        }
    }

    public void displayInfo() {
        System.out.println("Crop Information:");
        System.out.println("Type: " + type);
        System.out.println("Growth Stage: " + growthStage);
        System.out.println("Water Level: " + waterLevel);
        System.out.println("Description: " + description);
    }

}
