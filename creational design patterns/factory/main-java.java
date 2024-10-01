package Factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();

        DeviceFactory dellLaptopFactory = new LaptopFactory("Dell");
        DeviceFactory lenovoLaptopFactory = new LaptopFactory("Lenovo");
        DeviceFactory samsungPhoneFactory = new SmartphoneFactory("Samsung");
        DeviceFactory applePhoneFactory = new SmartphoneFactory("Apple");

        devices.add(dellLaptopFactory.createDevice());
        devices.add(lenovoLaptopFactory.createDevice());
        devices.add(samsungPhoneFactory.createDevice());
        devices.add(applePhoneFactory.createDevice());

        System.out.println("Getting details of devices:");
        for (Device device : devices) {
            device.getDetails();
        }
    }
}
