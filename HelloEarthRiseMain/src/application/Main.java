package application;
	
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		 String message
         = "Earthrise at Christmas: "
         + "[Forty] years ago this Christmas, a turbulent world "
         + "looked to the heavens for a unique view of our home "
         + "planet. This photo of Earthrise over the lunar horizon "
         + "was taken by the Apollo 8 crew in December 1968, showing "
         + "Earth for the first time as it appears from deep space. "
         + "Astronauts Frank Borman, Jim Lovell and William Anders "
         + "had become the first humans to leave Earth orbit, "
         + "entering lunar orbit on Christmas Eve. In a historic live "
         + "broadcast that night, the crew took turns reading from "
         + "the Book of Genesis, closing with a holiday wish from "
         + "Commander Borman: \"We close with good night, good luck, "
         + "a Merry Christmas, and God bless all of you -- all of "
         + "you on the good Earth.\"";

 // Reference to the Text
 Text textRef = new Text(message);
 textRef.setLayoutY(100);
 textRef.setTextOrigin(VPos.TOP);
 textRef.setTextAlignment(TextAlignment.JUSTIFY);
 textRef.setWrappingWidth(400);
 textRef.setFill(Color.rgb(187, 195, 107));
 textRef.setFont(Font.font("SansSerif", FontWeight.BOLD, 24));

 // Provides the animated scrolling behavior for the text
 TranslateTransition transTransition = new TranslateTransition(new Duration(75000), textRef);
 transTransition.setToY(-820);
 transTransition.setInterpolator(Interpolator.LINEAR);
 transTransition.setCycleCount(Timeline.INDEFINITE);
 
 // Create an ImageView containing the Image
 Image image = new Image("http://projavafx.com/images/earthrise.jpg");
 ImageView iv = new ImageView(image);

 // Create a ScrollPane containing the text
 ScrollPane scrollPane = new ScrollPane();
 scrollPane.setLayoutX(50);
 scrollPane.setLayoutY(180);
 scrollPane.setPrefWidth(400);
 scrollPane.setPrefHeight(85);
 scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
 scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
 scrollPane.setPannable(true);
 scrollPane.setContent(textRef);
 
 
 // Combine ImageView and Group
 Group root = new Group(iv, scrollPane);
 Scene scene = new Scene(root, 516, 387);

 //stage.setScene(scene);
 //stage.setTitle("Hello Earthrise");
 //stage.show();

 // Start the text animation
 //transTransition.play();

		try {
		//	BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
