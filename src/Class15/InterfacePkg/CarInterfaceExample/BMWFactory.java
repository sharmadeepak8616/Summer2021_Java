package Class15.InterfacePkg.CarInterfaceExample;

public class BMWFactory implements CarGuidelines {

    public void addSteering() {
        System.out.println("BMW Special steering");
    }
    public void addEngine() {
        System.out.println("Sporty engine");
    }

    public void premiumEngine() {
        System.out.println("Premium engine added");
    }


}
