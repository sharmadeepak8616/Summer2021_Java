package Class15.InterfacePkg.CarInterfaceExample;

public class MercFactory implements CarGuidelines, EnvGuidelines {

    public void addSteering() {
        System.out.println("All weather steering wheel");
    }
    public void addEngine() {
        System.out.println("Best engine");
    }

    public void premiumServicing() {
        System.out.println("Premium servicing added");
    }

    public void zeroEmission() {
        System.out.println("Merc - Zero emission when driving below 10mph");
    }


}
