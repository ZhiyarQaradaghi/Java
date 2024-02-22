package ITE409.PcShop;

public class Laptop implements Device {

    private String modelName;
    private int units;
    private int brand;
    private int price;
    private int modelYear; 

    public int getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getPrice() {
        return price;
    }
    
    public int getUnits() {
        return units;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }
    
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    
    public void printDevice(String string) {
        
    }
    
}
