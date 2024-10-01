package Factory;

public interface Device {
    void configure();
    void assemble();
    void verify();
    void getDetails();
    String getBrand();
}
