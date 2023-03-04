package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {

    @BeforeEach
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","15c2c35a");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.gamlp.igob247");
        capabilities.setCapability("appActivity","com.gamlp.igob247.MainActivity");
        capabilities.setCapability("platformName","Android");

        //con AndroidDriver permite crear la ruta del Appium server con el que se va a conectar trabajamos con los datos que nos muestra el insoector"remote host,puerto,remote Path"
        AppiumDriver driver= null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        //implicit
        driver.manage().timeouts().implicitlyWait(15000L, TimeUnit.MICROSECONDS);
        return driver;
    }

}

