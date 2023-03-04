package testIgob;

import activity.carnet.CarnetScreen;
import activity.login.LoginScreen;
import activity.main.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class appTest {

    LoginScreen loginScreen = new LoginScreen();
    MainScreen mainScreen = new MainScreen();
    CarnetScreen carnetScreen = new CarnetScreen();

    @Test
    public void verifyLogin(){
        String usuarioText ="6000101010";
        String pin = "6901";

        loginScreen.modalButton.click();
        loginScreen.usuarioTextBox.setText(usuarioText);
        loginScreen.passwordTextBox.setText("9313");
        loginScreen.ingresarButton.click();

    }

    @AfterEach
    public void close(){
        //driver.quit();
    }

}
