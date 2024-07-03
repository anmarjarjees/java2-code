package relationships;

public class HardDrive {
    public String type; // HDD or SSD
    public String brand; // Seagate, Western Digital...
    public String size; // in GB or in TB
    public String dimensions;

    // Constructor:
    public HardDrive(String hdType, String hdBrand, String hdSize, String dimensions) {
        type = hdType;
        brand = hdBrand;
        size = hdSize;
        this.dimensions = dimensions;
    }

}
