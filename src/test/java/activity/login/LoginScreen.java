package activity.login;

import appiumcontrol.Button;
import appiumcontrol.TextBox;
import org.openqa.selenium.By;

public class LoginScreen {
    public TextBox modalButton = new TextBox(By.xpath("//android.widget.Button[@text='CERRAR']"));
    public TextBox usuarioTextBox = new TextBox(By.xpath("//android.widget.EditText[@index='0']"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//android.widget.EditText[@password='true']"));
    public Button ingresarButton = new Button(By.xpath("//android.widget.Button[@text='INGRESAR']"));

    //public Button continuarButton = new Button(By.xpath("//android.widget.Button[@content-desc=\"Continuar\"]"));

}
