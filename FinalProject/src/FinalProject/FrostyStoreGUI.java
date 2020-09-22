package FinalProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FrostyStoreGUI extends Application{
	
	// Layout labels
	Label title, right, left, center;
	
	// Labels created when user inputs membership info 
	Label nameLabel, eLabel, numLabel, infoLabel, infoLabel2, infoLabel3;
	
	// Labels used to display what the user ordered to the GUI
	Label userLabel, userLabel2, userLabel3, price;
	
	Label gallery;
	
	// fonts for each of the labels used
	Font font1, font2, font3;
	
	// text fields so a user can input there information for membership purposes
	TextField name, email, num;
	
	// Buttons created only when one of the stores is selected
	// proper flavors will pop up depending on selected store 
	RadioButton one, two, three, four;
	
	// A button for each store results in different styles and flavors 
	RadioButton boston, newyork, philly, tampa;
	
	// Group for the radio buttons
	ToggleGroup group, group2;
	
	// Left center and right displays of the borderpane are represented by a VBox
	VBox userInfo, selectStore, checkOptions;

	// Main layout of the GUI program
	BorderPane root;
	
	// Button to submit information to become a member, button to order
	Button order, submit;
	
	// All the same image, given to the radio buttons to display store mascot
	Image img;
	
	// Ice cream images displayed throughout the GUI depending on user action
	Image icecream, icecream2, icecream3, icecreamHappy, icecreamSad, icecreamPanic;

	// Presents a way to view all of the images
	ImageView view, view2, view3, view4, ic, ic2, ic3, icHappy, icSad, icPanic;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	//*****User info displayed on the left portion of the Borderpane in a vertical format*******//
	//*****Stores will be formated vertically in the middle of the border pane*****************//
	//*****Check boxes will be displayed on the right, once a store is selected****************//
	
	
	public void start(Stage primaryStage) throws Exception{
	
		// instantiating layout components and togglegroup
		userInfo = new VBox();
		selectStore = new VBox();
		group = new ToggleGroup();
		group2 = new ToggleGroup();
		
		// instatiating the title label and providing a big font
		title = new Label("Frosty Treats");
		font1 = new Font("Times",50);
		
		
		title.setFont(font1);
		title.setTextFill(Color.DARKBLUE);
		
		// This is the left hand layout
		// The customer needs to provide info before placing an order
		// Textfields created for user in input information
		// Once information is created you can move on to create an order
		
		left = new Label("To create a Frostys order, please enter information here!");
		
		font2 = new Font("Times", 20);
		font3 = new Font("Times", 15);
		left.setFont(font3);
		
		nameLabel = new Label("Please enter your name: ");
		nameLabel.setFont(font3);
		name = new TextField(null);
		
		eLabel = new Label("Please enter your email: ");
		eLabel.setFont(font3);
		email = new TextField(null);
		
		numLabel = new Label("Please Enter Your Phone Number: ");
		numLabel.setFont(font3);
		num = new TextField(null);
		
		infoLabel = new Label(null);
		infoLabel2 = new Label(null);
		infoLabel3 = new Label(null);
		
		icecream = new Image("https://t3.ftcdn.net/jpg/00/78/05/36/240_F_78053654_rrLonTDY3GylO01xiErJvPB3DplUIVvz.jpg");
		ic = new ImageView(icecream);
		ic.setVisible(false);
		
		icecream2 = new Image("https://t4.ftcdn.net/jpg/01/89/18/43/240_F_189184350_dbjeFpqAXfoJvBv6q8XdGGyxFSphuhYO.jpg");
		ic2 = new ImageView(icecream2);
		
		icecream3 = new Image("https://dncache-mauganscorp.netdna-ssl.com/thumbseg/842/842203-bigthumbnail.jpg");
		ic3 = new ImageView(icecream3);
		
		icecreamHappy = new Image("https://i.pinimg.com/originals/e2/50/c2/e250c2c8d119f17fc16d2d1afba7570d.jpg");
		icHappy = new ImageView(icecreamHappy);
		icHappy.setVisible(false);
		
		icecreamSad = new Image("http://2.bp.blogspot.com/-5ZBGfY-NlSs/VAt6vdDfegI/AAAAAAAALv4/b_-2K6_81FQ/s1600/sorry-emoticon.jpg");
		icSad = new ImageView(icecreamSad);
		icSad.setVisible(false);
		
		icecreamPanic = new Image("http://st2.depositphotos.com/1431107/6149/v/450/depositphotos_61498823-stock-illustration-dont-panic-sign.jpg");
		icPanic = new ImageView(icecreamPanic);
		icPanic.setVisible(false);
		

		
		submit = new Button("Submit");
		submit.setOnAction(e-> {
	
			if(name.getText() != null && email.getText() != null && num.getText() != null) {

				infoLabel.setText("Thank you " + name.getText() + "!");
				infoLabel2.setText("We will send you a confirmation email ");
				infoLabel3.setText("when your order is placed.");
				infoLabel.setFont(font3);
				infoLabel2.setFont(font3);
				infoLabel3.setFont(font3);
				icPanic.setVisible(false);
				icHappy.setVisible(true);
				
				
			
			} else {
				infoLabel.setText("Please enter information first, thank you.");
				infoLabel.setFont(font3);
				icPanic.setVisible(true);
				
			}

		});
		
		
		userInfo.setMargin(left, new Insets(20));
		userInfo.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		userInfo.getChildren().addAll(left, nameLabel, name, eLabel, email, numLabel, num, submit, infoLabel, infoLabel2, infoLabel3, icHappy, icPanic);
		

		
		//Center Layout
		//
		center = new Label("Select which store to order from.");
		center.setFont(font2);
		
		boston = new RadioButton("Frosty Treats Boston.");
		boston.setFont(font3);
		boston.setToggleGroup(group);
		boston.setOnAction(this::bostonSelected);
		
		newyork = new RadioButton("Frosty Treats New York.");
		newyork.setFont(font3);
		newyork.setToggleGroup(group);
		newyork.setOnAction(this:: NYSelected);
		
		philly = new RadioButton("Frosty Treats Philly");
		philly.setFont(font3);
		philly.setToggleGroup(group);
		philly.setOnAction(this::phillySelected);
		
		tampa = new RadioButton("Frosty Treats Tampa");
		tampa.setFont(font3);
		tampa.setToggleGroup(group);
		tampa.setOnAction(this::tampaSelected);
		
		// creating the image and setting graphic for each button
		img = new Image("https://vignette.wikia.nocookie.net/battlefordreamislandfanfiction/images/e/e8/Ice_Cream.jpeg/revision/latest?cb=20160401144234");
		view = new ImageView(img);
		view2 = new ImageView(img);
		view3 = new ImageView(img);
		view4 = new ImageView(img);
		
		boston.setGraphic(view);
		newyork.setGraphic(view2);
		philly.setGraphic(view3);
		tampa.setGraphic(view4);
		
		userInfo.setPadding(new Insets(0,100,10,100));
		userInfo.setMargin(center, new Insets(20));
		userInfo.setMargin(boston, new Insets(20));
		userInfo.setMargin(newyork, new Insets(20));
		userInfo.setMargin(philly, new Insets(20));
		userInfo.setMargin(tampa, new Insets(20));
		selectStore.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		selectStore.getChildren().addAll(center, boston, newyork, philly, tampa, view);
		
		checkOptions = new VBox();
		checkOptions.setPadding(new Insets(20,50,10,10));
		checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		checkOptions.setSpacing(20);
		gallery = new Label("Frosty Treat's Deluctible Gallery!");
		gallery.setFont(font2);
		checkOptions.getChildren().addAll(gallery, ic2, ic3);
		
		
			
		
		
//instantiating the BorderPane layout and setting each configuration to its proper coordinates
		root = new BorderPane();
		root.setStyle("-fx-background-color: lightblue");
		root.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		root.setPadding(new Insets(5));
		root.setMargin(title, new Insets(50,600,50,600));
		
		
		root.setTop(title);
		root.setLeft(userInfo);
		root.setCenter(selectStore);
		root.setRight(checkOptions);
		
		Scene scene = new Scene(root, 300, 300, Color.BLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Practice");
		primaryStage.show();
		
		
	}
	
// Giving action to the radio buttons by creating check boxes	
	public void bostonSelected(ActionEvent event) {
		
	    if(boston.isSelected() && name.getText() != null && email.getText() != null && num.getText() != null) {
		one = new RadioButton("Vanilla");
		one.setFont(font3);
		one.setToggleGroup(group2);
		
		two = new RadioButton("Chocolate");
		two.setFont(font3);
		two.setToggleGroup(group2);
		
		three = new RadioButton("Strawberry");
		three.setFont(font3);
		three.setToggleGroup(group2);
		
		four = new RadioButton("Patriot Pistachio");
		four.setFont(font3);
		four.setToggleGroup(group2);
		
		order = new Button("Order Now!");
		checkOptions = new VBox();
		right = new Label("What flavor would you like?");
		right.setFont(font2);
		userLabel = new Label(null);
		userLabel.setFont(font3);
		userLabel2 = new Label(null);
		userLabel2.setFont(font3);
		price = new Label(null);
		price.setFont(font3);

		
		checkOptions.setPadding(new Insets(0,100,10,100));
		checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		checkOptions.setSpacing(20);
		checkOptions.getChildren().addAll(right, one, two, three, four, order, userLabel, price, userLabel2, ic);
		root.setRight(checkOptions);
		order.setOnAction(e-> bostonOptions(one, two, three, four));
	    }
		else {
			checkOptions = new VBox();
			right = new Label("Sorry about that!");
			userLabel = new Label("Make sure to submit your information before selecting a");
			userLabel2 = new Label("a store. Thank you for your consideration and support!");
			right.setFont(font2);
			userLabel.setFont(font3);
			userLabel2.setFont(font3);
			icSad.setVisible(true);
			
			
			checkOptions.setPadding(new Insets(0,100,10,100));
			checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			checkOptions.setSpacing(20);
			checkOptions.getChildren().addAll(icSad, right, userLabel, userLabel2);
			root.setRight(checkOptions);
			
		}
	
	}
	
	public void NYSelected(ActionEvent event) {
		if(newyork.isSelected() && name.getText() != null && email.getText() != null && num.getText() != null) {
			one = new RadioButton("Vanilla");
			one.setFont(font3);
			one.setToggleGroup(group2);
			
			two = new RadioButton("Chocolate");
			two.setFont(font3);
			two.setToggleGroup(group2);
			
			three = new RadioButton("Strawberry");
			three.setFont(font3);
			three.setToggleGroup(group2);
			
			four = new RadioButton("Blueberry Broadway");
			four.setFont(font3);
			four.setToggleGroup(group2);
			
			order = new Button("Order Now!");
			checkOptions = new VBox();
			right = new Label("What flavor would you like?");
			right.setFont(font2);
			userLabel = new Label(null);
			userLabel.setFont(font3);
			userLabel2 = new Label(null);
			userLabel2.setFont(font3);
			price = new Label(null);
			price.setFont(font3);

			
			checkOptions.setPadding(new Insets(0,100,10,100));
			checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			checkOptions.setSpacing(20);
			checkOptions.getChildren().addAll(right, one, two, three, four, order, userLabel, price, userLabel2, ic);
			root.setRight(checkOptions);
			order.setOnAction(e-> NYOptions(one, two, three, four));
		}
		else {
			checkOptions = new VBox();
			right = new Label("Sorry about that!");
			userLabel = new Label("Make sure to submit your information before selecting a");
			userLabel2 = new Label("a store. Thank you for your consideration and support!");
			right.setFont(font2);
			userLabel.setFont(font3);
			userLabel2.setFont(font3);
			icSad.setVisible(true);
		
			
			checkOptions.setPadding(new Insets(0,100,10,100));
			checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			checkOptions.setSpacing(20);
			checkOptions.getChildren().addAll(icSad, right, userLabel, userLabel2);
			root.setRight(checkOptions);
			
		}
	}
	
	public void phillySelected(ActionEvent event) {
	if(philly.isSelected() && name.getText() != null && email.getText() != null && num.getText() != null) {
		one = new RadioButton("Vanilla");
		one.setFont(font3);
		one.setToggleGroup(group2);
		
		two = new RadioButton("Chocolate");
		two.setFont(font3);
		two.setToggleGroup(group2);
		
		three = new RadioButton("Strawberry");
		three.setFont(font3);
		three.setToggleGroup(group2);
		
		four = new RadioButton("Liberty Lime");
		four.setFont(font3);
		four.setToggleGroup(group2);
		
		order = new Button("Order Now!");
		checkOptions = new VBox();
		right = new Label("What flavor would you like?");
		right.setFont(font2);
		userLabel = new Label(null);
		userLabel.setFont(font3);
		userLabel2 = new Label(null);
		userLabel2.setFont(font3);
		price = new Label(null);
		price.setFont(font3);

		
		checkOptions.setPadding(new Insets(0,100,10,100));
		checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		checkOptions.setSpacing(20);
		checkOptions.getChildren().addAll(right, one, two, three, four, order, userLabel, price, userLabel2, ic);
		root.setRight(checkOptions);
		order.setOnAction(e-> phillyOptions(one, two, three, four));
	}
	else {
		checkOptions = new VBox();
		right = new Label("Sorry about that!");
		userLabel = new Label("Make sure to submit your information before selecting a");
		userLabel2 = new Label("a store. Thank you for your consideration and support!");
		right.setFont(font2);
		userLabel.setFont(font3);
		userLabel2.setFont(font3);
		icSad.setVisible(true);
		
		
		checkOptions.setPadding(new Insets(0,100,10,100));
		checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		checkOptions.setSpacing(20);
		checkOptions.getChildren().addAll(icSad, right, userLabel, userLabel2);
		root.setRight(checkOptions);
		
	}
	}
	
	// for some reason, adding the extra conditions extracts the image from being visible
	public void tampaSelected(ActionEvent event) {
		if(tampa.isSelected() && name.getText() != null && email.getText() != null && num.getText() != null) {
			one = new RadioButton("Vanilla");
			one.setFont(font3);
			one.setToggleGroup(group2);
			
			two = new RadioButton("Chocolate");
			two.setFont(font3);
			two.setToggleGroup(group2);
			
			three = new RadioButton("Strawberry");
			three.setFont(font3);
			three.setToggleGroup(group2);
			
			four = new RadioButton("Tropical Tangerine");
			four.setFont(font3);
			four.setToggleGroup(group2);
			
			order = new Button("Order Now!");
			checkOptions = new VBox();
			right = new Label("What flavor would you like?");
			right.setFont(font2);
			userLabel = new Label(null);
			userLabel.setFont(font3);
			userLabel2 = new Label(null);
			userLabel2.setFont(font3);
			price = new Label(null);
			price.setFont(font3);
			
			checkOptions.setPadding(new Insets(0,100,10,100));
			checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			checkOptions.setSpacing(20);
			checkOptions.getChildren().addAll(right, one, two, three, four, order,userLabel, price, userLabel2, ic);
			root.setRight(checkOptions);
			order.setOnAction(e-> tampaOptions(one, two, three, four));
		}
		else {
			checkOptions = new VBox();
			right = new Label("Sorry about that!");
			userLabel = new Label("Make sure to submit your information before selecting a");
			userLabel2 = new Label("a store. Thank you for your consideration and support!");
			right.setFont(font2);
			userLabel.setFont(font3);
			userLabel2.setFont(font3);
			icSad.setVisible(true);
			
			checkOptions.setPadding(new Insets(0,100,10,100));
			checkOptions.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
			checkOptions.setSpacing(20);
			checkOptions.getChildren().addAll(icSad, right, userLabel, userLabel2);
			root.setRight(checkOptions);
			
		}
	}
	
	// Handle Radio button options(flavors and styles)
	public void bostonOptions(RadioButton one, RadioButton two, RadioButton three, RadioButton four) {
		if(one.isSelected()) {
			
			FrostyTreatsStore treat = new BostonStore();
			FrostyTreats t = treat.orderIceCream("vanilla");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
			
		}
		if(two.isSelected()) {
			FrostyTreatsStore treat = new BostonStore();
			FrostyTreats t = treat.orderIceCream("chocolate");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(three.isSelected()) {
			FrostyTreatsStore treat = new BostonStore();
			FrostyTreats t = treat.orderIceCream("strawberry");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(four.isSelected()) {
			FrostyTreatsStore treat = new BostonStore();
			FrostyTreats t = treat.orderIceCream("patriot pistachio");
			String s = t.toString();
			price.setText("Price: 2.75. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		
	}
	public void NYOptions(RadioButton one, RadioButton two, RadioButton three, RadioButton four) {
		
		if(one.isSelected()) {
			FrostyTreatsStore treat = new NYStore();
			FrostyTreats t = treat.orderIceCream("vanilla");
			String s = t.toString();
			price.setText("Price: 3.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(two.isSelected()) {
			FrostyTreatsStore treat = new NYStore();
			FrostyTreats t = treat.orderIceCream("chocolate");
			String s = t.toString();
			price.setText("Price: 3.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(three.isSelected()) {
			FrostyTreatsStore treat = new NYStore();
			FrostyTreats t = treat.orderIceCream("strawberry");
			String s = t.toString();
			price.setText("Price: 3.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(four.isSelected()) {
			FrostyTreatsStore treat = new NYStore();
			FrostyTreats t = treat.orderIceCream("broadway blueberry");
			String s = t.toString();
			price.setText("Price: 3.75. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		
	}
	public void phillyOptions(RadioButton one, RadioButton two, RadioButton three, RadioButton four) {
		
		if(one.isSelected()) {
			FrostyTreatsStore treat = new PhillyStore();
			FrostyTreats t = treat.orderIceCream("vanilla");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(two.isSelected()) {
			FrostyTreatsStore treat = new PhillyStore();
			FrostyTreats t = treat.orderIceCream("chocolate");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(three.isSelected()) {
			FrostyTreatsStore treat = new PhillyStore();
			FrostyTreats t = treat.orderIceCream("strawberry");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(four.isSelected()) {
			FrostyTreatsStore treat = new PhillyStore();
			FrostyTreats t = treat.orderIceCream("liberty lime");
			String s = t.toString();
			price.setText("Price: 2.75. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
	}
	public void tampaOptions(RadioButton one, RadioButton two, RadioButton three, RadioButton four) {
		
		if(one.isSelected()) {
			FrostyTreatsStore treat = new TampaStore();
			FrostyTreats t = treat.orderIceCream("vanilla");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(two.isSelected()) {
			FrostyTreatsStore treat = new TampaStore();
			FrostyTreats t = treat.orderIceCream("chocolate");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(three.isSelected()) {
			FrostyTreatsStore treat = new TampaStore();
			FrostyTreats t = treat.orderIceCream("strawberry");
			String s = t.toString();
			price.setText("Price: 2.25. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		}
		if(four.isSelected()) {
			FrostyTreatsStore treat = new TampaStore();
			FrostyTreats t = treat.orderIceCream("tropical tangerine");
			String s = t.toString();
			price.setText("Price: 2.75. Confirmation email delivered!");
			userLabel.setText(s);
			userLabel2.setText("Thank you for your order " + name.getText() + "!");
			ic.setVisible(true);
		
		}
	}
	
	
}