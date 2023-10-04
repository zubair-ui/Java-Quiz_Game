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

public class Question5 extends Application {
	private boolean selected=false;
	private int score=0;
	
	public void setScore(int score) {
		this.score=score;
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Text header = new Text();
		header.setText("Question #5");
		header.setLayoutX(280);
		header.setLayoutY(110);
		header.setFill(Color.BLACK);
		header.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
		header.setUnderline(true);
		
		
		Label q5 = new Label();
		q5.setText("Q:Can a Class be considered as a Data Type?");
		q5.setLayoutX(100);
		q5.setLayoutY(200);
		q5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 25));
		
		
		RadioButton r1 = new RadioButton("Yes");
		RadioButton r2 = new RadioButton("No");
		
		ToggleGroup tg = new ToggleGroup();
		r1.setToggleGroup(tg);
		r2.setToggleGroup(tg);
		
		r1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
		r2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
		
		r1.setLayoutX(140);
		r1.setLayoutY(240);
		r2.setLayoutX(140);
		r2.setLayoutY(280);
		
		r1.setOnAction(e ->{
			if(!selected) {
				r1.setTextFill(Color.GREEN);
				selected=true;
				score++;
			}
		});
		
		r2.setOnAction(e ->{
			if(!selected) {
				r2.setTextFill(Color.RED);
				selected=true;
			}
		});
		
		
		
		
		
		
		
		Button next = new Button("Next");
		next.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		next.setLayoutX(600);
		next.setLayoutY(500);
		
		
		next.setOnAction(e ->{
			Question6 q6 = new Question6();
			q6.setScore(score);
			try {
				q6.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		
		Group root = new Group(header,q5,r1,r2,next);
        Scene scene = new Scene(root, 800, 600);
        scene.setFill(Color.POWDERBLUE);
        
        Image icon = new Image("file:icon.jpg");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("Quiz Game------>Question #5");
        stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
