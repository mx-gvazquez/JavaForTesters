abstract class Animal {

    protected String name; // Changed from Private to protected in order to use it in a child class (Dog)
    private String breed;

    public Animal(String name, String breed){ // Parameterized Constructor copied used in Cat and Dog. Instanced in Main2.
        this.name = name;
        this.breed = breed;
    }

    // GETTER autocode IntelliJ -->   Menu Code > Generate > Getter  (SHIFT + DOWN to select both variables)
    // These methods simply return variable values.
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }

    // SETTER autocode IntelliJ --> Menu Code > Generate > Setter (Only 'name', because can't change breed IRL)
    public void setName(String name) {
        this.name = name;
    }


    abstract void makeSound(); //Abstract methods don't have a body.

    public void sleep(){
        System.out.println("Sleeping ...... zzzzz");
    }

}
