package task;

import activity.login.LoginScreen;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Login {
    //private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    LoginScreen loginScreen = new LoginScreen();

    public void withTheData(String usuario, String clave) throws InterruptedException {


        loginScreen.modalButton.click();
    }
}
