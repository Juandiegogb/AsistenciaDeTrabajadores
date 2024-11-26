package com.asistencia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

  @Override
  public void start(Stage stage) {
    Label label = new Label("Hello, JavaFX");
    Scene scene = new Scene(new StackPane(label), 640, 480);
    stage.setScene(scene);
    stage.setTitle("JavaFX Application");
    stage.show();
  }

  public static void launchApp(String[] args) {
    launch(args);
  }
}
