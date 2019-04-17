package main;

import javafx.application.Application;
import javafx.stage.Stage;
import view.LevelView;

public class demo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	public void start(Stage stage) throws Exception {
		LevelView view = new LevelView();
		stage.setScene(view.getScene());
		stage.setTitle("Dungeon Game");
		stage.show();
	}
	
}
