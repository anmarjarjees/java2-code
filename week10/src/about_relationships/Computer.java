package about_relationships;

/* 
 * Relationship between classes:
 * - Inheritance Relationship => extends
 * - Aggregation
 * - Composition
 * 
 * Please refer to my PDF file for UML and OOP for more clarifications
 */
/* 
 * With OOP:
 * Two types of relationships:
 * - is a => Inheritance => Rectangle is a shape
 * - has a => Aggregation 
 * - owns => Composition
 * 
 * Computer contains the hard drive
 */
public class Computer {
    private String cpu; // Processor
    private String ram; // Memory

    // 4 properties for the Hard Drive!
    // private String hardDriveType; // HDD or SSD
    // private String hardDriveBrand; // Seagate, Western Digital..
    // private String hardDriveSize; // in GB or in TB
    // private String hardDimensions; // for laptop for desktop

    // It's better to create a new class for the HardDrive only:
    // Using "has a" relationship with HardDrive class
    // using this:
    private HardDrive hardDrive;

    public Computer(String processor, String memory, HardDrive hardDisk) {
        cpu = processor;
        ram = memory;
        // passing a hardDisk variable of type HardDrive
        hardDrive = hardDisk;
        System.out.println("Testing Hard Drive: " + hardDrive);
    }

    // getComSpecs => get the computer specifications
    public void getCompSpecs() {
        System.out.println("Specifications");
        System.out.println("CPU: " + cpu + "\nRAM: " + ram);
        System.out.println("Hard Drive: " + " " + hardDrive.brand + " " + hardDrive.type + " " + " " + hardDrive.size);
    }
} // end class
