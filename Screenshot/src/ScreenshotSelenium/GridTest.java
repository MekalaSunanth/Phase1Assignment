package ScreenshotSelenium;
import org.openqa.selenium.Platform;

import org.openqa.selenium.remote.DesiredCapabilities;

public class GridTest {

public static void main(String[] args) {

DesiredCapabilities cap = new DesiredCapabilities(); 
cap.setBrowserName ("chrome");

cap.setPlatform(Platform.WIN10);}
}

