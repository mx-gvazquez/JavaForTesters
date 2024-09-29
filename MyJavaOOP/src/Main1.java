package MyJavaOOP.src;

public class Main1 {
    public static void main(String[] args) {
// PRIVATE variable
        System.out.println("------------------------------------------");
        System.out.println("Outcome of LampPrivate");
    // Create two objects from LampPrivate Class
        LampPrivate kitchenLampPrivy = new LampPrivate();
        LampPrivate bedrooomLampPriv = new LampPrivate();

    // Instantiate 'privateLightStatus' method from those two objects.
        kitchenLampPrivy.privateLightStatus();
        bedrooomLampPriv.privateLightStatus();

// PUBLIC variable
        System.out.println("------------------------------------------");
        System.out.println("Outcome of LampPublic");
        // Create two objects from LampPrivate Class
        LampPublic kitchenLampPub = new LampPublic();
        LampPublic bedroomLampPub = new LampPublic();

        // Instantiate 'publicLightStatus' method from those two objects.
        kitchenLampPub.publicLightStatus();
        bedroomLampPub.publicLightStatus();

        System.out.println("------------------------------------------");
        System.out.println("Change a 'local' PUBLIC variable in one object and re-print");
        kitchenLampPub.lightStatus = true;

        // Instantiate 'publicLightStatus' method from those two objects.
        kitchenLampPub.publicLightStatus();
        bedroomLampPub.publicLightStatus();

    }
}
