package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Welcome extends Application {
	@Override
	public void start(Stage stage) {
		
		Text header = new Text();
		header.setText("Welcome to Java Quiz Game");
		header.setLayoutX(130);
		header.setLayoutY(110);
		header.setFill(Color.BLACK);
		header.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
		header.setUnderline(true);
		
		
		Button start = new Button("Start");
		start.setLayoutX(300);
		start.setLayoutY(290);
		start.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
		
		start.setOnAction(e ->{
			Question1 q1=new Question1();
			
			try {
				q1.start(stage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		
		
		Group root = new Group(header,start);
        Scene scene = new Scene(root, 800, 600);
        scene.setFill(Color.POWDERBLUE);
        
        Image icon = new Image("file:icon.jpg");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("Quiz Game");
        stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
