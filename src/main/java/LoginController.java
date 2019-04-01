import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginController {


    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;

    String user = "braintrust";
    String pw = "jad1234";

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String uname = username.getText();
        String pword = password.getText();


        if(uname.equals(user) && pword.equals(pw)){

            loadMain();
            ((Node)(event.getSource())).getScene().getWindow().hide();

        }
        else{

        }
        username.setText("");
        password.setText("");
    }


    @FXML
    private void handleCancelButtonAction(ActionEvent event) {
        System.exit(0);
    }


    void loadMain () {
        try {

            Parent parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);

               stage.setTitle("Moose Prints");
                stage.setScene(new Scene(parent));
                stage.show();
        }
        catch (IOException ex) {
            ex.printStackTrace();

        }
    }

}



