package Farm;


public class Crop extends AbstractCrop{
    private String growthStage;

    public Crop(String type, int initialWaterLevel) {
        super(type, initialWaterLevel, "A generic crop.");
        this.growthStage = "Seedling";
    }

    public Crop(String type, int initialWaterLevel, String description) {
        super(type, initialWaterLevel, description);
        this.growthStage = "Seedling";
    }

    public String getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }

    @Override
    public void waterCrop(int amount) {
        if(this.waterLevel < 40) {
            this.waterLevel += amount;
            System.out.println(type + " crop watered. Current water level: " + waterLevel);
        }
        else{
            System.out.println(type + " crop is already sufficiently watered. Current water level: " + waterLevel);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Crop Information:");
        System.out.println("Type: " + type);
        System.out.println("Growth Stage: " + growthStage);
        System.out.println("Water Level: " + waterLevel);
        System.out.println("Description: " + description);
    }

}
