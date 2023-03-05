package activity.editProfile;

import appiumcontrol.Button;
import appiumcontrol.TextBox;
import org.openqa.selenium.By;

public class EditProfile {
    public TextBox paternoTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Apaza']"));
    public TextBox maternoTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Pardo']"));
    public TextBox celularTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='71569845, Celular:']"));
    public TextBox expedidoTextBox = new TextBox(By.xpath("//android.widget.TextView[@resource-id='lbl-52']"));
    public Button modificarProfileButton = new Button(By.xpath("//android.widget.Button[@text='MODIFICAR PERFIL person']"));

    public Button aceptarProfileButton = new Button(By.xpath("//android.widget.Button[@text='ACEPTAR']"));
    public Button aceptarPersonButton = new Button(By.xpath("//android.widget.Button[@text='ACEPTAR']"));
    public Button atrasButton = new Button(By.xpath("//android.widget.Button[@text='arrow back']"));



}
