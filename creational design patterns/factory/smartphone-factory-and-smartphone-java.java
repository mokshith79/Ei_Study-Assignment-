// SmartphoneFactory.java
package Factory;

public class SmartphoneFactory implements DeviceFactory {
    private String brand;

    public SmartphoneFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public Device createDevice() {
        return new Smartphone(brand);
    }
}

// Smartphone.java
package Factory;

public class Smartphone implements Device {
    private String brand;

    public Smartphone(String brand) {
        this.brand = brand;
    }

    @Override
    public void configure() {
        System.out.println(brand + " Smartphone is being configured.");
    }

    @Override
    public void assemble() {
        System.out.println(brand + " Smartphone is being assembled.");
    }

    @Override
    public void verify() {
        System.out.println(brand + " Smartphone is being verified.");
    }

    @Override
    public void getDetails() {
        System.out.println("Details of " + brand + " Smartphone:");
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
