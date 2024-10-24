

import singleton.DatabaseConnection;
import factory.ShapeFactory;
import factory.Shape;
import builder.Computer;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();
        connection.disconnect();

        // Factory Pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        // Builder Pattern
        Computer computer = new Computer.ComputerBuilder("Intel i9", "16GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(computer);
    }
}
