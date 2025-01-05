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

public class ManageApplicationConfiguration {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testManageApplicationConfiguration() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_M");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("xpath=//form[@id='form1']/div[3]/div/div");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink301']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/AppConfigMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_btnYes");
		selenium.click("id=PC_MC_btnSearch");
		selenium.click("id=PC_MC_txtConfigKey");
		selenium.type("id=PC_MC_txtConfigKey", "HOLIDAYCAL");
		selenium.click("id=PC_MC_btnSearch");
		selenium.click("id=PC_MC_GV_RecordList_btnVersion_0");
		selenium.click("id=PC_MC_btnClose");
		selenium.click("id=PC_MC_GV_RecordList_btnEdit_0");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/AppConfigInfo.aspx");
		selenium.click("id=PC_MC_btn_Back");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/AppConfigMakerSmry.aspx");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Projection/ForecastTranDefMakerSmry.aspx?id=M");
		selenium.open("http://localhost/BASELTEST_PL/Account/se.aspx");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
