package com.webOrders.resources;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

	import org.testng.ITestContext;
	import org.testng.ITestResult;
	import org.testng.TestListenerAdapter;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtentReportListeners extends TestListenerAdapter {
		ExtentSparkReporter htmlreport;
		  ExtentReports extent;
		  ExtentTest testreport;
		 
		
		  public void onStart(ITestContext testcontext) {
				// onStart: This method invokes when the test class is instantiated and before executing any test method.
				htmlreport = new ExtentSparkReporter("C:/Users/Bala koti/eclipse-workspace/WebOrders/extentReport/extent.html");
				extent = new ExtentReports();
				extent.attachReporter(htmlreport);
				htmlreport.config().setDocumentTitle("EPOS Automation");
				System.out.println(("test started"));
			}
	
		public void onTestSuccess(ITestResult tr) {
			//onTestSuccess: This method is invoked every time a test case passes (succeeds).
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
			
			System.out.println("test success");
		}


		public void onTestFailure(ITestResult tr) {
			// onTestFailure: This method invokes every time a test case fails.
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
			 }
			
		public void onTestSkipped(ITestResult tr) {
			// onTestSkipped: This method invokes every time a test skips.
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.BLUE));
			//testreport.log(Status.SKIP, MarkupHelper.createTable(data));
			System.out.println("test skipped");
		}

		
		
		public void onFinish(ITestContext testContext) {
			// onFinish: This method invokes when all the test methods have run, and calling of all of their configuration methods happens.
		  extent.flush();
			super.onFinish(testContext);
		}



	}


