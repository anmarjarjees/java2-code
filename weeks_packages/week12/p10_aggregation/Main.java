package week12.p10_aggregation;

public class Main {
    public static void main(String[] args) {

        HardDrive hd = new HardDrive("SSD", "Seagate", "500GB");
        Computer pc1 = new Computer("Intel i5", "12 GB", hd);

        pc1.getCompSpecs();
    }
}
