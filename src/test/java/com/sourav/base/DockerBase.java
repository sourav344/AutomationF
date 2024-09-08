package com.sourav.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerBase {

    public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
        // URL for the Selenium Grid hub
        URL gridUrl = new URL("http://43.205.16.75:4444/wd/hub");
        
        if(browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true); // This bypasses SSL validation
            return new RemoteWebDriver(gridUrl, options);
        } else if(browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.setAcceptInsecureCerts(true); // This bypasses SSL validation
            return new RemoteWebDriver(gridUrl, options);
        } else if(browserName.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.setAcceptInsecureCerts(true); // This bypasses SSL validation
            return new RemoteWebDriver(gridUrl, options);
        }
        throw new IllegalArgumentException("Browser name not supported");
    }
}
