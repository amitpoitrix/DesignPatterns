Factory Design Pattern

![factoryDesignPattern.png](factoryDesignPattern.png)

The `Factory Design Pattern` in Java is a creational design pattern that provides a way to create objects without specifying the exact class of the object that will be created. Instead of instantiating objects directly using the new keyword, the pattern defines an interface for creating objects and lets subclasses alter the type of objects that will be created.

**Key Concepts of the Factory Pattern:**
- `Factory Method`: A method that returns an instance of a class, typically based on some input or logic.
- `Interface or Abstract Class`: The base type that all created objects must implement.
- `Concrete Classes`: The actual classes that the factory creates instances of.

**When to Use the Factory Pattern:**
- When the exact class of object to be created is determined at runtime.
- When you want to centralize object creation to maintain flexibility.
- When the creation process is complex or needs to be abstracted from the client.

**Example:**
Let's say we have different types of Shape objects (e.g., Circle, Rectangle, Square), and we want to use the factory pattern to create instances of these shapes.

**Advantages of the Factory Pattern:**
- `Loose coupling`: The code using the factory does not depend on the concrete classes.
- `Code reuse`: The object creation logic is centralized in one place.
- `Extensibility`: Adding new object types becomes easier without modifying the existing factory structure.

**Variants of the Factory Pattern:**
- `Simple Factory`: The example above is a simple factory pattern where we have a single method to create objects.
- `Factory Method Pattern`: In this pattern, the object creation is deferred to subclasses by defining an abstract method that the subclasses implement.
- `Abstract Factory`: This pattern provides an interface to create families of related objects without specifying their concrete classes.

The Factory Pattern is widely used in Java, for instance, in the java.util.Calendar, java.util.ResourceBundle, and java.sql.Connection classes.