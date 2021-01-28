package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Email Generator");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Email var = new Email("Spektre");
        var.setDepartment("Sales");
        var.setName("Talha", "Tariq");
        System.out.println(var.createEmail());
        System.out.println(var.generatePassword());

        launch(args);

    }
}
