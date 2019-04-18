package view;

import com.sun.javafx.css.StyleCache.Key;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class LevelView {
	Pane root;
	GridPane pane;
	Scene scene;
	Circle circle;

	public LevelView() {
		pane = new GridPane();
		root = new Pane();

		pane.setAlignment(Pos.CENTER);
		pane.setBackground(createBackground());

		addRectangles(createRectangles());
		pane.setGridLinesVisible(true);

		circle = createCircle();
		root.getChildren().add(circle);
		// root.getChildren().add(pane);
		scene = new Scene(root, 700, 700);
//		scene.setOnKeyPressed(e -> {
//			KeyCode key = e.getCode();
//			switch (key) {
//			case W: circle.setCenterY(circle.getCenterY() - 5); break;
//			case S: circle.setCenterY(circle.getCenterY() + 5); break;
//			case A: circle.setCenterX(circle.getCenterX() - 5); break;
//			case D: circle.setCenterX(circle.getCenterX() + 5); break;
//			}
//		});
	}

	public Circle createCircle() {
		Circle circle = new Circle(20, Paint.valueOf("red"));
		circle.setCenterX(200);
		circle.setCenterY(200);
		return circle;
	}

	public Background createBackground() {
		BackgroundFill fill = new BackgroundFill(Paint.valueOf("#B8860B"), new CornerRadii(10.0), new Insets(10));
		return new Background(fill);
	}

	public Rectangle[] createRectangles() {
		Rectangle[] rectangles = new Rectangle[100];
		for (int i = 0; i < 100; i++) {
			rectangles[i] = new Rectangle(65, 65);
			rectangles[i].setFill(Paint.valueOf("#A9A9A9"));
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
