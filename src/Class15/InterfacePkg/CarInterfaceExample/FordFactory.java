package Class15.InterfacePkg.CarInterfaceExample;

import com.sun.tools.doclint.Env;

public class FordFactory implements CarGuidelines,EnvGuidelines {

    public void addSteering() {
        System.out.println("basic steering");
    }

    public void addEngine() {
        System.out.println("Basic engine");
    }

    public void premiumSeating() {
        System.out.println("Premium seats added");
    }

    public void zeroEmission() {
        System.out.println("Ford - Zero emission when stop");
    }
}
