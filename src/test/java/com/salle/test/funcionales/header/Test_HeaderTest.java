package com.salle.test.funcionales.header;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.salle.Steps.Steps_header;
import com.salle.pantallas.Pantalla_Home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Test_HeaderTest {
	public Properties p = new Properties();
	public WebDriver driver = new ChromeDriver();
	public Pantalla_Home ph = new Pantalla_Home(driver);
	private Steps_header sh = new Steps_header(driver);
	
	//builds a new report using the html template 
    ExtentHtmlReporter htmlReporter;
    
    ExtentReports extent;
    //helps to generate the logs in test report.
    ExtentTest test;
    
	@BeforeTest
    public void startReport() {
		
    	// initialize the HtmlReporter
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        //configuration items to change the look and feel
        //add content, manage tests etc
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }
	
	  @BeforeClass
	  public void beforeClass() {
		  ph.getSalleUrl(driver);
	  }
	
	  @AfterClass(alwaysRun = true)
	  public void afterClass() {
		  driver.quit();
	  }
	  
	  @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	    }
	     
	    @AfterTest
	    public void tearDown() {
	    	//to write or update test information to reporter
	        extent.flush();
	    }
	  
	  @Test
	  public void Header_Accesos() {
		  test = extent.createTest("Test HEADER", "Test del header");
		  sh.Step1_Entra_Nuevos_Alumnos(driver);
		  sh.Step2_Entra_Alumnos(driver);
		  sh.Step3_Entra_Alumni(driver);
		  sh.Step4_Entra_Empresas(driver);
		  sh.Step5_Entra_Universidades(driver);
		  sh.Step6_Entra_Escuelas(driver);
		  sh.Step7_Entra_Prensa(driver);

	  }

}
