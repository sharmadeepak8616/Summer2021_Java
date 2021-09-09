package Class10.ClassConcept.Banking;

public class Customer {
    // data required to be our Customer-> name, address and ssn
    // String name, address, ssn;

    String name;
    String address;
    String ssn;


    // create Customer Profile (to create profile should show send the required data
    /*
        name = Deepak
     */
    public void createProfile(String cName, String cAddress, String cSsn) {
        name = cName;
        address = cAddress;
        ssn = cSsn;
        System.out.println("\n** Profile created **\n");
    }

    // updateProfile (user should tell the field to update and new value)
    public void updateProfile(String field, String newValue) {
        switch (field.toLowerCase()) {
            case "name":
                name = newValue;
                break;
            case "address":
                address = newValue;
                break;
            case "ssn":
                ssn = newValue;
                break;
            default:
                System.out.println("Incorrect field entered - " + field);
        }
    }

    // show Customer Profile (show customer info (name, address and ssn)
    /*
        sout(name)  // Deepak
     */
    public void showProfile() {
        System.out.println("\n** Profile **" +
                "\nName : " + name +
                "\nSSN : " + ssn +
                "\nAddress : " + address);
    }



}
