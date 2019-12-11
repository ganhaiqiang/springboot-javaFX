package org.demo;

import org.demo.view.ApplicationView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;

@SpringBootApplication
public class Application extends AbstractJavaFxApplicationSupport {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		LOGGER.info("springboot-javaFX整合。。。");
		launch(Application.class, ApplicationView.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		super.start(stage);
	}

}
