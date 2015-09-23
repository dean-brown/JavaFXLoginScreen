/*
 * Dean Brown - 23/09/2015
 * Simple JavaFX login screen with some basic styling
 * Application currently just displays your username to the screen
 * This could be developed to authenticate users if connected to a database or web service
 * 
 * 
 */

package com.testing.javafxlogin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginFx extends Application{
	String sUsername = "Username:";
	String sPassword = "Password";
	String sButtonLogin = "Login";
	String sButtonRegister = "Register";
	Label lblUsername;
	Label lblPassword;
	Label lblNotification;
	TextField taUsername;
	PasswordField taPassword;
	Button btnLogin;
	Button btnRegister;
	
	
	public static void main(String[] args) {
		launch(args);
	}
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		lblUsername = new Label(sUsername);
		lblPassword = new Label(sPassword);
		taUsername = new TextField();
		taPassword = new PasswordField();
		lblNotification = new Label("");
		btnLogin = new Button(sButtonLogin);
		btnRegister = new Button(sButtonRegister);
		
		// Handle click events for the Login Button
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				lblNotification.setText("Logging in as " + taUsername.getText() + " . . . ");
			}
		});
		
		// Create a new VBox and add the labels and buttons
		VBox root = new VBox();
		root.getChildren().addAll(lblUsername, taUsername, lblPassword, taPassword, btnLogin, lblNotification);
		
		// Create a new scene and set the stage
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login System");
		
		scene.getStylesheets().add("theme.css");
		// Display the stage
		primaryStage.show();
		
	}

}
