import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyWindow extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage st) throws Exception {
		 Pane pane = new StackPane();
		 Image img = new Image("image/img.jpg");
		 ImageView iv = new ImageView(img);
		 iv.setFitWidth(128);
		 iv.setFitHeight(128);
		 
		 Label name = new Label("Name: ");
		 Label pass = new Label("Password: ");
		 Label gd = new Label("Gender: ");
		 Label chk = new Label("Check Options: ");
		 
		 TextField nm = new TextField();
		 PasswordField ps = new PasswordField();
		 nm.setTooltip(new Tooltip("Enter name:"));
		 
		 HBox hb1 = new HBox();
		 RadioButton m = new RadioButton("M");
		 RadioButton f = new RadioButton("F");
		 hb1.getChildren().addAll(m,f);
		 hb1.setSpacing(10);
		 
		 ToggleGroup tg = new ToggleGroup();
		 m.setToggleGroup(tg);
		 f.setToggleGroup(tg);
		
		 HBox hb2 = new HBox(); 
		 CheckBox o1 = new CheckBox("1    ");
		 CheckBox o2 = new CheckBox("2    ");
		 CheckBox o3 = new CheckBox("3    ");
		 hb2.getChildren().addAll(o1,o2,o3);
		 
		 GridPane gp = new GridPane();
		 gp.add(name, 0, 0); gp.add(nm, 1, 0);
		 gp.add(pass, 0, 1); gp.add(ps, 1, 1);
		 gp.add(gd, 0, 2);gp.add(hb1, 1, 2);
		 gp.add(chk, 0, 3);gp.add(hb2, 1, 3);
		 
		 gp.setPadding(new Insets(20, 10, 10, 10));
		 gp.setAlignment(Pos.CENTER);

		 Button ok = new Button("OK");
		 Button cancel = new Button("Cancel");
		 HBox hb3 = new HBox();
		 hb3.getChildren().addAll(ok ,cancel);
		 hb3.setAlignment(Pos.CENTER);
		 hb3.setSpacing(10);
		
		 gp.setHgap(10);
		 gp.setVgap(10);
		 
		 VBox vb = new VBox();
		 vb.getChildren().addAll(iv,gp,hb3);
		 vb.setAlignment(Pos.CENTER);
		 pane.getChildren().add(vb);
		 
		 Scene sc = new Scene(pane, 400, 400);
		 st.setScene(sc);
		 st.setTitle("My Window");
		 st.show();
	}

}
