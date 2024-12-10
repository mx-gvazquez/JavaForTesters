package MyJavaOOP.src;

public class Dog  extends Animal{

    public Dog(String name, String breed){ // Parameterized Constructor
        super(name, breed);
    }
    @Override
    void makeSound() {

        System.out.println("Guau!");
    }

    @Override
    public void sleep(){
        super.sleep(); //
        System.out.println("Child Dog is sleeping.... zzzzz");
    }

    public void goodBoy(){
        System.out.println(super.name + ", come here, who's a good boy?"); // Super variable from Animal class
    }


}
