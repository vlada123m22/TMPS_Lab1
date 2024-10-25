# Topic: *Creational Design Patterns*
## Author: *Musin Vladislava*
------
## Objectives:
__1. Study and understand the Creational Design Patterns.__

__2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.__

__3. Use some creational design patterns for object instantiation in a sample project.__

## Some Theory:
In software engineering, the creational design patterns are the general solutions that deal with object creation, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by optimizing, hiding or controlling the object creation.

Some examples of this kind of design patterns are:

* Singleton
* Builder
* Prototype
* Object Pooling
* Factory Method
* Abstract Factory

## Main tasks:
__1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).__

__2. Select a domain area for the sample project.__

__3. Define the main involved classes and think about what instantiation mechanisms are needed.__

__4. Based on the previous point, implement atleast 3 creational design patterns in your project.__

## Implementation
### Singleton Pattern 
is used to ensure there's only one instance of DatabaseConnection.
DatabaseConnection has only 2 methods: connect() and disconnect() ans a private constructor to ensure a single instance of the object exists. Also there is a method getInstance that returns the instance of the class.
```
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
```
### Factory Pattern 
allows us to create Shape objects (either Circle or Square) without specifying the exact class in the client code.

I have one Shape interface, a ShapeFactory class and 3 concrete shapes that implement the Shape interface.
```
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();}
        return null;
    }
} 
```

### Builder Pattern 
is used to construct a Computer object step by step, with flexibility to include or exclude optional parameters like graphics card or Bluetooth.
#### Builder Class Constructor:
```
        public ComputerBuilder(String CPU, String RAM, String gpu) {
            this.CPU = CPU;
            this.RAM = RAM;
            GPU = gpu;
        }
```
#### Computer Class Constructor
```
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.GPU = builder.GPU;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
```

### Conclusion
This project has enhanced the understanding of creational patterns.
Note: Some parts of this project were generated using ChatGPT
