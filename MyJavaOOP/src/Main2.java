public class Main2 {

    public static void main(String[] args) {

// NEW instance
        Cat cat = new Cat("Don Gato","callejero"); // name & breed variables are now set, but remain PRIVATE.

        // To change them, we need SETTER, methods that simply return variable values.

        cat.setName("Felix");

        // To read the new values, we need a GETTER in the class 'Cat'.

        System.out.println("Tengo un gato " + cat.getBreed() + " llamado " + cat.getName());

        // We never saw the Cat class nor his variables.

        System.out.println("---------------");

        cat.makeSound();
        cat.sleep();

// NEW instance
        Dog dog = new Dog("Rex", "Chihuahua");
        dog.makeSound();
        dog.sleep();
        dog.goodBoy();

// New Instance of Interfaced methods

        InterfaceDemo Inter = new InterfaceDemo();
        Inter.printMessage();
        Inter.printNewMessage();

    }
}
