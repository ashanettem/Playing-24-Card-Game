import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.Random;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;


public class Driver extends Application {
		
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane pane = new BorderPane();
		GridPane centerPane = new GridPane();
		
		//top pane
		Button butSolution = new Button("Find a Solution");
		Button butRefresh = new Button("Refresh");
		TextField tfSolution = new TextField();
		tfSolution.setEditable(false);
		tfSolution.setAlignment(Pos.CENTER);
		
		HBox hBoxTop = new HBox(10);
		hBoxTop.getChildren().addAll(butSolution, tfSolution, butRefresh);
		hBoxTop.setAlignment(Pos.CENTER);
		hBoxTop.setPadding(new Insets(15,15,15,15));
		pane.setTop(hBoxTop);
		
		
		
		//center pane
		HBox hBoxCenter = new HBox(10);
		hBoxCenter.setPadding(new Insets(15, 15, 15, 15));
		
		//card1
		Random rand = new Random();
		int cardNum = rand.nextInt(13)+1;
		System.out.println(cardNum);		
		Image img1 = new Image("Cards\\Clubs\\2_of_clubs.png");
		ImageView cardImage = new ImageView(img1);
		cardImage.setFitHeight(200);
		cardImage.setFitWidth(150);
		
		//card2
		Random rand2 = new Random();
		int cardNum2 = rand2.nextInt(13)+1;
						
		Image img2 = new Image("Cards\\Diamonds\\"+(cardNum2)+"_of_diamonds.png");
		ImageView cardImage2 = new ImageView(img2);
		cardImage2.setFitHeight(200);
		cardImage2.setFitWidth(150);
		
		//card3
		Random rand3 = new Random();
		int cardNum3 = rand3.nextInt(13)+1;
								
		Image img3 = new Image("Cards\\Spades\\"+(cardNum3)+"_of_spades.png");
		ImageView cardImage3 = new ImageView(img3);
		cardImage3.setFitHeight(200);
		cardImage3.setFitWidth(150);
		
		//card4
		Random rand4 = new Random();
		int cardNum4 = rand3.nextInt(13)+1;
										
		Image img4 = new Image("Cards\\Spades\\"+(cardNum4)+"_of_spades.png");
		ImageView cardImage4 = new ImageView(img4);
		cardImage4.setFitHeight(200);
		cardImage4.setFitWidth(150);
		
		
		//this is just a rough draft that runs, I will work on the display
		
		
		//TO DO
		//create a card parent class, with suits are child class
		//create card objects with their images, and corresponding numbers
		//store card deck into array
		//create method that generates random cards to start with and be called again in refresh button
		//work on evaluation and generate expression buttons
		//store random generated cards into an array or array list, sort list by card number
		//store numbers in evaluation into array using isdigit() char method
		
		
		
		
		hBoxCenter.getChildren().addAll(cardImage, cardImage2, cardImage3, cardImage4);
		pane.setCenter(hBoxCenter);
		
		//bottom pane
		Label expressionLabel = new Label("Enter an expression: ");
		expressionLabel.setAlignment(Pos.CENTER_LEFT);
		expressionLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
		expressionLabel.setAlignment(Pos.CENTER_LEFT);
		
		TextField tfExpression = new TextField();
		tfExpression.setEditable(true);
		tfExpression.setAlignment(Pos.CENTER);
		
		Button butVerify = new Button("Verify");
		
		HBox hBoxBottom = new HBox(10);
		hBoxBottom.getChildren().addAll(expressionLabel, tfExpression, butVerify);
		hBoxBottom.setAlignment(Pos.CENTER);
		hBoxBottom.setPadding(new Insets(15, 15, 15, 15));
		pane.setBottom(hBoxBottom);
		
		Scene scene = new Scene(pane, 660, 350);
		primaryStage.setTitle("Playing Cards24");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	/*	final long start = System.nanoTime(); // code to record time
		for (int i = 0; i < length; i++) {
			  // Enter code here
			}
			final long finish = System.nanoTime();

			System.out.println("Total time to solve the problem: " + (finish - start));
	}
	
	*/
		
	public static void main(String [] a) {
		launch(a);
	}

}

