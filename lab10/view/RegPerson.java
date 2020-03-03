package view;

import java.text.SimpleDateFormat;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.MyDate;
import model.Person;
import model.User;
import model.RW.RWUser;

public class RegPerson {
public void view (Stage st) {
	Pane pane=new StackPane();
	GridPane gp=new GridPane();
	Label user=new Label("Username");
	Label pass=new Label("Password");
	Label name=new Label("Name");
	Label bd=new Label("Birthday");
	Label ad=new Label("Address");
	TextField usertf=new TextField();
	TextField passtf=new TextField();
	TextField nametf=new TextField();
	TextField bdtf=new TextField();
	TextField adtf=new TextField();
	
	gp.add(user, 0, 0);
	gp.add(pass, 0, 1);
	gp.add(usertf, 1, 0);
	gp.add(passtf, 1, 1);
	gp.add(name, 0, 2);
	gp.add(bd, 0, 3);
	gp.add(ad, 0, 4);
	gp.add(nametf, 1, 2);
	gp.add(bdtf, 1, 3);
	gp.add(adtf, 1, 4);
	gp.setHgap(10);
	gp.setVgap(10);
	gp.setAlignment(Pos.CENTER);
	
	HBox hb=new HBox();
	Button ok=new Button("OK");
	Button cancel=new Button("Cancel");
	//Veprimet e butonave
	cancel.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent arg0) {
			try {
				(new LogIn()).start(st);
			} catch (Exception e) {
				System.err.println("Logini nuk funksionon!!!");
			}
		}
	});
	
	//ok set on action
	ok.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent arg0) {
			RWUser rwu=new RWUser();
			String user=usertf.getText();
			String pass=passtf.getText();
			String name=nametf.getText();
		    String bd=bdtf.getText();
			String ad=adtf.getText();
			//MyDate b=bd;
		
			//Integer.parseInt(bd);
			//String bd=toString(MyDate(bdtf.getText()));
			rwu.getUsers().add(new Person(user,pass,name,ad,new MyDate(bd)));
			rwu.update();
			
			Alert al=new Alert(AlertType.WARNING, "User added", ButtonType.OK);
			al.show();
		}
	});
	
	hb.getChildren().addAll(ok,cancel);
	hb.setAlignment(Pos.CENTER);
	hb.setPadding(new Insets(10,10,10,10));
	
	VBox vb=new VBox();
	vb.getChildren().addAll(gp,hb);
	vb.setAlignment(Pos.CENTER);
	vb.setPadding(new Insets(10,10,10,10));
	pane.getChildren().add(vb);
	
	Scene sc=new Scene(pane,350,300);
	st.setScene(sc);
	st.setTitle("Dritarja jone");
	st.show();	
	}
}

