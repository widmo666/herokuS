package org.example.resources;

import java.util.concurrent.TimeUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Path("/web")
public class Webservice {

	@GET
	@Path("/message")
	@Produces("text/plain")
	public String getMessage() {
		return "Hello";
	}

	@Test
	public void runTest() {
		String t1 = webserwiceRunTest();
		System.out.println("t1: " + t1);
	}

	@GET
	@Path("/test")
	@Produces("text/plain")
	public String webserwiceRunTest() {
		System.out.println("runTest()");

		WebDriver webDriver = new FirefoxDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.navigate().to("https://wp.pl/");

		String currentUrl = webDriver.getCurrentUrl();
		System.out.println("currentUrl: " + currentUrl);

		webDriver.close();
		webDriver.quit();
		return currentUrl;
	}

}
