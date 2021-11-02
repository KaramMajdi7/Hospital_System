import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GuiClass extends Application {

	Stage window;
	Scene scene,scene1,scene2,scene3,scene4,scene5,scene6,scene7;
	@Override
	public void start(Stage myStage) throws Exception {
		window = myStage;
		GridPane gp = new GridPane();
		
		
		//--------------First Scene-----------------//
		
		
		//Button
		Button doc = new Button("Doctor");
		Button adm = new Button("Admin");
		Button pat = new Button("Patient");
		
		Image img = new Image("file:410Rvb5mM+L._SX425_.jpg");
		ImageView iv = new ImageView();
		iv.setImage(img);
		iv.setFitHeight(100);
		iv.setFitWidth(75);
		
		Image img1 = new Image("file:dev.png");
		ImageView iv1 = new ImageView();
		iv1.setImage(img1);
		iv1.setFitHeight(100);
		iv1.setFitWidth(75);
		
		Image img2 = new Image("file:patient.png");
		ImageView iv2 = new ImageView();
		iv2.setImage(img2);
		iv2.setFitHeight(100);
		iv2.setFitWidth(75);
		
		Image img3 = new Image("file:hh.jpg");
		ImageView iv3 = new ImageView();
		iv3.setImage(img3);
		iv3.setFitHeight(100);
		iv3.setFitWidth(100);
		
		
		Image backG1 = new Image("file:0798adf9c191e928d86114726aaee261.jpg");
		ImageView BackG1 = new ImageView(backG1);
		
		doc.setPrefHeight(20);
		doc.setPrefWidth(75);
		
		adm.setPrefHeight(20);
		adm.setPrefWidth(75);
		
		pat.setPrefHeight(20);
		pat.setPrefWidth(75);
		
		
		//-----------Doctor----------//
		
		doctor dd = new doctor();
		
		GridPane gp1 = new GridPane();
		Label n = new Label("Doctor name : ");
		Label i = new Label("ID = ");
		Label j = new Label("Job : ");
		
		
		TextField name = new TextField();
		TextField id = new TextField();
		TextField job = new TextField();
		
		Button view = new Button("View");

		view.setOnAction(e->{
			dd.setID(19278181);
			dd.setJob("Cardiologists");
			dd.setName("Khalid Ahmed");
		name.setText(dd.getName());
		id.setText(String.valueOf(dd.getID()));
		job.setText(dd.getJob());
		});
		
		Button back1 = new Button("Back");
		
		gp1.add(n, 2, 0);
		gp1.add(i, 2, 1);
		gp1.add(j, 2, 2);
		gp1.add(name, 3, 0);
		gp1.add(id, 3, 1);
		gp1.add(job, 3, 2);
		gp1.add(view,4,4);
		
		gp1.add(back1, 5, 4);
		
		gp1.setStyle("-fx-background-image: url('docccnn.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		doc.setOnAction(e-> {
			window.setScene(scene1);
			});
		

		back1.setOnAction(e-> {
			window.setScene(scene);
			});
		
		Group roo = new Group();
		roo.getChildren().addAll(BackG1);
		
		
		gp1.setAlignment(Pos.CENTER);
		gp1.setHgap(5);
		gp1.setVgap(5);
		scene1 = new Scene(gp1,700,700);
		
		
		
		gp.add(doc, 0, 0);
		gp.add(adm, 1, 0);
		gp.add(pat, 2, 0);
		gp.add(iv, 0, 1);
		gp.add(iv1, 1, 1);
		gp.add(iv2, 2, 1);
		
		gp.setStyle("-fx-background-image: url('0798adf9c191e928d86114726aaee261.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		

		
		//--------------Admin--------------//
		
		admin ad = new admin();
		
		GridPane gp2 = new GridPane();
		Label name1 = new Label("Admin name : ");
		Label id1 = new Label("ID = ");
		Label job1 = new Label("Job : ");
		Label check = new Label("If you are an admin don't fill the infromation");
		Label check_under = new Label("above and press the yes button !");
		TextField name11 = new TextField();
		TextField id11 = new TextField();
		TextField job11 = new TextField();
		
		Button yesBut = new Button("Yes");
		Button done_AD = new Button("Done");
		Button back = new Button("Back");
		
		ArrayList<Object> x = new ArrayList<>();
		
		x.add(name1);
		x.add(id1);
		x.add(job1);
		x.add(check);
		x.add(check_under);
		
		
		for (Object name222 : x) {
			
			((Labeled) name222).setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
			
			}
	
		
		yesBut.setOnAction(e-> {
			
			window.setScene(scene5);
			
			
			});
		
		
		
		
		gp2.add(name1, 0, 0);
		gp2.add(id1, 0, 1);
		gp2.add(job1, 0, 2);
		gp2.add(name11, 1, 0);
		gp2.add(id11, 1, 1);
		gp2.add(job11, 1, 2);
		gp2.add(done_AD, 1, 6);
		gp2.add(yesBut, 1, 9);
		gp2.add(check, 0, 8);
		gp2.add(check_under, 0, 9);
		
		GridPane gp_test = new GridPane();
		gp_test.add(back, 9, 9);
		gp_test.setStyle("-fx-background-color: #64a0dc;");
		BorderPane pane = new BorderPane();
		pane.setLeft(gp2);
		pane.setBottom(gp_test);
		
		gp2.setAlignment(Pos.CENTER);
		gp2.setHgap(10);
		gp2.setVgap(10);
		gp2.setPadding(new Insets(10, 10, 10, 10));
		gp2.setMinSize(300, 300);
		
		scene2 = new Scene(pane,700,700);
		
		pane.setStyle("-fx-background-image: url('addddd.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		
		back.setOnAction(e->{
			window.setScene(scene);
			
		});
		
		
		adm.setOnAction(e-> {
			window.setScene(scene2);
			});
		
		
		
		
		
		
		
		//---------------PreAdmin-------------//
		
		admin preAd = new admin();
		
		GridPane gp5  = new GridPane();
		
		
		Label nameForPre = new Label("Enter your name");
		TextField nameForTF = new TextField();
		Label pass = new Label("Enter the password");
		PasswordField passTF = new PasswordField();
		
		Button bb = new Button("Show Password");
		Label show = new Label(" ");
		
		

		ArrayList<Object> g = new ArrayList<>();
		
		g.add(pass);
		g.add(show);
		g.add(nameForPre);
		
		
		for (Object name111 : g) {
			
			((Labeled) name111).setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
			
			}
		
		bb.setOnAction(e->{
			String pass11 = passTF.getText();
			show.setText(pass11);
			
			
		});
		
		
		
		
		
		
		HBox box1 = new HBox();
		box1.setPadding(new Insets(6,6,6,6));
		box1.setSpacing(10);
		box1.setStyle("-fx-background-color: #9dbfff;");

	    Button buttonNext = new Button("Next");
	    buttonNext.setPrefSize(100, 20);
	    box1.setAlignment(Pos.CENTER_RIGHT);
	    box1.getChildren().addAll(buttonNext);
	    
	    
	    HBox box2 = new HBox();
	    box2.setPadding(new Insets(6,6,6,6));
	    box2.setSpacing(10);
		box2.setStyle("-fx-background-color: #9dbfff;");

	    Button buttonBack = new Button("Back");
	    buttonBack.setPrefSize(100, 20);
	    box2.getChildren().addAll(buttonBack);
	    
	    buttonBack.setOnAction(e->{
			window.setScene(scene2);
			
		});
	    
	    BorderPane pane2 = new BorderPane();
	    pane2.setTop(box1);
	    pane2.setCenter(gp5);
	    pane2.setBottom(box2);
		
		
		gp5.setAlignment(Pos.CENTER);
		gp5.setHgap(90);
		gp5.setVgap(20);
		
		
	
		gp5.add(nameForPre, 0, 0);
		gp5.add(nameForTF, 1, 0);
		gp5.add(pass, 0, 1);
		gp5.add(passTF, 1, 1);
		gp5.add(show, 1, 2);
		gp5.add(bb, 0, 2);
		
		
		scene5 = new Scene(pane2,700,700);
		
		//-----------------------------//
		
		GridPane grid = new GridPane();
	    grid.setHgap(15);
	    grid.setVgap(15);
	    grid.setPadding(new Insets(15,15,15,15));

	    
	    
	    Label lastText = new Label("your tasks for today are:");
	    Label lastText1 = new Label("-- Fixing the serevr for the Doctor section where the ID is the same for all.");
	    Label lastText2 = new Label("-- Checking on the patient data that it's saved correctly.");
	    Label lastText3 = new Label("-- Fixing an error when the patient is paying money throught credit card.");
	    
	    ArrayList<Object> last = new ArrayList<>();
		
	    last.add(lastText);
	    last.add(lastText1);
		last.add(lastText2);
		last.add(lastText3);

		
		
		for (Object lastField : last) {
			
			((Labeled) lastField).setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
			
			}
	    
		grid.add(lastText, 0, 1);
		grid.add(lastText1, 0, 2);
		grid.add(lastText2, 0, 3);
		grid.add(lastText3, 0, 4);
	    
	    
	    
	    HBox hbox = new HBox();
	    hbox.setPadding(new Insets(6,6,6,6));
	    hbox.setSpacing(10);
	    hbox.setStyle("-fx-background-color: #336699;");

	    Button buttonBack2 = new Button("Back");
	    buttonBack2.setPrefSize(100, 20);
	    
	    buttonBack2.setOnAction(e->{
	    	window.setScene(scene5);
	    	
	    });

	    Button buttonDone = new Button("Done");
	    buttonDone.setPrefSize(100, 20);
	    hbox.getChildren().addAll(buttonBack2, buttonDone);
	    
	    BorderPane pane1 = new BorderPane();
	    pane1.setBottom(hbox);
	    pane1.setCenter(grid);
	    
	    buttonDone.setOnAction(e->{
	    	
	    	window.close();
	    });
		
	    scene7 = new Scene(pane1,700,700);
		
		

	    pane1.setStyle("-fx-background-image: url('0798adf9c191e928d86114726aaee261.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		
		
	    buttonNext.setOnAction(e->{
			
			String adPass = "hello";
			
			String newPass = passTF.getText();
			
			String lastName = nameForTF.getText();
			//set the name of the admin here
		    Text nameOfAd = new Text("Welcome "+lastName+",");
		    
		    nameOfAd.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		    
		    grid.add(nameOfAd, 0,0);
			
			
			if(newPass.equals(adPass)) {
				
				window.setScene(scene7);
			}
			
			
			
			
		});
		
		
		
		
		gp5.setStyle("-fx-background-image: url('preAD.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		
		//---------------NewAdmin-------------//
		
		GridPane gp6  = new GridPane();
		admin newAD = new admin();
		
		gp6.setAlignment(Pos.CENTER);
		gp6.setHgap(20);
		gp6.setVgap(20);
		scene6 = new Scene(gp6,700,700);
		
		
		
		done_AD.setOnAction(e->{
			String Name_new = name11.getText();
			newAD.setName(Name_new);
			Label nameITNew = new Label(newAD.getName());
			Label text_AD = new Label("Welcome "+nameITNew.getText()+" you are now registered");
			Label text_AD1 = new Label("to our system, you could now access our");
			Label text_AD2 = new Label("system using this password, press on show passowrd! ");
			
			
			
			gp6.add(text_AD, 0, 0);
			gp6.add(text_AD1, 0, 1);
			gp6.add(text_AD2, 0, 2);
			
			ArrayList<Object> g1 = new ArrayList<>();
			
			g1.add(text_AD);
			g1.add(text_AD1);
			g1.add(text_AD2);
			
			
			for (Object newADMIN_p : g1) {
				
				((Labeled) newADMIN_p).setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
				
				}
			
			window.setScene(scene6);
		});
		
		Button show_NEWP = new Button("Show Password");
		gp6.add(show_NEWP, 0, 3);
		
		show_NEWP.setOnAction(e->{
			
			Label pass_Text = new Label("hello");
			
			pass_Text.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 14)); 
			pass_Text.setStyle("-fx-text-fill: red");
			gp6.add(pass_Text, 1, 3);
			
		});
		
		
		
		gp6.setStyle("-fx-background-image: url('newAD1.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		
		//---------------Patient-------------//

		patient pp = new patient();
		
		GridPane gp3 = new GridPane();
		Label name2 = new Label("Name : ");
		Label problem = new Label("Problem : ");
		Label docPc = new Label("Pick a doctor for your problem : ");
		
		name2.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
		problem.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
		docPc.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
		
		TextField name22 = new TextField();
		
		CheckBox Heart = new CheckBox("Heart failure");
		CheckBox Heart2 = new CheckBox("Arrhythmia");
		CheckBox Heart3 = new CheckBox("Myocardial infarction");
		CheckBox Heart4 = new CheckBox("Dilated cardiomyopathy");
		
		ArrayList<Object> patientList = new ArrayList<>();
		
		patientList.add(Heart);
		patientList.add(Heart2);
		patientList.add(Heart3);
		patientList.add(Heart4);

		
		
		for (Object patient : patientList) {
			
			((Labeled) patient).setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14)); 
			
			}
		
		
		
		
		
		
		ComboBox<String>selectType = new ComboBox<String>();
		
		selectType.getItems().addAll("Ahmed Khalid","Samer Omar","Abdullah Saeed");
		
		Label date11 = new Label("Select the date : ");
		DatePicker datee =  new DatePicker();
		
		date11.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 14));
		
		
		Button Done = new Button("Done");
		
		Button back2 = new Button("back");
		
		
		gp3.setAlignment(Pos.CENTER);
		gp3.setHgap(5);
		gp3.setVgap(5);
		scene3 = new Scene(gp3,700,700);
		
		gp3.add(name2, 0, 0);
		
		gp3.add(problem, 0, 2);
		gp3.add(name22, 1, 0);
		
		gp3.add(Heart, 1, 2);
		gp3.add(Heart2, 2, 2);
		gp3.add(Heart3, 1, 3);
		gp3.add(Heart4, 2, 3);
		
		gp3.add(docPc, 0, 4);
		gp3.add(selectType, 1, 4);
		gp3.add(date11, 0, 5);
		gp3.add(datee, 1, 5);
		gp3.add(Done, 3, 6);
		gp3.add(back2, 0, 6);
		
		gp3.setStyle("-fx-background-image: url('pat.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		
		
		back2.setOnAction(e->{
			window.setScene(scene);
			
		});
		
		
		pat.setOnAction(e-> {
			window.setScene(scene3);
			});
		
		
		GridPane gp4 = new GridPane();
		
		Label welcome = new Label("Thanks for choosing us");
		Label info1 =new Label("Your appointment information is :");
		Label nameI = new Label("Name : ");
		Label probI = new Label("Problem : ");
		Label docI = new Label("Doctor : ");
		Label dateI = new Label("Date of appointment : ");
		
		
		
		Done.setOnAction(e-> {
		
			String nam = name22.getText();
			pp.setName(nam);
			Label nameIT = new Label(pp.getName());
			gp4.add(nameIT, 1, 2);
				
			
			Label probIT = new Label();
			if(Heart.isSelected()) {
				probIT.setText("Heart failure");
			}
			
			else if(Heart2.isSelected()) {
				probIT.setText("Arrhythmia");
			}
			
			else if(Heart3.isSelected()) {
				probIT.setText("Myocardial infarction");
			}
			
			else if(Heart4.isSelected()) {
				probIT.setText("Dilated cardiomyopathy");
			}
			
			gp4.add(probIT, 1, 3);
			window.setScene(scene4);
			
			
			});
		
		selectType.setOnAction(e->{
			String nameOfP = selectType.getValue();
			Label docIT = new Label(nameOfP);
			gp4.add(docIT, 1, 4);
			
		});
		
		
		datee.setOnAction(e->{
			String dateN = String.valueOf(datee.getValue());
			Label dateIT = new Label(dateN);
			gp4.add(dateIT, 1, 5);
			
		});
		
		
		
		
		
		gp4.setAlignment(Pos.CENTER);
		gp4.setHgap(5);
		gp4.setVgap(5);
		scene4 = new Scene(gp4,700,700);

		gp4.add(welcome, 0, 0);
		gp4.add(info1, 0, 1);
		gp4.add(nameI, 0, 2);
		
		gp4.add(probI, 0, 3);
		
		gp4.add(docI, 0, 4);
		gp4.add(dateI, 0, 5);
		
		
		gp4.setStyle("-fx-background-image: url('docccc.jpg');"
				+"-fx-background-repeat:no-repeat;"
		+"-fx-background-size:700 700");
		
		//--------------------------------------//
	
		//Designing the font size and theme
		doc.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12)); 
		adm.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12)); 
		pat.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12)); 

		
		//Setting the GridPane place and the gap between each button and TextField and Label
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);

		//Setting the scene width and height and GridPane to the scene and the title and at last we will show the scene 
		scene = new Scene(gp,700,700);
		myStage.setScene(scene);
		myStage.setTitle("Heart Hospital");
		myStage.show();
		
		
	}

	
	public static void main(String[]args) {
		launch(args);
	}


}