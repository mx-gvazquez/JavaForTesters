# Notas del curso [Java for Testers](https://softtek.udemy.com/course/java-for-testers-dmitry/) by Dmitry Shyshkin.

## ATAJOS en Intelli J

- CTRL + D - copia la línea actual
- **main** - crea el Método completo
- CTRL + SHIFT + UP/DOWN  - Mover línea de código seleccionada
- ALT + UP/DOWN - Sube o baja la línea seleccionada.
- **sout** - crea la salida de texto
- **fori** - crea ciclos For
- Shift + F10 - Run program


HashMap en JAVA = Diccionario en Python.

Son arreglos LLAVE - VALOR.



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

- **public** - llama clases en cualquier parte del proyecto, desde otros paquetes.

- **private** - llama clases solo dentro del mismo paquete.

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

> Package - MyFirstJavaProject - Start UPPPERCASE
>> Class - HelloWorld - Start UPPPERCASE
>>> method - main - Start lowercase
>>>> Arguments - Array of strings
>>>>> Actual Java code - Print to console "Hello World!"
>>>>>> Variables - Start lowercase