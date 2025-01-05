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

public class DefineProjectedTransactionAdd {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDefineProjectedTransactionAdd() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
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
		selenium.click("id=PC_MC_btnAdd");
		selenium.click("id=PC_MC_txtNewTranSetName");
		selenium.type("id=PC_MC_txtNewTranSetName", "Test3112");
		selenium.click("id=PC_MC_btn_Save");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Projection/ForecastTranInfo.aspx");
		selenium.click("id=PC_MC_TCMain_TPInflowData_lnkButtonAdd");
		selenium.click("id=PC_MC_TCMain_TPInflowData_IFGV_txtIFGVDesc_0");
		selenium.type("id=PC_MC_TCMain_TPInflowData_IFGV_txtIFGVDesc_0", "0");
		selenium.click("id=PC_MC_TCMain_TPInflowData_lnkButtonAdd");
		selenium.click("id=PC_MC_TCMain_TPInflowData_IFGV_ddlIFGVCurrency_0");
		selenium.select("id=PC_MC_TCMain_TPInflowData_IFGV_ddlIFGVCurrency_0", "label=INR");
		selenium.click("id=PC_MC_btnSave");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_C");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink336']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Projection/ForecastTranDefCheckerSmry.aspx");
		selenium.click("id=PC_MC_GV_RecordList_RowSelector_0");
		selenium.click("id=PC_MC_btnApprove");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
