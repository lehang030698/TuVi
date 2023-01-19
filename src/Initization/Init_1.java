package Initization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Init_1 {
	public static WebDriver driver;
	public static String hoten = "abc" ;
	public static String projectPath = System.getProperty("user.dir");
	
	public static void Setup() {
		System.setProperty("webdriver.chrome.driver", projectPath + "//browserDriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void sleepInSecond(long timeTnSecond) {
		try {
			Thread.sleep(timeTnSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void nhapDataXemVanMenh() {
		driver.get("https://xemvanmenh.net/xem-la-so-tu-vi.html");
		driver.findElement(By.xpath("//input[@name='hovaten']")).sendKeys(hoten);
		new Select(driver.findElement(By.name("gioitinh"))).selectByVisibleText("Nữ giới");
		new Select(driver.findElement(By.name("ngay"))).selectByVisibleText("2");
		new Select(driver.findElement(By.name("thang"))).selectByVisibleText("2");
		new Select(driver.findElement(By.name("nam"))).selectByVisibleText("1998");
		new Select(driver.findElement(By.name("gio"))).selectByVisibleText("Dần (3g - 5g)");
		new Select(driver.findElement(By.name("namxem"))).selectByVisibleText("2023");
		driver.findElement(By.cssSelector("button.button")).click();
		sleepInSecond(2);
	}
	
	public static void nhapDataTuViChanCo() {
		driver.get("http://134.209.106.223:7790/horoscope");
		sleepInSecond(2);
		driver.findElement(By.id("full_name")).sendKeys(hoten);
		sleepInSecond(2);
		
		JavascriptExecutor jsExcutor = (JavascriptExecutor) driver;
		jsExcutor.executeScript("document.getElementById('female').checked=true");
		
		new Select(driver.findElement(By.name("year"))).selectByVisibleText("Năm 1998");
		new Select(driver.findElement(By.name("month"))).selectByVisibleText("Tháng 2");
		new Select(driver.findElement(By.name("day"))).selectByVisibleText("Ngày 2");
		new Select(driver.findElement(By.name("hour"))).selectByVisibleText("3 Giờ");
		new Select(driver.findElement(By.name("minute"))).selectByVisibleText("3 Phút");
		WebElement namhan = driver.findElement(By.id("year_horoscope"));
		String giatri = namhan.getAttribute("value");
		 if(giatri.equals("2023")) {
			 System.out.println("lấy năm hiện tại đã đúng");
		 }
		
		driver.findElement(By.xpath("//a[@class='btn btn-warning text-white']")).click();
		sleepInSecond(2);
	}

	public static void TearDown() {
		 driver.quit();
	}
}
