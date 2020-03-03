package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Person;
import model.User;
import model.RW.RWUser;

public class PersonView {

	public void view(Stage st, User usr) {
		Pane pane=new StackPane();
		Text t1=new Text("ID: "+usr.getId());
		Text t2=new Text("Name: "+((Person)usr).getName());
		Text t3=new Text("BirthDay: "+((Person)usr).getBd());
		Text t4=new Text("Address: "+((Person)usr).getAddress());
		Text t5=new Text("New Password: ");
		TextField tf=new TextField();
		Button ch=new Button("Change");
		ch.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				RWUser rwu=new RWUser();
				rwu.getUsers().remove(usr);
				usr.setPass(tf.getText());
				rwu.getUsers().add(usr);
				rwu.update();
				Alert al=new Alert(AlertType.INFORMATION,"Password Changed",ButtonType.OK);
				al.show();
			}
		});
		HBox hb=new HBox();
		hb.getChildren().addAll(t5,tf);
		hb.setSpacing(10);
		hb.setAlignment(Pos.CENTER);
			
		Button dil=new Button("Log Out");
		dil.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				try {
					(new LogIn()).start(st);
				} catch (Exception e) {
					System.err.println("Logini nuk funksionon!!!");
				}
			}
		});
		
		VBox vb=new VBox();
		vb.getChildren().addAll(t1,t2,t3,t4,hb,ch,dil);
		vb.setSpacing(20);
		vb.setAlignment(Pos.CENTER);
		pane.getChildren().add(vb);
		Scene sc=new Scene(pane,200,300);
		st.setScene(sc);
		st.setTitle("Person View");
		st.show();
		
	}

}
