package org.helper;

import java.awt.AWTException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;
	public static JavascriptExecutor js;
	public static void OpenChrome() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
}
public static void OpenEdge() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();

}
static public void maximize() {
	driver.manage().window().maximize();
}
static public void minimize() {
	driver.manage().window().minimize();
}
static public void launchurl(String url) {
	driver.get(url);
}
static public void getcurrenturl() {
	String txturl = driver.getCurrentUrl();
	System.out.println(txturl);
}
static public void getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
}
static public void filltextbox(WebElement ele,String input) {
	ele.sendKeys(input);
}
static public void toclick(WebElement c) {
	c.click();
}
static public void gettext(WebElement text) {
	text.getText();
}
static public void gettagname(WebElement tagname) {
	tagname.getTagName();
}
static public void quit() {
	driver.quit();
}
static public void close() {
	driver.close();
}
static public void wait(int time) throws InterruptedException {
	Thread.sleep(time);

}
static public void movetoelement(WebElement move) {
	 a=new Actions (driver);
	a.moveToElement(move).click().perform();;
}	
static public void draganddrop(WebElement sou,WebElement tar) {
	a=new Actions(driver);
	a.dragAndDrop(sou, tar).perform();
}
static public void doubleclick(WebElement value) {
	a=new Actions(driver);
	a.doubleClick(value).perform();
}
static public void contextclick(WebElement value) {
	a=new Actions(driver);
	a.contextClick(value).perform();
}
static public void copy() throws AWTException {
    r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
}
static public void paste() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
}
static public void robottab() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
}
static public void robotup() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
}
static public void robotdown() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}

static public void robotenter() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}	
static public void robotdelete() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_DELETE);
	r.keyRelease(KeyEvent.VK_DELETE);
}

static public void sellectall() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
}
static public void alertaccept() {
	driver.switchTo().alert().accept();
}
static public void alertdismiss() {
	driver.switchTo().alert().dismiss();
}
static public void alertsentkey(String value) {
	driver.switchTo().alert().sendKeys(value);
}
static public void alerttext() {
	driver.switchTo().alert().getText();
}
static public void selectvisibletext(WebElement element,String text) {
	s= new Select(element);
	s.selectByVisibleText(text);
}
static public void selectByValue(WebElement element,String value) {
	s=new Select(element);
	s.selectByValue(value);
}
static public void selectByIndex(WebElement element, int index) {
	s=new Select(element);
	s.selectByIndex(index);
}
static public void selectall(WebElement element) {
	s=new Select(element);
	s.deselectAll();
}
static public void deselectall(WebElement element) {
	s=new Select(element);
	s.deselectAll();
}
static public void deselectvisibletext(WebElement element,String text) {
	s=new Select(element);
	s.deselectByVisibleText(text);
}
static public void deselectvalue(WebElement element,String value) {
	s=new Select(element);
	s.deselectByValue(value);
}
static public void deselectindex(WebElement element,int index) {
	s=new Select(element);
	s.deselectByIndex(index);
}
static public void selectgetoptions(WebElement element) {
	s=new Select(element);
	s.getOptions();
}
static public void selectgetalloptions(WebElement element) {
	s=new Select(element);
	s.getAllSelectedOptions();
}
static public void selectgetfirstselectoptions(WebElement element) {
	s=new Select(element);
	s.getFirstSelectedOption();
}
static public void javascriptExecutorSendkey(WebElement element,String value) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value',"+value+")", element);
}
static public void javascriptExecutorgetvalue(WebElement element,String attname) {
	js=(JavascriptExecutor)driver;
	js.executeScript("return arguments[0].getAttribute("+attname+")", element);
}
static public void javascriptExecutorScrolDown(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
}
static public void javascriptExecutorScrollUp(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);
}
static public void javascriptExecutorToClick(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", element);
	
}
public void screenshot(String name) throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\Kumaresh\\OneDrive\\Documents\\eclipse-workspace\\project1\\src\\test\\resources\\Screenshots\\"+name+".jpg");
	FileUtils.copyFile(src, des);
}

}
