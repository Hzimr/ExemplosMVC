package com.mvc.visao;

import com.mvc.controlador.DataControlador;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class TelaData extends Application {
	
	@Override
	public void start(Stage stage) {
		stage.setTitle("Informa data certa");
		
		Button btn = new Button();
		btn.setText("Pressione aqui para saber a data certa");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				DataControlador dataControlador = new DataControlador();
				System.out.println("A data atual é: " + dataControlador.getDataCerta());
			
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().addAll(btn);
		stage.setScene(new Scene(root, 300, 250));
		stage.show();
	}
	
	public static void main(String[] args ) {
		launch(args);
	}
	
}
