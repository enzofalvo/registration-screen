package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;

public class Program extends Application {

    private static Scene mainScene;
    
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
            ScrollPane scrollPane = loader.load();
            
            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);
            
            String css = Program.class.getResource("application.css").toExternalForm();
            scrollPane.getStylesheets().add(css);
            
            mainScene = new Scene(scrollPane);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Registration Screen");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Scene getMainScene () {
        return mainScene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
