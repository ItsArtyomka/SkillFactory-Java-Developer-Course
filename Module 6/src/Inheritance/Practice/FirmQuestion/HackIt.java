package Inheritance.Practice.FirmQuestion;
import Inheritance.Practice.FirmQuestion.anotherfirm.*;
public class HackIt{

    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {
        // Call the method getSecret() of class Secret
        // from package "anotherfirm", in this method.

        Hack hackProcess = new Hack();
        hackProcess.hack();
    }
}

// Class Hack inherits class Secret meaning that class Hack
// is now the child of the Secret class and therefore is able
// to access the "protected" method as subclasses are able to
// collect the field and methods that are even in the other package.
class Hack extends Secret {
    public void hack(){
        getSecret(); // Getting access to the protected method
    }
}
