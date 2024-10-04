package Farm;
//     USE OF Open / CLosed Principle can be seen here
//     src/Farm/AbstractLiveStock.java
public abstract class AbstractCrop {
    protected String type;
    protected int waterLevel;
    protected String description;

    public AbstractCrop(String type, int initialWaterLevel, String description) {
        this.type = type;
        this.waterLevel = initialWaterLevel;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public abstract void waterCrop(int amount);
    public abstract void displayInfo();
}


//USE OF OCP