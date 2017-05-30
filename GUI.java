package connectFour;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application{
	
	Button startButton;
	Button gameButton;
	Scene gameScene;
	Scene startScene;

	// initiate program
	public static void commence(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// set button 1
		// opens connect four game window
		startButton = new Button("Start Game");
		startButton.setOnAction(e -> primaryStage.close());
		
		// start scene
		StackPane startLayout = new StackPane();
		startLayout.getChildren().add(startButton);
		startScene = new Scene(startLayout, 300, 300);
		
		// show stage
		primaryStage.setScene(startScene);
		primaryStage.setTitle("Connect Four");
		primaryStage.show();
	}
}
