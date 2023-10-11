public class Cat extends Animal{

    public Cat(String name, String breed){ // Parameterized Constructor
       super(name, breed);
    }

    @Override
    void makeSound() {
        System.out.println("Miau!");
    }
}
