package MyJavaOOP.src;

public class LampPublic {

    public boolean lightStatus = false; //NOW accesible from outside this class, 'Main' class

    public void publicLightStatus(){
        if (lightStatus){
            System.out.println("The lamp in the "  + " is ON");
        } else {
            System.out.println("The lamp in the " + " is OFF");
        }
    }
}
