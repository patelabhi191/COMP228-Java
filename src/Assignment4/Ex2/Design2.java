package Assignment4.Ex2;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Design2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    // Setup our gridpane object
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 13.5));
        pane.setHgap(25.5);
        pane.setVgap(5.5);

    // Place components into your pane.
        pane.add(new Label("Name: "), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Address: "), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Province: "), 0 ,2);
        pane.add(new TextField(), 1, 2);
        pane.add(new Label("City: "), 0, 3);
        pane.add(new TextField(), 1, 3);
        pane.add(new Label("Postal Code: "), 0, 4);
        pane.add(new TextField(), 1, 4);
        pane.add(new Label("Phone "), 0 ,5);
        pane.add(new TextField(), 1, 5);
        pane.add(new Label("Email "), 0 ,6);
        pane.add(new TextField(), 1, 6);

        pane.add(new CheckBox("Student Council"),2,1);
        pane.add(new CheckBox("Volunteer Work"),2,5);

        FlowPane paneRadio = new FlowPane();
        paneRadio.setPadding(new Insets(1, 0, 1, 2));
        paneRadio.getChildren().addAll(new RadioButton("Computer Science"), new RadioButton("Business"));
        paneRadio.setHgap(5.5);

        pane.add(paneRadio,3,1);



        Button btAdd = new Button("Display");
        pane.add(btAdd,2,7);



        // Application setup
        Scene scene = new Scene(pane,900,350);
        primaryStage.setTitle("Show Grid Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
}
}
