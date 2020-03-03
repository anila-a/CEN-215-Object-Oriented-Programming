package view;

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
import model.Person;
import model.User;
import model.RW.RWUser;

public class DeletePerson {

	public void view2(Stage st) {
		Pane pane=new StackPane();
		GridPane gp=new GridPane();
		
		Label id=new Label("Enter the ID");
		TextField idtf=new TextField();
		gp.add(id, 0, 0);
		gp.add(idtf, 1, 0);
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
		
		ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				int ID=Integer.parseInt(idtf.getText());
				(new DeleteUser()).view1(st,ID);
			}});
	
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

