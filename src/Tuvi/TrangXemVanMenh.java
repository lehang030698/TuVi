package Tuvi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Initization.Init_1;

public class TrangXemVanMenh extends Init_1{
	public static String hoten = "abc" ;
	
	public static void main(String[] args) {
		run();	
	}
	public static void run() {
		Setup();
		driver.get("https://xemvanmenh.net/xem-la-so-tu-vi.html");
		driver.findElement(By.xpath("//input[@name='hovaten']")).sendKeys(hoten);
		new Select(driver.findElement(By.name("gioitinh"))).selectByVisibleText("Nữ giới");
		new Select(driver.findElement(By.name("ngay"))).selectByVisibleText("2");
		new Select(driver.findElement(By.name("thang"))).selectByVisibleText("12");
		new Select(driver.findElement(By.name("nam"))).selectByVisibleText("1998");
		new Select(driver.findElement(By.name("gio"))).selectByVisibleText("Dần (3g - 5g)");
		new Select(driver.findElement(By.name("namxem"))).selectByVisibleText("2023");
		driver.findElement(By.cssSelector("button.button")).click();
		sleepInSecond(2);
		//
		WebElement ten = driver.findElement(By.xpath("//tr[@class='mb_color_hoten']/td[2]"));
		if(ten.getText().equals( hoten)) {
			System.out.println("Hiển thị đúng tên so với lúc tên nhập");
		}else {
			System.out.println("Tên hiển thị không đúng so với lúc nhập tên");
		}
		
		WebElement amDuong = driver.findElement(By.xpath("//label[contains(text(),'Âm dương')]/parent::td/following-sibling::td"));
		String amDuongText = amDuong.getText();
		System.out.println("Âm dương: " + amDuongText);

		
		WebElement menh = driver.findElement(By.xpath("//label[contains(text(),'Mệnh')]/parent::td/following-sibling::td"));
		System.out.println("Mênh: " + menh.getText());
		
		WebElement cuc = driver.findElement(By.xpath("//label[contains(text(),'Cục')]/parent::td/following-sibling::td"));
		System.out.println("Cục: " + cuc.getText());
		
		WebElement chuMenh = driver.findElement(By.xpath("//label[contains(text(),'Chủ mệnh')]/parent::td/following-sibling::td"));
		System.out.println("Chủ mệnh: " + chuMenh.getText());
		
		WebElement chuThan = driver.findElement(By.xpath("//label[contains(text(),'Chủ thân')]/parent::td/following-sibling::td"));
		System.out.println("Chủ Thân: " + chuThan.getText());
		
		WebElement heSoAmDuong = driver.findElement(By.xpath("//section[@class='trungtam_bot']//h6[1]//b"));
		System.out.println("Hệ số âm dương: " + heSoAmDuong.getText());
		
		WebElement menhCuc = driver.findElement(By.xpath("//section[@class='trungtam_bot']//h6[2]//b"));
		System.out.println("Mệnh cục: " + menhCuc.getText());
		
		WebElement than = driver.findElement(By.xpath("//section[@class='trungtam_bot']//h6[3]//b"));
		System.out.println("Thân cư: " + than.getText());
		
		// Cung số 1
		WebElement cung1 = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//span[@class='c_cung']"));
		System.out.println("Tên cung: " + cung1.getText());	
		
		WebElement conGiap1 = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='c_giap']"));
		System.out.println("Tên con giáp: " + conGiap1.getText());
		
		WebElement daiHan1 = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='daihan']"));
		System.out.println("Số đại hạn: " + daiHan1.getText());
		
		List <WebElement> chinhTinh1 = driver.findElements(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//p"));
		for (WebElement ct1 : chinhTinh1) {
			System.out.println("Chính tinh: " + ct1.getText());
		}
		
		WebElement tieuHan1 = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='tieu_han']"));
		System.out.println("Tiểu hạn: " + tieuHan1.getText());
		
		WebElement trangSinh1 = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='truong_sinh']"));
		System.out.println("Vòng tràng sinh: " + trangSinh1.getText());
		
		WebElement hanThang1 = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='han_thang']"));
		System.out.println("Hạn tháng:" +hanThang1.getText());
		
		System.out.println("Danh sách sao tốt:");
		
		List <WebElement> saotot1 = driver.findElements(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//ul[@class='sao_left']//li//span"));
		for (WebElement st1 : saotot1) {	
			System.out.println(st1.getText());
		}
		
		System.out.println("Danh sách sao xấu: ");
		List <WebElement> saoxau1 = driver.findElements(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//ul[@class='sao_right ul_saoright']//li//span"));
		for (WebElement sx1 : saoxau1) {
			System.out.println(sx1.getText());
			
		}
		
		
	}
	
}
