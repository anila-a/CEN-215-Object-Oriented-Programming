package model.RW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.Admin;
import model.Checker;
import model.Person;
import model.User;

public class RWUser {
	private ArrayList<User> users;
	private static final String file="users.bin";
	private File fi;
	public RWUser() {
		users=new ArrayList<>();
		fi=new File(file);
		if(fi.exists()) {
			readUsers();
			setNr();
		} else {
			createFile();
		}
	}
	private void setNr() {
		int max=0;
		for(User i:users) if(max<i.getId()) max=i.getId();
		User.setNr(max+1);
	}
	private void createFile() {
		System.out.println("First usage -> Please register Admin Data");
		Scanner in = new Scanner(System.in);
		System.out.print("Username: ");	String user=in.next();
		System.out.print("Password: ");	String pass=in.next();
		System.out.print("Name: ");	String name=in.next();
		System.out.print("Organization: ");	String org=in.next();
		users.add(new Admin(user,pass,name,org));
		writeUsers();
	}
	private void writeUsers() {
		try {
			FileOutputStream fos=new FileOutputStream(fi);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.close();fos.close();
		} catch (FileNotFoundException e) {
			System.err.println("File cannot be written!!!");
		} catch (IOException e) {
			System.err.println("Problem with writing object");
		}
	}
	private void readUsers() {
		try {
			FileInputStream fis=new FileInputStream(fi);
			ObjectInputStream ois=new ObjectInputStream(fis);
			users=(ArrayList<User>)ois.readObject();
			ois.close();fis.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found!!!");
		} catch (IOException e) {
			System.err.println("File is corrupted");
		} catch (ClassNotFoundException e) {
			System.err.println("Class does not match");
		}
		
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public void add(User x) {
		users.add(x);
		writeUsers();
	}
	public void delete(User x) {
		users.remove(x);
		writeUsers();
	}
	public Person getPersonById(int id) {
		for(User i:users)
			if(i.getId()==id) return (Person) i;
		return null;
	}
	public User checkLogin(String user,String pass) {
		for(User i:users)
			if( ((Checker) i).checkUser(user, pass))
				return i;
		return null;
	}
	public void update() {
		writeUsers();
	}
	
}
