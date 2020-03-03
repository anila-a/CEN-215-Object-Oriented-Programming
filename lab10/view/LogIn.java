package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Admin;
import model.Person;
import model.User;
import model.RW.RWUser;

public class LogIn extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage st) throws Exception {
		//Imazhi
		Image img=new Image("img/play.png");
		ImageView iv=new ImageView(img);
		iv.setFitWidth(200);
		iv.setFitHeight(150);
		//Zona e GridPane
		GridPane gp=new GridPane();
		Label user=new Label("Username");
		Label pass=new Label("Password");
		TextField usertf=new TextField();
		TextField passtf=new TextField();
		gp.add(user, 0, 0);
		gp.add(pass, 0, 1);
		gp.add(usertf, 1, 0);
		gp.add(passtf, 1, 1);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setAlignment(Pos.CENTER);
		//Zona e butonave
		HBox hb=new HBox();
		Button ok=new Button("OK");
		Button cancel=new Button("Cancel");
		//Veprimet e butonave
		cancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent ev) {
				System.exit(0);
			}
		});
		ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				RWUser rwu=new RWUser();
				String user=usertf.getText();
				String pass=passtf.getText();
				User usr=rwu.checkLogin(user, pass);
				if(usr instanceof Admin) {
					//Faqja e Adminit
					(new ViewAdmin()).view(st);
				} else if(usr instanceof Person) {
					//Faqja e Personit
					(new PersonView()).view(st,usr);
				} else {
					Alert al=new Alert(AlertType.WARNING, "Username and Password is incorrect", ButtonType.OK);
					al.show();
				}
				
			}
		});
		
		hb.getChildren().addAll(ok,cancel);
		hb.setAlignment(Pos.CENTER);
		hb.setPadding(new Insets(10,10,10,10));
		Pane pane=new StackPane();
		VBox vb=new VBox();
		vb.getChildren().addAll(iv,gp,hb);
		vb.setAlignment(Pos.CENTER);
		vb.setPadding(new Insets(10,10,10,10));
		pane.getChildren().add(vb);

		Scene sc=new Scene(pane,350,300);
		st.setScene(sc);
		st.setTitle("Dritarja jone");
		st.show();	
	}

}
