package testIgob;

import activity.editProfile.EditProfile;
import activity.login.LoginScreen;
import activity.main.MainScreen;
import activity.menu.MenuScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class appTest {
    LoginScreen loginScreen = new LoginScreen();
    MainScreen mainScreen = new MainScreen();
    MenuScreen menuScreen = new MenuScreen();
    EditProfile editProfile = new EditProfile();

    @Test
    public void verifyLogin(){
        String usuarioText ="6000101010";
        String pin = "6901";

        loginScreen.modalButton.click();
        loginScreen.usuarioTextBox.setText(usuarioText);
        loginScreen.passwordTextBox.setText(pin);
        loginScreen.ingresarButton.click();

        //menu
        //menuScreen.menuButton.click();
        //menuScreen.profileButton.click();

        //editarProfile
        //editProfile.paternoTextBox.setText("Apardo3");
        //editProfile.maternoTextBox.setText("Apardo1");
        //editProfile.celularTextBox.setText("77232323");
        //editProfile.expedidoTextBox.setText("BN");
        //editProfile.modificarProfileButton.click();
        //editProfile.aceptarProfileButton.click();
        //editProfile.aceptarPersonButton.click();
        //editProfile.atrasButton.click();

        //menu
        menuScreen.menuButton.click();
        menuScreen.changePinButton.click();

        //Cambiar Pin

    }

    @AfterEach
    public void close(){
        //driver.quit();
    }

}
