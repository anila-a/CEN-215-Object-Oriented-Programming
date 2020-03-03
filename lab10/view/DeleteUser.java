package view;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Person;
import model.User;
import model.RW.RWUser;

public class DeleteUser {

	public void view1(Stage st, int iD) {
		RWUser rwu=new RWUser();
		Object[] lista=rwu.getUsers().toArray();
		Text[] arr=new Text[lista.length];
		VBox vb1=new VBox();
		for(int i=0; i<lista.length; i++) {
			if(lista[i] instanceof Person) {
				if(((User) lista[i]).getId()==iD) {
					
				System.out.println(lista[i].toString());
				arr[i]=new Text("ID: "+((User) lista[i]).getId()+" -> "+lista[i].toString());
				vb1.getChildren().add(arr[i]);
			}}
		}
		
		for(int i=0; i<lista.length; i++) {
			if(lista[i] instanceof Person) {
				if(((User) lista[i]).getId()==iD) {
		rwu.delete((Person)lista[i]);}}}
		rwu.update();
		
		Alert al=new Alert(AlertType.WARNING, "User deleted", ButtonType.OK);
		al.show();
	}
}