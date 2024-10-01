// LaptopFactory.java
package Factory;

public class LaptopFactory implements DeviceFactory {
    private String brand;

    public LaptopFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public Device createDevice() {
        return new Laptop(brand);
    }
}

// Laptop.java
package Factory;

public class Laptop implements Device {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    public void configure() {
        System.out.println(brand + " Laptop is being configured.");
    }

    @Override
    public void assemble() {
        System.out.println(brand + " Laptop is being assembled.");
    }

    @Override
    public void verify() {
        System.out.println(brand + " Laptop is being verified.");
    }

    @Override
    public void getDetails() {
        System.out.println("Details of " + brand + " Laptop:");
        configure();
        assemble();
        verify();
        System.out.println();
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
