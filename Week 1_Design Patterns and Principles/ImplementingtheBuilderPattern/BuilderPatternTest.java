package ImplementingtheBuilderPattern;
public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a basic Computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
            .build();
        System.out.println(basicComputer);

        // Create a computer with additional options
        Computer advancedComputer = new Computer.Builder("Intel i9", "16GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 3080")
            .setBluetooth(true)
            .build();
        System.out.println(advancedComputer);
    }
}

