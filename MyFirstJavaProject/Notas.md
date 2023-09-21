# Notas

### ATAJOS en Intelli J

- CTRL + D - copia la línea actual
- **main** - crea el Método completo
- **sout** - crea la salida de texto
- **fori** - crea ciclos For
- Shift + F10 - Run program

## Sección 3
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

- public
- private

    Public and private are access modifiers used for classes, attributes, methods and constructors.
    Our class is public. This means that this class is visible to other classes in our projects. 
    Class can be public, or it can be created without access modifier without keyword.
    Public class will be visible only to other classes in the same package.

- class    (keyword defines a class).
- void
- import
- null

### Video 9 - 'main' method

Today we will learn about and will create Java 'main' methods Java 'main' method is the most important Java method.
When you start learning Java programming, this is the first method you encounter.
The 'main' method in Java is the standard method that is used by JVM to start the execution of any Java program.
The 'main' method is referred to as an entry point of Java application, which is true in the case of core Java applications.
But in test automation, we often use different test frameworks like JUnit or TestNG, and we execute tests by using test annotations, not the 'main' methods.
But before we'll learn test frameworks, let's use the 'main' method to start and run our first Java programs.

Packages > Classes > Methods 

'main' method must have the next three keywords:  public static void

The 'public' key word is an access modifier. 	This will make our main method accessible by any other class.

Next keyword is 'static' in Java. If a field or method is declared static, then exactly a single copy of that field is created and shared among all instances of that class. 	It doesn't matter how many times we initialize the class, there will be always only one copy of static field belonging to it. This may sound a little bit complicated at this time, so don't worry about this for now. We will learn more about this later. For now, just remember that the main method must be static.

The 'void' keyword allows us to create method, which does not return a value. Some Java methods need to return some values, but not the main method.

    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hola German!");
        }
    }

So with the clarity of 'void' keyword, let's continue right in our main method: public static void.

Then we need to write the name of our 'main' method, which is 'main'. Then brackets space and open and close curly brackets in Java. Methods can receive arguments, and for that, we use round brackets.

Even if the main method doesn't need any arguments, we still need to add brackets next to the method name.



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
 
---

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

---


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


- Strings son una CLASE en sí misma.
- Strings son Arreglos de Caracteres, y como arreglos, comienzan en el ìndice CERO.
- Los espacios, son caracteres también.
- Como Clase, se pueden invocar métodos a ella (lenght, toUpperCase, toLowerCase)
- Se pueden CONCATENAR entre ellos, y con enteros.
- Pueden incluir caracteres especiales, con una diagonal antes  \"
- Se pueden hacer saltos de línea con  \n      - new line.


### 17 - Arrays

MyArray.java

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

            for (String pupil : students) {  //Método FOR moderno
                System.out.println(pupil);
            }

        }
    }


- Guardan múltiples valores del mismo tipo en una variable individual. 
- Para declarar un arreglo, definimos - Tipo de Variable y usamos  [].
- Para ingresar manualmente valores, abrimos llaves
- Para acceder a un elemento del arreglo, necesitamos usar los INDEX.
- El primer INDEX en Java es '0'.

## Seccion 5 - Java Basics

### Java Operators
	
Operators.Java

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

- Depending on the condition, it enters the statements.
- Also can have NESTED IF's inside ELSE's.

### 20 - Java Switch Statement
SwitchDemo.java

Look for a SPECIFIC condition, and DO that.

    public class SwitchDemo {
      public static void main(String[] args) {
      int mes = 14;
        switch (mes){

          case 1:
          System.out.println("Enero");
          break;
          :
          :
          case 12:
          System.out.println("Diciembre");
          break;

          default:
          System.out.println("Número de mes incorrecto: " + mes);
        }
      }
    }

### 21 - HomeWork1Sol.java

        // Using IF ELSE statement, write a program that will
        //Print "Negative" if the number is negative
        //Print "Zero" if number is zero
        //Print "Small" if number is 10 or less
        //Print "Less than 100" if number is less than 100
        //Print "Too big" if number is 100 or more
        //Print "Jordan" if number is 100 or more

### 22 - PENDING

