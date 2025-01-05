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

public class DefineUploadCalendarEventDownload {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDefineUploadCalendarEventDownload() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/se.aspx?ReturnUrl=%2fBASELTEST_PL%2fBASEL%2fCustom%2fMCParam%2fCalendarEventMakerSmry.aspx%3fid%3dM&id=M");
		selenium.click("id=MC_myLink");
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
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink308']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/CalendarEventMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_ddlCalendarID");
		selenium.select("id=PC_MC_ddlCalendarID", "label=Holiday test");
		selenium.click("id=PC_MC_btnSearch");
		selenium.click("id=PC_MC_GV_RecordList_btnDownload_0");
		selenium.selectFrame("index=4");
		selenium.click("id=PC_MC_ddlSelectYear");
		selenium.select("id=PC_MC_ddlSelectYear", "label=All Data");
		selenium.click("id=PC_MC_BtnDownload");
		selenium.selectWindow("win_ser_local");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/CalendarEventMakerSmry.aspx?id=M");
		selenium.selectFrame("index=4");
		selenium.click("xpath=//*/text()[normalize-space(.)='']/parent::*");
		selenium.selectFrame("relative=parent");
		selenium.click("id=modalPopLite-mask1");
		selenium.click("xpath=//form[@id='form1']/div[5]/div[2]/div[6]");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
