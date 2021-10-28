package tests;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginFunctionality {

    private Capabilities caps;
    AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1/wd/hub"),caps);

    public LoginFunctionality() throws MalformedURLException {
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        LoginFunctionality check_login = new LoginFunctionality();
        check_login.setUp();
        //check_login.LogIn();
        //check_login.tearDown();


    }


    public void setUp() throws InterruptedException, MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability("platformName", "android");
        caps.setCapability("appPackage", "de.sevenmind.android");
        caps.setCapability("appActivity", ".MainActivity");
        //MobileElement el1 = (MobileElement) ad.findElementById("de.sevenmind.android:id/actionButton");
        //el1.click();
        caps.getCapability("appPackage");

       // ad.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


    }

    public void LogIn(){




    }

    public void tearDown(){

        ad.quit();
    }





}
