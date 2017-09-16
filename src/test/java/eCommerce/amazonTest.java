package eCommerce;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.amazonHomePage;
import eCommerce.base;

public class amazonTest extends base
{

	
	@Test(dataProvider="getDataSign")
	public void basePageNavigation(String userName, String password) throws IOException
	{
		System.out.println(userName);
		driver=initialize();
		//driver.get(baseURL);
		driver.manage().window().maximize();
		
		amazonHomePage cu= new amazonHomePage(driver);
		//cu.createUser();
		cu.userSignIn(userName, password);
		
	
	}
	
	//@DataProvider
	
	/*public Object[][] getData()
	{
		Object[][] data= new Object[1][2];
		
		data[1][1]="appumuv@gmail.com";
		data[1][2]="Anushka19915";
		
		return data;
	}*/
	
	/*@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="appumuv@gmail.com";
		data[0][1]="Anushka19915";
		//data[0][2]="Restrcited User";
		//1st row
		//data[1][0]="restricteduser@qw.com";
		//data[1][1]="456788";
		//data[1][2]= "Non restricted user";
		
		return data;	
	}*/
}
