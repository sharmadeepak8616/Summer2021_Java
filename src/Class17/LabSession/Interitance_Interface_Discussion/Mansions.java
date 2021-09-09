package Class17.LabSession.Interitance_Interface_Discussion;

public class Mansions extends BasicControls {

    // tempControl, doorControl, fridgeControl, switchControl,
    // garageControl, securityControl, swimmingPoolControl, sprinklerControl


    public void garageControl() {

    }

    public void securityControl() {

    }

    public void swimmingPoolControl() {

    }

    public void sprinklerControl() {
        doorControl();
    }

    public void gymControl() {
        super.gymControl();
        // spaControl
    }

}
