
# Sección 4 - Data Types

## VARIABLES

Code `Variables`

- Una variable es un contenedor que mantiene un valor mientras el program de Java se ejecuta.
- Es la unidad básica de almacenamiento en un programa de JAVA.
- Para crear una variable en JAVA, necesitamos 2 cosas

> Declarar e Inicializar

Para Declarar, necesitamos un 'DATA TYPE' y un Nombre
````java
    int number;
````

Para Inicializar, le asignamos un valor.
````java
    number = 1;
````

Se pueden hacer ambas cosas a la vez.
````java
    int secondNumber = 2;
````

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




## 12 - DATA TYPES:

### Primitive data types

1. boolean
2. char
3. byte
4. short
5. int
6. long
7. float
8. double

- Especifica el tamaño y el tipo del valor de la variable, y no tiene Métodos adicionales

    - Están pre-definidos en JAVA.
    - No pueden llamar Métodos.
    - No pueden ser 'nulos'.
    - Sus nombres comienzan con minúsculas.
    - El tamaño depende del tipo de dato.


- **boolean**  TRUE / FALSE - conditional testing

- **char** 	'A' - Store a 'single' character


#### Integer Types
Números enteros positivos o negativos SIN decimales.

La diferencia entre los tipos de datos enteros, es el tamaño de número.

- **byte**  ( -128 / 127) - Se puede usar para ahorrar memoria siempre que el 'valor' no rebase su rango.
- **short**  (-32,768 / 32,767)
- **int**  ( -2,147,483,648 / 2,147,483,647) - este es el de cajón.
- **long**  ( - 9,223,372,036,854,775,808L / 9,223,372,036,854,775,807L )
    - el valor de Literales Largos debe contener una 'L' al final
    - esto es porque JAVA interpreta todos los enteros como de 32 bits, la 'L' lo define de 64 bits.


#### Floating point types
Representan números fraccionarios con uno o más decimales

- **float** - 32 bits de precisión decimal - rango ilimitado - termina con una 'f' - 3.14f
- **double** - 64 bits de precisión decimal - rango ilimitado - va en seco - 3.14159




##### DATA TYPE CASTING

##### Widening Casting
  Converting smaller type to a larger type

  byte -> short
  int -> long
  byte -> int

##### Narrowing Casting
  Converting larger type to a smaller type

  double -> float
  int -> short


##### 14 - Data Types Casting

Code `DataTypesDemo`


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




### 15 - Non-Primitive Data Types (Reference Types, they reference to object)

1. Strings
2. Arrays
3. Classes
4. Interfaces


- Se les denomina tipo `refrenciado` porque se refieren a **OBJETOS**.

- Son creados por el programador y NO están predefinidos en JAVA. Excepto STRING.
- Llaman Métodos.
- Pueden ser 'nulos'.
- Sus nombres comienzan con Mayúsculas.
- Todos tienen el mismo tamaño.

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

We made this `MyString` code

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

Code of `MyArray`


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
- Para ingresar manualmente valores, abrimos llaves {} y separamos los valores por comas.
- Para acceder a un elemento del arreglo, necesitamos usar los INDEX.
- El primer INDEX en Java es '0'.
