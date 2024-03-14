package about_relationships;

public class Main {
    public static void main(String[] args) {
        HardDrive hd = new HardDrive("SSD", "Seagate", "500GB", "3.5 x 2");
        Computer pc1 = new Computer("Intel i5", "12 GB", hd);

        pc1.getCompSpecs();
    }
}
