package com.pages;

import org.openqa.selenium.By;

import com.utility.Library;

public class Amazonwebelementslocators {
	public static By firetvstickproduct=By.id("twotabsearchtextbox");
	public static By submitthefirestick=By.id("twotabsearchtextbox");
public static By firetvstickgeneration3=By.linkText("Fire TV Stick (3rd Gen, 2021) with Alexa Voice Remote (includes TV and app controls) | HD streaming device");


public static void choosefiretvstick() {
	Library.driver.findElement(firetvstickproduct).sendKeys("fire tv stick");
}
public static void submittingfiretvstickproduct() {
	Library.driver.findElement(submitthefirestick).submit();
	
}
public static void clickfiretvstickgeneration3() {
	Library.driver.findElement(firetvstickgeneration3).click();
	
	
}





}
	
