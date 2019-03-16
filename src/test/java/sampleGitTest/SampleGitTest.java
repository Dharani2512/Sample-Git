package sampleGitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleGitTest {
	@Test
	public void loginTest() throws IOException{
	WebDriver wd=new FirefoxDriver();
	wd.get("https://www.google.com/");
	File f= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\Hi\\Desktop\\Eclipse Neon Workspace\\SampleGit\\src\\test\\resources\\Screenshot"));
	}

}
