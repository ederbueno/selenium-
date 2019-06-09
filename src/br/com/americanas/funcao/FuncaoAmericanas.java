package br.com.americanas.funcao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FuncaoAmericanas {

	private static WebDriver driver = null;
	private static WebElement elemento;

	public static void abrirBrowser(String url) {		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\lib\\chromedriver.exe");    	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);	
		driver.get(url);
	}

	public static void fecharBrowser() {

		driver.quit();

	}

}
