public class vehicle {
    private int serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private int baseCost;

    public vehicle(int serialNumber, String name, String model, int year, String manufacturer, int baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getBaseCost() {
        return baseCost;
    }
    public String toString() {
        return "Vehicle{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", baseCost=" + baseCost +
                '}';
    }
}
