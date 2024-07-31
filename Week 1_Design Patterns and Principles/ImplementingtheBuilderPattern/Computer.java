package ImplementingtheBuilderPattern;
public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;
    
    // Optional parameters
    private final String storage;
    private final String graphicsCard;
    private final boolean bluetooth;
    
    // Private constructor to be used by the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }
    
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + 
               ", Storage=" + storage + ", Graphics Card=" + graphicsCard + 
               ", Bluetooth=" + bluetooth + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private final String CPU;
        private final String RAM;
        
        // Optional parameters
        private String storage = "";
        private String graphicsCard = "";
        private boolean bluetooth = false;
        
        // Constructor for required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        
        // Methods to set optional parameters
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        
        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }
        
        // Build method to return a Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}

