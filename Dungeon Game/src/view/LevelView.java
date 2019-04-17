package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class LevelView {
	GridPane pane;
	Scene scene;

	public LevelView() {
		pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10,10,10,10));
		BackgroundFill fill = new BackgroundFill(Paint.valueOf("#B8860B"), new CornerRadii(10.0), new Insets(10));
		Background background = new Background(fill);
		pane.setBackground(background);
		Rectangle[] rectangles = createRectangles();
		addRectangles(rectangles);
		scene = new Scene(pane, 700, 700);
	}

	public Rectangle[] createRectangles() {
		Rectangle[] rectangles = new Rectangle[100];
		for (int i = 0; i < 100; i++) {
			rectangles[i] = new Rectangle(65, 65);
			rectangles[i].setFill(Paint.valueOf("#A9A9A9"));
			rectangles[i].setStroke(Paint.valueOf("#000000"));
		}
		return rectangles;
	}

	public void addRectangles(Rectangle[] rectangles) {
		int nElems = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				pane.add(rectangles[nElems++], i, j);
			}
		}
	}

	public Scene getScene() {
		return scene;
	}

}
