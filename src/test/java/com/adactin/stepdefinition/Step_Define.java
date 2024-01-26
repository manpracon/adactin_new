package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Define {

	public static WebDriver driver = Runner_Class.driver;

	@Given("^user Launch The Url Successfully\\.$")
	public void user_Launch_The_Url_Successfully() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Type The Username In The Username Field\\.$")
	public void user_Type_The_Username_In_The_Username_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sandinesh");
	}

	@When("^user Type The Password In The Password Field\\.$")
	public void user_Type_The_Password_In_The_Password_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ds12345@");
	}

	@Then("^user Click The Login Button That Navigates To The Search Hotel\\.$")
	public void user_Click_The_Login_Button_That_Navigates_To_The_Search_Hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("^user Select The Location Using Dropdown\\.$")
	public void user_Select_The_Location_Using_Dropdown() throws Throwable {
		WebElement findElement = driver.findElement(By.xpath("//select[@id='location']"));
		Select a = new Select(findElement);
		a.selectByValue("London");
	}

	@When("^user Select The Hotel Using Dropdown\\.$")
	public void user_Select_The_Hotel_Using_Dropdown() throws Throwable {
		WebElement findelement1 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select b = new Select(findelement1);
		b.selectByIndex(3);
	}

	@When("^user Select The Room Type Using Dropdown\\.$")
	public void user_Select_The_Room_Type_Using_Dropdown() throws Throwable {
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select c = new Select(findElement2);
		c.selectByIndex(2);
	}

	@When("^user Select The Number Of Rooms Using Dropdown\\.$")
	public void user_Select_The_Number_Of_Rooms_Using_Dropdown() throws Throwable {
		WebElement findElement3 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select d = new Select(findElement3);
		d.selectByIndex(2);
	}

	@When("^user Select The Adult Per Room Using Dropdown\\.$")
	public void user_Select_The_Adult_Per_Room_Using_Dropdown() throws Throwable {
		WebElement findelement4 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select e = new Select(findelement4);
		e.selectByIndex(3);
	}

	@When("^user Select The Children Per Room Using Dropdown\\.$")
	public void user_Select_The_Children_Per_Room_Using_Dropdown() throws Throwable {
		WebElement findelement5 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select f = new Select(findelement5);
		f.selectByIndex(1);
	}

	@Then("^user Click The Search Button That Navigates To The Select Hotel Page\\.$")
	public void user_Click_The_Search_Button_That_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@When("^user Click The Option Of The Selected Hotel\\.$")
	public void user_Click_The_Option_Of_The_Selected_Hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@type='radio']")).click();
	}

	@Then("^user Click The Continue That Will Navigate To The Book Hotel Webpage\\.$")
	public void user_Click_The_Continue_That_Will_Navigate_To_The_Book_Hotel_Webpage() throws Throwable {
		driver.findElement(By.xpath("//input[@name='continue']")).click();
	}

	@When("^user Type The Firstname In The First Name Field\\.$")
	public void user_Type_The_Firstname_In_The_First_Name_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Dinesh");
	}

	@When("^user Type The Lastname In The Last Name Field\\.$")
	public void user_Type_The_Lastname_In_The_Last_Name_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("sankar D");
	}

	@When("^user Provide The Correct Address In The Address Field\\.$")
	public void user_Provide_The_Correct_Address_In_The_Address_Field() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']"))
				.sendKeys("43, Muthu street" + "\n" + "Thoothukudi-628002.");
	}

	@When("^user Provide The Credit Card Number In The Credit Card Field\\.$")
	public void user_Provide_The_Credit_Card_Number_In_The_Credit_Card_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("4512 4845 8458 1125");
	}

	@When("^user Select The Credit Card Type In The Type Field\\.$")
	public void user_Select_The_Credit_Card_Type_In_The_Type_Field() throws Throwable {
		WebElement findElement6 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select g = new Select(findElement6);
		g.selectByIndex(1);

		WebElement findElement7 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select h = new Select(findElement7);
		h.selectByIndex(10);
	}

	@When("^user Select The Expiry Date In The Consent Dropdown\\.$")
	public void user_Select_The_Expiry_Date_In_The_Consent_Dropdown() throws Throwable {
		WebElement findElement8 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select i = new Select(findElement8);
		i.selectByValue("2027");
	}

	@When("^user Type The Confidential Cvv Number In The Consent Field\\.$")
	public void user_Type_The_Confidential_Cvv_Number_In_The_Consent_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("462");
	}

	@Then("^user Click The Book Now Button That Will Navigate To The Hotel Confirmation page\\.$")
	public void user_Click_The_Book_Now_Button_That_Will_Navigate_To_The_Hotel_Confirmation_page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
	}

	@Then("^user Click The My itinerary To Navigate To The Bookings\\.$")
	public void user_Click_The_My_itinerary_To_Navigate_To_The_Bookings() throws Throwable {
		Actions act = new Actions(driver);
		WebElement findElement9 = driver.findElement(By.id("my_itinerary"));
		act.click(findElement9).build().perform();
	}

	@Then("^user Click The Logout Button To Logged Out From The Account\\.$")
	public void user_Click_The_Logout_Button_To_Logged_Out_From_The_Account() throws Throwable {
		driver.findElement(By.id("logout")).click();
	}
}
