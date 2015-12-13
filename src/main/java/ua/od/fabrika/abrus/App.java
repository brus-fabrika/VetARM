package ua.od.fabrika.abrus;

import javafx.application.Application;
import javafx.stage.Stage;
import ua.od.fabrika.abrus.view.MainController;

public class App extends Application
{
    private MainController mainCtrl = new MainController();

    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainCtrl.start(primaryStage);
    }
}
