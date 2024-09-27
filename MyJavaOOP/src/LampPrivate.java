public class LampPrivate {
    private boolean lightStatus = false; //NOT accesible from outside this class.

    public void privateLightStatus(){
        if (lightStatus){
            System.out.println("The lamp is ON");
        } else {
            System.out.println("The lamp is OFF");
        }
    }
}