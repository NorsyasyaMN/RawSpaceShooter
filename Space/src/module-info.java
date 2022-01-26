module Space {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires rs2xml;
	
	opens application to javafx.graphics, javafx.fxml;
}
