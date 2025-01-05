package com.example;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class DefineProjectedTransactionEdit {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDefineProjectedTransactionEdit() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("xpath=//form[@id='form1']/div[3]");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_M");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("xpath=//form[@id='form1']/div[3]/div");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink337']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Projection/ForecastTranDefMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_txtTransSetID");
		selenium.click("id=PC_MC_txtTranSetName");
		selenium.type("id=PC_MC_txtTranSetName", "Test3112");
		selenium.click("id=PC_MC_btnSearch");
		selenium.click("id=PC_MC_btnSearch");
		selenium.click("id=PC_MC_btnSearch");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
