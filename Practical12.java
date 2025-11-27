import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Practical12 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Create a circle
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.LIGHTBLUE);

        // Create a rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(70);
        rectangle.setWidth(120);
        rectangle.setHeight(60);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.LIGHTGREEN);

        // Add shapes to the pane
        pane.getChildren().addAll(circle, rectangle);

        // Create and set the scene
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("Draw Circle and Rectangle using JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}