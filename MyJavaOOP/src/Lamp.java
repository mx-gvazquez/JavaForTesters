public class Lamp {
    //    private boolean lightStatus = false; //NOT accesible from outside this class, 'Main' class
    public boolean lightStatus = false; //NOW accesible from outside this class, 'Main' class
    private String roomName;

/*//No ARGS constructor
    public Lamp(){
        System.out.println("Creating an object of a Lamp class");

    }*/

    // Parameterized constructor
    public Lamp(String room){
        roomName = room;
        System.out.println("Creating " + room + " instance");


    }

    public void printLightStatus(){
        if (lightStatus){
            System.out.println("The lamp in the " + roomName + " is ON");
        } else {
            System.out.println("The lamp in the " + roomName + " is OFF");
        }
    }
}
