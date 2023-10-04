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

public class Question10 extends Application {
	private boolean selected=false;
	private int score=0;
	
	public void setScore(int score) {
		this.score=score;
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Text header = new Text();
		header.setText("Question #10");
		header.setLayoutX(280);
		header.setLayoutY(110);
		header.setFill(Color.BLACK);
		header.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
		header.setUnderline(true);
		
		
		Label q10 = new Label();
		q10.setText("Q:Which keyword is used when inheriting from a Class?");
		q10.setLayoutX(100);
		q10.setLayoutY(200);
		q10.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 25));
		
		
		RadioButton r1 = new RadioButton("implements");
		RadioButton r2 = new RadioButton("extend");
		RadioButton r3 = new RadioButton("inherit");
		RadioButton r4 = new RadioButton("parent");
		
		ToggleGroup tg = new ToggleGroup();
		r1.setToggleGroup(tg);
		r2.setToggleGroup(tg);
		r3.setToggleGroup(tg);
		r4.setToggleGroup(tg);
		

		r1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
		r2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
		r3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
		r4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 17));
		
		r1.setLayoutX(140);
		r1.setLayoutY(240);
		r2.setLayoutX(140);
		r2.setLayoutY(280);
		r3.setLayoutX(140);
		r3.setLayoutY(320);
		r4.setLayoutX(140);
		r4.setLayoutY(360);
		
		r1.setOnAction(e ->{
			if(!selected) {
				r1.setTextFill(Color.RED);
				selected=true;
			}
		});
		
		r2.setOnAction(e ->{
			if(!selected) {
				r2.setTextFill(Color.GREEN);
				selected=true;
				score++;
			}
		});
		
		r3.setOnAction(e ->{
			if(!selected) {
				r3.setTextFill(Color.RED);
				selected=true;
			}
		});
		
		r4.setOnAction(e ->{
			if(!selected) {
				r4.setTextFill(Color.RED);
				selected=true;
			}
		});
		
		
		
		
		
		
		Button finish = new Button("Finish");
		finish.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		finish.setLayoutX(600);
		finish.setLayoutY(500);
		
		
		finish.setOnAction(e ->{
			Result result = new Result();
			result.setScore(score);
			try {
				result.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			});
		
		
		Group root = new Group(header,q10,r1,r2,r3,r4,finish);
        Scene scene = new Scene(root, 800, 600);
        scene.setFill(Color.POWDERBLUE);
        
        Image icon = new Image("file:icon.jpg");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("Quiz Game------>Question #10");
        stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
