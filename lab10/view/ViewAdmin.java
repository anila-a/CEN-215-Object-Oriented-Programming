package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import model.Person;
import model.User;
import model.RW.RWUser;

public class ViewAdmin {

	public void view(Stage st) {
		Pane pane=new StackPane();
		
		RWUser rwu=new RWUser();
		Object[] lista=rwu.getUsers().toArray();
		Text[] arr=new Text[lista.length];
		VBox vb=new VBox();
		for(int i=0; i<lista.length; i++) {
			if(lista[i] instanceof Person) {
				System.out.println(lista[i].toString());
				arr[i]=new Text("ID: "+((User) lista[i]).getId()+" -> "+lista[i].toString());
				vb.getChildren().add(arr[i]);
			}
		}
		Button add=new Button("Add User");
		Button edit=new Button("Edit User By Id");
		Button dele=new Button("Delete By Id");
		Button dil=new Button("Log Out");

		add.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent arg0) {
			try{
				(new RegPerson()).view(st);
			}catch (Exception e) {
				System.err.println("Logini nuk funksionon!!");
			}
		}
		});
		
		edit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				(new EditPerson()).view1(st);
			}});
		
		dele.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				(new DeletePerson()).view2(st);
			}});
	
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
		
		vb.getChildren().add(add);
		vb.getChildren().add(edit);
		vb.getChildren().add(dele);
		vb.getChildren().add(dil);
		//Veprimet e Butonave
		vb.setSpacing(10);
		vb.setAlignment(Pos.CENTER);
		
		pane.getChildren().add(vb);
		Scene sc=new Scene(pane,400,300);
		st.setScene(sc);
		st.setTitle("Admin View");
		st.show();
	}
}