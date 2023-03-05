package activity.menu;

import appiumcontrol.Button;
import appiumcontrol.TextBox;
import org.openqa.selenium.By;

public class MenuScreen {

    public Button menuButton = new Button(By.xpath("//android.widget.Button[@text='menu']"));
    public Button profileButton = new Button(By.xpath("//android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Image"));



}
