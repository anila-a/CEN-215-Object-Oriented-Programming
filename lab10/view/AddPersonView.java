package view;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddPersonView {
	private TextField username = new TextField();
	private TextField password = new TextField();
	private TextField name = new TextField();
	private TextField address = new TextField();
	private TextField bday = new TextField();
	private Button ok = new Button("Ok");
	private Button cancel = new Button("Cancel");

	public void view(Stage st) {
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Username"), 0, 0);
		gridPane.add(username, 1, 0);
		gridPane.add(new Label("Password"), 0, 1);
		gridPane.add(password, 1, 1);
		gridPane.add(new Label("Name"), 0, 2);
		gridPane.add(name, 1, 2);
		gridPane.add(new Label("Address"), 0, 3);
		gridPane.add(address, 1, 3);
		gridPane.add(new Label("Birthday"), 0, 4);
		gridPane.add(bday, 1, 4);
		gridPane.add(ok, 0, 5);
		gridPane.add(cancel, 1, 5);
		
		gridPane.setAlignment(Pos.CENTER);
		username.setAlignment(Pos.BOTTOM_RIGHT);
		password.setAlignment(Pos.BOTTOM_RIGHT);
		name.setAlignment(Pos.BOTTOM_RIGHT);
		address.setAlignment(Pos.BOTTOM_RIGHT);
		bday.setAlignment(Pos.BOTTOM_RIGHT);
		GridPane.setHalignment(ok, HPos.LEFT);
		GridPane.setHalignment(cancel, HPos.RIGHT);
		
		// Process events
		//ok.setOnAction(e -> );
		//cancel.setOnAction(e -> );
		

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		st.setTitle("Add Person"); // Set title
		st.setScene(scene); // Place the scene in the stage
		st.show(); // Display the stage
	}
	
}
