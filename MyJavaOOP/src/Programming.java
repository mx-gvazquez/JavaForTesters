package MyJavaOOP.src;

public class Programming {

//Class attributes
    private String language; // Class level variable, to use it in other constructors.
    private boolean learningComplete = false;

// Constructor
    public Programming(String language){  //Class level variable AND constructor parameter are both Strings and have the same name.
        this.language = language;         // 'this'. refers to the class level variable, NOT the constructor parameter.
                                        // 'this.' is used to eliminate confusion between class attributes and parameters with the same name.
    }


// Methods
    public void learningStatus(){
        if (learningComplete){
            System.out.println("Mastered " + language); // Class level variable, not confussion.
        } else {
            System.out.println("Learning " + language); // Class level variable, not confussion.
        }

        }

    public void learningComplete(){
        learningComplete = true;
    }

}
