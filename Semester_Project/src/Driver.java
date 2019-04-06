import java.util.Arrays;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Driver extends Application {
	
	
	
	public Card[] loadCards() {
		 
			Card aceOfHearts = new Heart("Cards\\Hearts\\1_of_hearts.png", 1, "Heart");
		    Card twoOfHearts = new Heart("Cards\\Hearts\\2_of_hearts.png", 2, "Heart");
		    Card threeOfHearts = new Heart("Cards\\Hearts\\3_of_hearts.png", 3, "Heart");
		    Card fourOfHearts = new Heart("Cards\\Hearts\\4_of_hearts.png", 4, "Heart");
		    Card fiveOfHearts = new Heart("Cards\\Hearts\\5_of_hearts.png", 5, "Heart");
		    Card sixOfHearts = new Heart("Cards\\Hearts\\6_of_hearts.png", 6, "Heart");
		    Card sevenOfHearts = new Heart("Cards\\Hearts\\7_of_hearts.png", 7, "Heart");
		    Card eightOfHearts = new Heart("Cards\\Hearts\\8_of_hearts.png", 8, "Heart");
		    Card nineOfHearts = new Heart("Cards\\Hearts\\9_of_hearts.png", 9, "Heart");
		    Card tenOfHearts = new Heart("Cards\\Hearts\\10_of_hearts.png", 10, "Heart");
		    Card jackOfHearts = new Heart("Cards\\Hearts\\11_of_hearts.png", 11, "Heart");
		    Card queenOfHearts = new Heart("Cards\\Hearts\\12_of_hearts.png", 12, "Heart");
		    Card kingOfHearts = new Heart("Cards\\Hearts\\13_of_hearts.png", 13, "Heart");
		    
		    //Load Club Cards
		    Card aceOfClubs = new Club("Cards\\Clubs\\1_of_clubs.png", 1, "Club");
		    Card twoOfClubs = new Club("Cards\\Clubs\\2_of_clubs.png", 2, "Club");
		    Card threeOfClubs = new Club("Cards\\Clubs\\3_of_clubs.png", 3, "Club");
		    Card fourOfClubs = new Club("Cards\\Clubs\\4_of_clubs.png", 4, "Club");
		    Card fiveOfClubs = new Club("Cards\\Clubs\\5_of_clubs.png", 5, "Club");
		    Card sixOfClubs = new Club("Cards\\Clubs\\6_of_clubs.png", 6, "Club");
		    Card sevenOfClubs = new Club("Cards\\Clubs\\7_of_clubs.png", 7, "Club");
		    Card eightOfClubs = new Club("Cards\\Clubs\\8_of_clubs.png", 8, "Club");
		    Card nineOfClubs = new Club("Cards\\Clubs\\9_of_clubs.png", 9, "Club");
		    Card tenOfClubs = new Club("Cards\\Clubs\\10_of_clubs.png", 10, "Club");
		    Card jackOfClubs = new Club("Cards\\Clubs\\11_of_clubs.png", 11, "Club");
		    Card queenOfClubs = new Club("Cards\\Clubs\\12_of_clubs.png", 12, "Club");
		    Card kingOfClubs = new Club("Cards\\Clubs\\13_of_clubs.png", 13, "Club");
		    
		    //Load Spade Cards
		    Card aceOfSpades = new Spade("Cards\\Spades\\1_of_spades.png", 1, "Spade");
		    Card twoOfSpades = new Spade("Cards\\Spades\\2_of_spades.png", 2, "Spade");
		    Card threeOfSpades = new Spade("Cards\\Spades\\3_of_spades.png", 3, "Spade");
		    Card fourOfSpades = new Spade("Cards\\Spades\\4_of_spades.png", 4, "Spade");
		    Card fiveOfSpades = new Spade("Cards\\Spades\\5_of_spades.png", 5, "Spade");
		    Card sixOfSpades = new Spade("Cards\\Spades\\6_of_spades.png", 6, "Spade");
		    Card sevenOfSpades = new Spade("Cards\\Spades\\7_of_spades.png", 7, "Spade");
		    Card eightOfSpades = new Spade("Cards\\Spades\\8_of_spades.png", 8, "Spade");
		    Card nineOfSpades = new Spade("Cards\\Spades\\9_of_spades.png", 9, "Spade");
		    Card tenOfSpades = new Spade("Cards\\Spades\\10_of_spades.png", 10, "Spade");
		    Card jackOfSpades = new Spade("Cards\\Spades\\11_of_spades.png", 11, "Spade");
		    Card queenOfSpades = new Spade("Cards\\Spades\\12_of_spades.png", 12, "Spade");	    
		    Card kingOfSpades = new Spade("Cards\\Spades\\13_of_spades.png", 13, "Spade");
		    

		    //Load Diamond Cards
		    Card aceOfDiamonds = new Diamond("Cards\\Diamonds\\1_of_diamonds.png", 1, "Diamond");
		    Card twoOfDiamonds = new Diamond("Cards\\Diamonds\\2_of_diamonds.png", 2, "Diamond");
		    Card threeOfDiamonds = new Diamond("Cards\\Diamonds\\3_of_diamonds.png", 3, "Diamond");
		    Card fourOfDiamonds = new Diamond("Cards\\Diamonds\\4_of_diamonds.png", 4, "Diamond");
		    Card fiveOfDiamonds = new Diamond("Cards\\Diamonds\\5_of_diamonds.png", 5, "Diamond");
		    Card sixOfDiamonds = new Diamond("Cards\\Diamonds\\6_of_diamonds.png", 6, "Diamond");
		    Card sevenOfDiamonds = new Diamond("Cards\\Diamonds\\7_of_diamonds.png", 7, "Diamond");
		    Card eightOfDiamonds = new Diamond("Cards\\Diamonds\\8_of_diamonds.png", 8, "Diamond");
		    Card nineOfDiamonds = new Diamond("Cards\\Diamonds\\9_of_diamonds.png", 9, "Diamond");
		    Card tenOfDiamonds = new Diamond("Cards\\Diamonds\\10_of_diamonds.png", 10, "Diamond");
		    Card jackOfDiamonds = new Diamond("Cards\\Diamonds\\11_of_diamonds.png", 11, "Diamond");
		    Card queenOfDiamonds = new Diamond("Cards\\Diamonds\\12_of_diamonds.png", 12, "Diamond");
		    Card kingOfDiamonds = new Diamond("Cards\\Diamonds\\13_of_diamonds.png", 13, "Diamond");
		
		    //Store Diamonds, Clubs, Hearts, Spades Cards
		    Card [] deck =
	            {
	              aceOfHearts, twoOfHearts, threeOfHearts, fourOfHearts, fiveOfHearts, sixOfHearts, sevenOfHearts, eightOfHearts, nineOfHearts, tenOfHearts, jackOfHearts, queenOfHearts, kingOfHearts,
	                    aceOfClubs, twoOfClubs, threeOfClubs, fourOfClubs, fiveOfClubs, sixOfClubs, sevenOfClubs, eightOfClubs, nineOfClubs, tenOfClubs, jackOfClubs, queenOfClubs, kingOfClubs,
	                    aceOfSpades, twoOfSpades, threeOfSpades, fourOfSpades, fiveOfSpades, sixOfSpades, sevenOfSpades, eightOfSpades, nineOfSpades, tenOfSpades, jackOfSpades, queenOfSpades, kingOfSpades,
	                    aceOfDiamonds, twoOfDiamonds, threeOfDiamonds, fourOfDiamonds, fiveOfDiamonds, sixOfDiamonds, sevenOfDiamonds, eightOfDiamonds, nineOfDiamonds, tenOfDiamonds, jackOfDiamonds, queenOfDiamonds, kingOfDiamonds 
	            };
		    
		    return deck;
	}
	
	public HBox displayCards(Card [] deck) {
		
		HBox hBoxCenter = new HBox(10);
		hBoxCenter.setPadding(new Insets(15, 15, 15, 15));
		Random rand = new Random(); // Makes a new random number using the Random class
        int cardNum = rand.nextInt(52) + 1; // Stores random number to an int variable to use for the 'deck' array
        
        
        Image img1 = new Image(deck[cardNum].getPic()); // Grabs the image directory of the card in the 'deck' array chosen by the random number
        ImageView cardImage = new ImageView(img1); // Displays the chosen card to the user
        cardImage.setFitHeight(200);
		cardImage.setFitWidth(150);
		Card picked1 = deck[cardNum];
		
		//card2
		Random rand2 = new Random();
		int cardNum2 = rand2.nextInt(52) + 1;
						
		Image img2 = new Image(deck[cardNum2].getPic());
		ImageView cardImage2 = new ImageView(img2);
		cardImage2.setFitHeight(200);
		cardImage2.setFitWidth(150);
		Card picked2 = deck[cardNum2];
		
		//card3
		Random rand3 = new Random();
		int cardNum3 = rand3.nextInt(52) + 1;
								
		Image img3 = new Image(deck[cardNum3].getPic());
		ImageView cardImage3 = new ImageView(img3);
		cardImage3.setFitHeight(200);
		cardImage3.setFitWidth(150);
		Card picked3 = deck[cardNum3];
		
		//card4
		Random rand4 = new Random();
		int cardNum4 = rand4.nextInt(52) + 1;
										
		Image img4 = new Image(deck[cardNum4].getPic());
		ImageView cardImage4 = new ImageView(img4);
		cardImage4.setFitHeight(200);
		cardImage4.setFitWidth(150);
		Card picked4 = deck[cardNum4];
			
		int [] hand = {picked1.getCardNum(), picked2.getCardNum(), picked3.getCardNum(), picked4.getCardNum()};
		Arrays.sort(hand);
		
		
		hBoxCenter.getChildren().addAll(cardImage, cardImage2, cardImage3, cardImage4);
		
		return hBoxCenter;
	}
	
		
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Card [] deck = loadCards();
		
		
		BorderPane pane = new BorderPane();
		
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
		
		HBox hBoxCenter = displayCards(deck);
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
		
		
	}
	
	
	public static void main(String [] a) {
		launch(a);
	}

}

