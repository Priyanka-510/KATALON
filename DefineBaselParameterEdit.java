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

public class DefineBaselParameterEdit {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDefineBaselParameterEdit() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_M");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("xpath=//form[@id='form1']/div[3]/div/div/div[3]/div");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink333']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/BaselParameter/Axis_tblBASELParametersMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_ddlCountryID");
		selenium.select("id=PC_MC_ddlCountryID", "label=GIFTCITY");
		selenium.click("id=PC_MC_btnSearch");
		selenium.click("id=PC_MC_GV_RecordList_btnEdit_0");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/BaselParameter/Axis_tblBASELParametersMakerInfo.aspx");
		selenium.click("id=ddlESCROWCA");
		selenium.select("id=ddlESCROWCA", "label=BIU");
		selenium.click("id=PC_MC_AddEditUC_btn_Save");
		selenium.click("xpath=//div[@id='dvAccount']/span/div");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/BaselParameter/Axis_tblBASELParametersMakerSmry.aspx?id=M");
		selenium.open("http://localhost/BASELTEST_PL/Account/se.aspx");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_C");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("xpath=//form[@id='form1']/div[3]/div/div/div[3]/div");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("xpath=//*/text()[normalize-space(.)='']/parent::*");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink332']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/BaselParameter/Axis_tblBASELParametersCheckerSmry.aspx");
		selenium.click("xpath=//table[@id='PC_MC_GV_RecordList']/tbody/tr/th");
		selenium.click("id=PC_MC_GV_RecordList_chkboxSelectAllMC");
		selenium.click("id=PC_MC_btnApprove");
		selenium.click("xpath=//div[@id='dvAccount']/span/div");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
