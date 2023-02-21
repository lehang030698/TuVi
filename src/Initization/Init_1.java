package Initization;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Init_1 {
	public static WebDriver driver;
	public static String hoten = "abc" ;
	public static String projectPath = System.getProperty("user.dir");
	
	public static String cungso1aText;
	public static String cungso1bText;
	public static String conGiap1aText;
	public static String conGiapSo1bText;
	public static String daiHan1aText;
	public static String daiHan1bText;
	public static String tieuHan1aText;
	public static String tieuHan1bText;
	public static String trangSinh1aText;
	public static String trangSinh1bText;
	public static String hanThang1aText;
	public static String hanThang1bText;
	
	public static String cungso2aText;
	public static String cungso2bText;
	public static String conGiap2aText;
	public static String conGiapSo2bText;
	public static String daiHan2aText;
	public static String daiHan2bText;
	public static String tieuHan2aText;
	public static String tieuHan2bText;
	public static String trangSinh2aText;
	public static String trangSinh2bText;
	public static String hanThang2aText;
	public static String hanThang2bText;
	
	public static String cungso3aText;
	public static String cungso3bText;
	public static String conGiap3aText;
	public static String conGiapSo3bText;
	public static String daiHan3aText;
	public static String daiHan3bText;
	public static String tieuHan3aText;
	public static String tieuHan3bText;
	public static String trangSinh3aText;
	public static String trangSinh3bText;
	public static String hanThang3aText;
	public static String hanThang3bText;
	
	public static String cungso4aText;
	public static String cungso4bText;
	public static String conGiap4aText;
	public static String conGiapSo4bText;
	public static String daiHan4aText;
	public static String daiHan4bText;
	public static String tieuHan4aText;
	public static String tieuHan4bText;
	public static String trangSinh4aText;
	public static String trangSinh4bText;
	public static String hanThang4aText;
	public static String hanThang4bText;
	
	public static String cungso5aText;
	public static String cungso5bText;
	public static String conGiap5aText;
	public static String conGiapSo5bText;
	public static String daiHan5aText;
	public static String daiHan5bText;
	public static String tieuHan5aText;
	public static String tieuHan5bText;
	public static String trangSinh5aText;
	public static String trangSinh5bText;
	public static String hanThang5aText;
	public static String hanThang5bText;
	
	public static String cungso6aText;
	public static String cungso6bText;
	public static String conGiap6aText;
	public static String conGiapSo6bText;
	public static String daiHan6aText;
	public static String daiHan6bText;
	public static String tieuHan6aText;
	public static String tieuHan6bText;
	public static String trangSinh6aText;
	public static String trangSinh6bText;
	public static String hanThang6aText;
	public static String hanThang6bText;
	
	public static String cungso7aText;
	public static String cungso7bText;
	public static String conGiap7aText;
	public static String conGiapSo7bText;
	public static String daiHan7aText;
	public static String daiHan7bText;
	public static String tieuHan7aText;
	public static String tieuHan7bText;
	public static String trangSinh7aText;
	public static String trangSinh7bText;
	public static String hanThang7aText;
	public static String hanThang7bText;
	
	public static String cungso8aText;
	public static String cungso8bText;
	public static String conGiap8aText;
	public static String conGiapSo8bText;
	public static String daiHan8aText;
	public static String daiHan8bText;
	public static String tieuHan8aText;
	public static String tieuHan8bText;
	public static String trangSinh8aText;
	public static String trangSinh8bText;
	public static String hanThang8aText;
	public static String hanThang8bText;
	
	public static String cungso9aText;
	public static String cungso9bText;
	public static String conGiap9aText;
	public static String conGiapSo9bText;
	public static String daiHan9aText;
	public static String daiHan9bText;
	public static String tieuHan9aText;
	public static String tieuHan9bText;
	public static String trangSinh9aText;
	public static String trangSinh9bText;
	public static String hanThang9aText;
	public static String hanThang9bText;
	
	public static String cungso10aText;
	public static String cungso10bText;
	public static String conGiap10aText;
	public static String conGiapSo10bText;
	public static String daiHan10aText;
	public static String daiHan10bText;
	public static String tieuHan10aText;
	public static String tieuHan10bText;
	public static String trangSinh10aText;
	public static String trangSinh10bText;
	public static String hanThang10aText;
	public static String hanThang10bText;
	
	public static String cungso11aText;
	public static String cungso11bText;
	public static String conGiap11aText;
	public static String conGiapSo11bText;
	public static String daiHan11aText;
	public static String daiHan11bText;
	public static String tieuHan11aText;
	public static String tieuHan11bText;
	public static String trangSinh11aText;
	public static String trangSinh11bText;
	public static String hanThang11aText;
	public static String hanThang11bText;
	
	public static String cungso12aText;
	public static String cungso12bText;
	public static String conGiap12aText;
	public static String conGiapSo12bText;
	public static String daiHan12aText;
	public static String daiHan12bText;
	public static String tieuHan12aText;
	public static String tieuHan12bText;
	public static String trangSinh12aText;
	public static String trangSinh12bText;
	public static String hanThang12aText;
	public static String hanThang12bText;
		
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
		new Select(driver.findElement(By.name("ngay"))).selectByVisibleText("1");
		new Select(driver.findElement(By.name("thang"))).selectByVisibleText("1");
		new Select(driver.findElement(By.name("nam"))).selectByVisibleText("1950");
		new Select(driver.findElement(By.name("gio"))).selectByVisibleText("Sửu (1g - 3g)");
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
		
		new Select(driver.findElement(By.name("year"))).selectByVisibleText("Năm 1950");
		new Select(driver.findElement(By.name("month"))).selectByVisibleText("Tháng 1");
		new Select(driver.findElement(By.name("day"))).selectByVisibleText("Ngày 1");
		new Select(driver.findElement(By.name("hour"))).selectByVisibleText("2 Giờ");
		new Select(driver.findElement(By.name("minute"))).selectByVisibleText("2 Phút");
//		WebElement namhan = driver.findElement(By.id("year_horoscope"));
//		String giatri = namhan.getAttribute("value");
//		 if(giatri.equals("2023")) {
//			 System.out.println("lấy năm hiện tại đã đúng");
//		 }
		
		driver.findElement(By.xpath("//a[@class='btn btn-warning text-white']")).click();
		sleepInSecond(2);
	}

	public static void TearDown() {
		 driver.quit();
	}
}
