# Notas

## ATAJOS en Intelli J

- CTRL + D - copia la línea actual
- **main** - crea el Método completo
- CTRL + SHIFT + UP/DOWN  - Mover línea de código seleccionada
- ALT + UP/DOWN - Sube o baja la línea seleccionada.

> public static void main(String[] args) {
>
> }

- **sout** - crea la salida de texto
- **fori** - crea ciclos For
- Shift + F10 - Run program

## Sección 3

### Video 7 - Crear el Proyecto

- To `name projects`: Use CAPITALS in every word
> SeUsaEsteModo

### Video 8 - Java Class
#### Naming Conventions

Ahora, nombremos nuestra clase.

HolaMundo.

Todas las palabras en mayúscula sin espacios y presione enter.
Recuerde, los nombres de las clases deben anunciarse en mayúsculas y minúsculas mixtas, era la primera letra de cada palabra interna en mayúscula.
Intente que los nombres de sus clases sean simples y descriptivos.
Utilice palabras completas.
Evite acrónimos y abreviaturas a menos que la abreviatura se utilice mucho más que la forma larga como URL o HDMI.

KeyWords:

1. public
2. private
3. class    (keyword that defines a class).
4. void
5. import
6. null

`Public` and `private` are access modifiers used for classes, attributes, methods and constructors.
Our class is public. This means that this class is visible to other classes in our projects.
Class can be public, or it can be created without access modifier without keyword.

`Public` class will be only visible to other classes inside the same package.

### Video 9 - 'main' method

Today we will learn about and will create Java 'main' methods Java 'main' method is the most important Java method.
When you start learning Java programming, this is the first method you encounter.
The 'main' method in Java is the standard method that is used by JVM to start the execution of any Java program.
The 'main' method is referred to as an entry point of Java application, which is true in the case of core Java applications.
But in test automation, we often use different test frameworks like JUnit or TestNG, and we execute tests by using `test annotations`, not the 'main' methods.
But before we'll learn test frameworks, let's use the 'main' method to start and run our first Java programs.

Packages > Classes > Methods

`main` method must have the next three keywords:
> public static void

The `public` keyword is an access modifier. 	This will make our main method accessible by any other class.

Next keyword is `static` in Java. If a field or method is declared static, then exactly a single copy of that field
is created and shared among all instances of that class.
It doesn't matter how many times we initialize the class, there will be always only one copy of static field belonging to it.
This may sound a little bit complicated at this time, so don't worry about this for now. We will learn more about this later.
For now, just remember that the main method must be static.

The `void` keyword allows us to create a method which does NOT return a value.
Some Java methods need to return some values, but not the `main` method.
So with the clarity of 'void' keyword, let's continue right in our main method: public static void.

Then we need to write the name of our `main` method, which is 'main'.
Then brackets space and open and close curly brackets in Java.
Methods can receive arguments, and for that, we use round brackets.

Even if the `main` method doesn't need any arguments, we still need to add brackets next to the method name.

BUT, `main` method should have an array of strings as arguments, so we do need to add those arguments to method.

Now we have a `HelloWorld` **class**, with a `main` **method** with String **arguments** inside of it.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hola German!");
    }
}
```
Something like this:

> Package - MyFirstJavaProject
>> Class - HelloWorld
>>> method - main
>>>> Arguments - Array of strings
>>>>> Actual Java code - Print to console "Hello World!"

## Sección 4

### VARIABLES

Variables.java

Una variable es un contenedor que mantiene un valor mientras el program de Java se ejecuta.

Declarar e Inicializar

Para Declarar, necesitamos un 'DATA TYPE' y un Nombre

    int number;

Para Inicializar, le asignamos un valor.

    number = 1;

Se pueden hacer ambas cosas a la vez.

    int secondNumber = 2;

- NOTAS:

    - En los 'nombres' no debe haber espacios.
    - Se usa el CamelWord.
    - Cada siguiente palabra comienza con Mayúscula.
    - Las CLASES comienzan con Mayúsculas
    - Los MÉTODOS y las VARIABLES comienzan con minúsculas.

````java
public class Variables {

    public static void main(String[] args) {
        System.out.println("Hello German!");

        int myFirstVariable;
        myFirstVariable = 5;

        System.out.println(myFirstVariable);
        System.out.println("myFirstVariable");

        String name = "Roman";
        String textToPrint = "Favorite number of " + name + " is: " + myFirstVariable;
        System.out.println(textToPrint);
    }
}
````




### 12 - DATA TYPES:

#### Primitive data types

- Especifica el tamaño y el tipo del valor de la variable, y no tiene Métodos adicionales

    - Están pre-definidos en JAVA.
    - No pueden llaman Métodos.
    - No pueden ser 'nulos'.
    - Sus nombres comienzan con minúsculas.
    - El tamaño depende del tipo de dato.


- **boolean**  TRUE / FALSE - conditional testing

- **char** 	'A' - Store a 'single' character


##### Integer Types
Números enteros positivos o negativos SIN decimales.

La diferencia entre los tipos de datos enteros, es el tamaño de número.

- **byte**  ( -128 / 127) - Se puede usar para ahorrar memoria siempre que el 'valor' no rebase su rango.
- **short**  (-32,768 / 32,767)
- **int**  ( -2,147,483,648 / 2,147,483,647 ) - este es el de cajón.
- **long**  ( - 9,223,372,036,854,775,808L / 9,223,372,036,854,775,807L )
    - el valor de Literales Largos debe contener una 'L' al final
    - esto es por que JAVA interpreta todos los enteros como de 32 bits, la 'L' lo define de 64 bits.


##### Floating point types
Representan números fraccionarios con uno o más decimales

- float - 32 bits de precisión decimal - rango ilimitado - termina con una 'f' - 3.14f
- double - 64 bits de precisión decimal - rango ilimitado - va en seco - 3.14159


#### Non - Primitive data types (Reference Types, they reference to object)
- Son creados por el programador y NO están pre-definidos en JAVA.Excepto STRING.
- Llaman Métodos.
- Pueden ser 'nulos'.
- Sus nombres comienzan con Mayúsculas.
- Todos tienen el mismo tamaño.


### DATA TYPE CASTING

#### Widening Casting
Converting smaller type to a larger type

    byte -> short
    int -> long
    byte -> int

#### Narrowing Casting
Converting larger type to a smaller type

    double -> float
    int -> short

---



### 14 - Data Types Casting

DataTypesDemo.java
````java
public class DataTypesDemo {
    public static void main(String[] args) {

        /* PRIMITIVE DATA TYPES */
        boolean myBoolean = true;
        char myChar = 'A';

        /* INTEGER */
        byte myByte = 50;
        short myShort = 30000;
        int myInt = 2000000000; /* 9 zeros */
        long myLong = 1000000000000000000L; /* for Long Literals,  18 zeros + L */

        /* FLOATING */
        float myFloat = 3.14f;
        double myDouble = 3.14;


        // Data type casting - Widening - byte -> int
        int newInt = myByte;
        System.out.println(newInt);

        // Data type casting - Narrowing - double -> int
        int newIntFromDouble = (int) myDouble;
        System.out.println(newIntFromDouble);

    }
}
````

- **public** - llama clases en cualquier parte del proyecto, desde otros paquetes.

- **private** - llama clases sólo dentro del mismo paquete


### 15 - Non-Primitive Data Types

This are referred to 'Objects' or 'Referenced Types'

- Strings
    - String is a sequence of characters, but in Java, a string is an object that represent a sequence of
      characters.
- Arrays
    -  Arrays store one or more of values of a specific data type and provide indexed access
       to store the same.
- Classes
    - A class in Java is the blueprint, which includes all your data like a class and interface can have methods and variables.
      But the method declared in the interface are, by default, abstract only method signature.
- Interfaces

### 16 - Strings

MyString.java
````java
    public class MyString {
    public static void main(String[] args) {
        String hello = "Hola German!"; //Se define una variable tipo String
        System.out.println(hello);
        // Los datos tipo String son una clase, y pueden invocar métodos
        // Contar elementos
        int stringLength = hello.length();
        System.out.println(stringLength);
        // Texto en MAYÚSCULAS
        String helloUp = hello.toUpperCase();
        System.out.println(helloUp);
        // Texto en minúsculas
        String helloLow = hello.toLowerCase();
        System.out.println(helloLow);
        // Concatenación de variables string
        String addStrings = helloLow + helloUp;
        System.out.println(addStrings);
        // Concatenación de variables string
        String stringWithInt = hello + ", this string length is: " + stringLength;
        System.out.println(stringWithInt);
        // Saltos de línea y caracteres especiales
        String movie = "Mi pelicula favorita es \n \"Deadpool\"";
        System.out.println(movie);
    }
}
````

- Strings son una CLASE en sí misma.
- Strings son Arreglos de Caracteres, y como arreglos, comienzan en el ìndice CERO.
- Los espacios, son caracteres también.
- Como Clase, se pueden invocar métodos a ella (lenght, toUpperCase, toLowerCase)
- Se pueden CONCATENAR entre ellos, y con enteros.
- Pueden incluir caracteres especiales, con una diagonal antes  \"
- Se pueden hacer saltos de línea con  \n      - new line.


### 17 - Arrays

MyArray.java
````java
    public class MyArray {
    public static void main(String[] args) {
        //    String[] students;
        String[] students = {"Roco", "Tico", "Maco", "Paco"};

        //    int[] numbers;
        int[] numbers = {1, 3, 5, 8, 13, 21};

        System.out.println(students[0]); // Imprime el primer valor del arreglo.

        students[0] = "Ester"; // Cambia el valor del arreglo en el Indice '0'.
        System.out.println(students[0]); // Imprime el valor del arreglo en el Indice '0'.

        System.out.println("Hay " + students.length + " alumnos en la clase"); //Concatenación de arreglos.

        for (String pupil : students) {  //Método FOR moderno, 'pupil' es una variable interna del Ciclo.
            System.out.println(pupil);
        }
    }
}
````



- Guardan múltiples valores del mismo tipo en una variable individual.
- Para declarar un arreglo, definimos - Tipo de Variable y usamos  [].
- Para ingresar manualmente valores, abrimos llaves
- Para acceder a un elemento del arreglo, necesitamos usar los INDEX.
- El primer INDEX en Java es '0'.

## Seccion 5 - Java Basics

### Java Operators

Operators.Java
````java
    public class Operators {
    public static void main(String[] args) {

        //Arithmetical Operators
        int a = 100;
        int b = 50;

        System.out.println(a + b); //Addition
        System.out.println(a - b); //Substraction
        System.out.println(a * b); //Multiplication
        System.out.println(a / b); //Division

        System.out.println(++a); //Incremental 1
        System.out.println(++a); //Incremental 1
        System.out.println(++a); //Incremental  - 103

        System.out.println(--b); //Decremental 1
        System.out.println(--b); //Decremental 1
        System.out.println(--b); //Decremental - 47


        //Assignment Operators
        int c = 10;

        //c = c+3;
        c += 3;  // Nueva sintaxis de adición.
        System.out.println(c);

        int sum = a + b; // Creamos una nueva variable con base en 2 anteriores (mismo tipo).
        System.out.println(sum); //103 + 47

        //Comparison Operators
        System.out.println(a == b); // Is 'a' equal to 'b' ?
        System.out.println(a != b); // Is 'a' not equal to 'b' ?
        System.out.println(a > b); // Is 'a' greater than 'b' ?
        System.out.println(a < b); // Is 'a' less 'b' ?
        System.out.println(a >= b); // Is 'a' greater or equal 'b' ?
        System.out.println(a <= b); // Is 'a' less or equal 'b' ?

        //Logical Operators

        System.out.println("------------------");

        //System.out.println(3 > 2);
        System.out.println(3 > 2 && 10<15); // AND Logical operator - True AND True = True
        System.out.println(3 > 2 && 10<9); // AND Logical operator - True AND False = False
        System.out.println(3 > 2 || 10<9); // AND Logical operator - True OR False = False


    }
}
````



Operators Are used to perform operations on Variables and Values.

1. Arithmetical Operators

    - Used to perform common mathematical operations.
        - Addition, Substraction, Multiplication, Division.
        - Increment Operators, ++a,
        - Decrement Operators, --b

2. Assignment Operators

    - Assign values to Variables. Variable ' = ' Value.
        - c += 3    ==    c+3

3. Comparison Operators

    - To compare two values.
        - Equal, =
        - Not Equal,  !=
        - Greater Than,  >
        - Less Than, <

4. Logical Operators

    - Logic between variables and values.
        - AND - &&
        - NOT - !=
        - OR - ||


### 19 - Java If ... Else
IfElseDemo.java
````java
if (x == 10) {
        System.out.println("x is 10");
} else if (x > 10) {
        System.out.println(x + " is more than 10");
} else {
        System.out.println(x + " is less than 10");
}

boolean cold = true;
int time = 1900;
if (time < 1200) {
        System.out.println("Good morning");
} else if (time >= 1200 && time < 1800) {
        System.out.println("Good afternoon");
} else {
        if (cold) {
        System.out.println("Good evening, it's cold");
    } else {
            System.out.println("Good warm evening");
    }
            }

````

- Depending on the condition, it enters the statements.
- Also, can have NESTED IF's inside ELSE's.

### 20 - Java Switch Statement
SwitchDemo.java

Look for a SPECIFIC condition, and DO that.
````java
public class SwitchDemo {
    public static void main(String[] args) {
        int mes = 14;
        switch (mes){

            case 1:
                System.out.println("Enero");
                break;
            case 12:
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("Número de mes incorrecto: " + mes);
        }
    }
}
````


### 21 - HomeWork1Sol.java

        // Using IF ELSE statement, write a program that will
        //Print "Negative" if the number is negative
        //Print "Zero" if number is zero
        //Print "Small" if number is 10 or less
        //Print "Less than 100" if number is less than 100
        //Print "Too big" if number is 100 or more
        //Print "Jordan" if number is 100 or more

### 22 - Homework2
Using Switch statement, print day of the week, depending on a dat number from 1 to 7.

## LOOPS

### 23 - 'For' Loop

Sometimes we need to execute the same block of court a few times for that we can use loops.

Similar to 'if' statement we write 'for', then brackets for condition, then curly brackets that will hold
the body of the loop.
````java
byte pages = 12;
for (byte j = 0; j <= pages; j++) {
        System.out.println(j); // Now we run through all 0 to 'pages'.
}
````


But unlike if statement, the condition is not something simple that returns Boolean.

### 24 - 'While' Loop
The difference between 'for' a loop and 'while' loop is that in the 'for' loop, the number of iterations to be done **is already known** and is used to obtain a certain result.

Whereas in the 'while' loop, the command runs until a certain condition is reached. Only then the process stop.

If there's no STOP condition, loop will run indefinitely.

#### 'While'
Check for the condition, then executes the code.
````java
byte i = 0;
while (i < 5){
        System.out.println(i);
i++;                      // Break condition, to avoid infinite Loop.
        }
````


#### Do While
Executes the code, then checks for the condition status if you need to continue the loop.
````java
do {
        System.out.println(i);
i--;
        } while (i > 0);
````


### 25 - Break & Continue inside LOOPS
**Break** interrupt the execution of the loop.
- It's used to finish the loop earlier.
- We already used it in 'SWITCH' loop.
- Usefull when looking for something in a pages list, when found, finish the search.

````java
byte pages = 12;
for (byte j = 0; j <= pages; j++) {
        System.out.println(j); // Now we run through all 0 to 'pages'.

  if (j == 5) {   // Enter here only on condition J == 5
        System.out.println("STOP");  // Do something
      break;      // Finishes loop run.
              }
              }
````


**Continue** skips or jumps, am iteration in the loop, then continues with the next.
- It finishes a specific iteration, and move on with next one.
````java
byte pages = 12;

do {
        if (pages == 8){
        System.out.println("No imprimas este número");
pages--;    // Make sure to add the counter, to avoid infinite loop.
        // Otherwise variable 'pages' don't update and will skip the counter
        // and return here forever.
        continue;
        }
        System.out.println(pages);
pages--;
        } while (pages > 3);
````


### 26 - Try Catch
Used to prevent and handle 'Exceptions'.
- Normally an exceptions interrupts our code, by failure.
- With Try Catch, we can 'handle it', recognize it, and continue.

## Section 6 - Java Methods

### Java Methods (Sub-Routines or Code Snippets)
- Methods Go Inside a Class, but
- Go Outside the 'main' method, usually at bottom.
    - Even can be summoned from another Classes with 'extends' method. (Inheritance)
- Able to contain a whole code.
- Are summoned from Inside the Class.
- Do Have 'Modifiers' and 'Parameters'


A Java method is the collection of statements that are grouped together to perform an operation.
In other words, a method is the block of code, which only runs when it's called.

You can pass data known as 'parameters' into a method.
We use methods to reuse code defined only once that's used many times.
````java
public class JavaMethodsFull {

    public static void main(String[] args) {
        helloWorld();
    }

    private static void helloWorld(){
        System.out.println("Hello, world!");
    }
}
````

Access Modifiers of Methods:

- **private** is access modifier
    - We will be able to use it only inside of this class, but we will not be able
      to call this method from other classes.
- **static**
    - Static methods are the methods in Java that can be called without creating an object of a class.
- **void**
    - 'void' means that this method does not have a return value.
- **name**
    - The 'method' need a name, next to '()' the parameters.

Note that there is no RUN bottom next to this method, like we have next to our 'main' method.

We cannot just run it.

This 'class > main > method' will be executed.

### Java PARAMETERS (Arguments of a Method, or Variables of that Method)
- Parameters act as variables inside the 'methods'
- Parameters are specified after the method name inside the parentheses.
    - You can create the method that accepts as many parameters as you want.
        - Those parameters can be a different type, just separate them by ',' commas.

````java
public class JavaMethodsFull {

    public static void main(String[] args) {
        age("German", (byte) 38);
    }

    private static void age(String name, byte years){
        System.out.println(name + " is " + years + " years old.");
    }
}
````


### Method overloading
Method overload in multiple methods can have the same name but different parameters.
````java
    private static void suma(byte a, byte b){
    byte sum = (byte) (a + b);
    System.out.println(sum);
}

private static void suma(int a, int b, int c){
    int sum = a + b + c;
    System.out.println(sum);
}

private static void suma(double a, double b){
    double sum =  a + b;
    System.out.println(sum);
}
````

- IntelliJ suggests which one to use.

### Method RETURN type
Currently, all our methods have a 'void' keyword in the method signature, which means they do not return anything.

Let's create the method that returns a value, and ask for it.
````java
public class JavaMethodsFull {

    public static void main(String[] args) {
        System.out.println(square(4));
    }

    private static int square(int i){
        //  int cuadrado = i * i;
        //  return cuadrado;
        return i * i; // Mejora de IntelliJ
    }

}
````


## Section 7 - Object-Oriented Programming (OOP)

### Java OOP generals

Object-oriented programming is the programing paradigm based on the concept of 'objects' that contain 'data'
and 'methods'.

The primary purpose of object-oriented programming is to increase the flexibility and maintainability
of programs.

Object-oriented programming has several advantages over procedural programming:

- OOP is faster and easier to execute.
- It provides a clear structure for the programs, makes the code easier to maintain, modify and debug.
- And OOP makes it possible to create full, reusable applications with less code and shorter development time.

'Classes' and 'Objects' are the two main aspects of Object-Oriented Programming.

- A class is a template for the object, and an object is an instance of a class.
- When the individual objects are created, they inherit all the variables and methods from the class.
- A class is the blueprint for the object before we create an object.
- We first need to define the class.

We can think of the 'class' as the sketch of the house. It contains all the details about the floors, doors, windows, etc.

Based on these descriptions, we build the house. House is an 'object'.

Since many houses can be made from the same description. We can create many objects from the same class.

### Classes and Objects

Note that our variable is 'private', but the 'method' is 'public'.

This means that we can access this method from outside this class, but we cannot access our variable from outside.

    public class ClassDemo {
      private int number = 5;   // PRIVATE
  
      public void printNumber(){   // PUBLIC
          System.out.println("The number is " + number);
      }
    }

---

First, let's learn how to create an 'instance' of our Demo class.

The same way when we create new integer or new string, we start typing the type of the object, and in our case, the 'type' is the 'class name' `ClassDemo`.

So class Demo is going to be the type. And let's call it 'instancia'.

    public class Main {

      public static void main(String[] args) {
          ClassDemo instancia = new ClassDemo();
          instancia.printNumber();
      }

    }

We use the class as a blueprint and create a new **instance** of a class and call it `instancia`.

Now, using this **instance** of a class, we can execute the public method `printNumber()` of the class .

Let's start type 'instancia' and as you see, we can access this print number 'method' from `Main` Class.
So let's use it print number.

---
Let's create another instance.

    public class Main {
    
      public static void main(String[] args) {
  
          ClassDemo instancia = new ClassDemo();
          instancia.printNumber();
  
          ClassDemo instancia2 = new ClassDemo();
          instancia2.printNumber();
  
      }
    
    }


As expected, the number is five was printed two times here,

Here, `instancia` and `instancia2` are the names of `objects`.

We can use them to access fields and methods of the class.

As you can see, we have created two objects of the same class.

We can create multiple `objects` of the single `class` in Java.

### Class 36 - Classes and Objects example

`Lamp.java`

    public class Lamp {
    //    private boolean lightStatus = false; //NOT accesible from outside this class, 'Main' class
    public boolean lightStatus = false; //NOW accesible from outside this class, 'Main' class
    
        public void printLightStatus(){
            if (lightStatus){
                System.out.println("The lamp is ON");
            } else {
                System.out.println("The lamp is OFF");
            }
        }
    }

By making '`lightStatus`' variable '`public`' in '`Lamp`' class, we can access it from another classes.

Variable is 'true' because we used instance of a class when we changed the light status variable. We changed it only in one instance, `kitchenLamp`.

`kitchenLamp` and `bedroomLamp` are two separate `objects`.

The values of variables can be different.

They have the same methods and the same variables because they were created from the same class.

But now we can change the values of instances, and these objects are similar, but not the same.

### Class 37 - Java 'Constructors'
`Lamp.java`

There are actually three types of constructors in Java.

- **No ARG** Constructor
- **Parameterized** constructor and
- **Default** constructor

Constructors are usually placed at the beginning of the Java class, after variables and before all other methods.


A 'constructor' has the same name as the class
---

And unlike **method**, doesn't have a `return` type, so we don't have to put 'void' or anything like this here in the constructor.

---

- **No ARG** Constructor


    public class Lamp {
    //    private boolean lightStatus = false; //NOT accesible from outside this class, 'Main' class
    public boolean lightStatus = false; //NOW accesible from outside this class, 'Main' class
    
      //No ARGS constructor
        public Lamp(){
              System.out.println("Creating an object of a Lamp class");
            }

    }

---

- **Parameterized** constructor

Class

    public class Lamp {

    public boolean lightStatus = false; 
    private String roomName;
    
    
      // Parameterized constructor
        public Lamp(String room){      // <<<< Now the constructor ASK for a parameter
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

Main - calling the constructors

    public class Main {
    
        public static void main(String[] args) {
    
    /*        ClassDemo instancia = new ClassDemo();
    instancia.printNumber();
    
            ClassDemo instancia2 = new ClassDemo();
            instancia2.printNumber();*/
    
            Lamp kitchenLamp = new Lamp("Kitchen"); // Summon the constructor, with a parameter
            Lamp bedroomLamp = new Lamp("Bedroom");
    
    
            kitchenLamp.printLightStatus(); // Executing the constructor
            bedroomLamp.printLightStatus();
    
    // By making 'lightStatus' variable 'public' in 'Lamp' class, we can access it from another classes
    
            kitchenLamp.lightStatus = true;
    
            kitchenLamp.printLightStatus();
            bedroomLamp.printLightStatus();
        }
    
    }

Output

    Creating Kitchen instance       << Now we can differenciate an instance from another
    Creating Bedroom instance       << Now we can differenciate an instance from another
    The lamp in the Kitchen is OFF
    The lamp in the Bedroom is OFF
    The lamp in the Kitchen is ON
    The lamp in the Bedroom is OFF

### Access Modifiers

- Default
- Private
- Protected
- Public

Access modifiers are used to set the accessibility or visibility of classes, interfaces, variables, methods and constructors.

- Default

    - If access modifier is default, the code is only accessible in the same package.

    - This is used when we don't specify a modifier, so we don't write default. We just don't write anything.

- Private

    - If Access Modifier is private, the code is only accessible within the declared class.

- Protected
    - For the protected, the code is accessible in the same package and subclasses.
    - We will learn about this later when we'll learn inheritance.

- Public
    - The Code is accessible for all classes.

Access modifiers are mainly used for `encapsulation`.

It can help us to control what part of a program can access the members of the class so that misuse of data can be prevented.

As the rule of thumb, I suggest making everything `private` when you create that and then change the access modifier if you need to use this part of the code elsewhere.

### Homework6
        /*
        Create a class called 'Programming'
        This class should have a constructor, that accepts argument (Parameterized constructor)
        This class should have a method called learningStatus()
        Also, class should have another boolean variable, learningComplete. The default value should be FALSE.

        Second method of the class, that is called completeLearning()
        This method should just change the value of learningComplete() variable from FALSE to TRUE.
        learningStatus() method should print "Learning ..." and the name of the language. if you are still learning.
        And, if you finish learning, then the message should be "Mastered..." and the language name

        Here in Main method, create an object of a class.
        Call learningStatus() method to print the status
        Then change the status using completeLearning() method
        And call learningStatus() method to print the status again

         */
---
`Programming.java`

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

`Main.java`

        Programming programming = new Programming("Java");  // Use this `Programming` class to create an instance named `programming` in `Main` class.
        programming.learningStatus();
        programming.learningComplete();
        programming.learningStatus();
---

### 'Static' Keyword

`ClassDemo.java` `Main.java`

The static can be:
- Variable
- Method
- Block
- Nested Class

Anything labeled as `STATIC`, belongs to the `Class` instead of the '**instance**', '**Object**' or '**Method**'.

It's not a volatile memory, it sticks to a value.

The static keyword in Java is used for memory management.
- The static variable is used to refer to common property of all objects, and it gets memory only once in the class area; at the time of class loading.

The static keyword belongs to the `class` rather than an `instance` of the class.
- So if we use instance to change it, it will be changed for all instances of the class.

---

As you see, `text` is static, `number`, is not.



    public class ClassDemo {
        public int number = 5; // Not 'static', can be different value inside INSTANCES.
        public static String text = "Some text";   // STATIC variable belongs to CLASS, same for ALL instances.

            public void printNumber(){   // PUBLIC
                System.out.println("The number is " + number);
            }

            public void printText(){   // PUBLIC
                System.out.println("The text is " + text);
            }

    }

---

    public class Main {

      public static void main(String[] args) {
    
          ClassDemo instancia = new ClassDemo();
          ClassDemo instancia2 = new ClassDemo();
    
          instancia.number = 10;
          instancia2.text = "New Text";  //IntelliJ suggest an improvement, we'll implement later.
    
          instancia.printNumber();
          instancia2.printNumber();
    
          instancia.printText();
          instancia2.printText();
    
     >    ClassDemo.text = "Third Text"; // Access 'ClassDemo.text' via class 'ClassDemo' reference DIRECTLY.
          instancia.printText();
  
      }
    
    }

So when we created the class, we can change the `number` for each instance.

But this `text` variable is part of the class, is **not** part of the instance.

We can use instance to change it, but it will change this variable (the static `text` variable) for all instances.

That's why when we printed text, for instance, one, it was not 'some text', it's 'new text'.

---

We don't even need to have instance to access it. `ClassDemo.text`

We cannot access no or other methods because they are not static, but `text` is static.

---

---
Similarly to static variables, we can create `static` methods.

A static method belongs to the class rather than the object of the class, and it can be invoked without
the need for creating an instance the same way we access and invoked this variable.

Also `static method` can access `static data member` and can change the value of it.

#### BEFORE

ClassDemo.java

    public void printText(){   // PUBLIC
        System.out.println("The text is " + text);
    }

Main.java

    instancia.printText();

#### AFTER

ClassDemo.java

    public static void printText(){   // PUBLIC
        System.out.println("The text is " + text);
    }

Main.java

    ClassDemo.printText();

We can use instances to access static methods like we did here to access static variables or because this method is static we can call it directly from the class.

### Four pillars of OOP
Main four principles of Object-Oriented-Programming

#### Basic elements

##### Object

    Object is the instance of the class, is the working entity of the class

##### Class

    This is the model or standard about the capability of what an object can do.

##### Method

    Method can modify a class state that would apply across all the instances of the class.

##### Instance

    Instances are like objects. However, let think about them in these terms. 
    
    A blueprint for the car design is the class description.

    All the cars manufactured from that blueprint are object of that class, `instances`.

    Your car that has been made from the blueprint is basically an instance of the class.

---

#### The four principles of Object-Oriented-Programming are:
##### Encapsulation

Access modifiers are mainly used for `encapsulation`.     (881)

      Encapsulation is one of the key features of object-oriented programming.
      
      Encapsulation refers to the bundling of fields and the methods inside the single class.
      
      It prevents outer classes from accessing and changing fields and methods of the class. This also helps to achieve data hiding.
      
      In Java encapsulation help us to keep related fields and methods together, which makes our code cleaner and easy to read.
      
      It helps to decouple components of this system. This decoupled components can be developed, tested and debugged independently. 
      Any changes in the particular component do not have any effect on other components.

##### Abstraction

      Abstraction is an extension of encapsulation.
      
      It is an important concept of object-oriented programming that allows us to hide unnecessary details and only showed the needed information.
      
      This allows us to manage complexity by a meeting or hide in details with simpler, higher level idea.
      
      A practical example of abstraction can be car breaks.
      
      We know what brakes do when we applied the brakes. The car will stop, however, the working of the brakes is kept hidden from us.
      
      The major advantage of hiding the working of the brakes is that now the manufacturer can implement brakes differently for different cars. However, what brakes do will be the same.

##### Inheritance

      Inheritance is one of the key features of OOP that allows us to create a new class from existing class.
      
      The new class that is created the is known as `subclass` or `child class`, and the existing class from where the child class is derived is known as `super class` or `parent` or `base` class in Java.
      
      Inheritance is a relationship. We use inheritance only if there exists and is a relationship between two classes.
      
      For example:
      - Car is a vehicle.
      - Orange is a fruit.
      - Dog is a animal 
      
      Here, Car can inherit from vehicle, Orange can inherit from fruit and so on.
      
      In test automation, we use it for `Page Object Model`.
      
      `Login` Page is a page; `checkout` page is a page, so we can have a parent page class and different subclasses that inherit from parent class.
      
      The most important use of inheritance in Java is called re-usability.
      
      The code that is present in the parent class can be directly used in the child class

##### Polymorphism

      Polymorphism simply means more than one form. The same entity, method, operator or object can perform different operations in different scenarios.
      
      The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
      
      Any Java object that can pass more than one is a test is considered to be polymorphic.



#### Encapsulation

`Cat.java`
`Main2.java`

The meaning of encapsulation is to make sure that sensitive data is hidden from users.

To achieve this, you must declare class variables attributes as `private`.


Use this `Cat` class to create an instance of `cat` in `Main2` class.

Provide public `Get` and `Set` methods to access and update the values of the private variables.

---

As you see, encapsulation gives us a better control of class attributes and methods.

Class attributes can be made a `read only` if you only use the `get method` like `breed` or `write only` if
you only use this `set methods`.

This increases security of data.

#### Abstraction
Data Abstraction is the process of hiding certain details and showing only essential information to the user.

Abstraction can be achieved with either Abstract Classes or interfaces. Let's use abstract Class in this example.

`Animal.java`

    abstract class Animal {
    
      abstract void makeSound(); //Abstract methods don't have a body.
  
      public void sleep(){
          System.out.println("Sleeping ...... zzzzz");
      }
    
    }

The abstract keyword is a NON access modifier used for classes and methods.

Abstract class is the restricted class that cannot be used to create objects to access. It must be inherited from another class.

Abstract method can only be used in the abstract class, and it doesn't have a body. The body is provided by the subclass inherited from.

---

We cannot create `objects` from the abstract class.

    Animal animal = new Animal();

`Animal` is Abstract, cannot be instantiated in order to use it.

We must `inherit` from this class and implement abstract methods in this subclass.

#### Inheritance

It is possible to inherit `attributes and methods` from one class to another when it comes to `inheritance`.

We need to know the words:
- `Subclass` (Child), the class that inherits a from another class and
- `Super class` (parent), The class being inherited from.

---

We have an `animal` class and a `cat` class. `cat` is a `animal` so we can use inheritance here.

To inherit from a class we use the `extends` keyword.

    public class Cat extends Animal{

IntelliJ showed us an error. That's because our `animal` class has abstract method `makeSound()`, which we must implement in `Cat` class.

So hover over the error and select this implement methods link.

So just click on it, `makeSound()`.

This added an empty `makeSound()` method to our class `Cat` with this annotation `Override`.

    @Override
    void makeSound() {

    }

We add a simple action:

    @Override
    void makeSound() {
        System.out.println("Miau!");
    }

Switch back to `Main2` method.

Since our `Cat` class (already instanced in `Main2`) extends `Animal` class, we can use `cat` instance here.

    cat.makeSound();
    cat.sleep();

- We can use `makeSound()` that is `abstract` and implemented inside `Cat` class.
- And we can use `Super Class` method `sleep()` because `Cat` class inherits this method from the `Parent` class `Animal`.
- We can use all public methods inside the `Animal` class.

#### Polymorphism

`Polymorphism` means many forms, and it occurs when we have many
classes that are related to each other by `inheritance`.

Like we learned in the previous lecture, inheritance
lets us inherit attributes and methods from another class.

Polymorphism uses those methods to perform different tasks.

This allows us to perform a single action in different ways.

For example, our super superclass `Animal` has a method `makeSound()`,
and we implemented this method inside the `Cat` class to print `Miau`.
---
We created new class `Dog`, which extends `Animal`; to be able to extend the Animal
(an `abstract class`) we have to implement `abstract method` called `makeSound()` method in `Dog` class.

Now, we need to create an `INSTANCE` of the `Dog` class in `Main2` method
in order to invoke the `makeSound()` abstract method from `Animal` class.

The source routing follows:

`Abstract method > Abstract Class > Class inheritance and Method implementation > Instancing Objects in Main Class`

`makeSound() > Animal > Dog & CAT > Main2`

`Dog.java`

    public class Dog  extends Animal{
    
        @Override
        void makeSound() {
            System.out.println("Guau!");
        }
    }

`Main2`

        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();

### Overriding

Let's talk about overriding today.

In the previous lectures, we talked about super classes and some
classes.

If a class inherits a method from its super class, then there is a chance to overwrite the method.

In object oriented terms, overriding means to override the functionality of an existing method.

---
In `Main2` class, we're instancing `Cat` and `Dog` class with `makeSound()` abstract method from `Animal` class

The moment we inherit abstract class `Animal`, IntelliJ shows an error with a MUST include this, and automatically
applies the tag `@Override`.

    @Override
    void makeSound() {
        System.out.println("Miau!");
    }


`BEFORE`

    Miau!
    Sleeping ...... zzzzz
    Guau!
    Sleeping ...... zzzzz
---
But it's no exclusive for abstract methods.

We also can `@Override` regular methods inside an abstract class and make it individual for a particular Instance.

In `Dog` class we did this:

`bad - Dog`

    public void sleep(){
        System.out.println("Dog is sleeping.... zzzzz");
    }

But IntelliJ is perfectible; it only shows a message alert, it doesn't apply the tag.

We need to add it manually.

`good - Dog`

    @Override  // <<<< Good Practice
    public void sleep(){
        System.out.println("Dog is sleeping.... zzzzz");
    }



`AFTER`

    Miau!
    Sleeping ...... zzzzz
    Guau!
    Dog is sleeping.... zzzzz

### 'Super' Keywords

The `super` keyword in Java is used in `subclasses` to
access `super class` members:
- Attributes,
- Constructors and
- Methods.

---
The `Super` keyword refers to a `super`, `parent` or `base` class in Java.
See `Inheritance` for a refresh of concepts.
---
Uses of `super` keyword:
- to call methods from of the superclass that is Override in subclass.
- to access attributes of the superclass
- to explicitly call superclass constructor (A 'constructor' has the same name as the class, and no 'return').

When we ran out of imagination and start duplicating variable names, we might have a problem.

---

Similar to the case when we have a Class variable and a method constructor parameter with the same name, and we use the `this.variable`
keyword to refer CLASS variable instead of method variable.

`Programming.java`

    public class Programming {
    
    //Class attributes
      private String language; // Class level variable, to use it in other constructors.

    
    // Constructor
      public Programming(String language){   // Constructor Parameter AND Class level variable are both Strings and have the same name (language).
    this.language = language;                // 'this'. refers to the class level variable (private), NOT the constructor parameter.
                                             // 'this.' is used to eliminate confusion between class attributes and parameters with the same name.
      }   
    }
---

In the last lecture, we have overridden `sleep` method.

So now, instead of the code from `Animal` sleep method, sleep from `Dog` will be executed if we call sleep
using Dog `instance`.

But sometimes we need the method of the parent (super) class to be executed.

To do so, we can use `super` Keyword.

    public class Dog  extends Animal{    
    
        @Override
        public void sleep(){

            super.sleep();   // <<<<<<<<<<<<<<<<<<<<<<<

            System.out.println("Dog is sleeping.... zzzzz");
        }    
    }

First, this `sleep` from `Animal` superclass will be executed and then

`Dog` override `sleep` method message will be printed.

    Miau!
    Sleeping ...... zzzzz
    Guau!
    Sleeping ...... zzzzz
    Dog is sleeping.... zzzzz

We can call this `super.sleep` from other methods inside `Dog` class too, not just from the inside of the method that is overriding it.

---
**Advanced use of the 'super' keyword inside a Constructor.**

We have two classes that extend animal class.

`Cat` class has two attributes:
- name
- breed.

`Dogs` also can have names and breeds.

But instead of duplicating this variables inside the `Dog` class, let's just move them from `Cat` to Animal `super class`
and move `Getters` and `Setters` up there, too.

Now we create there a `constructor` (with same name as `super class`)

Since `Dog` also extends from `Animal`, we just create a constructor there (as required since it's a subclass).

We use finally use `super.name` in `goodBoy` method instanced in `Main2` to import variable from `super class`.

So, this is similar-ish to `this.name`.

`Animal`

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

    
    }

`Dog`

    public class Dog  extends Animal{
    
      public Dog(String name, String breed){ // Parameterized Constructor
        super(name, breed);
      }
      
      public void goodBoy(){
        System.out.println(super.name + ", come here, who's a good boy?"); // Super variable from Animal class
      }
    }


`Cat`

    public class Cat extends Animal{
    
      public Cat(String name, String breed){ // Parameterized Constructor
        super(name, breed);
      }

    }

`Main2`

    public class Main2 {
    
    public static void main(String[] args) {
    
    // NEW instance
      Cat cat = new Cat("Don Gato","callejero"); // name & breed variables are now set, but remain PRIVATE.
    
    // To change them, we need SETTER, methods that simply return variable values.
     cat.setName("Felix");
    
    // To read the new values, we need a GETTER in the class 'Cat'.    
      System.out.println("Tengo un gato " + cat.getBreed() + " llamado " + cat.getName());
    
    // We never saw the Cat class nor his variables. (Encapsulation)
    
    
    // NEW instance
      Dog dog = new Dog("Rex", "Chihuahua");

      dog.goodBoy();
    
    }
    }

---

### Java 'Interfaces'

Java does not support multiple inheritance.

Interface is a way to 'cheat' and do so.

A Class actually can inherit abstract methods from multiple Interfaces.

---
An interface is the `fully abstract glass`.

It includes a group of `abstract methods`: methods without the body.

Let's look at the advantages of interfaces:

- Similar to abstract classes,  interfaces help us to achieve abstraction in Java
- Interfaces provide specifications that a class which implements it must follow.

- Interfaces are also used to achieve multiple inheritance in Java.

To create a new interface:
- Right click on `src`
- New
- JAva Class
- Select `Interface` instead of Class.
- Write a name, hit Enter.

Remember:
- Methods inside the interface, don't have a body since it's an abstract Class.
- We cannot create objects of interfaces
- To use an interface, other Classes must implement it.

Let's create new class interface them that implements an interface.

**In Java, a class can also implement multiple interfaces.**

So as you see, we have a class that implements two interfaces, so it have to implement all mantles from both interfaces.

- Java does not support multiple inheritance.
- A class can only inherit from **one** super class.
- However, it can be achieved with interfaces because the class can implement multiple interfaces.

`A`

    public interface A {
      void printMessage();
    }

`B`

    public interface B {
      void printNewMessage();
    }

`InterfaceDemo`

    public class InterfaceDemo implements A, B {
      @Override
        public void printMessage() {
            System.out.println("Implemented interface A");
        }
      @Override
        public void printNewMessage() {
            System.out.println("Implemented interface B");
        }
    }

`Main2`

    public class Main2 {    
      public static void main(String[] args) {    
      
      // New Instance of Interfaced methods    
        InterfaceDemo Inter = new InterfaceDemo();
          Inter.printMessage();
          Inter.printNewMessage();      
      }
    }

`Outcome`

    Implemented interface A
    Implemented interface B

### Homework7

`Main3`
`Car`
`Coupe`
`Sedan`



---

## Test Frameworks

`MyJunitTEsts`

### @Test
At first, it was an Object inside evert `@Test` method

`CalculatorDemo calculatorDemo = new CalculatorDemo();`

### @BeforeEach

Then, moved to `@BeforeTest` became an Instance, that uses a `Class Level` variable
to assign a new instance of `CalculatorDemo`class.



### @BeforeAll y @AfterAll

- Make **only** labeled `All` method `static`.

### Parameterized Tests

- Hardcoded values, but it's a start.

### Skip a Test

`Lazy mode`

In both JUnit or TestNG, just comment out the `// @Test` tag.

`Pro mode`

Add a `@Disabled + comment`

@Disabled("Test deshabilitado por que no hemos terminado el Data Provider")
@Test

### Debug

