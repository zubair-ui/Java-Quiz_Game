package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Result extends Application {
	private int score=0;
	
	public void setScore(int score) {
		this.score=score;
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Text header = new Text();
		header.setText("Result");
		header.setLayoutX(280);
		header.setLayoutY(110);
		header.setFill(Color.BLACK);
		header.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
		header.setUnderline(true);
		
		
		Label marks = new Label();
		marks.setText("Score: "+score+"/10");
		marks.setLayoutX(250);
		marks.setLayoutY(200);
		marks.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 35));
		
		
		
		
		
		
		
		
		Button playAgain = new Button("Play Again");
		playAgain.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		playAgain.setLayoutX(600);
		playAgain.setLayoutY(500);
		
		
		playAgain.setOnAction(e ->{
			Welcome welcome = new Welcome();
			welcome.start(stage);
		});
		
		
		Group root = new Group(header,marks,playAgain);
        Scene scene = new Scene(root, 800, 600);
        scene.setFill(Color.POWDERBLUE);
        
        Image icon = new Image("file:icon.jpg");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("Quiz Game------>Result");
        stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
