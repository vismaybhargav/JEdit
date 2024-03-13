package org.jedit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.jedit.views.EditingView;

public class Main extends Application {
    /** Menu Bar that is immutable for the entire lifespan of the editor */
    MenuBar menuBar;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        menuBar = initializeMenuBar();
        root.setTop(menuBar);

        new EditingView(root, stage).initialize(); // begin viewing

        Scene scene = new Scene(root, 1280, 720);
        stage.setScene(scene);
        stage.show();
    }

    private MenuBar initializeMenuBar() {
        MenuBar menuBar = new MenuBar();

        //TODO: Create the items of MenuBar, still weighing the pros and cons of using FXML
        return menuBar;
    }
}