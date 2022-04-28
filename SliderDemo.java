import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SliderDemo extends Application {
	
	public void start(Stage primaryStage) {
		Text text = new Text (20, 20, "JavaFX Programming");
		
		Slider slHorizontal = new Slider();
		slHorizontal.setShowTickLabels(true);
		slHorizontal.setShowTickMarks(true);
		
		Slider slVertical = new Slider();
		slVertical.setOrientation(Orientation.VERTICAL);
		slVertical.setShowTickLabels(true);
		slVertical.setShowTickMarks(true);
		slVertical.setValue(100);
		
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(paneForText);
		pane.setBottom(slHorizontal);
		pane.setRight(slVertical);
		
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("Slider Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}

}

