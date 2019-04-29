//package com.integra.ExtentReportListener;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ExtentTestNGITestListener implements ITestListener {
//	
//	 private static ExtentReports extent = ExtentManager.createInstance("extent.html");
//	    private static ThreadLocal test = new ThreadLocal();
//	 
//	    public synchronized void onStart(ITestContext context) {
//	        System.out.println("Extent Reports Version 3 Test Suite started!");
//	    }
//	 
//	    public synchronized void onFinish(ITestContext context) {
//	        System.out.println(("Extent Reports Version 3  Test Suite is ending!"));
//	        extent.flush();
//	    }
//	 
//	    
//	    public synchronized void onTestStart(ITestResult result) {
//	        System.out.println((result.getMethod().getMethodName() + " started!"));
//	        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
//	        test.set(extentTest);
//	    }
//	 
//	    public synchronized void onTestSuccess(ITestResult result) {
//	        System.out.println((result.getMethod().getMethodName() + " passed!"));
//	        test.get().pass("Test passed");
//	    }
//	 
//	    
//	    public synchronized void onTestFailure(ITestResult result) {
//	        System.out.println((result.getMethod().getMethodName() + " failed!"));
//	        test.get().fail(result.getThrowable());
//	    }
//	 
//	    
//	    public synchronized void onTestSkipped(ITestResult result) {
//	        System.out.println((result.getMethod().getMethodName() + " skipped!"));
//	        test.get().skip(result.getThrowable());
//	    }
//	 
//	    
//	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	        System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
//	    }
//	}