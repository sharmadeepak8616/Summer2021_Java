package Class14.ConstructorPkg.SchoolPkg;

public class School {
    public static void main(String[] args) {

        Students s1 = new Students("S1", 20);
        s1.showProfile();

        Students s2 = new Students("S2", 22, "NYC");
        s2.showProfile();

        Students s3 = new Students("S3", 33, "TX");
        s3.showProfile();

//        Students s1 = new Students();
//        s1.enroll("S1", 20);
//        s1.showProfile();
//
//        Students s2 = new Students();
//        s2.enroll("S2", 22, "NY");
//        s2.showProfile();
//
//        Students s3 = new Students();
//        s3.showProfile();   // no profile exists
//        // do not create object unless user provide mandatory info





    }
}
