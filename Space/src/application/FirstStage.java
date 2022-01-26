package application;
//Jangan tukar semua variable letak comment je yee terima kasih
import java.sql.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.proteanit.sql.DbUtils;

import java.net.URL;
import java.util.ResourceBundle;


//import java.io.IOException;

import javafx.event.ActionEvent;

public class FirstStage implements Initializable{


    @FXML
    private ScrollPane scoreBoard;
    
    @FXML
    private TextField Player_Name;
	
	@FXML
    private Button closedButton;
	
    @FXML
    private Button Button_Play;
    
    //JGN TUKAR
    @FXML
    void ButtonPlay(ActionEvent event) throws Exception{
    	String name = Player_Name.getText();
    	//name PUNYA VARIABLE JGN TUKAR
    	new SecondStage(name);	
    }


    @FXML
    void ButtonExit(ActionEvent event) {
        
        Stage stage = (Stage) closedButton.getScene().getWindow();
        stage.close();
    }
    
    
    @FXML
    void previewScore(ActionEvent event){
    	
    	Connection con;
    	PreparedStatement pst;
    	ResultSet rs;
    	
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/studentscore", "root", "");
    		pst = con.prepareStatement("select * from stdhighscore");
    		rs = pst.executeQuery();
    		scoreBoard.setModel(DbUtils.resultSetToTableModel(rs));
    	}catch (SQLException e) {};
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Button_Play.disableProperty().bind(Player_Name.textProperty().isEmpty());
		
	}
}


