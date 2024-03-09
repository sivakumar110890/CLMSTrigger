package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExceptionTestContextImpl;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.SessionStatusStats;
import com.aventstack.extentreports.SystemAttributeContext;
import com.aventstack.extentreports.TestAttributeTestContextProvider;
import com.aventstack.extentreports.model.Author;
import com.aventstack.extentreports.model.Category;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.model.Screencast;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonFunctions {
	public static Properties prop;
	public static WebDriver driver;
	ExtentReports extentreports;
	ExtentHtmlReporter htmlreporter;
	ExtentTest Exttestcase;


	public static Properties LoadPropertyfile() throws IOException {
		FileInputStream fileinput = new FileInputStream(System.getProperty("user.dir")+"//config//config.properties");
		prop = new Properties();
		prop.load(fileinput);
		return prop;


	}

	@BeforeSuite
	public void LaunchBrowser() throws IOException {
		LoadPropertyfile();
		PropertyConfigurator.configure(prop.getProperty("log4jpath")); 
		extentreports=new ExtentReports();
		htmlreporter=new ExtentHtmlReporter("ExtentReport.html");
		extentreports.attachReporter(htmlreporter);
		Exttestcase=extentreports.createTest("Launch Browser");
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");

		if(browser.equalsIgnoreCase("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chrome_latest\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt);
		}

		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Selenium\\drivers\\edge\\msedgedriver.exe");
			//WebDriverManager.firefoxdriver().setup();
			driver= new EdgeDriver();

		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			//WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to(prop.getProperty("url"));

	}

	@AfterSuite
	public void CloseBrowser() {
		//driver.quit();

	}

}
