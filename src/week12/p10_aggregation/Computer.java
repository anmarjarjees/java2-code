package week12.p10_aggregation;

/* 
 * With OOP:
 * Two types of relationships:
 * - is a => Inheritance => Rectangle is a shape
 * - has a => Composition or Aggregation => 
 */
public class Computer {
    private String cpu;
    private String ram;

    // 3 properties for the Hard Drive!
    // It's better to create a new class for the HardDrive only:
    /*
     * private String hardDriveType; // HDD or SSD
     * private String hardDriveBrand; // Seagate, Western Digital..
     * private String hardDriveSize; // in GB or in TB
     */

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
